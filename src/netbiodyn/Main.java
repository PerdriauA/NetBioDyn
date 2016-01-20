/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package netbiodyn; //On crée un package, cette ligne indiquant que le fichier actuel sera dans ce package 

import netbiodyn.ihm.Controller; //On importe dans le Main le Contrôleur dont on va créer un objet dans la suite du code.

/**
 *
 * @author pascalballet
 */
public class Main {

	//taille d'origine de la fenêtre du logiciel
    static int FRAME_WIDTH = 900;
    static int FRAME_HEIGHT = 600;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    	//l'ouverture du logiciel entraîne la création du Contrôleur (dans ihm)
        new Controller();
    }

}

