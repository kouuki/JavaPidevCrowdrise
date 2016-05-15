/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.SolutionDao;
import entities.Solution;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Utils.DemandeEnvoyerModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rayhana
 */
public class SolutionGui extends javax.swing.JFrame {

    SolutionDao sDao = new SolutionDao();

    /**
     * Creates new form SolutionGui
     */
    public SolutionGui() {
        initComponents();
        this.setResizable(false);
        this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 2);
        tfId.setVisible(false);
        idUpload2.setVisible(false);
        loadAcceptedProblems();
        idUpload2.setText("0");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tP1 = new javax.swing.JPanel();
        panelAjoutDemande = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DescLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfSalaire = new javax.swing.JTextField();
        tfTitre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfDescription = new javax.swing.JTextPane();
        btnEnvoyerDemande = new javax.swing.JButton();
        tP2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabDemandeEnvoye = new javax.swing.JTable();
        panelModifier = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfTitre1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfDescription1 = new javax.swing.JTextPane();
        btnSupprimer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        tfId = new javax.swing.JLabel();
        msgTab1 = new javax.swing.JLabel();
        tp3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabDemandeAcceptee = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cbProblem = new javax.swing.JComboBox();
        panelUpload = new javax.swing.JPanel();
        btnParcourir = new javax.swing.JButton();
        btnEnregistrer = new javax.swing.JButton();
        idUpload2 = new javax.swing.JLabel();
        labelFichier = new javax.swing.JLabel();
        tP4 = new javax.swing.JPanel();
        panelCredit = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Espace Solver");

        panelAjoutDemande.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajout demande"));

        jLabel2.setText("Titre:");

        DescLabel.setText("Description:");

        jLabel4.setText("Rénumération:");

        tfSalaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalaireActionPerformed(evt);
            }
        });

        tfTitre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTitreActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tfDescription);

        btnEnvoyerDemande.setText("Envoyer");
        btnEnvoyerDemande.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvoyerDemandeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAjoutDemandeLayout = new javax.swing.GroupLayout(panelAjoutDemande);
        panelAjoutDemande.setLayout(panelAjoutDemandeLayout);
        panelAjoutDemandeLayout.setHorizontalGroup(
            panelAjoutDemandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjoutDemandeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAjoutDemandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(DescLabel)
                    .addComponent(jLabel2))
                .addGap(61, 61, 61)
                .addGroup(panelAjoutDemandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAjoutDemandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                        .addComponent(tfSalaire))
                    .addComponent(tfTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAjoutDemandeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnvoyerDemande)
                .addGap(196, 196, 196))
        );
        panelAjoutDemandeLayout.setVerticalGroup(
            panelAjoutDemandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAjoutDemandeLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelAjoutDemandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelAjoutDemandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfSalaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(panelAjoutDemandeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnEnvoyerDemande)
                .addContainerGap())
        );

        javax.swing.GroupLayout tP1Layout = new javax.swing.GroupLayout(tP1);
        tP1.setLayout(tP1Layout);
        tP1Layout.setHorizontalGroup(
            tP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tP1Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(panelAjoutDemande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        tP1Layout.setVerticalGroup(
            tP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tP1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(panelAjoutDemande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Ajout demande", tP1);

        tabDemandeEnvoye.setModel(new DemandeEnvoyerModel());
        tabDemandeEnvoye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDemandeEnvoyeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabDemandeEnvoye);

        panelModifier.setBorder(javax.swing.BorderFactory.createTitledBorder("Modifiez votre demande"));

        jLabel5.setText("Titre:");

        jLabel6.setText("Description:");

        tfTitre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTitre1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(tfDescription1);

        btnSupprimer.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayhana\\Desktop\\3A18\\PIDEV\\java\\1457827364_DeleteRed.png")); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnModifier.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rayhana\\Desktop\\3A18\\PIDEV\\java\\1457826966_common-new-edit-compose-glyph.png")); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModifierLayout = new javax.swing.GroupLayout(panelModifier);
        panelModifier.setLayout(panelModifierLayout);
        panelModifierLayout.setHorizontalGroup(
            panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModifierLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModifierLayout.createSequentialGroup()
                        .addGroup(panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(panelModifierLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTitre1)
                            .addComponent(jScrollPane2)))
                    .addGroup(panelModifierLayout.createSequentialGroup()
                        .addGap(0, 132, Short.MAX_VALUE)
                        .addComponent(btnModifier)
                        .addGap(18, 18, 18)
                        .addComponent(btnSupprimer))
                    .addGroup(panelModifierLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(tfId)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelModifierLayout.setVerticalGroup(
            panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModifierLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(tfId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTitre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(47, 47, 47)
                .addGroup(panelModifierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifier)
                    .addComponent(btnSupprimer))
                .addGap(28, 28, 28))
        );

        msgTab1.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout tP2Layout = new javax.swing.GroupLayout(tP2);
        tP2.setLayout(tP2Layout);
        tP2Layout.setHorizontalGroup(
            tP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tP2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(tP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgTab1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tP2Layout.setVerticalGroup(
            tP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tP2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(tP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tP2Layout.createSequentialGroup()
                        .addComponent(msgTab1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(tP2Layout.createSequentialGroup()
                        .addComponent(panelModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(76, 76, 76))))
        );

        jTabbedPane1.addTab("Demandes envoyées", tP2);

        tabDemandeAcceptee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabDemandeAccepteeMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabDemandeAcceptee);

        jLabel7.setText("Problème:");

        cbProblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProblemActionPerformed(evt);
            }
        });

        panelUpload.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choisissez votre fichier", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnParcourir.setText("Parcourir...");
        btnParcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParcourirActionPerformed(evt);
            }
        });

        btnEnregistrer.setText("Enregistrer");
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        idUpload2.setText("idUpload");

        labelFichier.setText("Aucun fichier choisi");

        javax.swing.GroupLayout panelUploadLayout = new javax.swing.GroupLayout(panelUpload);
        panelUpload.setLayout(panelUploadLayout);
        panelUploadLayout.setHorizontalGroup(
            panelUploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUploadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnregistrer)
                .addGap(23, 23, 23))
            .addGroup(panelUploadLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelUploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelFichier)
                    .addComponent(btnParcourir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idUpload2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        panelUploadLayout.setVerticalGroup(
            panelUploadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUploadLayout.createSequentialGroup()
                .addComponent(idUpload2)
                .addGap(18, 18, 18)
                .addComponent(btnParcourir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelFichier)
                .addGap(23, 23, 23)
                .addComponent(btnEnregistrer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tp3Layout = new javax.swing.GroupLayout(tp3);
        tp3.setLayout(tp3Layout);
        tp3Layout.setHorizontalGroup(
            tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp3Layout.createSequentialGroup()
                .addGroup(tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tp3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelUpload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tp3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tp3Layout.setVerticalGroup(
            tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tp3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbProblem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelUpload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Demandes acceptées", tp3);

        panelCredit.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrez vos coordonnées"));

        jLabel12.setText("Nom de l'utilisateur:");

        jLabel13.setText("Mot de passe:");

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel14.setText("Code:");

        jButton4.setText("Valider");

        txtPass.setText("jPasswordField1");

        javax.swing.GroupLayout panelCreditLayout = new javax.swing.GroupLayout(panelCredit);
        panelCredit.setLayout(panelCreditLayout);
        panelCreditLayout.setHorizontalGroup(
            panelCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreditLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panelCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(panelCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addGroup(panelCreditLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton4))
                    .addComponent(txtPass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCreditLayout.setVerticalGroup(
            panelCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreditLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelCreditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tP4Layout = new javax.swing.GroupLayout(tP4);
        tP4.setLayout(tP4Layout);
        tP4Layout.setHorizontalGroup(
            tP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tP4Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(panelCredit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(162, 162, 162))
        );
        tP4Layout.setVerticalGroup(
            tP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tP4Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(panelCredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Chargement crédits", tP4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfSalaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSalaireActionPerformed

    private void tfTitreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTitreActionPerformed


    }//GEN-LAST:event_tfTitreActionPerformed

    private void btnEnvoyerDemandeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvoyerDemandeActionPerformed
        tfSalaire.setText("0");
        Solution s = new Solution();
        //Le contrôle de saisie sur les champs titre, salaire et description :D
        s.setTitre(tfTitre.getText());
        s.setSalaire(Double.parseDouble(tfSalaire.getText()));
        s.setDescription(tfDescription.getText());
        s.setEtat("En attente");
        SolutionDao sdao = new SolutionDao();
        //1= id du problème selectionné
        //2= id du Solver connecté
        sdao.addDemande(s,1,2);
        JOptionPane.showMessageDialog(null, "Votre demande a été bien envoyée.");
    }//GEN-LAST:event_btnEnvoyerDemandeActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        msgTab1.setText("");

        if (tabDemandeEnvoye.getSelectedRow() == -1) {
            if (tabDemandeEnvoye.getRowCount() == 0) {
                msgTab1.setText("Table vide.");
            } else {
                msgTab1.setText("Vous devez selectionner une demande.");
            }
        } else {

            Solution s = new Solution();
            s.setTitre(tfTitre1.getText());
            s.setDescription(tfDescription1.getText());
            SolutionDao sdao = new SolutionDao();
            sdao.updateSolution(Integer.parseInt(tfId.getText()), s);
            jScrollPane3.setViewportView(tabDemandeEnvoye);

            JOptionPane.showMessageDialog(null, "Votre demande a été bien modifiée.");

        }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        SolutionDao sdao = new SolutionDao();
        try {
            int i = tabDemandeEnvoye.getSelectedRow();

            int s = (int) tabDemandeEnvoye.getModel().getValueAt(i, 0);
            sdao.removeById(s);

        } catch (ArrayIndexOutOfBoundsException exp) {
            JOptionPane.showMessageDialog(null, "Veuillez selectionner une demande à supprimer.");
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed
    String filePath;
    String fileName;
    private void tfTitre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTitre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTitre1ActionPerformed

    private void btnParcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParcourirActionPerformed

        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File f = fc.getSelectedFile();
        filePath = f.getAbsolutePath();
        fileName = filePath.substring(filePath.lastIndexOf(File.separator) + 1);
        DescLabel.setText(filePath);
        labelFichier.setText(fileName);
    }//GEN-LAST:event_btnParcourirActionPerformed

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed

        InputStream inputStream = null;
        BufferedReader br = null;
        OutputStream outputStream = null;
        if (filePath == null) {
            JOptionPane.showMessageDialog(null, "Vous devez choisir une offre et un fichier.");
        } else if (idUpload2.getText() == "0") {
            JOptionPane.showMessageDialog(null, "Vous devez choisir une offre et un fichier.");
        } else {

            File file = new File(filePath);
            SolutionDao sDao = new SolutionDao();

            sDao.updateFichierSolution(filePath, Integer.parseInt(idUpload2.getText()));
            File uploadDir;
            uploadDir = new File("C:\\wamp\\www\\Uploads\\Solutions\\" + (String) cbProblem.getSelectedItem().toString());

            try {
                // read this file into InputStream
                inputStream = new FileInputStream(file);

                // write the inputStream to a FileOutputStream
                if (!uploadDir.exists()) {
                    uploadDir.mkdir();
                    System.out.println("Upload Directory Created");
                }
                outputStream = new FileOutputStream(new File(uploadDir.getAbsolutePath() + File.separator + fileName));

                int length;
                byte[] bytes = new byte[1024];

                while ((length = inputStream.read(bytes)) > 0) {
                    outputStream.write(bytes, 0, length);
                }
                System.out.println("Done!");

            } catch (IOException e) {

            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {

                    }
                }
                if (outputStream != null) {
                    try {
                        // outputStream.flush();
                        outputStream.close();
                    } catch (IOException e) {
                    }

                }
                JOptionPane.showMessageDialog(null, "Votre offre a été bien enregistré.");
            }
        }
    }//GEN-LAST:event_btnEnregistrerActionPerformed

    private void tabDemandeEnvoyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDemandeEnvoyeMouseClicked

        int elementselectionner = tabDemandeEnvoye.getSelectedRow();
        tfId.setText("" + tabDemandeEnvoye.getValueAt(elementselectionner, 0));
        tfTitre1.setText(((String) tabDemandeEnvoye.getValueAt(elementselectionner, 1)));
        tfDescription1.setText(((String) tabDemandeEnvoye.getValueAt(elementselectionner, 3)));

    }//GEN-LAST:event_tabDemandeEnvoyeMouseClicked

    private void cbProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProblemActionPerformed
        SolutionDao mq = new SolutionDao();
        ArrayList<Solution> list = mq.getDataSolution((String) cbProblem.getSelectedItem().toString());
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"ID", "Offre", "Description"});
        Object[] row = new Object[3];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getIdSolution();
            row[1] = list.get(i).getTitre();
            row[2] = list.get(i).getDescription();
            model.addRow(row);

        }
        tabDemandeAcceptee.setModel(model);
    }//GEN-LAST:event_cbProblemActionPerformed

    private void tabDemandeAccepteeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabDemandeAccepteeMouseClicked
        int elementselectionner = tabDemandeAcceptee.getSelectedRow();
        idUpload2.setText("" + tabDemandeAcceptee.getValueAt(elementselectionner, 0));
    }//GEN-LAST:event_tabDemandeAccepteeMouseClicked

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void loadAcceptedProblems() {
        Set<String> tab = new HashSet();

        try {
            //2 = id du solver connecté
            ResultSet res = sDao.getAcceptedProblems(2);
            while (res.next()) {
                tab.add(res.getString(6));
            }
            for (Object o : tab) {
                System.out.println();
                cbProblem.addItem((String) o);

            }

        } catch (SQLException ex) {
            Logger.getLogger(SolutionGui.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }

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
            java.util.logging.Logger.getLogger(SolutionGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolutionGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolutionGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolutionGui.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolutionGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DescLabel;
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnEnvoyerDemande;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnParcourir;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JComboBox cbProblem;
    private javax.swing.JLabel idUpload2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelFichier;
    private javax.swing.JLabel msgTab1;
    private javax.swing.JPanel panelAjoutDemande;
    private javax.swing.JPanel panelCredit;
    private javax.swing.JPanel panelModifier;
    private javax.swing.JPanel panelUpload;
    private javax.swing.JPanel tP1;
    private javax.swing.JPanel tP2;
    private javax.swing.JPanel tP4;
    private javax.swing.JTable tabDemandeAcceptee;
    private javax.swing.JTable tabDemandeEnvoye;
    private javax.swing.JTextPane tfDescription;
    private javax.swing.JTextPane tfDescription1;
    private javax.swing.JLabel tfId;
    private javax.swing.JTextField tfSalaire;
    private javax.swing.JTextField tfTitre;
    private javax.swing.JTextField tfTitre1;
    private javax.swing.JPanel tp3;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
