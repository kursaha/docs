---
order: 89
icon: people
tags: [campaign, engage data drive]
label: Cohort
---

# Cohort: Streamline Targeted Engagement with Cohorting

Cohorting is a strategic approach that clusters individuals based on shared attributes or behaviors, allowing for focused analysis and personalized interactions. At Kursaha, we empower you to categorize users exhibiting similar behaviors into cohorts. This encompasses actions like product views, cart additions, and purchases. Additionally, you can tailor cohorts for users who exhibit specific behaviors, such as downloading an app without completing a subscription or sign-up.

## Utilizing Cohort Events

Cohort Events represent specific user actions, providing a granular view of individual interactions. Kursaha offers a range of predefined events, which you can seamlessly integrate into your API calls to track and monitor user behaviors. Here are some key events:


User Actions     | Event Type       |  Description { class="compact" }
:---             | ---
Sign Up          | signup           |  When a user signs up for a platform. 
Click            | click            |  When a user clicks on a target.  
View Product     | view             |  When a user views a product.
Add to Cart      | cart             |  When a user adds a product to their cart.
Item Purchased   | purchase         |  When a user completes a product purchase. 

### Steps to Leverage Cohort Functionality

1. To harness the **power of Cohorts**, utilize our API to seamlessly transmit [**user event data**](../developer/eddsdk/#sending-events-to-kursaha-seamlessly-integrate-user-data) to our system. Please give Customer id same as [this](../developer/EddSdk.md/#sending-customer-data-to-kursaha). 
2. Navigate to the Cohort section and select the *create new cohort* tab.
3. Apply filters to user activity based on specific criteria, encompassing various actions discussed earlier.

![Select User Action](/static/images/create-cohort-1.png)

4. Advanced searches can be conducted using the "where" field. Add rules to include conditions.

 For instance, to identify users who made a purchase activity of a product from the brand "something", priced higher than 1000, the cohort configuration will look like this.

![Sample Cohort](/static/images/create-cohort-2.png)

5. You can further filter users based on event count and event date.

 For example, if you're looking to pinpoint users who have made multiple purchases (a purchase activity) of a product from the brand "something", priced over 1000, and completed the purchase more than once, all after the date 22/03/2023, your cohort configuration will resemble this.

 ![Example Cohort](/static/images/create-cohort-3.png)

 6. After applying the necessary filters, validate selected users by clicking the *Run* button.
 7. Provide an appropriate name and save the cohort by clicking the *Save* button.

### Sync Job: Seamless Data Transmission

After creating a cohort, transmit user data to your designated data destination.

 For instance, to synchronize data with Facebook Ads, click the *Sync* button for the specific cohort. Choose the destination ID, sync frequency, and save your configuration.

![Sync Option](/static/images/create-sync-1.png)

![Create Sync](/static/images/create-sync-2.png)

Note: If a sync job is already active for a specific cohort and data destination, you cannot initiate a new sync job with the same configuration (i.e., identical cohort and data destination). Instead you can update the frequency or create the sync and create a new one.
