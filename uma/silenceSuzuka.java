package uma;

public class silenceSuzuka extends UmaAttributes {
    public silenceSuzuka(String name, String speciality, int speed, int stamina, int power, int guts, int wit) {
        super(name, speciality, speed, stamina, power, guts, wit);
    }
    
    @Override
    public String getName() {
        return "Silence Suzuka";
    }
    
    @Override
    public String getSpeciality() {
        return "Front Runner";
    }

    @Override 
    public int getSpeed() {
        return 101;
    }

    @Override 
    public int getStamina() {
        return 84;
    }

    @Override 
    public int getPower() {
        return 77;
    }

    @Override 
    public int getGuts() {
        return 100;
    }

    @Override 
    public int getWit() {
        return 88;
    }
}
