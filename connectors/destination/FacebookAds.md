---
order: 99
icon: dot
tags: [queries, engage data drive]
---

# Facebook Ads

This integration empowers you to craft tailored audiences using your behavioral data, fostering fresh user acquisition and heightened conversions. Seamlessly, you can upload and synchronize behavioral cohorts to Facebook, strategically leveraging them for precise campaign targeting across the expansive Facebook ad network.

## Why Facebook Ads is so important ?

An effective avenue for expanding your customer base and enhancing business growth, they offer an excellent means to connect with new prospects. Facebook Ads provide the advantage of targeting your audience using demographic filters including age, gender, location, and interests. Furthermore, you can precisely target individuals who have interacted with your website or engaged with your content on Facebook.

## How Kursaha helps you to integrate with Facebook ads ?

In Facebook ads, there is feature called **Look Alike Audience**. A Facebook [Lookalike Audience](https://www.facebook.com/business/help/164749007013531?id=401668390442328) is a tailor-made advertising audience designed to connect with individuals who closely resemble your existing customers.
In Engage Data Drive, you can create cohort based on user activities and filter those important user.
Next, Kursaha helps you to upload those user data into Facebook Ads Manager for accquiring Look Alike audiences.

## Prerequisites

- You need a [Facebook Business Manager account](https://business.facebook.com/) with admin access.
- You need a valid Add Account.

## Setup

- In Engage Data Drive click on **Connector** and goto **Destination** tab
- Click on **Facebook Ads** and click on **Continue with Facebook**. Here we need the ads_management permission to upload custom data to Facebook Ads.
- Next, give the valid **Ad Account Id** and click on save button.
- Next, Align your Facebook users with your user data by establishing correlations. Opt for mapping diverse Facebook identifiers like email, phone number, user ID, or custom user properties. While non-specific keys like "country" are acceptable, it's imperative to include at least one distinct identifier (e.g., email, phone, user ID). The addition of multiple key mappings enhances your match rate, ensuring a more accurate connection.

## Send Cohort to Facebook Ads

- First, You need to create one Cohort. In Cohort data, the number of user details must be grater than 100. Otherwise Facebook does not allow to use that datasets.
- Next, Click on sync button and choose the Facebook Ads as a datasource and choose the frequecny type.
- Next, Click on Save button.

## Some Common Issues

While configuring the Facebook integration, users might encounter three common issues:

- **Unaccepted Facebook Custom Audience Terms of Service:** Failure to accept the Facebook Custom Audience Terms of Service prevents Kursaha from being authorized for custom audience use. To resolve this, ensure you accept the terms of service and the necessary permissions on Facebook to accept the terms within the pop-up module.
- **Missing Connection to Facebook Business Manager:** For security reasons, Facebook mandates that ad accounts are linked to Business Manager. The integration relies on Business Manager being enabled for your ad account. To rectify this, create a Business Manager for your account and associate your ad account with it.
- **Inadequate Audience Permissions on Facebook:** The user initiating the integration in Kursaha must possess the correct permissions to access Facebook APIs. Since Kursaha sends custom audiences to Facebook on behalf of this user, lacking proper permissions in Facebook will also affect Amplitude's capabilities.  
  _Solution:_ Grant the setup user access to use APIs. If the original setup user loses permissions, disconnect the integration and re-establish it with another user having the required permissions. To disconnect, go to Sources & Destinations → {Project Name} → Destinations → Cohort Destinations → Facebook.
