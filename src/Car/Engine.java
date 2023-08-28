package Car;

public class Engine {
    private String name;
    private int power;
    private int wear;

    public Engine() {
        this.name = "2jz-ge";
        this.power = 220;
        this.wear = 1;
    }

    public Engine(String name, int power, int wear) {
        this.name = name;
        this.power = power;
        this.wear = wear;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getPower() {
        return power;
    }

//    public void setPower(int power) {
//        this.power = power;
//    }

    public int wearEngine(){
        return this.power - wear;
    }
}
