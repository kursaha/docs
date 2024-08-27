---
order: 99
icon: verified
label: Email Security
---

!!!
90%+ of all cyber attacks involve fake email.
!!!

The word **Email Security** refers to various processes and strategies for defending email accounts, information, and communications from unwanted access, theft, or compromise.

## Types of Email Attacks

Cyber criminals use many different tactics to hack email, and some methods can cause considerable damage to an organization’s data and/or reputation. Malware, which is malicious software used to harm or manipulate a device or its data, can be placed on a computer using each of the following attacks.

### Phishing

A phishing attack targets users by sending them a text, direct message, or email. The attacker pretends to be a trusted individual or institution and then uses their relationship with the target to steal sensitive data like account numbers, credit card details, or login information.

Phishing comes in several forms, such as spear phishing, regular phishing, and whaling. Spear phishing targets a particular person, while a whaler targets someone high up in the organization by pretending to be someone they trust.

### Spoofing

Spoofing is a dangerous email threat because it involves fooling the recipient into thinking the email is coming from someone other than the apparent sender. This makes spoofing an effective business email compromise (BEC) tool. The email platform cannot tell a faked email from a real one because it merely reads the metadata—the same data the attacker has changed.

This makes the impersonation of a person the victim either knows or respects relatively easy for an attacker.

## Email security best practices

Some of the important email security practices for the end users

- [x] Use a strong email password
- [x] Use two-factor authentication
- [x] Monitor your email habits
- [x] Look out for _Phishing Emails_
- [x] Don’t open attachments without scanning them first
- [x] Never access emails from public WiFi
- [x] Change your password as often as possible
- [x] Be careful with the devices you use
- [x] Avoid giving your email address away
- [x] Log out of your email account when you’re finished

## Security practices for mail servers

Some of the important email security practices for the businesses

1. Configure mail relay options to avoid Open Relay
2. Implement [SPF](SPF.md) (Sender Policy Framework)
3. Implement [DKIM](DKIM.md) (DomainKeys Identified Mail)
4. Implement [DMARC](DMARC.md) (Domain-based Message Authentication Reporting & Conformance)
5. Use Reverse DNS to block malicious senders
6. Use DNSBL to block malicious emails and domains
7. Use SURBL to block malicious URIs
8. Use a local IP blacklist to block phishers and spammers
9. Use TLS to keep your email confidential
