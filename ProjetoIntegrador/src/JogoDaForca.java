import javax.swing.JOptionPane;
import java.util.ArrayList;

public class JogoDaForca {

    public String palavraEscolhida;
    public String PalavraEscondida;

    public void IniciarPrograma() {
        JOptionPane.showMessageDialog(null, "Projeto Integrador - Jogo da Forca");

        String nomeJogador = JOptionPane.showInputDialog(null, "Digite seu nome: ");

        JOptionPane.showMessageDialog(null, "\nBem Vindo " + nomeJogador + " ao Jogo da Forca");

        JOptionPane.showMessageDialog(null, "\nPara iniciar o jogo, digite uma das seguintes opções \n1. Como o jogo Funciona? \n2. Sair do Jogo");
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Opção escolhida: "));

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "COMO FUNCIONA:" +
                        "\n1 - Será solicitada a palavra que deve ser descoberta." +
                        "\n2 - Você deverá digitar apenas uma letra para tentar advinhar a letra." +
                        "\n3 - Após isso se a letra estiver correta aparecerá no lugar do _ que corresponde a letra descoberta." +
                        "\n4 - Caso esteja errada, o contador de erros irá iniciar, começando em 1." +
                        "\nATENÇÃO! Caso o limite de erros passe de 5, o usuário perde o jogo." +
                        "\nNo final do jogo aparecerá a palavra correta, seja o usuário ganhando ou perdendo.");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Finalizando o Sistema.");
                break;
        }
    }

    public void MenuDeContinuar() {
        int opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Para continuar digite 1, para sair digite 2: "));

        switch (opcao2) {
            case 1:
                JOptionPane.showMessageDialog(null, "Iniciando o Jogo.");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Finalizando o Sistema.");
                break;
        }
    }

    public void criarPalavraEscolhida(String palavraEscolhida) {
        this.palavraEscolhida = palavraEscolhida;

        for (int i = 0; i < palavraEscolhida.length(); i++) {
            PalavraEscondida += "_";

        }
    }

    public void atualizaraPalavraEscondida(String letra) {
        String temp = "";
        for (int i = 0; i < this.palavraEscolhida.length(); i++) {


            if (letra.equals(palavraEscolhida.substring(i, i + 1))) {
                temp += letra;

            } else {
                temp += PalavraEscondida.substring(0, i + 1);
            }
        }
        PalavraEscondida = temp; // atualiza a palavra escondida
    }

    public void LetraDigitada() {
        // função para armazenar a letra digitada

        ArrayList<Character> letras = new ArrayList<>();

        String entrada = JOptionPane.showInputDialog(null, "Digite a letra: ");
        char letra = entrada.charAt(0);

        letras.add(letra);

        JOptionPane.showMessageDialog(null, "Letras digitadas: " + letras);
    }

    public void Vidas() {
        int vidas = 5;


    }


    public static void main(String[] args) throws Exception {
        JogoDaForca criar = new JogoDaForca();

        criar.IniciarPrograma(); // Função que inicia o programa - Com menu inicial, nome e

        JOptionPane.showMessageDialog(null, "Iniciado o Jogo.");

        criar.criarPalavraEscolhida(JOptionPane.showInputDialog(null, "Digite a palavra: "));

        criar.MenuDeContinuar(); // Menu de Escolha Ok ou Finalizar o programa - USAR PARA CADA TENTATIVA

        do {
            criar.MenuDeContinuar();
            criar.LetraDigitada();

        } while (true);


        // Para uso futuro, não no momento

        // Continuação do Programa

        // criar.MenuDeContinuar(); Menu de Escolha Ok ou Finalizar o programa - USAR PARA CADA TENTATIVA

        // Continuação do Programa

        // criar.MenuDeContinuar(); // Menu de Escolha Ok ou Finalizar o programa - USAR PARA CADA TENTATIVA

        // Continuação do Programa

        // criar.MenuDeContinuar(); // Menu de Escolha Ok ou Finalizar o programa - USAR PARA CADA TENTATIVA

    }
}