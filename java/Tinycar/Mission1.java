import java.util.Scanner;

public class Mission1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== Question 2 =====
        // Variables necessaires :
        // - prixHT (double) : prix hors taxe de la voiture
        // - tauxTVA (double) : taux de TVA applicable
        // - prixTTC (double) : prix toutes taxes comprises, calcule

        // Formule : prixTTC = prixHT + (prixHT * tauxTVA / 100)
        // ou simplement : prixTTC = prixHT * (1 + tauxTVA / 100)

        // ===== Question 3 =====
        // Le programme demande desormais le prixHT a l'utilisateur.
        // Fonctions de saisie utilisees :
        // - scanner.nextDouble() : pour lire un nombre decimal (prixHT, tauxTVA)
        // - scanner.nextLine() : pour lire une chaine de caracteres (marque, modele)

        System.out.println("=== Calcul du prix TTC d'une voiture ===");

        System.out.print("Veuillez saisir le prix HT de la voiture (en euros) : ");
        double prixHT = scanner.nextDouble();

        System.out.print("Veuillez saisir le taux de TVA applicable (en %) : ");
        double tauxTVA = scanner.nextDouble();

        // ===== Question 4 =====
        // Nouvelles variables :
        // - marque (String) : la marque du vehicule
        // - modele (String) : le modele du vehicule
        // Fonction de saisie utilisee : scanner.nextLine()
        // (necessite un nextLine() vide juste avant pour vider le buffer
        // apres les nextDouble() precedents)

        scanner.nextLine(); // vidage du buffer

        System.out.print("Veuillez saisir la marque du vehicule : ");
        String marque = scanner.nextLine();

        System.out.print("Veuillez saisir le modele du vehicule : ");
        String modele = scanner.nextLine();

        // Calcul du prix TTC
        double prixTTC = prixHT * (1 + tauxTVA / 100);

        // Affichage du resultat
        System.out.println();
        System.out.println("Vehicule : " + marque + " " + modele);
        System.out.println("Prix HT  : " + prixHT + " EUR");
        System.out.println("TVA      : " + tauxTVA + " %");
        System.out.println("Prix TTC : " + prixTTC + " EUR");

        scanner.close();
    }
}
