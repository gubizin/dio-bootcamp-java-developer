import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int tabuada;

        System.out.println("Informe a tabuada: ");
        num = scan.nextInt();

        for(int i=0; i <= 10; i++){
            tabuada = num * i;
            System.out.println("Tabuada de " + num + ": " + num + " x " + i + " = " + tabuada);
        }
    }
}
