FROM ubuntu:22.04

WORKDIR /app

COPY . ./

RUN apt-get update -y
RUN apt-get upgrade -y
RUN apt-get install -y openjdk-17-jdk
RUN apt-get install -y maven

EXPOSE 8080

CMD ["mvn", "spring-boot:run"]