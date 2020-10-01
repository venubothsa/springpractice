# SpringSecurity-jwt

# Spring security 

Spring Security is a powerful and highly customizable authentication and access-control framework. 
It is the de-facto standard for securing Spring-based applications.
Spring Security is a framework that focuses on providing both authentication and authorization to Java applications. 
the real power of Spring Security is found in how easily it can be extended to meet custom requirements
with the help of Spring Dependencies

It Handles Common Vulnerbality out of the box

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

User Authentication For any Web application which can be configured for validating the correct user name and password
and various type of authentication are available such as 
LdapAuthentication
DaoAuthentication
inMemoryAuthentication
and more

## **Authorization**

Levels of Access In different end points can be controlled in Spring Boot with differentiating in Users providing them roles 
just Like Admin is a Role 
 


## **Principal**
Currently Logged in User . Application Remembers the currently Logged in User with there information Stored in runtime refered as Principal .


## **Granted Authority**

Permissions Given To Users For Specific Requests/operation In the application which can be configured In a List of Auuthorities Which have to be assigned to specific User 

## **Roles**
Group OF Authorities can be added for particular set of people which is Known AS roles.

