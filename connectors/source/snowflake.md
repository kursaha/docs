---
order: 100
icon: dot
label: Snowflake
---

This page contains the setup guide and reference information for the Snowflake source connector.

### To Connect with Snowflake database

There are two options

1. Username/Password
2. OAuth 2.0

Additionally, you have to fill the details given below

1. Source Name
2. Host Account
3. Role
4. Warehouse
5. Database
6. Schema
7. Jdbc url (optional)

### Getting Started

##### Create a dedicated read-only user with access to the relevant schemas (Recommended but optional)

This step is optional but highly recommended to allow for better permission control and auditing. Alternatively, you can connect Datasource with an existing user in your database.

To create a dedicated database user, run the following commands against your database:

```
-- set variables (these need to be uppercase)
SET KURSAHA_ROLE = 'KURSAHA_ROLE';
SET KURSAHA_USERNAME = 'KURSAHA_USER';

-- set user password
SET KURSAHA_PASSWORD = '-password-';

BEGIN;

-- create Airbyte role
CREATE ROLE IF NOT EXISTS $KURSAHA_ROLE;

-- create Airbyte user
CREATE USER IF NOT EXISTS $KURSAHA_USERNAME
PASSWORD = $KURSAHA_PASSWORD
DEFAULT_ROLE = $KURSAHA_ROLE

-- grant Airbyte schema access
GRANT OWNERSHIP ON SCHEMA $KURSAHA_SCHEMA TO ROLE $KURSAHA_ROLE;

COMMIT;
```

#### Connect with Username/Password option

| Name                | Description { class="compact" }                                                                                             |
| :------------------ | --------------------------------------------------------------------------------------------------------------------------- |
| Source Name         | Pick a name to help you identify this source.                                                                               |
| Username            | The Username of your Snowflake account. (like KURSAHA_ROLE)                                                                 |
| Password            | The password associated with the username.                                                                                  |
| Host Account Name   | The host Account Url of the snowflake instance. like (https://<locator>.<region>.<cloud>.snowflakecomputing.com)            |
| Role                | Snowflake user Role. like (KURSAHA_ROLE)                                                                                    |
| Warehouse           | The warehouse name of your Snowflake database                                                                               |
| Database            | The Database name in which your tables are located                                                                          |
| Schema              | The table name by which you can access data.                                                                                |
| Jdbc url (optional) | Additional properties to pass to the JDBC URL string. [Read more](https://docs.snowflake.com/en/user-guide/jdbc-parameters) |

#### Connect with OAuth2.0 option

| Name                | Description { class="compact" }                                                                                                     |
| :------------------ | ----------------------------------------------------------------------------------------------------------------------------------- |
| Source Name         | Pick a name to help you identify this source.                                                                                       |
| OAuth2.0            | Details of OAuth2.0 details you get from snowflake. [How to Configure OAuth](https://docs.snowflake.com/en/user-guide/oauth-custom) |
| Host Account Name   | The host Account Url of the snowflake instance. like (https://<locator>.<region>.<cloud>.snowflakecomputing.com)                    |
| Role                | Snowflake user Role. like (KURSAHA_ROLE)                                                                                            |
| Warehouse           | The warehouse name of your Snowflake database                                                                                       |
| Database            | The Database name in which your tables are located                                                                                  |
| Schema              | The table name by which you can access data.                                                                                        |
| Jdbc url (optional) | Additional properties to pass to the JDBC URL string. [Read more](https://docs.snowflake.com/en/user-guide/jdbc-parameters)         |
