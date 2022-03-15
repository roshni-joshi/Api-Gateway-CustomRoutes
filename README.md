# Api-Gateway-CustomRoutes
Mapping requests to Microservices through custom routes defined in Api Gateway using Eureka Server

Description : No ports are configured for account and user microservices. Request mapping is managed at Api Gateway microservice using Eureka Server and routes defined in properties file.


Eureka Server : http://localhost:8010/

Account WebService : http://localhost:8082/account/status/check

User WebService : http://localhost:8082/users/status/check