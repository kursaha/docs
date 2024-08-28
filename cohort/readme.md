---
order: 95
icon: people
label: Cohort
---

# Cohort

Cohorting is a strategic approach that clusters individuals based on shared attributes or behaviors, allowing for focused analysis and personalized interactions. At Kursaha, we empower you to categorize users exhibiting similar behaviors into cohorts. This encompasses actions like product views, cart additions, and purchases. Additionally, you can tailor cohorts for users who exhibit specific behaviors, such as downloading an app without completing a subscription or sign-up.

### Steps to Leverage Cohort Functionality

[!embed el="iframe" text="Cohort"](/static/videos/Cohort_tour.mp4)

1. To harness the _power of Cohorts_, utilize our API to seamlessly transmit [**user event data**](../developer/readme.md/#sending-events) to our system. Please give Customer id same as [this](../developer/readme.md/#sending-customer-data).
2. Navigate to the Cohort section and select the _create new cohort_ tab.
3. Apply filters to user activity based on specific criteria, encompassing various actions discussed earlier.
4. Advanced searches can be conducted using the "where" field. Add rules to include conditions. Example, to identify users who made a purchase activity of a product from the brand "something", priced higher than 1000.
5. You can further filter users based on event count and event date.
6. After applying the necessary filters, validate selected users by clicking the _Run_ button.
7. Provide an appropriate name and save the cohort by clicking the _Save_ button.

### Sync Job: Seamless Data Transmission

[!embed el="iframe" text="Cohort Sync"](/static/videos/Cohort_sync.mp4)

After creating a cohort, transmit user data to your designated data destination.
For instance, to synchronize data with Facebook Ads, click the _Sync_ button for the specific cohort. Choose the destination ID, sync frequency, and save your configuration.

Note: If a sync job is already active for a specific cohort and data destination, you cannot initiate a new sync job with the same configuration (i.e., identical cohort and data destination). Instead you can update the frequency or create the sync and create a new one.

## Utilizing Cohort Events

Cohort Events represent specific user actions, providing a granular view of individual interactions. Kursaha offers a range of predefined events, which you can seamlessly integrate into your API calls to track and monitor user behaviors. Here are some key events:

| User Actions   | Event Type | Description { class="compact" }           |
| :------------- | ---------- | ----------------------------------------- |
| Sign Up        | signup     | When a user signs up for a platform.      |
| Click          | click      | When a user clicks on a target.           |
| View Product   | view       | When a user views a product.              |
| Add to Cart    | cart       | When a user adds a product to their cart. |
| Item Purchased | purchase   | When a user completes a product purchase. |

To use customer data as event. [Refer here](./Customer.md)
