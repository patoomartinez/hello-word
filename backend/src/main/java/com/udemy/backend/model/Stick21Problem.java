package com.udemy.backend.model;

import java.util.Scanner;

public class Stick21Problem {
	public static void main(String[] args) {
        int cantidadSticks = 21;
        System.out.println("BIENVENIDO A 21STICK PROBLEM - DESEA JUGAR?  S/N");
		Scanner sc = new Scanner(System.in);

        String first = sc.nextLine().toUpperCase();
        if (first.equals("S")) {
            int numTake = 0;
            System.out.println("DESEA SER PRIMERO? S/N");
            String first2 = sc.nextLine().toUpperCase();
            while (cantidadSticks > 0) {
                if (first2.equals("S")) {

                    //Arranca Participante 1
                    System.out.println("CANTIDAD DE PALOS DISPONIBLES :[" + cantidadSticks+ "]");


                    System.out.println("Cuantos palos desea agarrar (1 or 2?");
                    numTake = sc.nextInt();
                    if (numTake > 2) {
                        numTake = 2;
                    } else if (numTake < 1) {
                        numTake = 1;

                    }
                    cantidadSticks = cantidadSticks - numTake;


                    System.out.println("CANTIDAD DE PALOS DISPONIBLES : [" + cantidadSticks + "]");


                    if (cantidadSticks <= 0) {
                        System.out.println("YOU LOSE!");


                    } else {
                        if ((cantidadSticks - 2) % 3 == 0 || cantidadSticks - 2 == 0) {
                            numTake = 1;
                        } else {
                            numTake = 2;
                        }

                        System.out.println("[PLAYER 2] tomo [" + numTake + "] palos");
                        cantidadSticks = cantidadSticks - numTake;

                        if (cantidadSticks <= 0) {
                            System.out.println("GANASTE!");
                        }


                    }


                } else {
                    //ARRANCA PARTICIPANTE 2

                    if ((cantidadSticks - 2) % 3 == 0 || cantidadSticks - 2 == 0) {
                        numTake = 1;
                    } else {
                        numTake = 2;
                    }

                    System.out.println("[JUGADOR 2] toma " + numTake + " palos");

                    cantidadSticks = cantidadSticks - numTake;

                    if (numTake <= 0) {
                        System.out.println("You win!");
                    } else {
                        //TURNO JUGADOR UNO
                        System.out.println("Quedan " + cantidadSticks + " palos");
                        System.out.println("Cuantos palos desea agarrar (1 or 2?");
                        numTake = sc.nextInt();
                        if(numTake>2){
                            numTake = 2;
                        } else if(numTake<1){
                            numTake = 1;
                        }
                        cantidadSticks = cantidadSticks - numTake;

                        if (cantidadSticks<= 0){
                            System.out.println("PERDISTE !!!");
                        }
                    }

                }
            }
        } else {
            System.out.println("HASTA LUEGO!");
        }

    }
}
