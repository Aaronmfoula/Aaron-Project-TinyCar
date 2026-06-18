import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== Question 4 =====
        // Meme base que Question3, avec en plus :
        // - recherche du prix minimum et de l'accessoire correspondant
        // - recherche du prix maximum et de l'accessoire correspondant
        // - calcul du prix moyen

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
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < taille; i++) {
            System.out.println("- " + noms[i] + " : " + prixHT[i] + " EUR HT");
            sommeTotale += prixHT[i];

            if (prixHT[i] < prixHT[indexMin]) {
                indexMin = i;
            }
            if (prixHT[i] > prixHT[indexMax]) {
                indexMax = i;
            }
        }

        double prixMoyen = sommeTotale / taille;

        System.out.println();
        System.out.println("Somme totale des achats : " + sommeTotale + " EUR HT");
        System.out.println("Accessoire le moins cher : " + noms[indexMin] + " (" + prixHT[indexMin] + " EUR HT)");
        System.out.println("Accessoire le plus cher  : " + noms[indexMax] + " (" + prixHT[indexMax] + " EUR HT)");
        System.out.println("Prix moyen                : " + prixMoyen + " EUR HT");

        scanner.close();
    }
}
