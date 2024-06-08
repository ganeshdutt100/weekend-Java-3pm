package intro.oops;


class animal{
    void eat(){
        System.out.println("Eating......");

    }

    static class Cat extends animal{
        void meaowwwwwww(){
            System.out.println("meaowwwwwww...");
        }
    }
}
class Dog extends animal{
    void barks(){
        System.out.println("barks...");
    }
}

public class class1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        animal.Cat myCat = new animal.Cat();
        myDog.eat();
        myCat.meaowwwwwww();
        myCat.eat();

    }
}
