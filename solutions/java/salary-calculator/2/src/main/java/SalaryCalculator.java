public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double multiplier = 1.0;
        return daysSkipped >= 5 ? multiplier - 0.15 : multiplier;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        
        double totalSalary = 0;
        
        if(productsSold != 0) {
            totalSalary = 1000.0 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        } else {
            totalSalary = 1000.0 * salaryMultiplier(daysSkipped);
        }
        
        return totalSalary > 2000.0 ? 2000.0 : totalSalary;
    } 
}
