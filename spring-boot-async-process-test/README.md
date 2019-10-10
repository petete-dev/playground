# Spring Boot - REST API with async processing data

This project has two endpoints:

 - **/async/entity/{code}** : An asynchronous handling of a longrunner process is simulated.

```mermaid
sequenceDiagram
REST->>SBComponent: 
SBComponent--XSBServices: asyncMethod(code)
SBComponent-->REST: give back REST response
```

 - **/sync/entity/{code}** : A synchronous handling of a longrunner process is simulated.

```mermaid
sequenceDiagram
REST->>SBComponent: 
SBComponent->>SBServices: syncMethod(code)
SBServices->>SBComponent: response
SBComponent-->REST: give back REST response
```

## Run project

Run this from root folder:
`mvn spring-boot:run`

After bootstrap invoke REST operation via [browser](http://localhost:8080/swagger-ui.html).