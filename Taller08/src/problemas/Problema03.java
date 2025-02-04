/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num;

        for (num = 1; num <= 5; num++) {
            for (int contador = 1; contador <= num; contador++) {

                System.out.printf("%s", "*");
            }
            System.out.println();
        }
        for (num = 5; num >= 1; num--) {
            for (int contador = 1; contador <= num; contador++) {

                System.out.printf("%s", "*");
            }
            System.out.println();
        }
    }
}
