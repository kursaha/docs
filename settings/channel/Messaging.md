---
order: 98
icon: dot
label: Messaging Channel
---

# Messaging channel

A Messaging Channel is crucial for modern businesses looking to enhance customer engagement, streamline communication, and improve efficiency.This immediacy helps in addressing customer queries, resolving issues, and maintaining a high level of customer satisfaction. Different messaging platforms offer unique features that cater to various communication needs. Messaging channels automate routine interactions, such as appointment reminders, promotional messages, and customer support inquiries.

By integrating multiple messaging channels, you can choose the platform that best fits your requirements and reach your audience effectively. To configure, start with logging to your Kursaha account. Kursaha supports below channels.

## **1. Whatsapp**

To create a Whatsapp channel, you'll need to obtain your [Details from Whatsapp Account](https://developers.facebook.com/docs/whatsapp/business-management-api/get-started).

1. Go to **Settings** -> **Channel** -> **Messaging** -> **Create New** -> **Whatsapp**.
2. Add Phone number Id and
3. Paste the Access Token obtained from your Whatsapp account.

[How to get ID and Access Token](https://developers.facebook.com/docs/whatsapp/business-management-api/get-started)


### How to Set Up a Webhook on Kursaha to Track WhatsApp Message Events

This guide will show you how to set up a webhook on Meta's platform and connect it to Kursaha to monitor WhatsApp message events, such as message delivery and read statuses.

#### Step 1: Set Up the Webhook on Meta's Platform

1. **Log in to Meta for Developers**:
   - Visit [Meta for Developers](https://developers.facebook.com/docs/whatsapp/cloud-api/guides/set-up-webhooks) and log in.

2. **Go to WhatsApp Configuration**:
   - In the left-hand menu, under **Products**, click **WhatsApp** and then **Configuration**.
     ![](/static/images/whatsappEvent1.png)

   ---   
3. **Enter the Webhook URL**:
   - In the **Webhook** section, find the **Callback URL** field and enter:
     ```
     https://www.edd.kursaha.com/api/whatsapp/webhooks
     ```

4. **Retrieve Your Verify Token from Kursaha**:
   - Email support@kursaha.com to request your unique Verify Token, and we'll send it to you promptly.

5. **Enter the Verify Token**:
   - Return to Meta’s platform and paste the token into the **Verify Token** field.

6. **Select Events to Track**:
   ![](/static/images/whatsappEvent2.png)

   - Under **Webhook fields**, ensure the **messages** field is selected and **Subscribed**.
   - Choose the appropriate API version (e.g., v17.0 for messages).

7. **Verify and Save**:
   - Click **Verify and save**. Meta will verify your webhook and start sending notifications to Kursaha.

#### Step 2: Monitor Events on Kursaha
- **View Incoming Events**:
   - Once the webhook is active, you can track WhatsApp message events like sent, delivered, and read statuses in the Kursaha dashboard.



## **2. Whatsapp Interakt**

To create a Whatsapp Interakt channel, you'll need to obtain your [API Key from Whatsapp Interakt Account](https://www.interakt.shop/resource-center/interakt-apis/).

1. Go to **Settings** -> **Channel** -> **Messaging** -> **Create New** -> **Whatsapp Interakt**.
2. Paste the API Key obtained from your Whatsapp Interakt account.

## **3. MSG91**

The MSG91 Channel allows you to integrate your MSG91 messaging service with the Kursaha platform for seamless communication management. Follow the steps below to set up the channel.

#### Prerequisites
Before you start, ensure you have:
- **MSG91 Account**: To create a MSG91 channel, you'll need to obtain your [Auth Key from MSG91 Account](https://appwrite.io/docs/products/messaging/msg91).
- **Sender ID**: Registered and approved by MSG91.

#### Steps to Create a MSG91 Channel
1. Go to **Settings** -> **Channel** -> **Messaging** -> **Create New** -> **MGS91**.
2. Enter Channel Details:
    - **Channel Name**: Provide a unique name for the channel (e.g., `MarketingSMS`).
    - **Auth Key**: Enter the API key from your MSG91 account.

---

## **4. Gupshup**

To create a Gupshup channel, you'll need to obtain your [details from Gupshup Account](https://apidoc.gupshup.io/).

1. Go to **Settings** -> **Channel** -> **Messaging** -> **Create New** -> **Gupshup**.
2. Paste the details like APP Id, API Key and Source obtained from your Gupshup account.

## **5. Twilio SMS**

To create a Twilio SMS channel, you'll need to obtain your details from Twilio SMS Account.

1. Go to **Settings** -> **Channel** -> **Messaging** -> **Create New** -> **Twilio SMS**.
2. Paste the obtained [Account SID from your Twilio SMS account](https://help.twilio.com/articles/14726256820123).
3. Paste the obtained [API Key from your Twilio SMS account](https://www.twilio.com/docs/iam/api/authtoken).
4. Paste the obtained [Twilio SMS Number from your Twilio SMS account](https://www.twilio.com/docs/twilio-cli/examples/explore-sms).

# After channel setup
- **Send Campaigns**: Start sending campaigns directly from the Kursaha.
- **User Journeys**: Start user Journeys directly from the Kursaha.
- **Monitor Performance**: Track message delivery and engagement statistics via the platform’s dashboard.
- **Manage Contacts**: Use the platform to manage and segment your recipients efficiently.

#### Best Practices
- **API Key Security**: Keep your API key secure. Avoid sharing it or exposing it in public repositories.
- **Content**: Ensure that the content of your messages complies with local regulations.

#### Troubleshooting
- **Invalid API Key**: Double-check the API key and ensure it's correctly entered.
- **Message Delivery Issues**: Verify your channel account's credit balance and ensure the recipient's contact details are correct.
- **Configuration Errors**: Review the entered details for any typos or incorrect values.

#### Need Help?
For any issues during the setup, contact our support team at [support@kursaha.com](mailto:support@kursaha.com).

---

**Security Reminder**: Always handle your credentials with care and follow best practices to ensure your account's security.

