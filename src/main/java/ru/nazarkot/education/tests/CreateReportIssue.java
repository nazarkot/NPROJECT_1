package net.shipovalov.training.tests;



import net.shipovalov.training.model.UserData;
import net.shipovalov.training.model.fillreport;
import org.testng.annotations.Test;

public class CreateReportIssue extends NTestBase {

    @Test
    public void createReportIssue () {
        app.openLoginPage("http://shipovalov.net/login_page.php");
        app.loginInApp(new UserData().withUserName("student").withUserPassword("luxoft"));
        app.goToReportForm();
        app.fillReport(new fillreport().withDescription("NDescrip").withSummary("NSum").withStep("NStep"));
        app.submitReport();
    }

    @Test
    public void createReportIssueNullDescription () {
        app.openLoginPage("http://shipovalov.net/login_page.php");
        app.loginInApp(new UserData().withUserName("student").withUserPassword("luxoft"));
        app.goToReportForm();
        app.fillReport(new fillreport().withDescription("NDescrip").withSummary("NSum").withStep("NStep"));
        app.submitReport();
    }


}
