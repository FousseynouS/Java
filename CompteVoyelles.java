import java.util.Scanner;

public class CompteVoyelles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un mot : ");
        String mot = scanner.nextLine();

        int compteur = 0;
        for (int i = 0; i < mot.length(); i++) {
            char lettre = mot.charAt(i);
            if (lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u' || lettre == 'y' ||
                    lettre == 'A' || lettre == 'E' || lettre == 'I' || lettre == 'O' || lettre == 'U'
                    || lettre == 'Y') {
                compteur++;
            }
        }

        System.out.println("Le mot contient " + compteur + " voyelle(s)");
    }
}
