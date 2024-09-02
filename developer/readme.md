---
order: 91
icon: code
label: Developers
---

# Kursaha SDK Integration Guide

The Kursaha SDK provides libraries and tools to integrate with your application. Here’s how you can use the SDK with different programming languages and APIs to connect seamlessly to your system.

!!!info :bulb: SDK
SDK stands for **Software Development Kit**, which provides a set of libraries and tools that you can integrate into your application.
!!!

## Prerequisites

To use the SDK, you need an API Key. If you don't have one, please refer to [this page](../settings/ApiKey.md) for instructions on generating your API Key.

## SDK Integration

+++ Java

Add the Kursaha SDK to your `build.gradle` file:

```gradle
dependencies {
    ...
    implementation 'com.kursaha:java-sdk:0.0.16'
}
```

Initialize the client:

```java
/**
 * Create a unique API key from <a href="https://kursaha.com/engage-data-drive/settings/api-key">API Key</a>.
 * Add that API key to your system environment.
 */
private final String apiKey = System.getenv("KURSAHA_KEY"); // Environment variable name
private final KursahaClient kursahaClient;
```

+++ Node.js

Add Kursaha SDK to your `package.json` file:

```json
"dependencies": {
    ...
    "kursaha-sdk": "^1.0.8"
}
```

+++ GoLang

Install the Kursaha SDK:

```bash
go get github.com/kursaha/go-sdk
```

Initialize the client:

```go
kursahaClient := kursaha.NewKursaha("<YOUR-API-KEY>")
```

+++ REST API

To interact with the REST API, include the following headers in your requests:

1. **Content-Type**: `application/json`
2. **Authorization**: `Bearer Your-Api-Key`

+++

## Methods

### Signal Start Event

+++ Java

:::code source="../static/code/signalStartEvent.java" range="21-29" :::

+++ Node.js

```javascript
var Kursaha = require("kursaha-sdk"); // in Javascript file
// OR
import Kursaha from "kursaha-sdk"; // in Typescript file

// Initialize the SDK with your API key
var kursahaClient = new Kursaha("<YOUR-API-KEY>");

const signal = {
  customerId: "unique-customer-id",
  eventType: "event_type",
  data: {},
  eventflowIdentifier: "uuid",
};

kursahaClient.signal(signal);
```

+++ GoLang

```go
signal := edd.Signal{
    EmitterID:           "unique-customer-id",
    StepNodeID:          "event_type",
    Data:                map[string]interface{}{},
    EventFlowIdentifier: "uuid",
}
err := client.Edd.SendSignal([]edd.Signal{})
if err != nil {
    print(err.Error())
} else {
    print("successfully sent signal!")
}
```

+++ cURL

```bash
curl --location 'https://edd.kursaha.com/api/event-flows/signal' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer <API-KEY>' \
--data '{
    "requestIdentifier": "UUID",
    "signals": [
        {
            "customerId": "unique-customer-id",
            "eventType": "event_type",
            "data": {},
            "eventflowIdentifier": "event_flow_id"
        }
    ]
}'
```

+++

**Field Descriptions:**

1. `requestIdentifier`: Unique UUID to track the request.
2. `signals`: List of signals to send in one API call.
3. `emitterId/customerId`: Unique ID for the emitter.
4. `stepNodeId/eventType`: Step node ID.
5. `data`: User data for the specific event.
6. `eventflowIdentifier`: Identifier for the event flow.

### Sending Customer Data

Send customer data using the following endpoint:

```bash
POST https://edd.kursaha.com/api/customers
```

+++ Nodejs

```javascript
const customerData = {
  customerId: "<Unique-customer-id>",
  customerData: {
    email: "j.doe@swq.com",
    phoneNumber: "+911002220000",
    firstName: "John",
    lastName: "Doe",
    gender: "",
    dob: "",
    city: "",
    state: "",
    country: "",
    zip: "",
  },
};

kursahaClient.sendCustomerData(customerData);
```

+++ cURL

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
        "dob": "",
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

### Sending Events

Send events to Kursaha using the following endpoint:

```bash
POST https://edd.kursaha.com/api/event-flows/signal
```

+++ Node.js

```javascript
const event = {
  customerId: "<Unique-customer-id>",
  eventType: "<event-type>",
  data: {
    price: 200,
    brand: "something",
    productId: "",
    category: "",
    subCategory1: "",
    subCategory2: "",
    subCategory3: "",
  },
};

kursahaClient
  .sendEvent(event)
  .then((response) => {
    console.log("Event sent successfully:", response);
  })
  .catch((error) => {
    console.error("Error sending event:", error);
  });
```

+++ cURL

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
                "price": 200,
                "brand": "something",
                "productId": "",
                "category": "",
                "subCategory1": "",
                "subCategory2": "",
                "subCategory3": ""
            }
        }
    ]
}'
```

+++ Java

//coming soon
+++

**Field Descriptions:**

1. `customerId`: Unique identifier for the customer.
2. `signals`: List of events to send in one API call.
3. `eventType`: Type of the event.
4. `data`: Data associated with the event, including attributes like price, brand, product ID, category, etc.

Leverage this seamless integration to transmit crucial user behavior data to Kursaha, enhancing your customer engagement and acquisition strategies. Connect with your audience like never before!
