FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/finsights-app-1.0.0.jar  finsights-app-1.0.0.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "finsights-app.jar"]
