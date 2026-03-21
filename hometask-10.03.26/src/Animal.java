class Animal{
    String name;
    void makeSound() {

    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bark bark");
    }

}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Miaw, miaw");
    }
}