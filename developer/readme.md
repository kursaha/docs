---
order: 91
icon: code
tags: [email, mailkeets]
---

# Developers

!!!info :bulb: SDK
SDK stands for **Software Development Kit**, which provides a set of libraries and tools that you can integrate into your application.
!!!

These documentation provides how you can use Kursaha sdk's to seamlessly connect to your system.

+++ Java

```
// build.gradle
dependencies {
    ...
    // https://mavenlibs.com/maven/dependency/com.kursaha/java-sdk
    implementation 'com.kursaha:java-sdk:0.0.16'
}

```

+++ NodeJs

```
  // package.json
  "dependencies": {
    ...
    "kursaha-sdk": "^1.0.8",
  }
```

+++ GoLang

```go
go get github.com/kursaha/go-sdk
```

+++ Rest API
Add these headers

1. **Content-Type** : You must set the content-type header to 'application/json'. Key-pair will look like Content-Type: application/json.
2. **Authorization** : You must set the Authorization header to 'Bearer Your-Api-Key'. Key-pair will look like Authorization: Bearer Your-Api-Key.
   +++

Before proceeding with further illustration, it is mandatory to have an API Key for using the SDK. If you don't have a Mailkeets API Key, please refer to [this page](../settings/ApiKey.md) for instructions on how to generate one.

## Methods

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

### Sending Customer data to Kursaha

Send your unique customer data to our API using the following endpoint:

```bash
  POST https://edd.kursaha.com/api/customers
```

+++ Curl

```bash
curl --location 'https://edd.kursaha.com/api/customers' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer <API-KEY>' \
--data-raw '{
    "customerId": "<Unique-customer-id>",
    "customerData": {
        "email": "j.doe@swq.com",
        "phoneNumber": "+911002220000",
        "firstName": "John",
        "lastName": "Doe",
        "gender": "",
        "dob":"",
        "city": "",
        "state": "",
        "country": "",
        "zip": ""
    }
}'
```

+++ Java
:::code source="../static/code/signalStartEvent.java" range="33-41" :::
+++

### Sending Events to Kursaha: Seamlessly Integrate User Data

Effortlessly send multiple events to our API using the following endpoint:

```bash
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
            "customerId": "<Unique-customer-id>",
            "eventType": "<event-type>",
            "data": {
                "price" : 200,
                "brand" : "something",
                "productId": "",
                "category" : "",
                "subCategory1" : "",
                "subCategory2" : "",
                "subCategory3" : ""
            }
        }
    ]
}'
```

+++ Java

// Coming soon

+++

Here's a breakdown of the fields within the events:

1. **customerId**: A distinctive user identifier for precise targeting.
2. **signals**: Batch multiple signals in a single API call.
3. **eventType**: Specify the [**event type**](../engageDataDrive/cohort/#utilizing-cohort-events) corresponding to a specific user action.
4. **data**: User data associated with the particular event, including attributes price, brand, productId, category, subCategory1, subCategory2, subCategory3 etc.

Leverage this seamless integration to transmit crucial user behavior data to Kursaha, enhancing your customer engagement and acquisition strategies. Connect with your audience like never before!
