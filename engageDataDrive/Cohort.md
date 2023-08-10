---
order: 89
icon: paper-airplane
tags: [campaign, engage data drive]
---

# Cohort
Cohorting involves grouping individuals based on shared attributes or characteristics, allowing for targeted analysis and personalized interactions. Kursaha enables you to categorize users exhibiting similar behaviors into cohorts. This encompasses actions like adding items to a cart or purchasing a product. Additionally, you can define cohorts for users who don't undertake specific actions, such as downloading an app but not completing subscription or sign-up.

## Cohort Events
Events represent particular user actions for tracking individual user interactions. Kursaha offers predefined events, requiring mapping to user actions during API calls. This integration allows precise monitoring of user behaviors and activities. Those events are -

Name  | Event Name  |  Description { class="compact" }
:---  | ---
View product activity  | view  |  User views a product.
Add to cart activity  | cart  |  User adds a product into cart.
Item purchased activity  | purchase  |  User purchases a product.
Signup activity  | signup_activity  |  User signs up into a platform.
Click activity  | click  |  User clicks on a target.

### Required steps for using Cohort
1. To utilize **Cohort functionality**, you need to invoke our API to transmit [**user data**](../developer/eddsdk/#send-event) to our system. 
2. Navigate to the Cohort section and select the *create new cohort* tab.
3. Subsequently, you can apply filters to user activity according to your specific criteria. These activities encompass various actions that we've previously discussed.

![Choose Activity](/static/images/create-cohort-1.png)

4. Furthermore, you can make use of the "where" field for conducting advanced searches. Click the "Add Rule" button to include conditions.

 For instance, if you intend to find users who made a purchase (a purchase activity) of an item from the brand "something" and the price is higher than 1000, your cohort configuration will resemble the following.

![Example Cohort](/static/images/create-cohort-2.png)

5. Additionally, you have the option to filter users based on event count and event date.

 For instance, if you wish to identify users who have made multiple purchases (a purchase activity) of an item from the brand "something," with a price exceeding 1000, and have completed the purchase more than once, all after the date 22/03/2023, your cohort configuration will resemble the following.

 ![Example Cohort](/static/images/create-cohort-3.png)

 6. Once all the necessary filtering is complete, you can verify the selected users by clicking the *Run* button.
 7. Lastly, provide an appropriate name and then save the cohort by clicking the *Save* button.

### Sync Job
Upon successful cohort creation, you can transmit user data to the designated data destination.

  For instance, to synchronize data with Facebook Ads, click the *Sync* button for the specific cohort. Then, select the destination ID, sync frequency, and save by clicking the *Save* button.

  ![Sync Button](/static/images/create-sync-1.png)

  ![Create Sync](/static/images/create-sync-2.png)

Note:- When a sync job is already in progress for a specific cohort and data source, it's not possible to initiate a new sync job with the same configuration (i.e., identical cohort and data source).