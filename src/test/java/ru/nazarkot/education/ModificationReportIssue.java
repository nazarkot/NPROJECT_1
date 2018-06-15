package net.shipovalov.training;

import org.testng.annotations.Test;


public class ModificationReportIssue extends NTestBase{

    @Test
    public void modificationReportIssue(){


        openLoginPage("http://shipovalov.net/login_page.php");

        login("student", "luxoft");

        goToReportForm();

        fillReport("NSummary", "NDescription-description", "NSteps");

        submitReport();


    }

}
