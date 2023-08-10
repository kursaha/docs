---
order: 99
icon: tools
tags: [edd, configuration]
---

# Engage Data Drive Sdk

Before proceeding with further illustration, it is mandatory to have an API Key for using the SDK. If you don't have a Mailkeets API Key, please refer to [this page](../settings/ApiKey.md) for instructions on how to generate one.


## Methods in the SDK

Initialize client as below

+++ Java

```java
    /**
     * Create a unique api key from <a href="https://kursaha.com/engage-data-drive/settings/api-key">API Key</a>.
     * After that, please add that api key into system environment.
     */
    private final String apiKey = System.getenv("KURSAHA_KEY"); // Name of the Environment variable
    private final KursahaClient kursahaClient;
```
+++ GoLang
```go
kursahaClient := kursaha.NewKursaha("<YOUR-API-KEY>")
```
+++


### Signal Start Event


+++ Java
:::code source="../static/code/signalStartEvent.java" range="21-29" :::

+++ Golang
```go
signal := edd.Signal{
    EmitterID:           "unique-emitter-id",
    StepNodeID:          "step-node-id",
    Data:                map[string]interface{}{},
    EventFlowIdentifier: "uuid",
}
err := client.Edd.SendSignal([]edd.Signal{})
if err != nil {
    print(err.Error())
} else {
    print("successfully send signal!")
}
```
+++ Curl
```bash
curl --location 'https://edd.kursaha.com/api/event-flows/signal' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer <API-KEY>' \
--data '{
    "requestIdentifier": "UUID",
    "signals": [
        {
            "emitterId": "UUID",
            "stepNodeId": "step_node_id",
            "data": {
                
            },
            "eventflowIdentifier": "event_flow_id"
        }
    ]
}'
```
+++ 

The description for each fields in the signal are as below:
1. requestIdentifier: Unique UUID to trage the request
2. signals: Multiple signals can batch in one API call
3. emitterId: Unique emitter ID, should be unique across the journey of the workflow
4. stepNodeId: Step node id
5. data: user data for the specific event
6. eventflowIdentifier: Event flow identifier

### Send Event
You can send muliple events to this api. The api is
```js
  POST https://edd.kursaha.com/api/event-flows/signal
```

+++ Curl
```bash
curl --location 'https://edd.kursaha.com/api/event-flows/signal' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer <API-KEY>' \
--data-raw '{
    "signals": [
        {
            "userId": "<Unique-user-id>",
            "eventType": "<event-type>",
            "data": {
                "firstName": "John",
                "lastName": "Deo",
                "email_id": "j.doe@swq.com",
                "phone": "+1000-00-000",
                "price" : 200,
                "brand" : "something"
            }
        }
    ]
}'
```
+++ Java

// Coming soon

+++

The description for each fields in the events are as below:
1. userId: Unique user id to target perticular user.
2. signals: Multiple signals can batch in one API call
3. eventType: Specific [**event type**](../engageDataDrive/cohort/#cohort-events) for perticular user action.
5. data: user data for the specific event