package view;

import control.Control;
import model.Etat;
import model.Parcours;

import java.awt.*;
import javax.swing.*;


/**
 * Ça représente l'interface graphique du jeu.
 * @author Mahdi RANJBAR
 */
public class Affichage extends JPanel {

    //Dimensions du panel
    public static final int LARG = 600;
    public static final int HAUT = 400;

    //Dimensions de l'oval
    public static final int OVAL_X = 10;
    /*
     * On utilise cette valeur pour la valeur initiale de la hauteur dans la classe Etat
     * public static final int OVAL_y = 300;
     */
    public static final int OVAL_LARG = 20;
    public static final int OVAL_HAUT = 90;

    //Taille du saut
    public static final int SAUT_TAILLE = 50;

    public Etat etat = new Etat(this);
    public Control ctl = new Control(etat,this);
    public Voler voler = new Voler(etat);

    /**
     * Ça crée le panel et active l’évènement mouseClicked là-dessus.
     */
    public Affichage() {
        setPreferredSize(new Dimension(LARG, HAUT));
        this.addMouseListener(ctl);
        voler.start();
    }

    /**
     * Ça dessine l’ovale dans le panel
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(OVAL_X, etat.getHauteur(), OVAL_LARG, OVAL_HAUT);
        drawLines(g);
    }

    void drawLines(Graphics g) {
       // Graphics2D g2d = (Graphics2D) g;

        for(int i=0;i<Parcours.NB_POINT-1;i++){
            g.drawLine(etat.parcours.getParcours().get(i).x
                    ,etat.parcours.getParcours().get(i).y
                    ,etat.parcours.getParcours().get(i+1).x
                    ,etat.parcours.getParcours().get(i+1).y);
        }
    }

}
