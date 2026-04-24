import javax.swing.JOptionPane;

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
        JogoDaForca criar = new JogoDaForca();

        JOptionPane.showMessageDialog(null, "Projeto Integrador - Jogo da Forca");

        String nomeJogador = JOptionPane.showInputDialog(null, "Digite seu nome: ");

        JOptionPane.showMessageDialog(null, "\nBem Vindo " + nomeJogador + " ao Jogo da Forca");

        JOptionPane.showMessageDialog(null, "\nPara iniciar o jogo, digite uma das seguintes opções \n1. Como o jogo Funciona? \n2. Sair do Jogo");
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Opção escolhida: "));

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, " COMO FUNCIONA:" +
                        "\n1 - Será solicitada a palavra que deve ser descoberta." +
                        "\n2 - Você deverá digitar apenas uma letra para tentar advinhar a letra." +
                        "\n3 - Após isso se a letra estiver correta aparecerá no lugar do _ que corresponde a letra descoberta." +
                        "\n4 - Caso esteja errada, o contador de erros irá iniciar, começando em 1." +
                        "\nATENÇÃO! Caso o limite de erros passe de 5, o usuário perde o jogo." +
                        "\nNo final do jogo aparecerá a palavra correta, seja o usuário ganhando ou perdendo.");

            case 2:
                JOptionPane.showMessageDialog(null, "Finalizando o Sistema.");
                break;
        }
        JOptionPane.showMessageDialog(null, "Iniciado o Jogo.");

        criar.criarPalavraEscolhida(JOptionPane.showInputDialog(null, "Digite a palavra: "));
        int opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Para continuar marque 1, para sair marque 2: "));

        switch (opcao2) {
            case 1:
                JOptionPane.showMessageDialog(null, "Iniciado o Jogo.");
            case 2:
                JOptionPane.showMessageDialog(null, "Finalizando o Sistema.");
                break;
        }


    }
}