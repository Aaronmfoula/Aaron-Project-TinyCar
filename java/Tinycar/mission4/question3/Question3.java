import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== Question 3 =====
        // La taille des tableaux est desormais donnee par l'utilisateur.
        // L'utilisateur saisit le nom et le prix de chaque accessoire.

        System.out.print("Combien d'accessoires souhaitez-vous ajouter au panier ? ");
        int taille = scanner.nextInt();
        scanner.nextLine(); // vidage du buffer

        String[] noms = new String[taille];
        double[] prixHT = new double[taille];

        for (int i = 0; i < taille; i++) {
            System.out.print("Nom de l'accessoire " + (i + 1) + " : ");
            noms[i] = scanner.nextLine();

            System.out.print("Prix HT de l'accessoire " + (i + 1) + " : ");
            prixHT[i] = scanner.nextDouble();
            scanner.nextLine(); // vidage du buffer
        }

        System.out.println();
        System.out.println("=== Contenu du panier ===");

        double sommeTotale = 0.0;

        for (int i = 0; i < taille; i++) {
            System.out.println("- " + noms[i] + " : " + prixHT[i] + " EUR HT");
            sommeTotale += prixHT[i];
        }

        System.out.println();
        System.out.println("Somme totale des achats : " + sommeTotale + " EUR HT");

        scanner.close();
    }
}
