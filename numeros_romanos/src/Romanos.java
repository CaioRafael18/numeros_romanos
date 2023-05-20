public class Romanos {
    public static String Romanos(int numero) {
        int[] numeros = {1000, 500, 100, 50, 10, 5, 1};
        String[] letras = {"M", "D", "C", "L", "X", "V", "I"};

        StringBuilder numerosRomanos = new StringBuilder();

        for (int i = 0; i < numeros.length; i++) {
            while (numero >= numeros[i]) {
                numerosRomanos.append(letras[i]);
                numero -= numeros[i];
            }
        }
        return numerosRomanos.toString();
    }
}