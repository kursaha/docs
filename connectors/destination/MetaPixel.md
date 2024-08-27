---
order: 100
icon: dot
label: Meta Pixel
---

Using Kursaha you can direcetly send events into your Meta Event Platform.

### To Connect with MetaPixel

- A Pixel Id is required to connect with your account. Read the [Meta Pixel Documentation](https://developers.facebook.com/docs/marketing-api/conversions-api/get-started/#pixel-id) to create pixel id.
- An Access Token is also required for granting permission. Read the [Meta Pixel Documentation](https://developers.facebook.com/docs/marketing-api/conversions-api/get-started/#access-token) to create access token.

### How to Create the Structure of Events

If you want to sync the events to Meta Pixel, You have to follow the specific structure of event payload.

```js #2
{
  "userId": "<User-Id>",
  "eventType": "<Event-Name>", // AddToCart
  "data" : {
    // event data
    "email" : "john@deo.mail.com",
    "firstName" : "john",
    "lastName" : "doe"
  }
}

```

#### How to choose a userId :

It is essential not to set the user ID as "None" for multiple users, as it will lead Kursaha to group all their events under the same user ID, assuming they are the same user. Additionally, avoid assigning user IDs that may change, such as using email addresses. Remember that user IDs are case-sensitive, so using different cases for the same ID will create separate profiles for the same user in Kursaha's tracking.

### Details of User Specific Fields :

Customer information parameters consist of user identifiers shared with event data, enabling better user behavior analysis and personalized experiences. To ensure the request is properly formatted, you must include at least one of the following parameters relevant to user identifier.

| Fields      | Description { class="compact" }                                                                                                                                                                                                                                                                  |
| :---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| email       | Email id of that user                                                                                                                                                                                                                                                                            |
| phone       | Phone number of that user. Phone numbers must include a country code to be used for matching (e.g., the number 1 must precede a phone number in the United States). Always include the country code as part of your customers' phone numbers, even if all of your data is from the same country. |
| gender      | We accept gender in the form of an initial in lowercase. Ex. `f` for Female and `m` for Male.                                                                                                                                                                                                    |
| firstName   | First name of that user. Lowercase only with no punctuation. If using special characters, the text must be encoded in UTF-8 format.                                                                                                                                                              |
| lastName    | Last name of that user. Lowercase only with no punctuation. If using special characters, the text must be encoded in UTF-8 format.                                                                                                                                                               |
| dateOfBirth | We accept the YYYYMMDD format accommodating a range of month, day and year combinations, with or without punctuation. Ex. 1997-09-13.                                                                                                                                                            |
| city        | City name in lowercase only with no punctuation, no special characters, and no spaces. If using special characters, the text must be encoded in UTF-8 format.                                                                                                                                    |
| state       | State name in lowercase with no punctuation, no special characters, and no spaces.                                                                                                                                                                                                               |
| zipcode     | Zipcode in lowercase with no spaces and no dash.                                                                                                                                                                                                                                                 |
| countryCode | Use the lowercase, 2-letter country codes in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2?fbclid=IwAR2VYJ70CxsOKvP5fOtRRhZK1jnNRUX1IkaiVWUN20RRYEYXVgXjblClqWI).                                                                                                        |

### Details of EventType and Some Specific Fields :

| EventType   | Event Description                                                                                                                                       | Fields { class="compact" }                                                                   |
| ----------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| AddToCart   | When a product is added to the shopping cart.                                                                                                           | contentId, contentName, contentType, currency, value                                         |
| Purchase    | When a purchase is made or checkout flow is completed. A person has finished the purchase or checkout flow and lands on thank you or confirmation page. | contentId, contentName, contentType, currency, numItems, value. Required: currency and value |
| ViewContent | A visit to a web page you care about (for example, a product page or landing page).                                                                     | contentId, contentCategory, contentName, contentType, currency, value                        |

#### Field properties :

| Fields          | Value Type       | Description                                                |
| --------------- | ---------------- | ---------------------------------------------------------- |
| contentId       | String           | Product ID associated with the event                       |
| contentName     | String           | Name of the page/product.                                  |
| contentType     | String           | Name of product group name or content group name.          |
| contentCategory | String           | Category of the page/product.                              |
| currency        | String           | The currency for the value specified.                      |
| value           | Integer or float | The value of a user performing this event to the business. |
| numItems        | Integer          | The number of items when checkout was initiated.           |
