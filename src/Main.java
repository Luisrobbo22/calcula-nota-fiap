import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matéria: Digital");

        double cp01 = 10.0;
        double cp02 = 10.0;
        System.out.println("Notas do checkpooint: \n" + cp01 + "\n" + cp02);

        double ch1 = 10.0;
        double ch2 = 9.5;
        System.out.println("Notas da challenge: \n" + ch1 + "\n" + ch2);

        System.out.println("Sua média do segundo semestre é: " + calcularMedia(cp01, cp02, ch1, ch2));
        double media = calcularMedia(cp01, cp02, ch1, ch2);
        double mediaMin = 7.5;

        if (media < mediaMin){
            System.out.println("falta " + (mediaMin - media) + " pontos para alcançar a média do segundo semestre");
        }

        double mediaPrimeiro = 9.7;
        System.out.println("Média do primeiro semestre: " + mediaPrimeiro);

        double mediaTotal = (media + mediaPrimeiro) / 2;

        System.out.println("Média total: " + mediaTotal);

    }

    static double calcularMedia(double n1, double n2, double n3, double n4){
        return (n1 + n2 + n3 + n4) /4;
    }
}
