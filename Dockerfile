FROM openjdk:21-oracle

WORKDIR /app

ARG jar=./build/libs/*.jar

COPY ${jar} /app

CMD ["java", "-jar", "/app/cicd-docker.jar"]
