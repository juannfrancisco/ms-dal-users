FROM openjdk:8-jdk-alpine
LABEL maintainer="juan.maldonado.leon@gmail.com"

ENV LANG C.UTF-8

COPY *.jar /apps/app.jar

WORKDIR /apps

ENTRYPOINT exec java -jar app.jar
