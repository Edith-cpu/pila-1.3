/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila3;

import java.util.Scanner;

/**
 *
 * @author garci
 */
public class Pila3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tamaño = 0, opcion = 0, c1 = 0, Aux = 0;//creacion de variables para guardar el tamaño del arreglo 
        System.out.println("Introducir tamaño deseado de las pilas A y B...\n");//pedir al usuario que tmaño desea
        Tamaño = sc.nextInt();//hace que lea comandos del teclado de tipo entero

        int PilaA[] = new int[Tamaño];//creacion de las pilas (arreglos donde se apilan datos) que 
        int PilaB[] = new int[Tamaño];//depende del usuario su tamaño
        int PilaC[] = new int[Tamaño];//crecion de una tercera pila que sume las pil
        do {//repertir una serie de pasos hasta que se cumpla la condcion
            System.out.println("Elija una oprcion:\n");
            System.out.println("1.Llenar Pilas A y B:\n");
            System.out.println("2.Mostrar pilas A y B:\n");
            System.out.println("3.Vaciar Pilas A y B:\n");
            System.out.println("4.Unir pilas A y B:\n");
            System.out.println("5.Mostrar Pila A y B unidas:\n");
            System.out.println("6.Salida:\n");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: {//en caso de que la variable operador sea 1 hacer lo siguiente
                    if (c1 == Tamaño) {//si tope es igual al tamaño imprimira el mesaje
                        System.out.println("Pilas A y B llenas :3...\n");
                    } else {
                        for (c1 = 0; c1 < Tamaño; c1++) {//nuestro contador sea =0 y contador menor al numero que tenga la variable tamaño y nuestro contador aunmente de 1 en 1
                            PilaA[c1] = (int) (Math.random() * 99) + 1; //va a llenar un espacio con un numero aleatorio funciona con valores de tipo flot
                            PilaB[c1] = (int) (Math.random() * 99) + 101;//en el arreglo pila a pondra un valor aleatorio entre 1 y 100

                        }
                    }

                }
                break;//se rompe el caso
                case 2: {
                    if (c1 == 0) {//si nuetra variable c1 alacanza el numero de tamaño es igual a 0 entonces la pila esta vacia
                        System.out.println("Pilas A y B vacias...\n");
                    } else {
                        System.out.println("\nPila A:\n");
                        for (int x = Tamaño - 1; x >= 0; x--) {//crear variable tipo entero llamada x se va a posicionar en el ultimo espacio del arreglo
                            System.out.println("" + PilaA[x]);
                        }
                        System.out.println("\nPila B:\n");
                        for (int x = Tamaño - 1; x >= 0; x--) {
                            System.out.println("" + PilaB[x]);
                        }
                    }
                }
                break;
                case 3: {
                    if (c1 == 0) {
                        System.out.println("Pila A y B vacias...\n");
                    } else {
                        c1 = 0;

                    }
                }
                break;
                case 4: {
                    int x2 = Tamaño - 1;//se crea un avariable 
                    for (int x = 0; x < Tamaño; x++) {
                        PilaC[x2] = PilaA[x] + PilaB[x];//
                        x2--;
                        Aux = 1;

                    }
                }
                break;
                case 5: {
                    if (Aux != 1) {
                        System.out.println("Pilas unidas vacias...\n");
                    } else {
                        System.out.println("Pilas A y B unidas:\n");
                        for (int x = Tamaño - 1; x >= 0; x--) {
                            System.out.println("" + PilaC[x]);
                        }
                    }
                }

            }

        } while (opcion != 6);//mientras opcion sea diferente a 6

        // TODO code application logic here
    }

}
