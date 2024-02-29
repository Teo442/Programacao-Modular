package Pedro_Teodoro;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Desafio {
    public static void main(String args[]) {
        int op; 
        boolean ativo = true; 

        Scanner sc = new Scanner(System.in); 

        while (ativo) {
            System.out.println("********** MENU **********");
            System.out.println("* 1 - Advinhe o Numero   *");
            System.out.println("* 2 - Siga-me            *");
            System.out.println("* 3 - Suporte Online     *");
            System.out.println("* 4 - Sair               *");
            System.out.println("**************************");
            op = sc.nextInt(); 

            switch (op) {
                case 1:
                    jogarAdivinhacao();
                    break;
                case 2:
                    jogarSigaMe();
                    break;
                case 3:
                    suporteOnline();
                    break;
                case 4:
                    ativo = false;
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }

    public static void jogarAdivinhacao() {
        Random random = new Random();
        int numero = random.nextInt(99);
        int margem1 = 99;
        int margem2 = 0;
        int tentativas = 0;
        boolean acerto = false;

        while (!acerto) {
            System.out.println("Escolha um número entre " + margem2 + " e " + margem1 + ":");
            Scanner sc = new Scanner(System.in);
            int entrada = sc.nextInt();
            tentativas++;

            if (entrada == numero) {
                System.out.println("PARABENS! Você acertou o número sorteado " + numero + " com " + tentativas + " tentativas.");
                acerto = true;
            } else {
                if (tentativas == 1) {
                    margem1 = numero + 10;
                }
                if (tentativas == 2) {
                    margem1 = numero + 5;
                }
                if (tentativas == 3) {
                    margem1 = numero + 5;
                    margem2 = numero - 10;
                }
            }
        }
    }

    public static void jogarSigaMe() {
        Random random = new Random();
        int[] sequencia = new int[5];

        
        for (int i = 0; i < sequencia.length; i++) {
            sequencia[i] = random.nextInt(100) + 1;
        }

        
        try {
            for (int i = 0; i < sequencia.length; i++) {
                System.out.print(sequencia[i] + " ");
                Thread.sleep(2000); 
            }
            System.out.println();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        
        System.out.print("\033[H\033[2J");
        System.out.flush();

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sequência, número por número:");

        for (int i = 0; i < sequencia.length; i++) {
            int entrada = sc.nextInt();
            if (entrada != sequencia[i]) {
                System.out.println("Erro! Você errou a sequência.");
                System.out.println("A sequência correta era:");
                for (int j = 0; j <= i; j++) {
                    System.out.print(sequencia[j] + " ");
                }
                System.out.println();
                break;
            }
        }
        sc.close();
    }

    public static void suporteOnline() {
        System.out.println("Bem-vindo ao sistema de suporte técnico. Em que posso ajudar?");

        
        ArrayList<String> respostas = new ArrayList<>();
        respostas.add("Nenhum outro cliente se queixou a respeito deste problema antes. Quais as configurações do seu sistema?");
        respostas.add("Isto está explicado no manual. Você leu o manual?");
        respostas.add("Parece estranho. Você poderia explicar o problema com mais detalhes?");
        respostas.add("Desculpe, mas eu não consigo resolver. Você terá que aguardar a visita de um técnico.");
        respostas.add("Parece interessante. Fale mais a respeito...");
        respostas.add("Desculpe, mas eu não consigo resolver. Você terá que aguardar a visita de um técnico");
        respostas.add("Você já tentou pesquisar a solução para esse problema em nossa base de conhecimento online?");
        respostas.add("Parece ser um problema comum. Muitos usuários relataram isso. Vou verificar nossa documentação para encontrar uma solução.");
        respostas.add("Por favor, aguarde um momento enquanto verifico essa questão em nosso sistema.");
        respostas.add("Estou aqui para ajudar. Por favor, me forneça mais informações para que eu possa entender melhor o problema.");

        
        while (true) {
            System.out.print("Usuário: ");
            Scanner sc = new Scanner(System.in);
            String pergunta = sc.nextLine();
            if (pergunta.toLowerCase().contains("tchau")) {
                System.out.println("Foi bom falar com você. Espero ter ajudado a resolver seu problema. Tchau...");
                break;
            }

            
            Random respAleatoria = new Random();
            String resposta = respostas.get(respAleatoria.nextInt(respostas.size()));
            System.out.println("Suporte Técnico: " + resposta); 
            sc.close();
        }
    }
}
