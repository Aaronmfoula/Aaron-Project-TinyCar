import java.util.Scanner;

public class Mission3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== Question 3 =====
        // Nouvelle variable :
        // - tentatives (int) : compteur de tentatives pour saisir le bon code (max 3)
        String codeSecret = "Padawan";
        int tentatives = 0;
        int maxTentatives = 3;
        boolean accesAutorise = false;

        while (tentatives < maxTentatives) {
            System.out.print("Veuillez saisir le code secret (tentative "
                    + (tentatives + 1) + "/" + maxTentatives + ") : ");
            String codeSaisi = scanner.nextLine();

            if (codeSaisi.equals(codeSecret)) {
                accesAutorise = true;
                break;
            }

            tentatives++;
            System.out.println("Code incorrect.");
        }

        if (!accesAutorise) {
            System.out.println("Nombre maximal de tentatives atteint. Acces refuse.");
            scanner.close();
            return;
        }

        System.out.println("Code correct, bienvenue dans l'application !");
        System.out.println();

        // ===== Question 1 (boucle TantQue) =====
        // Nouvelle variable :
        // - continuer (int) : 1 pour continuer, 0 pour quitter

        int continuer = 1;

        while (continuer == 1) {
            System.out.print("Veuillez saisir le prix HT de la voiture (en euros) : ");
            double prixHT = scanner.nextDouble();

            System.out.print("Le vehicule est-il electrique ? (1 = oui, 0 = non) : ");
            int estElectriqueChoix = scanner.nextInt();
            boolean estElectrique = (estElectriqueChoix == 1);

            double tauxTVA = estElectrique ? 5.0 : 20.0;
            double prixTTC = prixHT * (1 + tauxTVA / 100);

            if (prixTTC > 20000) {
                prixTTC = prixTTC * 0.90; // remise de 10%
            }

            System.out.println("Prix TTC calcule : " + prixTTC + " EUR");
            System.out.println();

            System.out.print("Voulez-vous calculer un autre prix ? (1 = oui, 0 = non) : ");
            continuer = scanner.nextInt();
        }

        System.out.println("Merci d'avoir utilise l'application, au revoir !");
        System.out.println();

        // ===== Question 2 (boucle Pour) =====
        // Nouvelle variable :
        // - n (int) : nombre de produits a traiter
        // - i (int) : compteur de boucle

        scanner.nextLine(); // vidage du buffer
        System.out.print("Combien de produits souhaitez-vous traiter ? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("--- Produit " + i + " / " + n + " ---");

            System.out.print("Veuillez saisir le prix HT du produit : ");
            double prixHT = scanner.nextDouble();

            System.out.print("Le produit est-il electrique ? (1 = oui, 0 = non) : ");
            int estElectriqueChoix = scanner.nextInt();
            boolean estElectrique = (estElectriqueChoix == 1);

            double tauxTVA = estElectrique ? 5.0 : 20.0;
            double prixTTC = prixHT * (1 + tauxTVA / 100);

            if (prixTTC > 20000) {
                prixTTC = prixTTC * 0.90;
            }

            System.out.println("Prix TTC calcule : " + prixTTC + " EUR");
            System.out.println();
        }

        System.out.println("Tous les produits ont ete traites. Au revoir !");

        scanner.close();
    }
}
