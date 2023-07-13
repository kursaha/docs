---
order: 95
icon: dot
tags: [data source, engage data drive]
---

# BigQuery

### To Connect with BigQuery
- A Google Cloud Project with BigQuery enabled
- A Google Cloud Service Account with the "BigQuery User" and "BigQuery Data Editor" roles in your GCP project
- A Service Account Key to authenticate into your Service Account

### Getting Started
In order to use bigquery in our system, first you need to enable bigquery in your [Google cloud project](https://cloud.google.com/bigquery). Next, you need to create a [Service account](https://cloud.google.com/iam/docs/service-account-overview) with the "BigQuery User" and "BigQuery Data Editor" roles, which grants permissions to run BigQuery jobs, write to BigQuery Datasets, and read table metadata. However, you can use a pre-existing Service Account if you already have one with the correct permissions.

The easiest way to create a Service Account is to follow GCP's guide for [Creating a Service Account.](https://cloud.google.com/iam/docs/service-accounts-create) Once you've created the Service Account, make sure to keep its ID handy as you will need to reference it when granting roles. Service Account IDs typically take the form

__\<account-name>@\<project-name>.iam.gserviceaccount.com__

Then, add the service account as a Member in your Google Cloud Project with the "BigQuery User" role. To do this, follow the instructions for [Granting Access](https://cloud.google.com/iam/docs/granting-changing-revoking-access#granting-console) in the Google documentation. The email address of the member you are adding is the same as the Service Account ID you just created.

##### Service Account keys
Service Account Keys are used to authenticate as Google Service Accounts. You'll need to provide its Service Account Keys. See the [Google documentation](https://cloud.google.com/iam/docs/service-account-overview#service_account_keys) for more information about Keys.

Follow the [Creating and Managing Service Account Keys](https://cloud.google.com/iam/docs/keys-create-delete) guide to create a key. We currently support JSON Keys only, so make sure you create your key in that format. As soon as you created the key, make sure to download it, as that is the only time Google will allow you to see its contents. Once you've successfully configured BigQuery as a Datasource, delete this key from your computer.

### Required Fields
Name  | Description { class="compact" }
:---  | ---
Name  | Pick a name to help you identify this source.
Project ID  | The GCP project ID for the project containing the target BigQuery dataset.
Default Dataset ID (Optional)  | The dataset ID to search for tables and views. If you are only loading data from one dataset, setting this option could result in much faster schema discovery.
Credentials JSON  | The contents of your Service Account Key JSON file.