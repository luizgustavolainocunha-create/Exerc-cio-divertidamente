public class Divertidamente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alefria = 0;
        int tristeza = 0;
        int amizades;

        // 1. Amizade
        System.out.print("Quantas amizades Riley fez na nova cidade? ");
        amizades = scanner.nextInt();
        if (amizades > 0) {
            alefria += 10 * amizades; // ganha 10 pontos de alegria por amizade
            tristeza += 0;
        } else {
            alefria += 0;
            tristeza += 30; // perde 30 pontos de tristeza se não fizer amizades
        }

        // Continuando o programa...
        // Você pode adicionar mais partes aqui, como notas e exercícios, como no exemplo anterior.

        System.out.println("Alegria: " + alefria);
        System.out.println("Tristeza: " + tristeza);
        scanner.close();
    }
}
