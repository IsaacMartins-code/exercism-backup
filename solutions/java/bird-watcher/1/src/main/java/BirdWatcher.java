
class BirdWatcher {
    private final int[] birdsPerDay;
    private final int[] birdsInLastWeek = new int[] {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsInLastWeek;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int birdCount : birdsPerDay) {
            if(birdCount == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int soma = 0;
        
        if(numberOfDays > 7) {
            numberOfDays = 7;
        }
        for(int i = 0; i < numberOfDays; i++) {
            soma += birdsPerDay[i];
        }
        return soma;
    }

    public int getBusyDays() {
        int countBusyDays = 0;
        for(int birdCount : birdsPerDay) {
            if(birdCount >= 5) {
                countBusyDays++;
            }
        }
        return countBusyDays;
    }
}
