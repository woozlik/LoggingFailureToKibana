package kibana;

public class TestResult {
    private String testName;
    private String testClass;
    private String testStatus;
    private long executionTime;

    public String getTestStatus() {
        return testStatus;
    }

    public long getExecutionTime() {
        return executionTime;
    }

    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }


    public void setExecutionTime(long executionTime) {
        this.executionTime = executionTime;
    }

    public String getTestClass() {
        return testClass;
    }

    public void setTestClass(String testClass) {
        this.testClass = testClass;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
