package view;

import model.Etat;

public class Voler extends Thread{

    public Etat etat;

    public Voler(Etat etat){
        this.etat = etat;
    }

    @Override
    public void run() {
        while(true){
            etat.moveDown();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
