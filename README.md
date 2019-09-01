# springbootsecurity

This repository is to understand the basics of Spring security.
Initial project is created by https://start.spring.io/
Check branches for step by step development. Starting with default security provided by spring then http basic authentication/authorization.
Implementing database to store the user details and then finally JWT implementation.

<h2>Http Requests for user<h2/>

curl http://localhost:8080/admin/ashish -u test:test1234

<h2>Http Requests for admin<h2/>

curl http://localhost:8080/admin/ashish -u test:test1234

curl http://localhost:8080/admin/getAllUser -u test:test1234
