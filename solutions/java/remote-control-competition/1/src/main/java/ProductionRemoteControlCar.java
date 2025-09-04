public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {

    private int distance;
    private int victories;

    @Override
    public void drive() {
        distance += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return distance;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar anotherProdCar) {
        if (this.victories < anotherProdCar.getNumberOfVictories()) {
            return -1;
        }
        if (this.victories > anotherProdCar.getNumberOfVictories()) {
            return 1;
        }
        return 0;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int victories) {
        this.victories = victories;
    }
}
