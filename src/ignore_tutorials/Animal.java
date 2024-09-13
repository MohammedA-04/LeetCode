package ignore_tutorials;


import java.util.ArrayList;
import java.util.List;

public class Animal {

    public static void main(String[] args) {

        AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(new Cat());
        catPrinter.print();

        AnimalPrinter<Dog> dogPrinter = new AnimalPrinter<>(new Dog());
        dogPrinter.print();

        // E.g., 3
        returnT_V("Ahmed", 19);
        returnT_V(16, "Shan");

        // E.g., 4
        returnK("Mohammed", 19, "Ahmed");
        System.out.println( returnK("Born At Time", 6.30, 2004) );

        List<Integer> intList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        printList(intList);
        printList(catList);


    }

    // Example 3
    // Within the Animal class make return <T> method()
    private static <T,V> void returnT_V (T thingToPrint, V otherToPrint){
        System.out.println(thingToPrint + " " + otherToPrint);

    }

    private static <T,V,K> K returnK (T thingToPrint, V otherToPrint, K random){
        //System.out.println(thingToPrint + " " + otherToPrint + " " + random);

        return random; // <k>
    }

    // Example 5
    // Use <?> wildcard when you do not know what List<> going to be
    private static void printList(List<?> myList) {

        System.out.println(myList);
    }


    public void eat(){
        System.out.println("Eating");
    }



    // Other types of animal
    static class Dog extends Animal{
        String name = "Kalb";

        @Override
        public void eat(){
            System.out.println(name +" Eating");
        }
    }

    static class Cat extends Animal{
        String name = "Qita";

        @Override
        public void eat(){
            System.out.println(name + " Eating");
        }

    }

}
