/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class ChatComponent extends javax.swing.JPanel {

    /**
     * Creates new form ChatComponent
     */
    public ChatComponent() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        scrollComponent = new javax.swing.JScrollPane();
        scrollPanel = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        lblChat = new javax.swing.JLabel();

        user.setText("");

        lblChat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblChat.setText("");

        javax.swing.GroupLayout scrollPanelLayout = new javax.swing.GroupLayout(scrollPanel);
        scrollPanel.setLayout(scrollPanelLayout);
        scrollPanelLayout.setHorizontalGroup(
                scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(scrollPanelLayout.createSequentialGroup()
                                .addGroup(scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(scrollPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(user))
                                        .addGroup(scrollPanelLayout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(lblChat, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(27, Short.MAX_VALUE))
        );
        scrollPanelLayout.setVerticalGroup(
                scrollPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(scrollPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(user)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblChat)
                                .addContainerGap(62, Short.MAX_VALUE))
        );

        scrollComponent.setViewportView(scrollPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollComponent, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollComponent, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );
    }// </editor-fold>


    // Variables declaration - do not modify
    javax.swing.JLabel lblChat;
    private javax.swing.JScrollPane scrollComponent;
    private javax.swing.JPanel scrollPanel;
    javax.swing.JLabel user;
    // End of variables declaration
}