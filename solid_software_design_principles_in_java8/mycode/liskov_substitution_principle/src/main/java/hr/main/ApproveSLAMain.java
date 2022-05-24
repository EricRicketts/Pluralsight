package hr.main;

import hr.logging.ConsoleLogger;
import hr.persistence.EmployeeFileSerializer;
import hr.persistence.EmployeeRepository;
import hr.personnel.Employee;
import hr.personnel.ServiceLicenseAgreement;
import hr.personnel.Subcontractor;

import java.util.Arrays;
import java.util.List;

public class ApproveSLAMain {
    public static void main(String[] args) {
        // Define SLA
        int minTimeOffPercent = 98;
        int maxResolutionDays = 2;

        ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(
            minTimeOffPercent,
            maxResolutionDays
        );

        // Get Collaborators from their own source
        Subcontractor subcontractor1 = new Subcontractor(
            "Rebekah Jackson",
            "rebekah-jackson@ab.com",
                3000,
                15
        );
        Subcontractor subcontractor2 = new Subcontractor(
                "Harry Fritz",
                "harryfritz@def.com",
                3000,
                15
        );
        List<Subcontractor> collaborators = Arrays.asList(subcontractor1, subcontractor2);

        // check SLA
        for (Subcontractor subcontractor:collaborators) {
            subcontractor.approveSLA(companySla);
        }
    }
}
