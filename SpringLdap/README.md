# Spring security 

Securing your Web application

Pre configured Security options with minimal 


Handles Common Vulnerbality

- session fixation
- clickJacking
- Click site Rquest Forgery
- Widely adopted

## what can be done

-  username/pswd authentication
- SSO like okta or LDAP
- App level Authorization
- OAuth 
- Microservice Security
  

## 5 Main concepts of Security

- Authentication
- Authorization
- Principal
- Granted Authority
- Roles
 
## **Authentication**

## **Authorization**

## **Principal**

## **Granted Authority**

## **Roles**


# Setup LDAP
```
3 dependancies 

<!--Local ldap server--!>
<dependency>
   <groupId>com.unboundid</groupId>
   <artifactId>unboundid-ldapsdk</artifactId>
</dependency>

<!-- connection provider and implementaiton Spring  --!>
<dependency>
		<groupId>org.springframework.ldap</groupId>
		<artifactId>spring-ldap-core</artifactId>
</dependency>

<dependency>
		<groupId>org.springframework.security</groupId>
		<artifactId>spring-security-ldap</artifactId>
</dependency>

```
