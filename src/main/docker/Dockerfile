FROM frolvlad/alpine-oraclejdk8:slim
COPY dropwizard-helloworld-0.0.1-SNAPSHOT.jar app.jar
COPY hello-world.yml hello-world.yml
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","server","hello-world.yml"]
