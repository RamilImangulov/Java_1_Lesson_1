public class Main {

    public static void main(String[] args) {
        Cat[] cats = {new Cat("Васька", 50), new Cat("Боня", 40), new Cat("Бакс", 25), new Cat("Кузя", 15), new Cat("Котей", 10)};
        Plate plate = new Plate( 100);

        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            cat.info();
            plate.info();
            plate.addFood(50);
        }
    }
}
