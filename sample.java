class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
} ;