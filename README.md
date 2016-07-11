Hello world
---

Build it
---
mvn clean install docker:build

Run it
---
docker run -p 8080:8080 -p 8081:8081 slowteetoe/dropwizard-helloworld
