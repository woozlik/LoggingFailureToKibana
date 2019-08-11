package kibana;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ResultSender {
    static String ELASTIC_URL = "http://localhost:9200/app/suite";
    static String CONTENT_TYPE_VALUE = "application/json";
    static String CONTENT_TYPE = "Content-Type";
    static ObjectMapper OM = new ObjectMapper();

    public static void send(TestResult testResult) {
        try {
            Unirest.post(ELASTIC_URL)
                    .header(CONTENT_TYPE, CONTENT_TYPE_VALUE)
                    .body(OM.writeValueAsString(testResult)).asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
