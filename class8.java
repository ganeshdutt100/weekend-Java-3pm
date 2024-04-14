package intro;

//public class mainClass{
//    public static void AnotherClass() {
//        System.out.println("Another Aman");
//    }
//}



public class class8{
    public static void main(String[] args) {
//        same class
//        class8 Aman = new class8();
//        Aman.callByObject();



//different class
        AnotherClass1 nameDifferentClass = new AnotherClass1();
        nameDifferentClass.callByObject();



    }

//    method (same class)
//    public void callByObject(){
//        System.out.println("Call by Object with same class");
//    }
}

//method different class
class AnotherClass1{
    public void callByObject(){
        System.out.println("Call by Object with different class");
    }
}


