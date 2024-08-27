---
order: 100
icon: person-fill
label: Event data format
---

Customer data typically refers to the information related to individual customers or users that is collected and used for tracking their interactions and activities within a system or application. This data is crucial for various purposes, including analytics, personalization, and understanding user behavior. It may include details relevant information that helps in monitoring and analyzing user engagement.

#### How to choose a Customer Id :

It is essential not to set the customer ID as "None" for multiple users, as it will lead Kursaha to group all their details and events under the same customer ID, assuming they are the same user. Additionally, avoid assigning customer IDs that may change, such as using email addresses. Remember that customer IDs are case-sensitive, so using different cases for the same ID will create separate profiles for the same customer in Kursaha's tracking.

### Details of User Specific Fields :

Customer information parameters consist of user identifiers shared with event data, enabling better user behavior analysis and personalized experiences. Please try to provide maximum information of a customer for better results. Use this [Api Endpoint](/developer/readme.md/#sending-customer-data-to-kursaha) for sending customer data. These are all the available fields for a particular customer.

| Fields    | Description { class="compact" }                                                                                                                                                                                                                                                                   |
| :-------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| email     | Email id of that user                                                                                                                                                                                                                                                                             |
| phone     | Phone number of that user. Phone numbers must include a country code to be used for matching (e.g., the number +1 must precede a phone number in the United States). Always include the country code as part of your customers' phone numbers, even if all of your data is from the same country. |
| gender    | We accept gender like this. Ex. `FEMALE` for Female and `MALE` for Male.                                                                                                                                                                                                                          |
| firstName | First name of that user. Lowercase only with no punctuation. If using special characters, the text must be encoded in UTF-8 format.                                                                                                                                                               |
| lastName  | Last name of that user. Lowercase only with no punctuation. If using special characters, the text must be encoded in UTF-8 format.                                                                                                                                                                |
| dob       | We accept the YYYY-MM-DD format accommodating a range of month, day and year combinations, with punctuation. Ex. 1997-09-13.                                                                                                                                                                      |
| city      | City name in lowercase only with no punctuation, no special characters, and no spaces. If using special characters, the text must be encoded in UTF-8 format.                                                                                                                                     |
| state     | State name in lowercase with no punctuation, no special characters, and no spaces.                                                                                                                                                                                                                |
| zip       | Zipcode in lowercase with no spaces and no dash.                                                                                                                                                                                                                                                  |
| country   | Use the lowercase, 2-letter country codes in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2?fbclid=IwAR2VYJ70CxsOKvP5fOtRRhZK1jnNRUX1IkaiVWUN20RRYEYXVgXjblClqWI).                                                                                                         |
