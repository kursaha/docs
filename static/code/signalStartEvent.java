package org.example;

import com.kursaha.KursahaClient;

import java.util.UUID;

public class KursahaEventflowExample {

    /**
     * Create a unique api key from <a href="https://kursaha.com/engage-data-drive/settings/api-key">API Key</a>.
     * After that, please add that api key into system environment.
     */
    private final String apiKey = System.getenv("KURSAHA_KEY"); // Name of the Environment variable
    private final KursahaClient kursahaClient;

    public KursahaEventflowExample() {
        kursahaClient = new KursahaClient(apiKey);
    }

    public void sendStartEvent() throws InterruptedException {
        // unique ID for a user, this ID should be constant across the workflow journey
        String emitterId = String.valueOf(UUID.randomUUID());

        // Eventflow identifier can be found @ https://kursaha.com/engage-data-drive/eventflow
        UUID eventflowIdentifier = UUID.fromString("event-flow-identifier");

        // Unique id of the step node
        String stepNodeId = "start_event";
        kursahaClient.edd.signal(eventflowIdentifier, stepNodeId, emitterId);
    }

    public void sendCustomerData() {
        // Unique Id of your Customer
        String customerId = "<Unique-customer-id>";

        // Details of your Customer
        CustomerData customerData = new CustomerData();
        customerData.setEmail("john.deo@sqs.com");
        // ... Please provide all the details of that customer

        kursahaClient.edd.sendCustomerData(customerId, customerData);
    }

    public static void main(String[] args) throws Exception {
        KursahaEventflowExample kursahaEventflowExample = new KursahaEventflowExample();
        kursahaEventflowExample.sendStartEvent();
    }
}