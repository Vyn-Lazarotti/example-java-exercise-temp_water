import java.util.Scanner;

public class tempWater {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i < 12; i++) {
            System.out.println("Digite a temperatura: ");
            double temp = teclado.nextDouble();
            for (int j = 1; temp < 4 && temp > 10; j++) {
                System.out.println("Digite a temperatura: ");
                temp = teclado.nextDouble();
            } 
        }
        double soma += temp;
        double media = soma / 12;
        System.out.println("A média de temperatura de hoje é " + media + " graus Celsius");

        teclado.close();
    }
}
