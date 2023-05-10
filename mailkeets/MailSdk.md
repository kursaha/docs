---
order: 97
icon: tools
tags: [mailkeets, configuration]
---

# Mail Sdk

!!!info :bulb: SDK
SDK stands for **Software Development Kit**, which provides a set of libraries and tools that you can integrate into your application.
!!!

To access Mailkeets, we offer an SDK called Kursaha-sdk.  We plan to release the SDK in other languages in the future.

+++ Java
You can download it from the [Maven repository](https://mvnrepository.com/artifact/com.kursaha/java-sdk){target="_blank"}.
+++ NodeJs
You can download it from the [NPM](https://www.npmjs.com/package/kursaha-sdk){target="_blank"}.
+++ Rest API
Add these headers
1. **Content-Type** : You must set the content-type header to 'application/json'. Key-pair will look like Content-Type: application/json.
2. **Authorization** : You must set the Authorization header to 'Bearer Your-Api-Key'. Key-pair will look like Authorization: Bearer Your-Api-Key.
+++


Before proceeding with further illustration, it is mandatory to have an API Key for using the SDK. If you don't have a Mailkeets API Key, please refer to [this page](./MailApiKey.md) for instructions on how to generate one.


## Methods in the SDK

1. Get all verified domains: This method returns all verified domains saved in your account.

**Demo Code Snippet**

+++ Java
:::code source="../static/code/getVerifiedDomain.java" :::
+++ Curl
:::code source="../static/code/get_verified_domain.sh" :::
+++


2. Send mail : With this method, You can send email to your recipient. There are some mandatory fields you have to provide.


- **to** : The recipient's email address.
- **fromName** : The name of the person or organization.
- **fromAddress** : The email address from which your message will be sent.
- **subject** : A brief description or summary of the content of the email.
- **body** : The main content of your email.
 **requestIdentifier** : A unique UUID that you can use to track your email later. You have to provide this field.
- **unsubscribedList** : A list of email addresses or contacts that have requested to be removed from a particular email marketing or mailing list. When someone unsubscribes from a mailing list, it means that they no longer wish to receive emails from the sender or organization, and they have opted out of future communications.


!!! :bulb: Know More about One-Click Functionality for Unsubscribe

==- How one click unsubscribe is shown in the mail clients

![](/static/images/iosunsub.jpg)

===

==- More about One-Click Unsubscribe
 
Please refer [RFC-8058](https://www.rfc-editor.org/rfc/rfc8058) to know more about how single click unsbuscribe functionality.

Header value for `List-Unsubscribe` looks like this in the raw email
 
![](/static/images/unsubscribeList.png)

===

!!!


+++ Java

:::code source="../static/code/sendMail.java" title="sendMail.java" :::

+++ Curl
:::code source="../static/code/send_mail.sh" :::
+++