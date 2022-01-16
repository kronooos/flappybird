package model;


import view.Affichage;

import java.awt.*;

/**
 * Ça définit l’ensemble des données qui caractérisent l’état de l’interface.
 * @author Mahdi RANJBAR
 */
public class Etat {

    //Hauteur initiale
    public int hauteur=0;

    //Taille de pixel pour le dépalcement vers le bas
    public static final int DESC_TAILL = 10;


    public Affichage affichage;

    public Parcours parcours = new Parcours();

    public Etat(Affichage affichage){
        this.affichage = affichage;
    }




    /**
     * Ça prend la positon y de l’ovale.
     * @return Un entier représentant la position y de l’ovale.
     */
    public int getHauteur(){
        return this.hauteur;
    }


    /**
     * Ça fait monter la position y de l’ovale de TAILLE_SAUT.
     */
    public void jump(){

        //Vérification pour ne pas dépasser la borne du panel
        if(hauteur- Affichage.SAUT_TAILLE < 0){
            System.out.println("ATTENTION À LA BORNE!");
        }
        else {
            hauteur -= Affichage.SAUT_TAILLE;
        }
    }

    /**
     *
     */
    public void moveDown(){
        if(hauteur+DESC_TAILL > Affichage.HAUT-Affichage.OVAL_HAUT){
            System.out.println("ĆA DEPASSE LA BORNE!");
        }
        else{
            hauteur+=DESC_TAILL;
        }

        affichage.repaint(Affichage.OVAL_X -1
                , getHauteur()-DESC_TAILL-1
                ,Affichage.OVAL_LARG+2
                ,Affichage.OVAL_HAUT+DESC_TAILL+2);
    }
}
