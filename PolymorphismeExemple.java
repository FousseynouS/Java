class Animal{
    public void son() {
        System.out.println("L'animal fait un son");
    }
}

class Chien extends Animal {
        public void son() {
        System.out.println("Le chien dit: bow bow");
    }
}


class Chat extends Animal {
        public void son() {
        System.out.println("Le chat dit: meow meow");
    }
}


class Canard extends Animal {
        public void son() {
        System.out.println("Le canard dit: quack quack");
    }
}

class Lion extends Animal {
    public void son() {
    System.out.println("Le lion dit: roar roaaar");
}
}


public class PolymorphismeExemple {
    public static void main(String arg[]) {
        // Création des objets
        Animal animal = new Animal();
        Animal chien = new Chien();
        Animal chat = new Chat();
        Animal canard = new Canard();
        Animal lion = new Lion();
   
        animal.son();
        lion.son();
        chien.son();
        chat.son();
        canard.son();


    }
}
