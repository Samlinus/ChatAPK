/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author ADMIN
 */
public class UserViewFrame extends javax.swing.JFrame {

    ChatPanel chatPanel;
    Client userClient;
    String userName;
    String receiverName;
    JFrame myFrame=this;
    JPanel prevPanel=new ChitPanel();
    DataBase dataBase;

    private static void actionPerformed(ActionEvent e) {
        System.out.println("\nReady to write message....");
    }


    public UserViewFrame(String userName)  {
        setResizable(false);
        ImageIcon img=new ImageIcon(getClass().getResource("icon.jpg"));
        setIconImage(img.getImage());
        this.userName = userName;
        try {
            userClient = new Client("localhost",80,userName);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            dataBase = new DataBase();
            //Database is connected pop up
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Not Connected with database");
        }
        initComponents();
        jPanel1.setLayout(new FlowLayout());
        jPanel1.add(prevPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        JScrollPane jScrollPane1 = new JScrollPane();
//        this.setResizable(false);
        Vector<String> vector =new Vector<>();
        ResultSet rs=dataBase.allFromUser();
        try{
            while (rs.next()) {
                if(this.userName.equals(rs.getString(2)))
                    continue;
                vector.add(rs.getString(2));
            }
        }
        catch (Exception e){e.printStackTrace();}
        usersList = new javax.swing.JList<>();
        usersList = new javax.swing.JList<>(vector);
        usersList.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setForeground(new java.awt.Color(0, 0, 204));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usersList.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 16)); // NOI18N
        startReaderThread();
        usersList.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                if (prevPanel != null) {
                    prevPanel.setVisible(false);
                }
                    chatPanel = new ChatPanel();
                    receiverName = usersList.getSelectedValue();
                    System.out.println("\nReceiverName: " + receiverName);
                    chatPanel.setDisplayNameTop(receiverName);

                    jPanel1.setLayout(new BoxLayout(jPanel1,BoxLayout.Y_AXIS)); // Set the layout manager
                    jPanel1.add(chatPanel);
                    prevPanel = chatPanel;
                    chatPanel.txtFieldMsg.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyReleased(KeyEvent e) {
                        if (chatPanel.txtFieldMsg.getText().equals("")) {
                            chatPanel.btnSend.setEnabled(false);
                        } else {
                            chatPanel.btnSend.setEnabled(true);
                        }
                        }
                    });
                    ResultSet resultSet=dataBase.getHistory(userName,receiverName);
                    try {
                        while (resultSet.next()) {
                            String sender=resultSet.getString(1);
                            String receiver=resultSet.getString(2);
                            String msg=resultSet.getString(3);

                            ChatComponent chat=new ChatComponent();
                            if(sender.equals(userName)){
                                chat.user.setText("(You)");
                            }
                            else {
                                chat.user.setText("("+receiver+")");
                            }
                            chat.lblChat.setText(msg);
                            chatPanel.jPanel1.add(chat);
                        }
                        chatPanel.jPanel1.revalidate();
                        System.out.println("\nVertical scrollbar layout changed...");
                        chatPanel.jScrollPane1.getVerticalScrollBar().setValue(chatPanel.jScrollPane1.getVerticalScrollBar().getMaximum());
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                    // To add the sent message into panel1....
                    chatPanel.btnSend.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String msg = chatPanel.txtFieldMsg.getText();
                            System.out.println("Receiver : " + receiverName);
                            System.out.println("Msg : " + msg);
                            chatPanel.txtFieldMsg.setText("");
                            chatPanel.btnSend.setEnabled(false);
                            userClient.write(receiverName, msg);
                            ChatComponent chat=new ChatComponent();
                            chat.lblChat.setText(msg);
                            chat.user.setText("(You)");
                            chat.setBorder(BorderFactory.createLineBorder(Color.blue));
                            chatPanel.jPanel1.add(chat);
                            chatPanel.jPanel1.revalidate();
                            chatPanel.jScrollPane1.getVerticalScrollBar().setValue(chatPanel.jScrollPane1.getVerticalScrollBar().getMaximum());
                            chatPanel.jPanel1.revalidate();
                        }
                    });
                }
            }
        );
        jScrollPane1.setViewportView(usersList);

        jPanel1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        myFrame.setVisible(true);
    }
    public void startReaderThread(){
        Thread readerThread=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        String senderNameRead = userClient.in.readUTF();
                        String msgRead = userClient.in.readUTF();
                        System.out.println("\nSender Name: "+senderNameRead);
                        System.out.println("\nSender Message: "+msgRead);
                        if (usersList.getSelectedValue().equals(senderNameRead)) {
                            ChatComponent chat = new ChatComponent();
                            chat.user.setText(senderNameRead);
                            chat.lblChat.setText(msgRead);
                            chatPanel.jPanel1.add(chat);
                            chatPanel.jPanel1.revalidate();
                            chatPanel.jScrollPane1.getVerticalScrollBar().setValue(chatPanel.jScrollPane1.getVerticalScrollBar().getMaximum());
                        }
                        else {

                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        readerThread.start();
    }
    private javax.swing.JPanel jPanel1;
    private javax.swing.JList<String> usersList;
}
