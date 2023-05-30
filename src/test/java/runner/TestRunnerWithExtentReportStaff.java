package runner;

import com.intuit.karate.Results;
import com.intuit.karate.Runner.Builder;
import org.junit.jupiter.api.Test;
import utilities.CustomExtentReport;

public class TestRunnerWithExtentReportStaff {
    @Test
    public void executeKarateTest() {
        Builder aRunner = new Builder();
        aRunner.path("classpath:features");
        Results result = aRunner.parallel(5);
/*        System.out.println("Total Feature => " + result.getFeatureResults());
        System.out.println("Total Scenarios => " + result.getScenariosTotal());
        System.out.println("Passed Scenarios => " + result.getScenariosPassed());

        Assertions.assertEquals(0, result.getFailCount(), "There are Some Failed Scenarios ");*/
        // Extent Report

        CustomExtentReport extentReport = new CustomExtentReport()
                .withKarateResult(result)
                .withReportDir(result.getReportDir())
                .withReportTitle("Karate Test Execution Report");
        extentReport.generateExtentReport();

    }
}

