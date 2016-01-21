/* This file is part of NetBioDyn.
 *
 *   NetBioDyn is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation; either version 3 of the License, or
 *   any later version.
 *
 *   NetBioDyn is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with NetBioDyn; if not, write to the Free Software
 *   Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
/*
 * WndGererEntites.java
 *
 * Created on 1 novembre 2007, 09:40
 */
package netbiodyn.ihm;

import netbiodyn.util.UtilFileFilter;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import netbiodyn.Behavior;
import netbiodyn.Entity;
import netbiodyn.Compartment;
import netbiodyn.util.Lang;
import netbiodyn.util.RandomGen;

/**
 *
 * @author ballet
 */
public class WndEditCompartment extends javax.swing.JDialog {

    private final ArrayList<Entity> entities;
    private final ArrayList<Behavior> behaviours;
    private final ArrayList<Compartment> compartment;
    private String DialogResult = "";
    public Compartment _cli = null;
    String _old_name = "";
    Color _old_color = Color.black;
    
    
    /**
     * Creates new form WndGererEntites
     * @param entities
     * @param behaviours
     */
    public WndEditCompartment(ArrayList<Entity> entities, ArrayList<Behavior> behaviours, ArrayList<Compartment> compartment) {
        this.setModal(true);
        this.entities=entities;
        this.behaviours=behaviours;
        this.compartment=compartment;
        initComponents();
    }
    

    public void WndCliValue_Load(Compartment comp) {
        // Set language
        if (Lang.getInstance().getLang().equals("FR")) {
            jLabelNom.setText("Nom");
            jLabelApp.setText("Apparence");
            jCheckBox_vidable.setText("Vidable");
            jLabelDescr.setText("Description");
            button_CANCEL.setText("Annuler");
            buttonCouleur.setText("Couleur");

        } else {
            jLabelNom.setText("Name");
            jLabelApp.setText("Appearance");
            jCheckBox_vidable.setText("Cleanable");
            jLabelDescr.setText("Description");
            button_CANCEL.setText("Cancel");
            buttonCouleur.setText("Color");
        }

        if (comp != null) {
            setCli(comp);
        } else {
            _cli = new Compartment();
            _cli.Couleur = new Color(RandomGen.getInstance().nextInt(250),RandomGen.getInstance().nextInt(250), RandomGen.getInstance().nextInt(250));
        }
        
        _old_name = _cli.getEtiquettes();
        _old_color = _cli.Couleur;

        textBox1.setText(_cli.getEtiquettes());

        // Apparence
        buttonCouleur.setBackground(_cli.Couleur);
        
        richTextBox_description.setText(_cli.getDescription().getText());
        jCheckBox_vidable.setSelected(_cli.Vidable);
            //this.setSize(new Dimension(WndEditEntite.WIDTH,WndEditEntite.HEIGHT+320));
    }

    public Compartment getCli() {
        return _cli;
    }

    public void setCli(Compartment _cli) {
        this._cli = _cli;
    }

    public String getDialogResult() {
        return DialogResult;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNom = new javax.swing.JLabel();
        jLabelApp = new javax.swing.JLabel();
        textBox1 = new javax.swing.JTextField();
        buttonCouleur = new javax.swing.JButton();
        jCheckBox_vidable = new javax.swing.JCheckBox();
        button_OK = new javax.swing.JButton();
        button_CANCEL = new javax.swing.JButton();
        jLabelDescr = new javax.swing.JLabel();
        button_aide_description = new javax.swing.JButton();
        richTextBox_description = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel19 = new javax.swing.JLabel();

        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(204, 204, 255));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabelNom.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabelNom.setText("Nom");
        getContentPane().add(jLabelNom);
        jLabelNom.setBounds(10, 40, 50, 15);
        

        jLabelApp.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabelApp.setText("Apparence");
        getContentPane().add(jLabelApp);
        jLabelApp.setBounds(10, 130, 70, 15);

