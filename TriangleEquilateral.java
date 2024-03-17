import java.util.Scanner;

public class TriangleEquilateral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer la taille du côté du triangle équilatéral :");
        int tailleCote = scanner.nextInt();

        dessinerTriangleEquilateral(tailleCote);
    }

    public static void dessinerTriangleEquilateral(int tailleCote) {
        int hauteur = (int) Math.ceil(Math.sqrt(3) * tailleCote / 2); // Calcul de la hauteur du triangle

        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < tailleCote - i - 1; j++) {
                System.out.print(" "); // Espaces pour aligner le triangle
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* "); // Affichage des étoiles pour le triangle
            }
            System.out.println(); // Saut de ligne pour passer à la ligne suivante
        }
    }
}
