package GUI;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author asalhi
 */
public class JFrameContact extends javax.swing.JFrame {

    private static String USER_NAME = "crowdsf1516@gmail.com";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "test2016"; // GMail password
    private static String RECIPIENT = "crowdrise1516@gmail.com";  // to destinataire qui recoit

    public JFrameContact() throws MessagingException {
        setBounds(250, 130, 600, 700);
        initComponents();

        setTitle("Contact Window");
        String from = USER_NAME;
        String pass = PASSWORD;
        String[] to = {RECIPIENT}; // list of recipient email addresses

        jBtnEnvoyer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    String subject = "Subject " + jtxtFldSujet.getText() + " From: " + jtxtFldNom.getText() + " " + jtxtFldPrenom.getText() + " Email:" + jtxtFldEmail.getText();
                    String body = jtxtAreaMessage.getText();
                    System.out.println(subject);
                    sendFromGMail(from, pass, to, subject, body);
                } catch (MessagingException ex) {
                    Logger.getLogger(JFrameContact.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) throws MessagingException {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");

        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for (int i = 0; i < to.length; i++) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for (int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (AddressException ae) {
            ae.printStackTrace();
        } catch (MessagingException me) {
            me.printStackTrace();
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

        jLabelContactez = new javax.swing.JLabel();
        jPanelFormulaire = new javax.swing.JPanel();
        jBtnEnvoyer = new javax.swing.JButton();
        jtxtFldNom = new JTextField();
        jtxtFldSujet = new JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAreaMessage = new JTextArea();
        jtxtFldPrenom = new JTextField();
        jBtnAnnuler = new javax.swing.JButton();
        jtxtFldEmail = new JTextField();
        jLabelEcoute = new javax.swing.JLabel();
        jPanelCoordonee = new javax.swing.JPanel();
        jLabelAerobase = new javax.swing.JLabel();
        jLabelFax = new javax.swing.JLabel();
        jLabelSkype = new javax.swing.JLabel();
        jLabelTeleph = new javax.swing.JLabel();
        jLabelGouvernorat = new javax.swing.JLabel();
        jLabelCite = new javax.swing.JLabel();
        jLabelBP = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelEnvlp = new javax.swing.JLabel();
        jPanelMap = new javax.swing.JPanel();
        jLabelMap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelContactez.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabelContactez.setForeground(new java.awt.Color(255, 0, 0));
        jLabelContactez.setText("CONTACTEZ-NOUS ");

        jBtnEnvoyer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnEnvoyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mail.png"))); // NOI18N
        jBtnEnvoyer.setText("Envoyer");
        jBtnEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEnvoyerActionPerformed(evt);
            }
        });

        jtxtFldNom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtxtFldNom.setForeground(new java.awt.Color(153, 153, 153));
        jtxtFldNom.setText("Nom");
        jtxtFldNom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtFldNomMouseClicked(evt);
            }
        });
        jtxtFldNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFldNomActionPerformed(evt);
            }
        });

        jtxtFldSujet.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtxtFldSujet.setForeground(new java.awt.Color(153, 153, 153));
        jtxtFldSujet.setText("Sujet            ");
        jtxtFldSujet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtFldSujetMouseClicked(evt);
            }
        });
        jtxtFldSujet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFldSujetActionPerformed(evt);
            }
        });

        jtxtAreaMessage.setColumns(20);
        jtxtAreaMessage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtxtAreaMessage.setForeground(new java.awt.Color(153, 153, 153));
        jtxtAreaMessage.setRows(5);
        jtxtAreaMessage.setText("Message");
        jtxtAreaMessage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtAreaMessageMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtxtAreaMessage);

        jtxtFldPrenom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtxtFldPrenom.setForeground(new java.awt.Color(153, 153, 153));
        jtxtFldPrenom.setText("Prenom");
        jtxtFldPrenom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtFldPrenomMouseClicked(evt);
            }
        });
        jtxtFldPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFldPrenomActionPerformed(evt);
            }
        });

        jBtnAnnuler.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jBtnAnnuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        jBtnAnnuler.setText("Annuler");
        jBtnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnnulerActionPerformed(evt);
            }
        });

        jtxtFldEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtxtFldEmail.setForeground(new java.awt.Color(153, 153, 153));
        jtxtFldEmail.setText("Adresse Electronique");
        jtxtFldEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtFldEmailMouseClicked(evt);
            }
        });
        jtxtFldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFldEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormulaireLayout = new javax.swing.GroupLayout(jPanelFormulaire);
        jPanelFormulaire.setLayout(jPanelFormulaireLayout);
        jPanelFormulaireLayout.setHorizontalGroup(
            jPanelFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormulaireLayout.createSequentialGroup()
                .addGroup(jPanelFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormulaireLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanelFormulaireLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanelFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtFldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtFldPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtFldSujet, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtFldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormulaireLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtnEnvoyer, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jBtnAnnuler, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        jPanelFormulaireLayout.setVerticalGroup(
            jPanelFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormulaireLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtFldNom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtFldPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jtxtFldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jtxtFldSujet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnEnvoyer, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jBtnAnnuler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        jLabelEcoute.setFont(new java.awt.Font("Times New Roman", 2, 16)); // NOI18N
        jLabelEcoute.setForeground(new java.awt.Color(0, 0, 204));
        jLabelEcoute.setText("A l'écoute de vos réclamations");

        jLabelAerobase.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelAerobase.setText("CrowdRise1516@gmail.com");

        jLabelFax.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelFax.setText("00-216-70-685-685");

        jLabelSkype.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelSkype.setText("Crowd-Rise");

        jLabelTeleph.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelTeleph.setText("00-216-70-685-685");

        jLabelGouvernorat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelGouvernorat.setText("Ariana, Tunisie, 2080");

        jLabelCite.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelCite.setText("2083 Pôle Technologique - Cité El Ghazala ,");

        jLabelBP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelBP.setText(" Z.I. Chotrana II - B.P. 160 ,   ");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email.png"))); // NOI18N
        jLabel13.setText(" ");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telephone.png"))); // NOI18N
        jLabel14.setText(" ");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fax.png"))); // NOI18N
        jLabel16.setText(" ");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Skype.png"))); // NOI18N
        jLabel15.setText(" ");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Maps.png"))); // NOI18N
        jLabel17.setText(" ");

        javax.swing.GroupLayout jPanelCoordoneeLayout = new javax.swing.GroupLayout(jPanelCoordonee);
        jPanelCoordonee.setLayout(jPanelCoordoneeLayout);
        jPanelCoordoneeLayout.setHorizontalGroup(
            jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCoordoneeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCoordoneeLayout.createSequentialGroup()
                        .addGroup(jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGouvernorat, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTeleph)
                            .addComponent(jLabelFax)
                            .addComponent(jLabelSkype, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAerobase)
                            .addComponent(jLabelBP, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addComponent(jLabelCite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCoordoneeLayout.setVerticalGroup(
            jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCoordoneeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCoordoneeLayout.createSequentialGroup()
                        .addComponent(jLabelBP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCite))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelGouvernorat)
                .addGap(25, 25, 25)
                .addGroup(jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTeleph)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFax)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAerobase)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanelCoordoneeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSkype)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabelEnvlp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/card-address.png"))); // NOI18N
        jLabelEnvlp.setText(" ");

        jPanelMap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));

        jLabelMap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/esprit_1.png"))); // NOI18N
        jLabelMap.setText(" ");
        jLabelMap.setToolTipText("Cliquer pour visualiser Map");
        jLabelMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMapLayout = new javax.swing.GroupLayout(jPanelMap);
        jPanelMap.setLayout(jPanelMapLayout);
        jPanelMapLayout.setHorizontalGroup(
            jPanelMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMap, javax.swing.GroupLayout.PREFERRED_SIZE, 393, Short.MAX_VALUE)
        );
        jPanelMapLayout.setVerticalGroup(
            jPanelMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelMap, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 181, Short.MAX_VALUE)
                                .addComponent(jLabelEnvlp))
                            .addComponent(jPanelCoordonee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelContactez))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabelEcoute, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(338, 338, 338))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jPanelMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEnvlp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelContactez)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEcoute)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelFormulaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelCoordonee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtFldNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFldNomActionPerformed

    }//GEN-LAST:event_jtxtFldNomActionPerformed

    private void jtxtFldSujetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFldSujetActionPerformed

    }//GEN-LAST:event_jtxtFldSujetActionPerformed

    private void jBtnEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEnvoyerActionPerformed
        JOptionPane.showMessageDialog(this, "Message envoyé avec succés", "CONTACTEZ-NOUS", JOptionPane.INFORMATION_MESSAGE);
        jtxtFldNom.setText("");
        jtxtFldPrenom.setText("");
        jtxtFldEmail.setText("");
        jtxtFldSujet.setText("");
        jtxtAreaMessage.setText("");
    }//GEN-LAST:event_jBtnEnvoyerActionPerformed

    private void jtxtFldPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFldPrenomActionPerformed

    }//GEN-LAST:event_jtxtFldPrenomActionPerformed

    private void jBtnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnnulerActionPerformed
        jtxtFldNom.setText("");
        jtxtFldPrenom.setText("");
        jtxtFldEmail.setText("");
        jtxtFldSujet.setText("");
        jtxtAreaMessage.setText("");
        this.hide();
    }//GEN-LAST:event_jBtnAnnulerActionPerformed

    private void jtxtFldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFldEmailActionPerformed

    }//GEN-LAST:event_jtxtFldEmailActionPerformed

    private void jtxtFldNomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtFldNomMouseClicked
        jtxtFldNom.setText("");
        jtxtFldNom.setForeground(Color.BLACK);
    }//GEN-LAST:event_jtxtFldNomMouseClicked

    private void jtxtAreaMessageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtAreaMessageMouseClicked
        jtxtAreaMessage.setText("");
        jtxtAreaMessage.setForeground(Color.BLACK);
    }//GEN-LAST:event_jtxtAreaMessageMouseClicked

    private void jtxtFldPrenomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtFldPrenomMouseClicked
        jtxtFldPrenom.setText("");
        jtxtFldPrenom.setForeground(Color.BLACK);
    }//GEN-LAST:event_jtxtFldPrenomMouseClicked

    private void jtxtFldEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtFldEmailMouseClicked
        jtxtFldEmail.setText("");
        jtxtFldEmail.setForeground(Color.BLACK);
    }//GEN-LAST:event_jtxtFldEmailMouseClicked

    private void jtxtFldSujetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtFldSujetMouseClicked
        jtxtFldSujet.setText("");
        jtxtFldSujet.setForeground(Color.BLACK);
    }//GEN-LAST:event_jtxtFldSujetMouseClicked

    private void jLabelMapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMapMouseClicked

        
        new JFrameMap().setVisible(true);
