import java.util.Scanner;

public class exercicio5 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos metros gostaria de converter para centímetros: ");
        int metro = scan.nextInt();

        System.out.println(metro + " metros dá um total de " + (metro * 100) + " centímetros.");
        scan.close();
    }
}
