---
order: 99
icon: dot
tags: [data source, engage data drive]
---

# MySql

### To Connect with Mysql database
- Make sure that your Mysql database is up and running
- Create a dedicated read-only user with access to all tables needed.

#### Make sure that your Mysql database is up and running
This is dependent on your networking setup with Mysql database.

####  Create a dedicated read-only user with access to the relevant tables (Recommended but optional)
This step is optional but highly recommended to allow for better permission control and auditing. Alternatively, you can connect with an existing user in your database.

To create a dedicated database user, run the following commands against your database:
```
 CREATE USER 'demo_user'@'%' IDENTIFIED BY 'your_password_here';
 ```

 So, *demo_user* is created. Now you have to grant some permission so that we can access data.
```
 GRANT SELECT, RELOAD ON <database name> TO 'demo_user'@'%';
 ```
Mysql supports different types of permission. See the [official documentation of Mysql](https://dev.mysql.com/doc/refman/8.0/en/privileges-provided.html#privileges-provided-summary)

#### Now you have to fill the connection specification of mysql
Name  | Description { class="compact" }
:---  | ---
Name  | Pick a name to help you identify this source.
Host  | The host name of the database.
Port  | The port to connect to the database.
Database  | The database name.
Username  | The username which is used to access the database. (like demo_user)
Password  | The password associated with the username.
JDBC url  | Optional properties to pass to the JDBC URL. [Read more](https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-reference-jdbc-url-format.html) 

### Connection via SSH Tunnel
We also support connection to a MySQl instance via an SSH Tunnel. The reason you might want to do this because it is not possible (or against security policy) to connect to the database directly (e.g. it does not have a public IP address).

When using an SSH tunnel, you are configuring Kursaha server to connect to an intermediate server (a.k.a. a bastion sever) that does have direct access to the database. Kursaha server connects to the bastion and then asks the bastion to connect directly to the server.

Using this feature requires additional configuration, when creating the source. We will talk through what each piece of configuration means.
- Configure all fields for the source as you normally would, except SSH Tunnel Method.
- SSH Tunnel Method defaults to No Tunnel (meaning a direct connection). If you want to use an SSH Tunnel choose SSH Key Authentication or Password Authentication.

#### SSH key Authentication
- Choose Key Authentication if you will be using an RSA private key as your secret for establishing the SSH Tunnel (see below for more information on generating this key).
- If you are using SSH Key Authentication, then SSH Private Key should be set to the RSA Private Key that you are using to create the SSH connection. This should be the full contents of the key file starting with -----BEGIN RSA PRIVATE KEY----- and ending with -----END RSA PRIVATE KEY-----.
##### Generating an SSH Key Pair
The connector expects an RSA key in PEM format. To generate this key:
```
ssh-keygen -t rsa -m PEM -f myuser_rsa
```
This produces the private key in pem format, and the public key remains in the standard format used by the authorized_keys file on your bastion host. The public key should be added to your bastion host to whichever user you want to use with Datasource. The private key is provided via copy-and-paste to the Datasource configuration screen, so it may log in to the bastion.

#### SSH password Authentication
- Choose Password Authentication if you will be using a password as your secret for establishing the SSH Tunnel.
- If you are using Password Authentication, then SSH Login Username should be set to the password of the User from the previous step. If you are using SSH Key Authentication leave this blank. Again, this is not the MySQl password, but the password for the OS-user that Kursaha server is using to perform commands on the bastion.

Name  | Description { class="compact" }
:---  | ---
SSH Tunnel Jump Server Host  | This is the intermediate (bastion) server that Kursaha server will connect to. This should be a hostname or an IP Address.
SSH Connection Port  | The port on the bastion server with which to make the SSH connection. The default port for SSH connections is 22, so unless you have explicitly changed something, go with the default.
SSH Login Username  | The username that Kursaha server should use when connection to the bastion server. This is NOT the MySQl username.
