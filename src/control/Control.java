package control;

import model.Etat;
import view.Affichage;

import java.awt.event.MouseEvent;


/**
 * Ça définit la manière dont l’état du modèle change. Il effectue les changements dans le modèle et informe la vue d’un
 * changement. Il s'occupe. Il s’occupe ainsi de la gestion des évènement de la souris.
 * @author Mahdi RANJBAR
 */
public class Control extends MouseControler {
    public Etat etat;
    public Affichage affichage;

    /**
     * Ça crée un contrôle sur un etat et un affichage spécifique.
     * @param etat Un objet de la classe Etat représentant l’etat actuel du jeu.
     * @param affichage Un objet de la classe Affichage représentant l’affichage actuel de l’interface graphique.
     */
    public Control(Etat etat, Affichage affichage){
        this.etat = etat;
        this.affichage = affichage;
    }

    /**
     * Ça définit la gestion de la clique de souris de façon que lorsqu’on clique dans l’interface, la position y de
     * l’ovale est monté de TAILLE_SAUT en appelant la méthode jump et puis à travers de l’objet affichage on appelle
     * la méthode repaint pour redessiner l’interface.
     * @param e Un objet de la classe MouseEvent
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        etat.jump();
        affichage.repaint(Affichage.OVAL_X -1
                , etat.getHauteur()-1
                ,Affichage.OVAL_LARG+2
                ,Affichage.OVAL_HAUT+Affichage.SAUT_TAILLE+2);

        //NOT SURE!!!!!!!
        affichage.revalidate();
    }

}
