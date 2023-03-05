package ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

    
    public static void main(String[] args) {
        //Hago array con las palabras que hay que adivinar
        String[] palabras = {"elefante", "marcos", "Jorge"};
         
        
        //Hago aleatorio la eleccion de la posicion donde esta la palabra en el array
        int posicionAleatoria = (int) (Math.random() * 2);
        
        //Guardo en una variable la palabra 
        String palabraSecreta = palabras[posicionAleatoria];
        
        //Convierto la palabra en array y la guardo en variable letras
        char[] letras = palabraSecreta.toCharArray();
        
        //Creo array
        char[] letrasConGuiones = new char[letras.length];

        //Recorro cada letra de la palabra y la sustituyo por una -
        for (int i = 0; i < letras.length; i++) {

            letrasConGuiones[i] = '-';
        }


       
        boolean hemosGanado = false;// --> de momento no hemos ganado
        
        while (hemosGanado == false) {

            Scanner obx = new Scanner(System.in);
            System.out.println("Escribe una letra");
            char letraIntroducida = obx.next().charAt(0);//como un obx.nextInt, guardo la letra en la variable letraIntroducida

            //Compruebo si la letra está en la palabra aleatoria
            for (int i = 0; i < letras.length; i++) {

                if (letras[i] == letraIntroducida) {
                    letrasConGuiones[i] = letraIntroducida;
                }

            }

            //ArrayEquals -> si la palbra con guiones es igual a palabra sectrea, hemos ganado
            if(Arrays.equals(letras,letrasConGuiones)){
                System.out.println("Has ganado el juego");
            }

            System.out.println(letrasConGuiones);

        }

    }

}
