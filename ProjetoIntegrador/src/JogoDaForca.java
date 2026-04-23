import java.util.Scanner;

public class JogoDaForca {

    public String palavraEscolhida;
    public String palavraEscondida;

    public void criarPalavraEscolhida(String palavraEscolhida) {
        this.palavraEscolhida = palavraEscolhida;
        for (int i = 0; i < palavraEscolhida.length(); i++) {
            palavraEscondida += "*";
        }
    }

    public void atualizaraPalavraEscondida(String letra) {
        String temp = "";
        for (int i = 0; i < this.palavraEscolhida.length(); i++) {

            if (letra.equals(palavraEscolhida.substring(i, i + 1))) {

                temp += letra;

            } else {
                temp += palavraEscondida.substring(0, i + 1);
            }
        }
        palavraEscondida = temp; // atualiza a palavra escondida
    }


    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nProjeto Integrador - Jogo da Forca");

        System.out.print("Digite seu nome: ");
        String nomeJogador = entrada.next();

        System.out.println("\nBem Vindo " + nomeJogador + " ao Jogo da Forca \nPara iniciar o jogo, digite uma das seguintes opções \n1. Como o jogo Funciona? \n2. Sair do Jogo");
        System.out.print("Opção escolhida: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("1. Você insere seu nome");

            case 2:
        }


        entrada.close();
    }
}