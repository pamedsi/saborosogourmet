FROM maven:3.9.3-amazoncorretto-8-debian-bookworm AS build
COPY . .

FROM openjdk:17-ea-slim
COPY --from=build /target/saborosogourmet-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]