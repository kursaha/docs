---
order: 98
icon: dot
tags: [data source, engage data drive]
---

# Google Sheet

### To Connect with Google Sheet
1. Enable the [Google Cloud Platform APIs](https://support.google.com/googleapi/answer/6158841?hl=en) for your personal or organization account.
2. Please Enable Google Sheet Api from your Google cloud console.

These two steps are mandatory.You have to perform that. After that, you can connect Google sheet in the datasource.

Kursaha Server supports the following options by which you can access google sheet.
- Google OAuth Credentials.
- Google Service Account (Recomended)

#### Connect With Google OAuth Credentials
Name  | Description { class="compact" }
:---  | ---
Source Name  | Pick a name to help you identify this source.
Oauth Credentials (client ID, client secret, refresh token)  | To authenticate your Google account via OAuth, enter your Google application's [client ID, client secret, and refresh token.](https://developers.google.com/identity/protocols/oauth2)
Row Batch Size  | Number of rows fetched when making a Google Sheet API call. Defaults to 200.
Spreadsheet Link  | Enter the link to the Google spreadsheet you want to sync. [Example value](https://developers.google.com/sheets/api/guides/concepts)

#### Connect With Google Service Account (Recomended)
Name  | Description { class="compact" }
:---  | ---
Source Name  | Pick a name to help you identify this source.
Service Account Key Authentication  | To authenticate your Google account via Service Account Key Authentication, enter your Google Cloud service account key in JSON format. [Make sure that the Service Account has access to your spreadsheet.](https://www.youtube.com/watch?v=GyomEw5a2NQ)
Row Batch Size  | Number of rows fetched when making a Google Sheet API call. Defaults to 200.
Spreadsheet Link  | Enter the link to the Google spreadsheet you want to sync. [Example value](https://developers.google.com/sheets/api/guides/concepts)