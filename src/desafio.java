public class desafio {
    public static void main(String[] args) {
        final double FATOR = 5 / 9.0;

        final double AJUSTE = 32;
        double fahrenheit = 86;

        double celsius = (fahrenheit - AJUSTE) * FATOR;
        
        System.out.println("O resuldato da conta é = " + celsius + "ºC.");
        fahrenheit = 150;
        celsius = (fahrenheit- AJUSTE) * FATOR;

    }
}