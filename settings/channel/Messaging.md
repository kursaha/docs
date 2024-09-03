---
order: 98
icon: dot
label: Messaging Channel
---

A Messaging Channel is crucial for modern businesses looking to enhance customer engagement, streamline communication, and improve efficiency.This immediacy helps in addressing customer queries, resolving issues, and maintaining a high level of customer satisfaction. Different messaging platforms offer unique features that cater to various communication needs. Messaging channels automate routine interactions, such as appointment reminders, promotional messages, and customer support inquiries.

By integrating multiple messaging channels, you can choose the platform that best fits your requirements and reach your audience effectively. Kursaha supports:

## **1. Whatsapp**

To create a Whatsapp channel, you'll need to obtain your [Deatils from Whatsapp Account](https://developers.facebook.com/docs/whatsapp/business-management-api/get-started).

1. Go to **Settings** -> **Channel** -> **Messaging** -> **Create New** -> **Whatsapp**.
2. Add Phone number Id and
3. Paste the Access Token obtained from your Whatsapp account.

[How to get ID and Access Token](https://developers.facebook.com/docs/whatsapp/business-management-api/get-started)

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
- **List of Recipients**: Phone numbers or groups to whom you'll be sending messages.
- **Campaign Name**: A unique name for the campaign you want to run via MSG91.

#### Steps to Create a MSG91 Channel

1. **Access the Platform**:
    - Log in to your Kursaha account.

2. **Navigate to Channels**:
    - Go to `Settings` > `Channel` > `Messaging` > `Create New`

3. **Select Channel Type**:
    - From the available options, choose **MSG91**.

4. **Enter Channel Details**:
    - **Channel Name**: Provide a unique name for the channel (e.g., `MarketingSMS`).
    - **API Key**: Enter the API key from your MSG91 account.
    - **Sender ID**: Input your registered Sender ID.
    - **Default Message Template**: Optionally, set a default template for your messages.

5. **Test the Configuration**:
    - Send a test message to ensure the channel is correctly configured.
    - Check the delivery status in your MSG91 account.

6. **Save and Activate**:
    - Once validated, save the channel configuration.
    - Activate the channel for it to start processing messages.

#### Using the MSG91 Channel

After setup:
- **Send Campaigns**: Start sending SMS campaigns directly from the platform.
- **Monitor Performance**: Track message delivery and engagement statistics via the platform’s dashboard.
- **Manage Contacts**: Use the platform to manage and segment your recipients efficiently.

#### Best Practices
- **API Key Security**: Keep your API key secure. Avoid sharing it or exposing it in public repositories.
- **Message Content**: Ensure that the content of your messages complies with local regulations.
- **Sender ID**: Use a recognizable Sender ID to increase message credibility and avoid being marked as spam.

#### Troubleshooting
- **Invalid API Key**: Double-check the API key and ensure it's correctly entered.
- **Message Delivery Issues**: Verify your MSG91 account's credit balance and ensure the recipient's numbers are correct.
- **Configuration Errors**: Review the entered details for any typos or incorrect values.

#### Need Help?
For any issues during the setup, contact our support team at [support@kursaha.com](mailto:support@kursaha.com).

---

**Security Reminder**: Always handle your credentials with care and follow best practices to ensure your account's security.

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
