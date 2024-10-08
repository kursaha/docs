---
order: 100
icon: code-square
label: Mail Api
---

Before proceeding with further illustration, it is mandatory to have an API Key for using the SDK. If you don't have a Mailkeets API Key, please refer to [this page](../settings/ApiKey.md) for instructions on how to generate one.

## Methods in the SDK

### Send mail

With this method, You can send email to your recipient. There are some mandatory fields you have to provide.

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

+++ GoLang

```go
dto := mailkeets.MailRequestDto{
    FromName:          "Bob",
    FromAddress:       "bob@joe.com",
    To:                "receiver@gmail.com",
    Subject:           "Hello from golang",
    ContentType:       "text/plain",
    Body:              "This is go lang sample",
    RequestIdentifier: uuid.New().String(),
    UnsubscribedList:  "",
}
err := client.Mk.SendEmail(dto)
if err != nil {
    print(err.Error())
} else {
    print("successfully send mail!")
}
```

+++ Curl
:::code source="../static/code/send_mail.sh" :::
+++

### Get all verified domains:

This method returns all verified domains saved in your account.

**Demo Code Snippet**

+++ Java
:::code source="../static/code/getVerifiedDomain.java" :::

+++ GoLang

```go
#todo
```

+++ Curl
:::code source="../static/code/get_verified_domain.sh" :::
+++
