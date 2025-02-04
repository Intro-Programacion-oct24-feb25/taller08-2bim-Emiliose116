/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double celcius;
        double fahrenheit;
        int contador = 0;
        String cadena = "";

        for (fahrenheit = 20; fahrenheit <= 100; fahrenheit += 4) {

            celcius = (5.0 / 9.0) * (fahrenheit - 32);

            cadena = String.format("%sOperacion(%d)Fahrenheit: %.2f ===> "
                    + "Celcius: %.2f\n", 
                    cadena, 
                    contador, 
                    fahrenheit, 
                    celcius);

            contador = contador + 1;

        }

        System.out.printf("%s", cadena);

    }
}
