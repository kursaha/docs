---
label: How User Journeys work ?
icon: light-bulb

---

## User Journeys with Temporal

!!!
:bulb: Eventflow uses Temporal to trigger custom notifications to customers based on certain user actions, such as making a purchase. 
!!!

This tech documentation explains how we use Temporal to trigger custom notifications and the benefits of using Temporal for managing notifications.


## Use case

These steps demostrate how a workflow can be triggered and processed.

1. User performs an action, such as making a purchase.
2. Kursaha creates a workflow instance in Temporal with relevant data.
3. Temporal starts a workflow execution with a series of steps to determine when and how to send the notification.
4. Workflow steps may include a delay or conditional step before sending the notification.
5. Temporal sends the notification via the appropriate channel, such as email or SMS or Whatsapp.
6. If notification fails to send, temporal retries the workflow execution.
7. Benefits of using temporal for custom notifications include efficient management and tracking of notifications, flexibility and scalability for adding or modifying notifications, and automated notification sending to reduce errors and delays.


### Technical Architecture
Below image demostrate how the event flows from customer enviornment to Kursaha systems and to Temporal.
![](/static/eventflow_temporal.png)


### Benefits of Using Temporal for Custom Notifications
Using Temporal to trigger custom notifications offers several benefits for Kursaha and its customers. 

* First, it allows Kursaha to easily manage and track all notifications sent to customers, ensuring that no customer is left out or receives duplicate notifications. 

* Second, temporal provides a flexible and scalable platform for managing notifications. Kursaha can easily add new notification types or modify existing ones without requiring any changes to the underlying infrastructure. 

* Finally, using temporal enables Kursaha to ensure that notifications are sent in a timely and efficient manner. By leveraging temporal's workflow engine, Kursaha can automate the process of sending notifications, reducing the risk of errors or delays that can occur when sending notifications manually.

### Conclusion
By using Temporal to trigger custom notifications, Kursaha is able to provide a seamless and efficient customer engagement experience. With its flexible and scalable platform, Temporal enables Kursaha to manage notifications in a way that is both efficient and effective. Overall, Temporal is an essential component of Kursaha's customer engagement strategy, and plays a crucial role in delivering timely and relevant notifications to customers.