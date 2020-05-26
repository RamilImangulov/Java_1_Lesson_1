public class Plate {
    public int food ;
    public Plate ( int food ) {
        this.food = food ;
    }
    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }
    public void addFood(int food) {
         this.food += food;
        System.out.println("В тарелку добавили: " + food);
    }

    public void info() {
        System.out.println("В тарелке: " + food);
    }

}
