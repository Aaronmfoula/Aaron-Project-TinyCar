public class Question1 {

    public static void main(String[] args) {

        // ===== Question 1 =====
        // Deux tableaux :
        // - noms (String[]) : contient les noms des accessoires
        // - prixHT (double[]) : contient le prix HT de chaque accessoire
        // Les deux tableaux sont initialises avec des valeurs inventees,
        // sans demander l'aide de l'utilisateur.

        String[] noms = {"Tapis de sol", "Porte-velo", "Klaxon", "Pare-soleil", "Housse de siege"};
        double[] prixHT = {25.90, 89.50, 14.99, 12.00, 45.00};

        System.out.println("=== Liste des accessoires ===");

        for (int i = 0; i < noms.length; i++) {
            System.out.println("- " + noms[i] + " : " + prixHT[i] + " EUR HT");
        }
    }
}
