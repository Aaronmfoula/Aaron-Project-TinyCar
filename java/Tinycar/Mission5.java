public class Mission5 {

    // ===== Etape 1 =====
    // Procedure (pas de retour, donc type "void") qui affiche un texte
    // descriptif d'un accessoire a partir de son nom et de son prixHT.
    // Parametres : nom (String), prixHT (double)
    public static void afficherAccessoire(String nom, double prixHT) {
        System.out.println("Accessoire : " + nom + " - Prix HT : " + prixHT + " EUR");
    }

    // ===== Etape 2 =====
    // Fonction qui retourne le prixTTC d'un accessoire a partir de son
    // prixHT. TVA fixe a 20%.
    // Parametre : prixHT (double) -> Retour : double
    public static double calculerPrixTTC(double prixHT) {
        return prixHT * 1.20;
    }

    // ===== Etape 3 =====
    // Procedure qui affiche les elements des tableaux noms, prixHT et
    // prixTTC ensemble.
    // Parametres : noms (String[]), prixHT (double[]), prixTTC (double[])
    public static void afficherTousLesAccessoires(String[] noms, double[] prixHT, double[] prixTTC) {
        for (int i = 0; i < noms.length; i++) {
            System.out.println("- " + noms[i]
                    + " | Prix HT : " + prixHT[i] + " EUR"
                    + " | Prix TTC : " + prixTTC[i] + " EUR");
        }
    }

    // ===== Etape 4 =====
    // Trois fonctions de statistiques sur le tableau des prixHT.
    // Parametre : prix (double[]) -> Retour : double

    public static double calculerMoyenne(double[] prix) {
        double somme = 0.0;
        for (double p : prix) {
            somme += p;
        }
        return somme / prix.length;
    }

    public static double trouverPrixMinimal(double[] prix) {
        double min = prix[0];
        for (double p : prix) {
            if (p < min) {
                min = p;
            }
        }
        return min;
    }

    public static double trouverPrixMaximal(double[] prix) {
        double max = prix[0];
        for (double p : prix) {
            if (p > max) {
                max = p;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        // Tableaux initialises comme dans la Mission 4
        String[] noms = {"Tapis de sol", "Porte-velo", "Klaxon", "Pare-soleil", "Housse de siege"};
        double[] prixHT = {25.90, 89.50, 14.99, 12.00, 45.00};

        System.out.println("=== Etape 1 : affichage avec la procedure ===");
        for (int i = 0; i < noms.length; i++) {
            afficherAccessoire(noms[i], prixHT[i]);
        }

        System.out.println();
        System.out.println("=== Etape 2 : calcul du prixTTC pour chaque accessoire ===");
        double[] prixTTC = new double[noms.length];
        for (int i = 0; i < noms.length; i++) {
            prixTTC[i] = calculerPrixTTC(prixHT[i]);
        }
        // Affichage temporaire pour verifier le tableau prixTTC
        for (int i = 0; i < noms.length; i++) {
            System.out.println(noms[i] + " -> Prix TTC : " + prixTTC[i] + " EUR");
        }

        System.out.println();
        System.out.println("=== Etape 3 : affichage complet (HT + TTC) ===");
        afficherTousLesAccessoires(noms, prixHT, prixTTC);

        System.out.println();
        System.out.println("=== Etape 4 : statistiques ===");
        double moyenne = calculerMoyenne(prixHT);
        double prixMin = trouverPrixMinimal(prixHT);
        double prixMax = trouverPrixMaximal(prixHT);

        System.out.println("Prix moyen (HT)  : " + moyenne + " EUR");
        System.out.println("Prix minimal (HT) : " + prixMin + " EUR");
        System.out.println("Prix maximal (HT) : " + prixMax + " EUR");
    }
}
