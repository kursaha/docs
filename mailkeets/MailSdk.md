---
order: 97
icon: tools
tags: [mailkeets, configuration]
---

# MailSdk
SDK stands for **Software Development Kit** provides a set of libraries and tools that you can integrate in your application . 

To access **Mailkeets**, We introduce sdk called **Kursaha-sdk**. For now it is only available in Java. You can download it from [Maven repository](https://mvnrepository.com/artifact/com.kursaha/java-sdk). Later, we will also release the sdk in different languages.

Before going to further illustration , an **Api Key** is mandatory for using sdk. If you don't have any **Mailkeets api key**, [read this](./MailApiKey.md) to generate one.

## Methods in Sdk
1. Get all verified domains : This will return all verified domains saved in your account.

**Demo Code Snippet**
:::code source="../static/getVerifiedDomain.java" :::

2. Send mail : With this method, You can send email to your recipient.
There are some mandatory fields you have to provide.

- **to** : Your recipient email address.
- **fromName** : It refers to the name of the person or organization.
- **fromAddress** : It is the email address from which your message will be sent.
- **subject** : It is a brief description or summary of the content of the email.
- **body** : It is the main content of your email.
- **requestIdentifier** : It is a unique UUID by which you can track your email later. You have to provide this field.
- **unsubscribedList** : It is a list of email addresses or contacts that have requested to be removed from a particular email marketing or mailing list. When someone unsubscribes from a mailing list, it means that they no longer wish to receive emails from the sender or organization, and they have opted out of future communications. Demo payload looks like this ![](/static/images/unsubscribeList.png)

This is a demo picture where you can see the Unsubscribe tab.![](/static/images/iosunsub.jpg)

**Demo Code Snippet**
:::code source="../static/sendMail.java" :::