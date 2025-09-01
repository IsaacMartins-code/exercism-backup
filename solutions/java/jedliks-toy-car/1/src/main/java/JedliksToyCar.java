public class JedliksToyCar {
    
    private int meters  = 0;
    private int batteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + meters + " meters";
    }

    public String batteryDisplay() {
        if(batteryPercentage > 0) {
            return "Battery at " + batteryPercentage + "%";
        } else {
            return "Battery empty";
        }
    }

    public void drive() {
        if(batteryPercentage > 0) {
            meters += 20;
            batteryPercentage--;
        }
    }
}
