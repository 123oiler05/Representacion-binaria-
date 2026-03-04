public class ConversionBinaria {

    public static String decimalABinarioManual(int n) {
        if (n == 0) return "0";
        
        StringBuilder binario = new StringBuilder();
        
        while (n > 0) {
            
            binario.insert(0, n % 2);
            n = n / 2;
        }
        
        return binario.toString();
    }

    public static void main(String[] args) {
        int numero = 42;
        
        System.out.println("El binario de " + numero + " es " + decimalABinarioManual(numero));
        
        
        String binarioAtajo = Integer.toBinaryString(numero);
        System.out.println("verificacion: el binario de " + numero + " es " + binarioAtajo);
    }
}