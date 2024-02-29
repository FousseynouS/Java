// Classe abstraite
abstract class Animal {
    // Méthode abstraite (n'a pas de corps)
    public abstract void son();
    // Méthode standard
    public void sleep() {
        System.out.println("Zzz");
    }
}


// Sous-classe (hérite de l'Animal)
class Cochon extends Animal {
    public void son () {
        System.out.println("Le cochon dit wee wee");
    }
}

public class MyMainClass {
    public static void main(String[] args) {
        Cochon monCochon = new Cochon(); //Crée un objet Cochon
        monCochon.son();
        monCochon.sleep();
    }
}
