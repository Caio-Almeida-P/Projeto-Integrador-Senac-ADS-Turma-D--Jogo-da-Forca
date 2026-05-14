import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class JogoDaForca {
    static Scanner ler = new Scanner(System.in);
    static List<Character> letras = new ArrayList<>();

    static String palavra;
    static char[] palavraOriginal;
    static char[] estadoAtual;
    static int erros;
    static boolean venceu;
    static boolean achouALetra;
    static char letraDigitada;
    static String nome;

    public static void iniciarJogo() {
        System.out.println("==================================================" + "\n=================== Jogo da Forca ================" + "\n==================================================");

        System.out.print("\nDigite o nome do jogador: ");
        nome = ler.next();

        System.out.println("Bem-vindo " + nome + " ao jogo da Forca.");

        menuDeContinuar();

    }

    public static void menuDeContinuar() {
        System.out.print("Digite 1. para Continuar ou 2. para Finalizar o Jogo." + "\nOpção Escolhida: ");
        int opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Continuando Jogo.");
                criarPalavra();
                break;
            case 2:
                System.out.println("Finalizando Jogo.");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }


    }

    public static void criarPalavra() {
        // array que pede a palavra e deixa MAIUSCULA

        System.out.print("Digite a palavra: ");
        palavra = ler.next().toUpperCase();

        esconderPalavra();
    }

    public static void esconderPalavra() {
        // Array que transforma a palavra em _ _ _ _

        palavraOriginal = new char[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            palavraOriginal[i] = palavra.charAt(i);
        }

        estadoAtual = new char[palavraOriginal.length];
        for (int i = 0; i < estadoAtual.length; i++) {
            estadoAtual[i] = '_';
        }

        // array para mostrar a palavra
        fluxoDoJogo();
    }

    public static void mostrarPalavra() {
        System.out.print("\nPalavra: ");
        for (char e : estadoAtual) {
            System.out.print(" " + e);
        }
    }

    public static void mostrarLetras() {


        System.out.print("Letras utilizadas: ");
        for (Character letra : letras) {
            System.out.print(letra + ", ");
        }
    }

    public static void condicoes() {
        achouALetra = false;

        for (int i = 0; i < palavraOriginal.length; i++) {
            if (palavraOriginal[i] == letraDigitada) {
                estadoAtual[i] = letraDigitada;
                achouALetra = true;
            }
        }
        if (!achouALetra) {
            erros++;
        }

        venceu = true;

        for (int i = 0; i < estadoAtual.length; i++) {
            if (estadoAtual[i] == '_') {
                venceu = false;
            }
        }
    }

    public static void resumoJogo() {
        
        System.out.println("\n\nResultado da gameplay");
        if (venceu) {
            System.out.println("Parabéns, você acertou a palavra");
            mostrarPalavra();
            System.out.println("\nFinalizando o Jogo, obrigado por jogar!!!");
        } else {
            System.out.println("Você perdeu " + nome + ", mas tente novamente!");
            System.out.println("A palavra era: " + palavra);
        }
    }

    public static void fluxoDoJogo() {

        erros = 0;
        venceu = false;

        while (!venceu && erros < 6) {
            mostrarPalavra(); //  função para mostrar a palavra atualmente

            System.out.println("\nErros: " + erros);

            mostrarLetras(); // função para mostrar as letras já utilizadas

            System.out.print("\nDigite uma letra: ");


            letraDigitada = ler.next().toUpperCase().charAt(0);

            if (!Character.isLetter(letraDigitada)) { // Validando apenas as entradas que forem letras
                System.out.println("Erro: Digite apenas letras, números e símbolos são bloqueados.");
                continue;
            }

            if (letras.contains(letraDigitada)) { // Verificando se a entrada é repetida ou nova
                System.out.println("Erro: Letra já digitada!");
                continue;

            } else {
                letras.add(letraDigitada);
            }

            condicoes(); // função com as condições do jogo, como trocar as _ por letras e verificar se ainda há _.
        }

        resumoJogo(); // função com o resumo do jogo, mostrando a vitória ou a derrota

        letras.clear();
    }

    public static void main(String[] args) {
        iniciarJogo();
    }
}
