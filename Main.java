public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat(200,10,0);
	cat.run(150);
	cat.jump(10);
	cat.swim(2);
	cat.printMaxDistance();

		System.out.println();

	Dog dog = new Dog(500, (float) 0.5,10);
	dog.run(200);
	dog.jump(1);
	dog.swim(5);
	dog.printMaxDistanceDog();
    }

}
