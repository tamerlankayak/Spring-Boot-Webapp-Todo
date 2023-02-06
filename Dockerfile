FROM openjdk:17-alpine
EXPOSE 8080
ARG JAR_FILE=./target/spring-boot-webapp-todo-0.0.1-SNAPSHOT.jar
ADD  ${JAR_FILE} webapp.jar
ENTRYPOINT ["java","-jar","/webapp.jar"]