package uma;

public class taikiShuttle extends UmaAttributes {
    public taikiShuttle(String name, String speciality, int speed, int stamina, int power, int guts, int wit) {
        super(name, speciality, speed, stamina, power, guts, wit);
    }

    @Override
    public String getName() {
        return "Taiki Shuttle";
    }
    
    @Override
    public String getSpeciality() {
        return "Pace Chaser";
    }

    @Override 
    public int getSpeed() {
        return 96;
    }

    @Override 
    public int getStamina() {
        return 71;
    }

    @Override 
    public int getPower() {
        return 98;
    }

    @Override 
    public int getGuts() {
        return 93;
    }

    @Override 
    public int getWit() {
        return 92;
    }
    
}
