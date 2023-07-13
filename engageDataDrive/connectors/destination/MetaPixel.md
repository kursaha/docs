---
order: 100
icon: dot
tags: [queries, engage data drive]
---

# Meta Pixel

Using Kursaha you can direcetly send events into your Meta Event Platform.

### To Connect with MetaPixel
- A Pixel Id is required to connect with your account. Read the [Meta Pixel Documentation](https://developers.facebook.com/docs/marketing-api/conversions-api/get-started/#pixel-id) to create pixel id.
- An Access Token is also required for granting permission. Read the [Meta Pixel Documentation](https://developers.facebook.com/docs/marketing-api/conversions-api/get-started/#access-token) to create access token.

### How to Create the Structure of Events
If you want to sync the events to Meta Pixel, You have to follow the specific structure of event payload.

```js #2
{
  "userId": "<User-Id>",
  "eventType": "<Event-Name>",
  "data" : {
    // user data
    "custom_data": {
      // custom data
    }
  }
}

```
Name  | Description { class="compact" }
:---  | ---
userId  | Please give an proper user id so that we can process further.
eventType  | Meta has some specific event types. You can use those [fields](https://developers.facebook.com/docs/meta-pixel/reference). 
data  | In this section you have to provide the user data. There are some mandetory fields. See the [Meta documentation](https://developers.facebook.com/docs/marketing-api/conversions-api/parameters/customer-information-parameters/#formatting-the-user-data-parameters)
custom_data | This is an additional field inside data. If you want to provide custom data, please follow the [specific structure](https://developers.facebook.com/docs/marketing-api/conversions-api/parameters/custom-data) for that field.