import java.util.Scanner;

public class SistemaStreaming {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do plano
        System.out.print("Digite o código do plano (1, 2 ou 3): ");
        int plano = sc.nextInt();
        sc.nextLine(); // limpar buffer

        // Entrada da idade
        System.out.print("Digite a idade do usuário: ");
        int idade = sc.nextInt();
        sc.nextLine();

        // Entrada do país
        System.out.print("Digite o país do usuário: ");
        String pais = sc.nextLine();

        // -------- SWITCH-CASE (Plano) --------
        switch (plano) {
            case 1:
                System.out.println("Resolução 720p - 1 tela disponível.");
                break;
            case 2:
                System.out.println("Resolução 1080p (Full HD) - 2 telas disponíveis.");
                break;
            case 3:
                System.out.println("Resolução 4K + HDR - 4 telas disponíveis.");
                break;
            default:
                System.out.println("Código de plano inválido.");
        }

        // -------- IF-ELSE (Classificação) --------
        if (idade < 12) {
            System.out.println("Categoria: Infantil (Desenhos e Animações).");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Categoria: Adolescente (Séries Teen e Aventura).");
        } else {
            System.out.println("Categoria: Adulto (Filmes de Ação e Documentários).");
        }

        // -------- IF-ELSE ENCADEADO (Bônus Regional) --------
        if (pais.equalsIgnoreCase("Brasil")) {
            System.out.println("Destaque: Assista agora produções originais brasileiras!");
        }

        sc.close();
    }
}