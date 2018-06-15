package net.shipovalov.training.tests;

import net.shipovalov.training.model.UserData;
import net.shipovalov.training.model.fillreport;
import org.testng.annotations.Test;


public class ModificationReportIssue extends NTestBase {

    @Test
    public void modificationReportIssue(){


        app.openLoginPage("http://shipovalov.net/login_page.php");

        app.loginInApp(new UserData().withUserName("student").withUserPassword("luxoft"));

        app.goToReportForm();

        app.fillReport(new fillreport().withDescription("NDescrip").withSummary("NSum").withStep("NStep"));

        app.submitReport();


    }

}
