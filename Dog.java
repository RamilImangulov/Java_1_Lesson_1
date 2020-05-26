public class Dog extends Animal{
    private float runningDistance;
    private float jumpingDistance;
    private float swimmingDistance;

    public Dog(float runningDistance, float jumpingDistance, float swimmingDistance) {
        this.runningDistance = runningDistance;
        this.jumpingDistance = jumpingDistance;
        this.swimmingDistance = swimmingDistance;
    }


        @Override
    public void run(float length) {
        if(length <= runningDistance){
            System.out.println(String.format("Dog is running distance %s", length));
        } else {
            System.out.println(String.format("Dog is cannot run distance %s", length));
        }
    }

        @Override
    public void swim(float length) {
        if(length <= swimmingDistance){
            System.out.println(String.format("Dog is swimming distance %s", length));
        } else {
            System.out.println(String.format("Dog is cannot swim distance %s", length));
        }
    }

        @Override
    public void jump(float length) {
        if(length <= jumpingDistance){
            System.out.println(String.format("Dog is jumping distance %s", length));
        } else {
            System.out.println(String.format("Dog cannot jump distance %s", length));
        }
    }
    public void printMaxDistanceDog(){
        System.out.println(String.format("Run: %s, Swim: %s, Jump: %s", runningDistance,swimmingDistance,jumpingDistance));
    }
}
