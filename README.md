Hello world using Dropwizard (and Docker)
---
Mostly a testing ground, but demonstrates using the spotify maven-docker-plugin, git-commit-id-plugin, and docker compose.

To run (from scratch)
---
* mvn clean install
* mvn package docker:build
* docker-compose up

Run it
---
docker run -p 8080:8080 -p 8081:8081 slowteetoe/dropwizard-helloworld
