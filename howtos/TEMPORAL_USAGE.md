---
label: How Eventflow works?
icon: bell
---

Kursaha - Eventflows with Temporal
Kursaha is a customer engagement platform that uses Temporal to trigger custom notifications to customers based on certain user actions, such as making a purchase. This tech documentation explains how Kursaha uses Temporal to trigger custom notifications and the benefits of using Temporal for managing notifications.

Workflow Diagram
When a user performs a specific action, Kursaha creates a workflow instance in Temporal. The workflow instance includes all the relevant data for the notification, such as the customer's email address, the details of the purchase, and the content of the notification. Once the workflow instance is created, temporal starts a workflow execution. The workflow execution consists of a series of steps that determine when and how the notification should be sent. For example, the workflow might include a delay step that waits for a certain amount of time before sending the notification, or a conditional step that only sends the notification if the customer has opted in to receive them. Once the workflow execution is complete, temporal sends the notification to the customer via the appropriate channel, such as email or SMS. If the notification fails to send for any reason, such as an invalid email address, temporal retries the workflow execution until the notification is successfully delivered.

Benefits of Using Temporal for Custom Notifications
Using Temporal to trigger custom notifications offers several benefits for Kursaha and its customers. First, it allows Kursaha to easily manage and track all notifications sent to customers, ensuring that no customer is left out or receives duplicate notifications. Second, temporal provides a flexible and scalable platform for managing notifications. Kursaha can easily add new notification types or modify existing ones without requiring any changes to the underlying infrastructure. Finally, using temporal enables Kursaha to ensure that notifications are sent in a timely and efficient manner. By leveraging temporal's workflow engine, Kursaha can automate the process of sending notifications, reducing the risk of errors or delays that can occur when sending notifications manually.

Conclusion
By using Temporal to trigger custom notifications, Kursaha is able to provide a seamless and efficient customer engagement experience. With its flexible and scalable platform, Temporal enables Kursaha to manage notifications in a way that is both efficient and effective. Overall, Temporal is an essential component of Kursaha's customer engagement strategy, and plays a crucial role in delivering timely and relevant notifications to customers.