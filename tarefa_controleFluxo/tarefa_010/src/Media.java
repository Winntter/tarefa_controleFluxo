import java.util.*;
public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, mediaTotal;

        System.out.print("Insira a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Insira a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Insira a terceira nota: ");
        nota3 = sc.nextDouble();
        System.out.print("Insira a quarta nota: ");
        nota4 = sc.nextDouble();

        mediaTotal = ((nota1 + nota2 + nota3 + nota4)/4) ;

        if (mediaTotal > 11) {
            System.out.println("Invalido");
        } else if (mediaTotal >= 7) {
            System.out.println("Aprovado");
        } else if (mediaTotal >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
