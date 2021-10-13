import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Matéria: ");
        String materia = sc.next();

        System.out.println("Informe suas notas da checkpoint do segundo semestre");
        double cp01 = sc.nextDouble();
        double cp02 = sc.nextDouble();

        System.out.println("Informe suas notas da Challenge do segundo semestre");
        double ch1 = sc.nextDouble();
        double ch2 = sc.nextDouble();

        System.out.println("Sua média do segundo semestre é: " + calcularMedia(cp01, cp02, ch1, ch2));
        double media = calcularMedia(cp01, cp02, ch1, ch2);
        double mediaMin = 7.5;

        if (media < mediaMin){
            System.out.println("falta " + (mediaMin - media) + " pontos para alcançar a média do segundo semestre");
        }

        System.out.println("Informe sua média do primeiro semestre");
        double mediaPrimeiro = sc.nextDouble();

        double mediaTotal = (media + mediaPrimeiro) / 2;

        System.out.println("Média total: " + mediaTotal);

    }

    static double calcularMedia(double n1, double n2, double n3, double n4){
        return (n1 + n2 + n3 + n4) /4;
    }
}
