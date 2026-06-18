import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== Question 2 =====
        // Le tableau des noms reste invente (sans aide de l'utilisateur).
        // Le tableau des prixHT est rempli par l'utilisateur.

        String[] noms = {"Tapis de sol", "Porte-velo", "Klaxon", "Pare-soleil", "Housse de siege"};
        double[] prixHT = new double[noms.length];

        for (int i = 0; i < noms.length; i++) {
            System.out.print("Veuillez saisir le prix HT pour \"" + noms[i] + "\" : ");
            prixHT[i] = scanner.nextDouble();
        }

        System.out.println();
        System.out.println("=== Liste des accessoires ===");

        for (int i = 0; i < noms.length; i++) {
            System.out.println("- " + noms[i] + " : " + prixHT[i] + " EUR HT");
        }

        scanner.close();
    }
}
