---
order: 96
icon: tools
tags: [mailkeets, configuration]
---

# Mail REST Endpoints
This page explains all REST endpoints to access **Mailkeets**. 

If you don't have any **Mailkeets api key**, [read this](./MailApiKey.md) to generate one.

## Header Values
You have to set these header values for all api call
1. **Content-Type** : You must set the content-type header to 'application/json'. Key-pair will look like **Content-Type: application/json**.
2. **Authorization** : You must set the Authorization header to 'Bearer Your-Api-Key'. Key-pair will look like **Authorization: Bearer Your-Api-Key**.

### Get All Verified Domain Api
!!!info This Api will fetch all verified domain
!!!

||| Url
**GET**  https://mailkeets.kursaha.com/api/sender-identities/verified-domains
|||

### Send Mail
!!!info This Api will send email
!!!

||| Url
**POST**  https://mailkeets.kursaha.com/api/mail-send
|||

```
Body (json)
{
    "fromName": "John",
    "fromAddress": "john@doe.com",
    "to": "hello@test.com",
    "subject": "This is test subject",
    "body": "This is test subject",
    "requestIdentifier": "800367b7-3b3a-423c-8006-eb63cc34c13c",
    "unsubscribedList": "<mailto:unsubscribe@example.com>, <http://www.unsubscribe.example.com/>"
}
```