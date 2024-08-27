---
order: 99
icon: note
---

# What is SPF ?

---

!!!
SPF stands for Sender Policy Framework
!!!

=== Definition
Specifies the servers and domains that are authorized to send email on behalf of your organization.
===

With the help of SPF, email servers can authenticate the ip address of the sender-email-server with the domain name the email. It is basically a DNS TXT Record with some necessary parameters that we have to include in the DNS server with the domain name.

=== SAMPLE SPF DNS record (type = TXT)
`"v=spf1 a mx include:_spf.google.com -all"`
===

## SPF Tag definition

| Tag     | Description                                                                                                                                             |
| ------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| v       | That defines the version of SPF Record. It is always version "SPF1".                                                                                    |
| a       | It indicates that, if ip address of sender mail will match with 'A' type Dns record of the sending domain. Then the SPF will pass.                      |
| mx      | It works same as 'a'. It will check the 'MX' type Dns record of the sending domain is same as mail ip address or not. If it is same then SPF will pass. |
| include | It matches the ip address of email with the domain.                                                                                                     |
| all     | It always checks all the parameters.                                                                                                                    |

## SPF Qualifiers

| Qualifier      | Description { class="compact" }                                                                                                      |
| -------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| '+' (Pass)     | The ip address will pass the SPF if it matches all parameters.                                                                       |
| '-' (Fail)     | The ip address will fail the SPF if it does not match all parameters.                                                                |
| '~' (SoftFail) | The ip address will soft fail the SPF. It means that the recipient's email server can accept the mail but it will mark that as spam. |
| '?' (Neutral)  | The ip address does not check any SPF. So, there is no guarantee about email delivery.                                               |

So, It is a necessary task of any email service provider to add SPF record in the email header.
