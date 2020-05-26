public class Cat extends Animal {
    private float runningDistance;
    private float jumpingDistance;
    private float swimmingDistance;

    public Cat(float runningDistance, float jumpingDistance, float swimmingDistance) {
        this.runningDistance = runningDistance;
        this.jumpingDistance = jumpingDistance;
        this.swimmingDistance = swimmingDistance;
    }

        @Override
    public void run(float length) {
    if(length <= runningDistance){
        System.out.println(String.format("Cat is running distance %s", length));
        } else {
        System.out.println(String.format("Cat is cannot run distance %s", length));
        }
    }

        @Override
    public void swim(float length) {
        System.out.println("Cat cannot swim");
    }

        @Override
    public void jump(float length) {
        if(length <= jumpingDistance){
            System.out.println(String.format("Cat is jumping distance %s", length));
        } else {
            System.out.println(String.format("Cat is cannot jumping distance %s", length));
        }
    }

    public void printMaxDistance (){
        System.out.println(String.format("Run: %s, Swim: %s, Jump: %s", runningDistance,swimmingDistance,jumpingDistance));
    }
}
