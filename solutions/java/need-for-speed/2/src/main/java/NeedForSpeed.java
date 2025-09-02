class NeedForSpeed {

    private int meters;
    private int speed;
    private int batteryPercentage = 100;
    private int batteryDrain;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

    public int distanceDriven() {
        return meters;
    }

    public void drive() {
        if(!batteryDrained()) {
            batteryPercentage -= batteryDrain;   
            meters += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }
}

class RaceTrack {

    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        NeedForSpeed carTest = new NeedForSpeed(car.getSpeed(), car.getBatteryDrain());
        while(!carTest.batteryDrained() && carTest.distanceDriven() < distance) {
            carTest.drive();
        }
        return carTest.distanceDriven() >= distance;
    }
}
