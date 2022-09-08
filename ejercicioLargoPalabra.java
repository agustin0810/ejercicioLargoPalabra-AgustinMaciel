package ClasesDDA.cerosieteseptiembre;

import java.lang.reflect.Array;

public class ejercicioLargoPalabra {
    public static void main(String[] args){
        //EJERCICIO 1
        fraseExcluyendoLosEspacios("Frase con 13 car");
        //EJERCICIO 2
        fraseIncluyendoLosEspacios("Frase   con espacios  entre medio");
    }
    public static void fraseExcluyendoLosEspacios(String frase){
        frase = frase.replace(" ", "");
        System.out.println(frase.length());
    }
    public static void fraseIncluyendoLosEspacios(String frase){

            boolean huboEspacio = false;
            String nuevaFrase = "";
            for(int i =0; i<frase.length(); i++) {
                if (frase.charAt(i) == ' ') {
                    if (!huboEspacio) {

                        nuevaFrase = nuevaFrase + frase.charAt(i);
                    }
                    huboEspacio = true;
                }
                else{

                    nuevaFrase = nuevaFrase + frase.charAt(i);
                    huboEspacio = false;
                }
                }
        System.out.println(nuevaFrase);
        System.out.println(nuevaFrase.length());
    }


}

//EJERCICIO 1. Con String.length contar el largo de una frase excluyendo los espacios.
//EJERCICIO 2. Con String.length contar el largo de una frase incluyendo los espacios,
// pero si la frase tiene dos o más espacios seguidos, deberán eliminarse quedando solo
// los espacios considerados correctos dentro del idioma. También deberán eliminarse los
//espacios iniciales y finales.

