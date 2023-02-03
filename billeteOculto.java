/*El profesor ha escondido todos sus ahorros
(20€) en uno de los sitios de una clase de 8 filas por 4 columnas. Desarrolla
un programa en Java que dibuje las coordenadas X e Y del billete (“€”) de
manera aleatoria empleando una tabla bidimensional.*/
package tema6;

import java.util.Random;

/* @author heladodepistacho*/
public class billeteOculto {

    public static void main(String[] args) {
        int F = 8;
        int C = 4;
        int dinero = 20;
        String[][] table = new String[F][C];
        Random rand = new Random();

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                table[i][j] = "";
            }
        }
        int row = rand.nextInt(F);
        int column = rand.nextInt(C);
        table[row][column] = dinero + "€";

        System.out.println("Las coordenadas del dinero escondido es: ");
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                if (table[i][j].equals(dinero + "€")) {
                    System.out.println("X: " + i + " Y: " + j);

                }

            }

        }

    }
}
