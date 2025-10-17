package uma;

public class goldship extends UmaAttributes {
    public goldship(String name, String speciality, int speed, int stamina, int power, int guts, int wit) {
        super(name, speciality, speed, stamina, power, guts, wit);
    }
    
    @Override
    public String getName() {
        return "Goldship";
    }
    
    @Override
    public String getSpeciality() {
        return "End Closer";
    }

    @Override 
    public int getSpeed() {
        return 82;
    }

    @Override 
    public int getStamina() {
        return 96;
    }

    @Override 
    public int getPower() {
        return 100;
    }

    @Override 
    public int getGuts() {
        return 77;
    }

    @Override 
    public int getWit() {
        return 70;
    }
}
