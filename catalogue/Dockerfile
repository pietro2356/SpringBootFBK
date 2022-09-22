# syntax=docker/dockerfile:1.2
FROM maven:3-eclipse-temurin-11-alpine AS build

COPY src/ /tmp/src/
COPY pom.xml /tmp/

ENV NAME catalogue
ENV TYPE prod

WORKDIR /tmp

RUN --mount=type=bind,target=/root/.m2,source=/root/.m2,from=smartcommunitylab/af-catalogue:11-alpine-cache mvn clean package -DskipTests

FROM amazoncorretto:11-alpine AS run

RUN addgroup -g 3000 catalogue
RUN adduser -u 3000 -G catalogue -h /home/catalogue -D catalogue

COPY --from=build --chown=catalogue:catalogue /tmp/target/catalogue-0.0.1-SNAPSHOT.jar /tmp/catalogue-0.0.1-SNAPSHOT.jar

USER catalogue

ENTRYPOINT [ "java", "-jar", "/tmp/catalogue-0.0.1-SNAPSHOT.jar" ]