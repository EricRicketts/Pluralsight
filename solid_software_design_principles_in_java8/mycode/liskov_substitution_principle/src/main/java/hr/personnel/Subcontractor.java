package hr.personnel;

public class Subcontractor {
    private final int monthlyIncome;
    private int nbHoursPerWeek;
    private String email;
    private String name;

    public Subcontractor(String name, String email, int monthlyIncome, int nbHoursPerWeek) {
        this.name = name;
        this.email = email;
        this.monthlyIncome = monthlyIncome;
        this.nbHoursPerWeek = nbHoursPerWeek;
    }

    public boolean approveSLA(ServiceLicenseAgreement sla) {
        boolean result = false;
        boolean approveSLATest = (sla.getMinUptimePercent() >= 98) && (sla.getProblemResolutionTimeDays() <= 2);
        if (approveSLATest) result = true;

        return result;
    }

    public String getEmail() {
        return email;
    }

    public int getMonthlyIncome() {
        return monthlyIncome;
    }

    public String getName() {
        return name;
    }

    public int getNbHoursPerWeek() {
        return nbHoursPerWeek;
    }
}
