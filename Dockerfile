FROM ubuntu:22.04

WORKDIR /app

COPY . ./

RUN apt-get update -y
RUN apt-get upgrade -y
RUN apt-get install -y openjdk-17-jdk

EXPOSE 8080

CMD ["java", "-jar",  "./target/saborosogourmet-0.0.1-SNAPSHOT.jar"]