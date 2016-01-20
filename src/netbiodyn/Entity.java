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
 * Entite.java
 *
 * Created on 15 octobre 2007, 15:23
 */
package netbiodyn;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ballet
 */
public class Entity extends ProtoSimplexel {

    /**
     * Creates new form Entite
     */
    public Entity() {
        initComponents();
        //_description.setContentType("text/rtf");
        //setBounds(0-200,0-200, 134-200, 73-200);
    }

    @Override
    public Entity clone() {
        Entity reaxel = new Entity();
        reaxel.setEtiquettes(getEtiquettes());
        reaxel.Couleur=Couleur;
        reaxel._visibleDansPanel=_visibleDansPanel;
        reaxel.Vidable=Vidable;
        reaxel.DemieVie=DemieVie;
        reaxel._forme = _forme;
        reaxel._taille = _taille;
        if (BackgroundImage != null) {
            reaxel._str_image_deco=_str_image_deco;
        }
        return reaxel;
    }

    @Override
    public ArrayList<String> toSave() {
        ArrayList<String> toSave = super.toSave();
        toSave.add(new String("\tforme:").concat(((Integer) this._forme).toString()) + "\n");
        toSave.add(new String("\ttaille:").concat(((Integer) this._taille).toString()) + "\n");

        if (BackgroundImage != null) {
            toSave.add("\tImage:" + _str_image_deco + "\n");
        }
        return toSave;
    }

    public int getTailleFenetre() {
        return _tailleFenetre;
    }

    public void setTailleFenetre(int t) {
        _tailleFenetre = t;
    }

    public double Proportion = 1;

    public BufferedImage BackgroundImage;

    int _tailleFenetre = 100;
    public int _taille = 0; // 0=Grande. 1=moyenne. 2=petite
    public int _forme = 1; //0=disque. 1=carre. 2=triangle. 3=losange. 4=etoile. 5=pois. 6=bruit.
    public String _str_image_deco = new String("");
    int _nbPosAngulaires = 1; // 1 pos angulaire est possible par defaut

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}

