import java.util.Scanner;
import java.util.Locale;

public class MediaComNotaRecuperacao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // VARIÁVEIS DE ENTRADA
        String nome;
        double n1, n2, n3;

        // ENTRADA DE DADOS
        System.out.print("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        n3 = sc.nextDouble();
        System.out.println(); // ESPAÇAMENTO

        // MEDIA DAS 3 NOTAS - INICIAIS
        double mediaInicial = (n1 + n2 + n3) / 3;

        if(mediaInicial >= 7){
            System.out.printf("Aluno: %s\n", nome);
            System.out.printf("Média final: %.2f\n", mediaInicial);
            System.out.println("SITUAÇÃO: Aluno aprovado com sucesso!");
        }

            else {
                System.out.printf("Aluno: %s\n", nome);
                System.out.printf("Média final: %.2f\n", mediaInicial);
                System.out.println("SITUAÇÃO: Aluno na recuperação.");

            System.out.println(); // ESPAÇAMENTO

         // ENTRADA DA NOTA DE RECUPERAÇÃO
        double notaRecuperacao;
            System.out.println("Digite a nota da recuperação: ");
            notaRecuperacao = sc.nextDouble();

        // MEDIA FINAL COM A NOTA DE RECUPERAÇÃO
        double mediaFinal = (notaRecuperacao + mediaInicial) / 2;

        // ESTRUTURA DE CONDIÇÃO - APÓS RECUPERAÇÃO
        if (mediaFinal >= 7){
            System.out.printf("Aluno: %s\n", nome);
            System.out.printf("Média final: %.2f\n", mediaFinal);
            System.out.println("SITUAÇÃO: Aluno aprovado após recuperação.");
        }
        else {
            System.out.printf("Aluno: %s\n", nome);
            System.out.printf("Média final: %.2f\n", mediaFinal);
            System.out.println("SITUAÇÃO: Aluno reprovado");
        }

        }

        sc.close();


        }

    }

