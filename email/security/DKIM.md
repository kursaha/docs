---
order: 100
icon: lock
tags: [email, security]
---

# What is DKIM?
-------------

!!!
DKIM stands for Domain Keys Identified Mail
!!!

=== Definition
DKIM is an email authentication technique that allows the receiver to check that an email was indeed sent and authorized by the owner of that domain. 
===

This is done by giving the email a digital signature. This DKIM signature is a header that is added to the message and is secured with encryption. :key: 

Once receiver (or receiving system) determines that an email is signed with a valid DKIM signature, it’s certain that parts of the email among which the message body and attachments haven’t been modified. Usually, DKIM signatures are not visible to end-users, the validation is done on a server level.

!!!
Implementing the DKIM standard will improve email deliverability. :bulb:
!!!

If you use DKIM record together with DMARC (and even SPF) you can also protect your domain against malicious emails sent on behalf of your domains. Though, in practice these goals are achieved more effective if you use DKIM record together with DMARC (and even SPF). DMARC and DMARC Analyzer use both SPF and DKIM. 

Together they provide synergy and the best result for email security and deliverability.
