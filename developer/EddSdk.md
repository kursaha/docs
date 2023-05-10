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
#todo
```
+++


### Signal Start Event


+++ Java
:::code source="../static/code/signalStartEvent.java" range="21-29" :::

+++ Golang

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