package net.shipovalov.training;


import org.testng.annotations.Test;

public class CreateReportIssue extends NTestBase {

    @Test
    public void createReportIssue () {
        openLoginPage("http://shipovalov.net/login_page.php");
        login("student", "luxoft");
        goToReportForm();
        fillReport("NSummary", "NDescription-description", "NSteps");
        submitReport();
    }

    @Test
    public void createReportIssueNullDescription () {
        openLoginPage("http://shipovalov.net/login_page.php");
        login("student", "luxoft");
        goToReportForm();
        fillReport("NSummary", "", "");
        submitReport();
    }


}
