package kibana;

import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.time.Instant;

public class KibanaTestLisener extends RunListener {
    private TestResult testResult;

    public void testFailure(Failure failure) {
        testResult = new TestResult();
        sendStatus(failure, Status.PASS);
    }

    private void sendStatus(Failure failure, Status status) {
        testResult = new TestResult();
        testResult.setTestClass(failure.getDescription().getClassName());
        testResult.setTestStatus(status.toString());
        testResult.setTestName(failure.getDescription().getMethodName());
        testResult.setExecutionTime(Instant.now().toEpochMilli());
        ResultSender.send(testResult);
    }
}
