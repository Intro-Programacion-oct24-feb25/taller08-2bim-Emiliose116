/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int num;
        int operacion1;
        int operacion2;
        int operacion3;
        String cadena = "";

        for (num = 30; num >= 10; num--) {
            operacion1 = num + num;
            operacion2 = num + num * 2;
            operacion3 = num + num * 3;
            cadena = String.format("%s%d-%d-%d-%d\n",
                    cadena,
                    num,
                    operacion1,
                    operacion2,
                    operacion3);
        }

        System.out.printf("%s", cadena);

    }

}