---
order: 100
icon: note
---

# What is DMARC ?
-------------
DMARC (Domain-based Message Authentication, Reporting and Conformance) is a tool that aids in stopping spammers 
from using your domain to send email without your permission. Before you even receive these fake emails in your inbox, 
DMARC makes sure they are blocked. Additionally, DMARC ensures that only genuine email is received by giving you
excellent visibility and reports into who is sending email on your domain's behalf.
DMARC is built on top of two email security framework - DKIM and SPF. It can also store the status report of 
every email that has been sent. So that, developer can secure the mail from spammers.

#### If you look any DMARC txt record, there are some tags -
Tag | Description { class="compact" }
--- | ---
v | This is the version tag. The only version of DMARC is "DMARC1".
p | Dmarc policy tag. There are three types of policies- 'None' = It is only used for checking DMARC reports the results of email flows. 'Quarantine' = It considers the unsuccessful emails suspicious and marks as spam.   'Reject' = It rejects the mail.
sp | Dmarc Sub-domain policy tag. It has same property like p tag and uses only for subdomain.
rua | Aggregate mail. In this mail, ESP sends the failure reports.
ruf | Forensic mail. 
aspf | SPF alignment. This tag adheres to the alignment between the Header From domain and the sender domain. There are two types of values -"r" (relaxed) tag is the default and allows for a partial match, "s"(strict) tag needs the domains to be identical.
adkim | DKIM alignment. It adheres to the alignment between the Header From domain and the sender domain. There are also two types of values -"r" (relaxed) tag is the default and allows for a partial match, "s"(strict) tag needs the domains to be identical.
ri | Reporting interval. It allows to send XML reports after the given time interval. The unit is in second.