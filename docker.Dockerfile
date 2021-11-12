FROM openjdk:8
#VOLUME /tmp
ADD target/xuegao-spring-docker-0.0.1-SNAPSHOT.jar app.jar
CMD ["java","-jar","app.jar"]