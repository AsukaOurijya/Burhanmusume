package uma;

public class tokaiTeio extends UmaAttributes {
    public tokaiTeio(String name, String speciality, int speed, int stamina, int power, int guts, int wit) {
        super(name, speciality, speed, stamina, power, guts, wit);
    }

    @Override
    public String getName() {
        return "Tokai Teio";
    }
    
    @Override
    public String getSpeciality() {
        return "Pace Chaser";
    }

    @Override 
    public int getSpeed() {
        return 99;
    }

    @Override 
    public int getStamina() {
        return 99;
    }

    @Override 
    public int getPower() {
        return 92;
    }

    @Override 
    public int getGuts() {
        return 102;
    }

    @Override 
    public int getWit() {
        return 108;
    }

}