        textBox1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        textBox1.setText("nom");
        textBox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textBox1KeyTyped(evt);
            }
        });
        getContentPane().add(textBox1);
        textBox1.setBounds(60, 40, 220, 20);

        buttonCouleur.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        buttonCouleur.setText("Couleur");
        buttonCouleur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCouleurMouseClicked(evt);
            }
        });
        getContentPane().add(buttonCouleur);
        buttonCouleur.setBounds(80, 130, 80, 21);

        jCheckBox_vidable.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jCheckBox_vidable.setSelected(true);
        jCheckBox_vidable.setText("Vidable");
        jCheckBox_vidable.setToolTipText("");
        jCheckBox_vidable.setContentAreaFilled(false);
        jCheckBox_vidable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCheckBox_vidable.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jCheckBox_vidable);
        jCheckBox_vidable.setBounds(10, 190, 110, 20);

        button_OK.setBackground(new java.awt.Color(153, 255, 153));
        button_OK.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        button_OK.setText("OK");
        button_OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_OKMouseClicked(evt);
            }
        });
        button_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_OKActionPerformed(evt);
            }
        });
        getContentPane().add(button_OK);
        button_OK.setBounds(0, 220, 280, 23);

        button_CANCEL.setBackground(new java.awt.Color(255, 153, 153));
        button_CANCEL.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        button_CANCEL.setText("Annuler");
        button_CANCEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_CANCELMouseClicked(evt);
            }
        });
        button_CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_CANCELActionPerformed(evt);
            }
        });
        getContentPane().add(button_CANCEL);
        button_CANCEL.setBounds(293, 220, 210, 23);

        jLabelDescr.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabelDescr.setText("Description de l'entite");
        getContentPane().add(jLabelDescr);
        jLabelDescr.setBounds(300, 40, 141, 15);

        button_aide_description.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        button_aide_description.setText("?");
        button_aide_description.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_aide_descriptionMouseClicked(evt);
            }
        });
        getContentPane().add(button_aide_description);
        button_aide_description.setBounds(447, 33, 40, 23);

        richTextBox_description.setColumns(20);
        richTextBox_description.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        richTextBox_description.setLineWrap(true);
        richTextBox_description.setRows(5);
        getContentPane().add(richTextBox_description);
        richTextBox_description.setBounds(300, 69, 190, 130);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 71, 2, 2);

        jLabel19.setBackground(new java.awt.Color(153, 153, 255));
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel19.setOpaque(true);
        getContentPane().add(jLabel19);
        jLabel19.setBounds(0, 0, 500, 30);

        setSize(new java.awt.Dimension(533, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_CANCELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_CANCELMouseClicked
// TODO add your handling code here:

    }//GEN-LAST:event_button_CANCELMouseClicked

    private void button_aide_descriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_aide_descriptionMouseClicked
        // TODO add your handling code here:
        if (Lang.getInstance().getLang().equals("FR")) {
            JOptionPane.showMessageDialog(this, "Placer ici du texte decrivant cette entite. L'accès a cette description se fera aussi par un clic droit sur une entite dans le simulateur.", "Information", JOptionPane.INFORMATION_MESSAGE, null);
        } else {
            JOptionPane.showMessageDialog(this, "Put a short description of this entity. This description is also displayed by a right-click in the simulator.", "Information", JOptionPane.INFORMATION_MESSAGE, null);
        }

    }//GEN-LAST:event_button_aide_descriptionMouseClicked


    private void buttonCouleurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCouleurMouseClicked
        // TODO add your handling code here:
        
        // List des couleurs deja existantes
        ArrayList<Color> lst_col = new ArrayList<Color>();
        for (int ii = 0; ii < entities.size(); ii++) {
            lst_col.add((entities.get(ii)).Couleur);
        }
        JColorChooser colorDialog1 = new JColorChooser();
        colorDialog1.setColor(_cli.Couleur);

        Color returnColor = JColorChooser.showDialog(this, "", _cli.Couleur);
        {
            lst_col.remove(_old_color);

            if (lst_col.contains(returnColor) == true) {
                // Cas ou la couleur existe deja
                if (Lang.getInstance().getLang().equals("FR")) {
                    JOptionPane.showMessageDialog(this, "Cette couleur d'entite existe deja. Changement non effectue.", "Information", JOptionPane.INFORMATION_MESSAGE, null);
                } else {
                    JOptionPane.showMessageDialog(this, "This color is already in use", "Information", JOptionPane.INFORMATION_MESSAGE, null);
                }

            } else {
                if (returnColor != null) {
                    if (returnColor.equals(Color.WHITE)) {
                        // Cas ou la couleur est blanche
                        if (Lang.getInstance().getLang().equals("FR")) {
                            JOptionPane.showMessageDialog(this, "La couleur blanche est reservee pour les emplacements vides de l'environnement. Changement non effectue.", "Information", JOptionPane.INFORMATION_MESSAGE, null);
                        } else {
                            JOptionPane.showMessageDialog(this, "The white color is not usable.", "Information", JOptionPane.INFORMATION_MESSAGE, null);
                        }

                    } else {
                        _cli.Couleur = returnColor;
                        buttonCouleur.setBackground(returnColor);
                        _old_color = _cli.Couleur;
                    }
                }
            }
        }
    }//GEN-LAST:event_buttonCouleurMouseClicked

    private void button_OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_OKMouseClicked


    }//GEN-LAST:event_button_OKMouseClicked

    private void textBox1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textBox1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c == '\\' || c == '/' || c == ':' || c == ' ' || c == '*' || c == '?' || c == '\"' || c == '<' || c == '>' || c == '|') {
            evt.consume();
            if (Lang.getInstance().getLang().equals("FR")) {
                JOptionPane.showMessageDialog(this, "Les caracteres \\ / : ESPACE * ? \" < > , et | sont interdits. Merci de votre comprehension", "ATTENTION", JOptionPane.INFORMATION_MESSAGE, null);
            } else {
                JOptionPane.showMessageDialog(this, "Characteres \\ / : SPACE * ? \" < > , and | are forbiden.", "ATTENTION", JOptionPane.INFORMATION_MESSAGE, null);
            }
        }
        if (c == '\n') {
            button_OKActionPerformed(null);
        }
    }//GEN-LAST:event_textBox1KeyTyped

    private void button_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_OKActionPerformed
        if (textBox1.getText().equals("")) {
            if (Lang.getInstance().getLang().equals("FR")) {
                JOptionPane.showMessageDialog(this, "Merci de nommer l'entité.", "Information", JOptionPane.INFORMATION_MESSAGE, null);
            } else {
                JOptionPane.showMessageDialog(this, "Please name the entity.", "Information", JOptionPane.INFORMATION_MESSAGE, null);
            }
            return;
        }

        // List des noms deja existants
        ArrayList<String> lst_str = new ArrayList<>();        
        for (Entity entity : entities) {
            lst_str.add(entity._etiquettes);       
        }

        lst_str.remove(_old_name);

        // Verif que le nom n'est pas deja attribue a un comportement
        for (int n = 0; n < behaviours.size(); n++) {
            if (behaviours.get(n).TrouveEtiquette(textBox1.getText()) >= 0) {
                // Cas ou le nom existe deja
                if (Lang.getInstance().getLang().equals("FR")) {
                    JOptionPane.showMessageDialog(this, "Ce nom existe déjà. Veuillez en changer svp.", "Information", JOptionPane.INFORMATION_MESSAGE, null);
                } else {
                    JOptionPane.showMessageDialog(this, "This name already exists.", "Information", JOptionPane.INFORMATION_MESSAGE, null);
                }
                return;
            }
        }

        if (lst_str.contains(textBox1.getText()) == true) {
            // Cas ou le nom existe deja
            if (Lang.getInstance().getLang().equals("FR")) {
                JOptionPane.showMessageDialog(this, "Ce nom existe déjà. Veuillez en changer svp.", "Information", JOptionPane.INFORMATION_MESSAGE, null);
            } else {
                JOptionPane.showMessageDialog(this, "This name already exists.", "Information", JOptionPane.INFORMATION_MESSAGE, null);
            }
            return;
        }
        try {
            _cli.setEtiquettes(textBox1.getText());
            _cli.getDescription().setText(richTextBox_description.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        // Apparence
        _cli.Couleur = buttonCouleur.getBackground();
        
        

        _cli.Vidable = jCheckBox_vidable.isSelected();

        this.DialogResult = new String("OK");
        setVisible(false);
    }//GEN-LAST:event_button_OKActionPerformed

    private void button_CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_CANCELActionPerformed
        // TODO add your handling code here:
        this.DialogResult = new String("CANCEL");
        setVisible(false);
    }//GEN-LAST:event_button_CANCELActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

        //if()
    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCouleur;
    private javax.swing.JButton button_CANCEL;
    private javax.swing.JButton button_OK;
    private javax.swing.JButton button_aide_description;
    private javax.swing.JCheckBox jCheckBox_vidable;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabelApp;
    private javax.swing.JLabel jLabelDescr;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea richTextBox_description;
    private javax.swing.JTextField textBox1;
    // End of variables declaration//GEN-END:variables

}