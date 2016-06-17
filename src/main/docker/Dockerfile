FROM frolvlad/alpine-oraclejdk8:slim
COPY helloworld.jar app.jar
COPY hello-world.yml hello-world.yml
RUN sh -c 'touch /app.jar'
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","server","hello-world.yml"]
