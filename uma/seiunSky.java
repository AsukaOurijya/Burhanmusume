package uma;

public class seiunSky extends UmaAttributes {
    public seiunSky(String name, String speciality, int speed, int stamina, int power, int guts, int wit) {
        super(name, speciality, speed, stamina, power, guts, wit);
    }
    
    @Override
    public String getName() {
        return "Seiun Sky";
    }
    
    @Override
    public String getSpeciality() {
        return "Front Runner";
    }

    @Override 
    public int getSpeed() {
        return 98;
    }

    @Override 
    public int getStamina() {
        return 98;
    }

    @Override 
    public int getPower() {
        return 88;
    }

    @Override 
    public int getGuts() {
        return 83;
    }

    @Override 
    public int getWit() {
        return 83;
    }
}
