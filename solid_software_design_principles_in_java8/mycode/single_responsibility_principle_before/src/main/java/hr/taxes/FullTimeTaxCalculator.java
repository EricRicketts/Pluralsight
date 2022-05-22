package hr.taxes;

import hr.personnel.Employee;

public class FullTimeTaxCalculator implements TaxCalculator {
    private final int RETIREMENT_TAX_PERCENTAGE = 10;
    private final int INCOME_TAX_PERCENTAGE = 16;
    private final int BASE_HEALTH_INSURANCE = 100;

    @Override
    public double calculate(Employee employee) {
        double retirement_tax = (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE) / 100.0;
        double income_tax = (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100.0;

        return BASE_HEALTH_INSURANCE + retirement_tax + income_tax;
    }
}
