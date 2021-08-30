package view;

import controller.SapoCorrendo;

public class Corrida {
    final static int NUM_SAPOS = 5; //quantidade de sapos na corrida 
    final static int DISTANCIA = 250; //distancia da corrida 

    public static void main(String[] args) {
        //colocando sapos na corrida 

        SapoCorrendo corrida;

        for (int i = 1; i <= NUM_SAPOS; i++) {
            corrida = new SapoCorrendo("SAPO"+ i, DISTANCIA);

            corrida.start();
        }

    }

}