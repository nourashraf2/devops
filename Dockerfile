FROM openjdk:25-ea-4-jdk-oraclelinux9

WORKDIR /app


COPY target target/

EXPOSE 8080


ENTRYPOINT ["java" ,"-jar", "target/devops-0.0.1-SNAPSHOT.jar"]

