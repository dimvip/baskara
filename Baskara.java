import java.util.Scanner;
 
public class Baskara{
    
    public static void main(String[] args){

        //Formula de Baskara
        Scanner entrada = new Scanner(System.in);

        //Declaração de variáveis
        System.out.println("Informe o valor de A: ");
        int a = entrada.nextInt();

        System.out.println("Informe o valor de B: ");
        int b = entrada.nextInt();
        System.out.println("Informe o valor de C: ");
        int c = entrada.nextInt();

        System.out.println("A sua equação é: " + a + "x² + " + b + " x + "  + c + " = 0");

        //Lógica
        double delta = Math.pow(b, 2) - (4 * a * (c));
        System.out.println("Delta = " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.println("X1 = " + x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("X2 = " + x2);

        entrada.close();
    }
}