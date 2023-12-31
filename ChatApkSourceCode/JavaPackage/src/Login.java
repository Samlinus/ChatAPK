/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Login extends javax.swing.JFrame {
    DataBase dataBase;
    JFrame loginFrame = this;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JButton signInBt;
    private javax.swing.JTabbedPane signInPane;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JButton signUpBt;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JTextField userIdField1;
    private javax.swing.JTextField userIdField2;
    private javax.swing.JLabel userIdLabel1;
    private javax.swing.JLabel userIdLabel2;
    public Login() {
        dataBase = new DataBase();
        initComponents();
        setVisible(true);
        setResizable(false);
        ImageIcon img=new ImageIcon(getClass().getResource("icon.jpg"));
        setIconImage(img.getImage());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        setForeground(new java.awt.Color(0, 0, 204));
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        signInPane = new javax.swing.JTabbedPane();
        signUpPanel = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        name.setForeground(new java.awt.Color(0, 0, 204));
        passwordLabel1 = new javax.swing.JLabel();
        passwordLabel1.setForeground(new java.awt.Color(0, 0, 204));
        userIdLabel1 = new javax.swing.JLabel();
        userIdLabel1.setForeground(new java.awt.Color(0, 0, 204));
        userIdField1 = new javax.swing.JTextField();
        userIdField1.setForeground(new java.awt.Color(0, 0, 204));
        passwordField1 = new javax.swing.JPasswordField();
        passwordField1.setForeground(new java.awt.Color(0, 0, 204));
        signUpBt = new javax.swing.JButton();
        signUpBt.setBackground(new java.awt.Color(238, 243, 244));
        signUpBt.setForeground(new java.awt.Color(0, 0, 204));
        signInPanel = new javax.swing.JPanel();
        userIdLabel2 = new javax.swing.JLabel();
        userIdLabel2.setForeground(new java.awt.Color(0, 0, 204));
        userIdField2 = new javax.swing.JTextField();
        passwordLabel2 = new javax.swing.JLabel();
        passwordLabel2.setForeground(new java.awt.Color(0, 0, 204));
        passwordField2 = new javax.swing.JPasswordField();
        passwordField2.setForeground(new java.awt.Color(0, 0, 204));
        signInBt = new javax.swing.JButton();
        signInBt.setBackground(new java.awt.Color(238, 243, 244));
        signInBt.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("jLabel3");

        signInBt.setMnemonic(KeyEvent.VK_ENTER);
        signUpBt.setMnemonic(KeyEvent.VK_ENTER);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        signInPanel.setBackground(new java.awt.Color(238, 243, 244));
        signUpPanel.setBackground(new java.awt.Color(238, 243, 244));
        signUpBt.addActionListener(evt -> signUp());
        signInBt.addActionListener(e -> {
            try{
                String user = userIdField2.getText();
                dataBase.checkLoginDetails(user, passwordField2.getText());
                JOptionPane.showMessageDialog(null,"successfull login...");
                new UserViewFrame(user);
                loginFrame.dispose();
                //pop up successfully login...
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(null,"Invalid credentials...");
            }
        });

        name.setText("Name");

        passwordLabel1.setText("Password");

        userIdLabel1.setText("UserId");

        signUpBt.setText("Sign Up");
        setBackground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Ink Free", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("CHAT APP");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("lock.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("rocket.png"))); // NOI18N

        signInPane.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N

        nameField.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        nameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        nameField.addActionListener(evt -> nameFieldActionPerformed());

        name.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        name.setText("Name");

        passwordLabel1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        passwordLabel1.setText("Password");

        userIdLabel1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        userIdLabel1.setText("UserId");

        userIdField1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        userIdField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        passwordField1.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        passwordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        signUpBt.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        signUpBt.setText("Sign Up");


        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
                signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpPanelLayout.createSequentialGroup()
                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(signUpPanelLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(signUpBt))
                                        .addGroup(signUpPanelLayout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(userIdLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(passwordLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                                        .addComponent(userIdField1)
                                                        .addComponent(passwordField1))))
                                .addGap(52, 52, 52))
        );
        signUpPanelLayout.setVerticalGroup(
                signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signUpPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name))
                                .addGap(31, 31, 31)
                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(userIdLabel1)
                                        .addComponent(userIdField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordLabel1)
                                        .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(signUpBt)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        signInPane.addTab("Sign Up", signUpPanel);

        userIdLabel2.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        userIdLabel2.setText("User Id");

        userIdField2.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        userIdField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        passwordLabel2.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        passwordLabel2.setText("Password");

        passwordField2.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        passwordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        signInBt.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        signInBt.setText("Sign In");

        javax.swing.GroupLayout signInPanelLayout = new javax.swing.GroupLayout(signInPanel);
        signInPanel.setLayout(signInPanelLayout);
        signInPanelLayout.setHorizontalGroup(
                signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInPanelLayout.createSequentialGroup()
                                .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(signInPanelLayout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(signInBt))
                                        .addGroup(signInPanelLayout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(userIdLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(passwordLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                                .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(userIdField2, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                        .addComponent(passwordField2))))
                                .addGap(51, 51, 51))
        );
        signInPanelLayout.setVerticalGroup(
                signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(signInPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(userIdLabel2)
                                        .addComponent(userIdField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordLabel2)
                                        .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(signInBt)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        signInPane.addTab("Sign In", signInPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addGap(430, 430, 430))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(signInPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(68, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(468, 468, 468)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(48, 48, 48)
                                                                .addComponent(signInPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(125, 125, 125))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66)))
                                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>// </editor-fold>//GEN-END:initComponents
    private void nameFieldActionPerformed() {
        // TODO add your handling code here:
    }
    public void signUp()
    {
        String username = nameField.getText();
        String userid = userIdField1.getText();
        String password = new String(passwordField1.getPassword());

        try {
            if(username.isEmpty() && userid.isEmpty() && password.isEmpty() )
            {
                JOptionPane.showMessageDialog(null,"Do check...All the inputs are empty");
            }
            else if (username.isEmpty() || userid.isEmpty() ||password.isEmpty() ) {
                //throw new IllegalArgumentException("Username cannot be empty");
                JOptionPane.showMessageDialog(null,"Enter the missing fields");
            }
            else {
                dataBase.insertSignupDetails(username,userid,password);
                JOptionPane.showMessageDialog(null,"Sign is done successfully");
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(Login.this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Login.this,e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Login();
    }

}
