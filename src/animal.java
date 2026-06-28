class animal {
    void sound() {
        System.out.println("the animal make sound ");
    }

    void move() {
        System.out.println("the animal can move ");
    }

    void eat() {
        System.out.println("the animal can eat ");
    }
}

class dog extends animal {
    @Override
    void sound() {
        System.out.println("the dogs berk ");
    }

    void move() {
        System.out.println("the dogs are walking ");
    }

    void eat() {
        System.out.println("the dogs are carnivorous ");
    }
}

class parrot extends animal {
    @Override
    void sound() {
        System.out.println("the parrots are twiting ");
    }

    void move() {
        System.out.println("the parrots are flying ");
    }

    void eat() {
        System.out.println("the dogs are hervivorous ");
    }
}

class mains {
    public static void main(String args[]) {
        animal sc3 = new animal();
        animal sc = new dog();
        animal sc1 = new parrot();
        sc3.sound();
        sc3.move();
        sc3.eat();
        sc.sound();
        sc.move();
        sc.eat();
        sc1.sound();
        sc1.move();
        sc1.eat();

    }
}