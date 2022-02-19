/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seguros;

import AppPackage.AnimationClass;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class Buscador extends javax.swing.JFrame {

    /**
     * Creates new form Buscador
     */
    public Buscador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void OpenInternet(){
        try {
            Desktop.getDesktop().browse(URI.create("www.google.com"));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }
    
    public void OpenFacebook(){
        try {
            Desktop.getDesktop().browse(URI.create("www.facebook.com"));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpIngreso = new javax.swing.JPanel();
        labelPass = new javax.swing.JLabel();
        labelUser1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        imageMusic = new javax.swing.JLabel();
        imageInternet = new javax.swing.JLabel();
        imageCalc = new javax.swing.JLabel();
        jpMenu = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        textDrive = new javax.swing.JLabel();
        textCronograma = new javax.swing.JLabel();
        textAnotaciones = new javax.swing.JLabel();
        textAjustes = new javax.swing.JLabel();
        textSocios = new javax.swing.JLabel();
        textEventos = new javax.swing.JLabel();
        imageIdea = new javax.swing.JLabel();
        imageConfig = new javax.swing.JLabel();
        imageHands = new javax.swing.JLabel();
        imageCalendar = new javax.swing.JLabel();
        imageClock = new javax.swing.JLabel();
        imageDrive = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jpIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jpIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jpIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPass.setBackground(new java.awt.Color(238, 112, 82));
        labelPass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelPass.setForeground(new java.awt.Color(238, 112, 82));
        labelPass.setText("Password:");
        jpIngreso.add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 130, 30));

        labelUser1.setBackground(new java.awt.Color(238, 112, 82));
        labelUser1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        labelUser1.setForeground(new java.awt.Color(238, 112, 82));
        labelUser1.setText("User:");
        jpIngreso.add(labelUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_User_96px_2.png"))); // NOI18N
        jpIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 100, 90));

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Ingrese Usuario");
        jTextField1.setBorder(null);
        jpIngreso.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 180, 40));
        jpIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 220, 30));
        jpIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 220, 30));

        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setBorder(null);
        jpIngreso.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 180, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_customer_32px_1.png"))); // NOI18N
        jpIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Key_32px.png"))); // NOI18N
        jpIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Menu_32px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jpIngreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enter_OFF.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enter_ON.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enter_ON.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Enter_ON.png"))); // NOI18N
        jpIngreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 100, 40));

        imageMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Musical_Notes_32px.png"))); // NOI18N
        imageMusic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpIngreso.add(imageMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 160, 40, 40));

        imageInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Globe_32px.png"))); // NOI18N
        imageInternet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imageInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageInternetMouseClicked(evt);
            }
        });
        jpIngreso.add(imageInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 60, 40, 40));

        imageCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Calculator_32px.png"))); // NOI18N
        imageCalc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imageCalc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageCalcMouseClicked(evt);
            }
        });
        jpIngreso.add(imageCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 110, 40, 40));

        getContentPane().add(jpIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jpMenu.setBackground(new java.awt.Color(255, 255, 255));
        jpMenu.setForeground(new java.awt.Color(255, 255, 255));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Buscar");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jpMenu.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 260, 40));

        textDrive.setBackground(new java.awt.Color(255, 99, 71));
        textDrive.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textDrive.setForeground(new java.awt.Color(255, 99, 71));
        textDrive.setText("Drive");
        jpMenu.add(textDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 50, 20));

        textCronograma.setBackground(new java.awt.Color(255, 99, 71));
        textCronograma.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textCronograma.setForeground(new java.awt.Color(255, 99, 71));
        textCronograma.setText("Cronograma");
        jpMenu.add(textCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        textAnotaciones.setBackground(new java.awt.Color(255, 99, 71));
        textAnotaciones.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textAnotaciones.setForeground(new java.awt.Color(255, 99, 71));
        textAnotaciones.setText("Anotaciones");
        jpMenu.add(textAnotaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        textAjustes.setBackground(new java.awt.Color(255, 99, 71));
        textAjustes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textAjustes.setForeground(new java.awt.Color(255, 99, 71));
        textAjustes.setText("Ajustes");
        jpMenu.add(textAjustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, -1, -1));

        textSocios.setBackground(new java.awt.Color(255, 99, 71));
        textSocios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textSocios.setForeground(new java.awt.Color(255, 99, 71));
        textSocios.setText("Socios");
        jpMenu.add(textSocios, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        textEventos.setBackground(new java.awt.Color(255, 99, 71));
        textEventos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textEventos.setForeground(new java.awt.Color(255, 99, 71));
        textEventos.setText("Eventos");
        jpMenu.add(textEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        imageIdea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageIdea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Idea_96px.png"))); // NOI18N
        imageIdea.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageIdeaMouseMoved(evt);
            }
        });
        imageIdea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imageIdeaMouseExited(evt);
            }
        });
        jpMenu.add(imageIdea, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 190, 190));

        imageConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Maintenance_96px.png"))); // NOI18N
        imageConfig.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageConfigMouseMoved(evt);
            }
        });
        imageConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imageConfigMouseExited(evt);
            }
        });
        jpMenu.add(imageConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 190, 190));

        imageHands.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageHands.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Handshake_96px.png"))); // NOI18N
        imageHands.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageHandsMouseMoved(evt);
            }
        });
        imageHands.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imageHandsMouseExited(evt);
            }
        });
        jpMenu.add(imageHands, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 190, 190));

        imageCalendar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageCalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Today_96px.png"))); // NOI18N
        imageCalendar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageCalendarMouseMoved(evt);
            }
        });
        imageCalendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imageCalendarMouseExited(evt);
            }
        });
        jpMenu.add(imageCalendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 190, 190));

        imageClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Clock_96px.png"))); // NOI18N
        imageClock.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageClockMouseMoved(evt);
            }
        });
        imageClock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imageClockMouseExited(evt);
            }
        });
        jpMenu.add(imageClock, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 190, 190));

        imageDrive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageDrive.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Google_Drive_96px.png"))); // NOI18N
        imageDrive.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imageDriveMouseMoved(evt);
            }
        });
        imageDrive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imageDriveMouseExited(evt);
            }
        });
        jpMenu.add(imageDrive, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 190, 190));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Search_32px_2.png"))); // NOI18N
        jpMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jpMenu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 70));

        getContentPane().add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 50, 40));

        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        AnimationClass internet = new AnimationClass ();
        internet.jLabelXRight(-40, 20, 10, 5, imageInternet);
        
        AnimationClass calculadora = new AnimationClass ();
        calculadora.jLabelXRight(-40, 20, 10, 5, imageCalc);
        
        AnimationClass musica = new AnimationClass ();
        musica.jLabelXRight(-40, 20, 10, 5, imageMusic);

        AnimationClass internett = new AnimationClass ();
        internett.jLabelXLeft(20, -40, 10, 5, imageInternet);

        AnimationClass calculadoraa = new AnimationClass ();
        calculadoraa.jLabelXLeft(20, -40, 10, 5, imageCalc);

        AnimationClass musicaa = new AnimationClass ();
        musicaa.jLabelXLeft(20, -40, 10, 5, imageMusic);

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
    
       

    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited

     
       
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        this.setState(Buscador.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Exit", dialog);
        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void imageDriveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageDriveMouseMoved

        imageDrive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        
    }//GEN-LAST:event_imageDriveMouseMoved

    private void imageDriveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageDriveMouseExited

        imageDrive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

    }//GEN-LAST:event_imageDriveMouseExited

    private void imageClockMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageClockMouseMoved
        imageClock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_imageClockMouseMoved

    private void imageClockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageClockMouseExited
        imageClock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_imageClockMouseExited

    private void imageIdeaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageIdeaMouseMoved
        imageIdea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_imageIdeaMouseMoved

    private void imageIdeaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageIdeaMouseExited
        imageIdea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_imageIdeaMouseExited

    private void imageCalendarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageCalendarMouseMoved
        imageCalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_imageCalendarMouseMoved

    private void imageCalendarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageCalendarMouseExited
        imageCalendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_imageCalendarMouseExited

    private void imageHandsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageHandsMouseMoved
        imageHands.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_imageHandsMouseMoved

    private void imageHandsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageHandsMouseExited
        imageHands.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_imageHandsMouseExited

    private void imageConfigMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageConfigMouseMoved
        imageConfig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_imageConfigMouseMoved

    private void imageConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageConfigMouseExited
        imageConfig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_imageConfigMouseExited

    private void imageInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageInternetMouseClicked

        OpenInternet();
    }//GEN-LAST:event_imageInternetMouseClicked

    private void imageCalcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageCalcMouseClicked

        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("calc");
            p.waitFor();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_imageCalcMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        OpenFacebook();
    }//GEN-LAST:event_jLabel9MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageCalc;
    private javax.swing.JLabel imageCalendar;
    private javax.swing.JLabel imageClock;
    private javax.swing.JLabel imageConfig;
    private javax.swing.JLabel imageDrive;
    private javax.swing.JLabel imageHands;
    private javax.swing.JLabel imageIdea;
    private javax.swing.JLabel imageInternet;
    private javax.swing.JLabel imageMusic;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jpIngreso;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUser1;
    private javax.swing.JLabel textAjustes;
    private javax.swing.JLabel textAnotaciones;
    private javax.swing.JLabel textCronograma;
    private javax.swing.JLabel textDrive;
    private javax.swing.JLabel textEventos;
    private javax.swing.JLabel textSocios;
    // End of variables declaration//GEN-END:variables
}