//        JFrameMap jFmap = new JFrameMap();
//        jFmap.setVisible(true);

    }//GEN-LAST:event_jLabelMapMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {

                    JFrameContact frameContact = new JFrameContact();
                    frameContact.setVisible(true);

                } catch (MessagingException ex) {
                    Logger.getLogger(JFrameContact.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAnnuler;
    private javax.swing.JButton jBtnEnvoyer;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabelAerobase;
    private javax.swing.JLabel jLabelBP;
    private javax.swing.JLabel jLabelCite;
    private javax.swing.JLabel jLabelContactez;
    private javax.swing.JLabel jLabelEcoute;
    private javax.swing.JLabel jLabelEnvlp;
    private javax.swing.JLabel jLabelFax;
    private javax.swing.JLabel jLabelGouvernorat;
    private javax.swing.JLabel jLabelMap;
    private javax.swing.JLabel jLabelSkype;
    private javax.swing.JLabel jLabelTeleph;
    private javax.swing.JPanel jPanelCoordonee;
    private javax.swing.JPanel jPanelFormulaire;
    private static javax.swing.JPanel jPanelMap;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxtAreaMessage;
    private javax.swing.JTextField jtxtFldEmail;
    private javax.swing.JTextField jtxtFldNom;
    private javax.swing.JTextField jtxtFldPrenom;
    private javax.swing.JTextField jtxtFldSujet;
    // End of variables declaration//GEN-END:variables

  
}

