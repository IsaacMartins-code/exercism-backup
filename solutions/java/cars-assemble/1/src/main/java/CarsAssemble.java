public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        double carsEachHour = 221.0;
        double rate = 0;

        if(speed >= 1 && speed <= 4) {
            rate = speed * carsEachHour;
            
        } else if(speed >= 5 && speed <= 8) {
            rate = speed * carsEachHour * 0.9;
            
        } else if(speed == 9) {
            rate = speed * carsEachHour * 0.8;
            
        } else if(speed == 10) {
            rate = speed * carsEachHour * 0.77;
        }

        return rate;
    }

    public int workingItemsPerMinute(int speed) {
        
        int carsEachHour = 221;
        int items = 0;

        if(speed >= 1 && speed <= 4) {
            items = speed * carsEachHour / 60;
            
        } else if(speed >= 5 && speed <= 8) {
            items = (int) (speed * carsEachHour * 0.9) / 60;
            
        } else if(speed == 9) {
            items = (int) (speed * carsEachHour * 0.8) / 60;
            
        } else if(speed == 10) {
            items = (int) (speed * carsEachHour * 0.77) / 60;
        }

        return items;
    }
}
