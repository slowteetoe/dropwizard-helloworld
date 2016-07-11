FROM anapsix/alpine-java:8
COPY helloworld.jar app.jar
COPY hello-world.yml hello-world.yml
RUN sh -c 'touch /app.jar'
EXPOSE 8080 8081
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar","server","hello-world.yml"]
