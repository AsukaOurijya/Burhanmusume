package uma;

public class maruzensky extends UmaAttributes{
    public maruzensky(String name, String speciality, int speed, int stamina, int power, int guts, int wit) {
        super(name, speciality, speed, stamina, power, guts, wit);
    }

    @Override
    public String getName() {
        return "Maruzensky";
    }
    
    @Override
    public String getSpeciality() {
        return "Front Runner";
    }

    @Override 
    public int getSpeed() {
        return 96;
    }

    @Override 
    public int getStamina() {
        return 68;
    }

    @Override 
    public int getPower() {
        return 86;
    }

    @Override 
    public int getGuts() {
        return 100;
    }

    @Override 
    public int getWit() {
        return 100;
    }
    
}
