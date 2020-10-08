# jwt with Spring security and Roles

# what is Jwt ?
JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed. JWTs can be signed using a secret (with the HMAC algorithm) or a public/private key pair using RSA or ECDSA.

Although JWTs can be encrypted to also provide secrecy between parties, we will focus on signed tokens. Signed tokens can verify the integrity of the claims contained within it, while encrypted tokens hide those claims from other parties. When tokens are signed using public/private key pairs, the signature also certifies that only the party holding the private key is the one that signed it.

# When should you use JSON Web Tokens?
Here are some scenarios where JSON Web Tokens are useful:

Authorization: This is the most common scenario for using JWT. Once the user is logged in, each subsequent request will include the JWT, allowing the user to access routes, services, and resources that are permitted with that token. Single Sign On is a feature that widely uses JWT nowadays, because of its small overhead and its ability to be easily used across different domains.

Information Exchange: JSON Web Tokens are a good way of securely transmitting information between parties. Because JWTs can be signed—for example, using public/private key pairs—you can be sure the senders are who they say they are. Additionally, as the signature is calculated using the header and the payload, you can also verify that the content hasn't been tampered with.

# Structure
In its compact form, JSON Web Tokens consist of three parts separated by dots (.), which are:

* Header
* Payload
* Signature
Therefore, a JWT typically looks like the following.

xxxxx.yyyyy.zzzzz

Let's break down the different parts.

## Header
The header typically consists of two parts: the type of the token, which is JWT, and the signing algorithm being used, such as HMAC SHA256 or RSA.

For example:

{
  "alg": "HS256",
  "typ": "JWT"
}
Then, this JSON is Base64Url encoded to form the first part of the JWT.

## Payload
The second part of the token is the payload, which contains the claims. Claims are statements about an entity (typically, the user) and additional data. There are three types of claims: registered, public, and private claims.


## Signature
To create the signature part you have to take the encoded header, the encoded payload, a secret, the algorithm specified in the header, and sign that.

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

## Jwt Dependency.
``` 
<!-- https://mvnrepository.com/artifact/io.jsonwebtoken/jjwt -->
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt</artifactId>
			<version>0.9.1</version>
		</dependency>
        
```

![Generate Token ](https://github.com/kapil0jaiswal/jwtSpringRoles/blob/main/Generate-Token.jpg)

![Validate token](https://github.com/kapil0jaiswal/jwtSpringRoles/blob/main/Validate-Token.jpg)


![Jwt client](https://github.com/kapil0jaiswal/jwtSpringRoles/blob/main/jwt-client.jpg)

![Spring Authentication](https://github.com/kapil0jaiswal/jwtSpringRoles/blob/main/spring%20authentication.png)

# REFERENCES
* [jwt hello world Authentication ](https://www.youtube.com/watch?v=p6MXb0GtXwg&t=892s)

* [Authorization configuration ](https://www.youtube.com/watch?v=payxWrmF_0k)

* [JWT INFO](https://jwt.io/introduction/)
