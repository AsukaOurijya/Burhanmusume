package uma;

public class specialWeek extends UmaAttributes{
    public specialWeek(String name, String speciality, int speed, int stamina, int power, int guts, int wit) {
        super(name, speciality, speed, stamina, power, guts, wit);
    }

    @Override
    public String getName() {
        return "Special Week";
    }
    
    @Override
    public String getSpeciality() {
        return "Pace Chaser";
    }

    @Override 
    public int getSpeed() {
        return 83;
    }

    @Override 
    public int getStamina() {
        return 88;
    }

    @Override 
    public int getPower() {
        return 98;
    }

    @Override 
    public int getGuts() {
        return 90;
    }

    @Override 
    public int getWit() {
        return 91;
    }
    
}
