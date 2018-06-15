package net.shipovalov.training.tests;

import net.shipovalov.training.ApplicationManager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NTestBase {


    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();

    }

    @AfterMethod

    public void tearDown() {
        app.stop();
    }

}
