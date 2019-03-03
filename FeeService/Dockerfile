FROM ubuntu:latest

MAINTAINER Ravichandran Nagarajan "ravinforu@yahoo.com"

RUN apt-get update && apt-get install -y openjdk-8-jdk

WORKDIR /usr/local/bin

ADD target/feeservice.jar .

ENTRYPOINT ["java", "-jar", "feeservice.jar"]
