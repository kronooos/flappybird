package model;

import view.Affichage;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public class Parcours {
    public ArrayList<Point> points = new ArrayList<Point>();
    public Random random = new Random();

    public static final int NB_POINT=7;
    public static final int MAX= Affichage.LARG+100;
    public static final double DELTA= MAX/ (float) NB_POINT;


    public Parcours(){

        for(int i=0; i<NB_POINT;i++){
            points.add(new Point((int)Math.round(i*DELTA + random.nextDouble() * DELTA), random.nextInt(Affichage.HAUT)));
        }
    }

    public ArrayList<Point> getParcours(){
        return this.points;
    }
}
