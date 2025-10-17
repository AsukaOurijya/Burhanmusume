package uma;

public class sakuraBakushinO extends UmaAttributes {
    public sakuraBakushinO(String name, String speciality, int speed, int stamina, int power, int guts, int wit) {
        super(name, speciality, speed, stamina, power, guts, wit);
    }

    @Override
    public String getName() {
        return "Sakura Bakushin O";
    }
    
    @Override
    public String getSpeciality() {
        return "Front Runner";
    }

    @Override 
    public int getSpeed() {
        return 87;
    }

    @Override 
    public int getStamina() {
        return 54;
    }

    @Override 
    public int getPower() {
        return 93;
    }

    @Override 
    public int getGuts() {
        return 85;
    }

    @Override 
    public int getWit() {
        return 81;
    }
    
}
