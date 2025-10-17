package uma;

public class UmaAttributes {
    private String name;
    private String speciality;
    private int speed;
    private int stamina;
    private int power;
    private int guts;
    private int wit;
    
    public UmaAttributes(String name, String speciality, int speed, int stamina, int power, int guts, int wit) {
        this.name = name;
        this.speciality = speciality;
        this.speed = speed;
        this.stamina = stamina;
        this.power = power;
        this.guts = guts;
        this.wit = wit;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public int getSpeed() {
        return speed;
    }

    public int getStamina() {
        return stamina;
    }

    public int getPower() {
        return power;
    }

    public int getGuts() {
        return guts;
    }

    public int getWit() {
        return wit;
    }

    @Override 
    public String toString() {
        return "";
    }
}
