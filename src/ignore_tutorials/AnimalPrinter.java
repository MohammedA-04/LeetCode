package ignore_tutorials;

public class AnimalPrinter <T extends Animal>{

    T thingToPrint;

    public AnimalPrinter(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        thingToPrint.eat();

    }



}
