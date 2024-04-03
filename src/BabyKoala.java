public class BabyKoala extends ZooAnimal {
    private boolean eyesOpen;
    private int age;
    // write this constructor as described in (b)
    public BabyKoala(String name){
        super(name);
        age = 0;
        eyesOpen = false;
    }

    public boolean hasEyesOpen() {
        return eyesOpen;
    }
    public void openEyes() {
        System.out.println("hello world!");
        eyesOpen = true;
    }
}
