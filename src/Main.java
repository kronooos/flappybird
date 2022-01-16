import view.Affichage;
import view.FenetrePrincipale;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Pour mettre en œuvre tout le projet, autrement dit le point de déclenchement.
 * @author Mahdi RANJBAR
 */
public class Main  {

    public static void main(String [] args) {

    /*
        model.Parcours p = new model.Parcours();
        ArrayList<Point> p1 = p.points;

        for(int i = 0; i < p1.size(); i++) {
            System.out.print(p1.get(i)+"\n");
        }

     */



        FenetrePrincipale fentre = new FenetrePrincipale();

        fentre.add(new Affichage());

        fentre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fentre.pack();
        fentre.setVisible(true);

    }
}