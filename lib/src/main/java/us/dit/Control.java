//Hugo Corona Laserna
//uvus:TYC7650
//pass:1741256428

package us.dit;

public class Control {

    public static void main(String[] args) {
        System.out.println(convertirAMayusculasEInvertir("Hola"));
    }
    
    public static String convertirAMayusculasEInvertir(String texto) {
        String mayusculas = texto.toUpperCase(); // Convierte la cadena a mayúsculas
        return new StringBuilder(mayusculas).reverse().toString(); // Invierte la cadena y la devuelve
    }
}

