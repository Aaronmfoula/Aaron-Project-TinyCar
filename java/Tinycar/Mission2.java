import java.util.Scanner;

public class Mission2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ===== Question 3 =====
        // Nouvelle variable : codeSaisi (String) pour verifier l'acces a l'application
        String codeSecret = "Padawan";

        System.out.print("Veuillez saisir le code secret pour acceder a l'application : ");
        String codeSaisi = scanner.nextLine();

        if (!codeSaisi.equals(codeSecret)) {
            System.out.println("Code incorrect. Au revoir !");
            scanner.close();
            return;
        }

        System.out.println("Code correct, bienvenue dans l'application !");
        System.out.println();

        // ===== Question 1 =====
        // Nouvelle variable :
        // - remise (double) : pourcentage de remise applique (10% si prix TTC > 20000)

        System.out.print("Veuillez saisir le prix HT de la voiture (en euros) : ");
        double prixHT = scanner.nextDouble();

        // ===== Question 2 =====
        // Nouvelle variable :
        // - estElectrique (boolean ou char) : indique si le vehicule est electrique
        // - tauxTVA (double) : 5% si electrique, 20% sinon

        scanner.nextLine(); // vidage du buffer
        System.out.print("Le vehicule est-il electrique ? (o/n) : ");
        String reponseElectrique = scanner.nextLine();
        boolean estElectrique = reponseElectrique.equalsIgnoreCase("o");

        double tauxTVA = estElectrique ? 5.0 : 20.0;

        double prixTTCAvantRemise = prixHT * (1 + tauxTVA / 100);

        // ===== Question 4 =====
        // Nouvelle variable :
        // - choixCarte (int) : 1 = sans carte, 2 = carte gold, 3 = carte platinium
        // - reductionCarte (double) : pourcentage de reduction selon la carte

        System.out.println("Choisissez votre type de carte de fidelite :");
        System.out.println("1 - Sans carte");
        System.out.println("2 - Carte Gold");
        System.out.println("3 - Carte Platinium");
        System.out.print("Votre choix : ");
        int choixCarte = scanner.nextInt();

        double reductionCarte = 0.0;

        switch (choixCarte) {
            case 1:
                reductionCarte = 0.0;
                break;
            case 2:
                // Carte gold : 20% de reduction, 30% si electrique
                reductionCarte = estElectrique ? 30.0 : 20.0;
                break;
            case 3:
                // Carte platinium : 15% de reduction
                reductionCarte = 15.0;
                break;
            default:
                System.out.println("Choix invalide, aucune reduction appliquee.");
                reductionCarte = 0.0;
        }

        double prixApresCarte = prixTTCAvantRemise * (1 - reductionCarte / 100);

        // Remise supplementaire de 10% si le prix TTC (apres carte) depasse 20000 EUR
        double remise = 0.0;
        if (prixApresCarte > 20000) {
            remise = 10.0;
        }

        double prixFinal = prixApresCarte * (1 - remise / 100);

        // Affichage du resultat
        System.out.println();
        System.out.println("Prix HT initial      : " + prixHT + " EUR");
        System.out.println("TVA appliquee         : " + tauxTVA + " %");
        System.out.println("Prix TTC avant remise : " + prixTTCAvantRemise + " EUR");
        System.out.println("Reduction carte        : " + reductionCarte + " %");
        System.out.println("Remise > 20000 EUR    : " + remise + " %");
        System.out.println("Prix final a payer    : " + prixFinal + " EUR");

        scanner.close();
    }
}
