FROM openjdk:11
# FROM openjdk:17-jdk-alpine
EXPOSE 8080

WORKDIR /app
ADD target/spring-boot-jiobp-docker.jar spring-boot-jiobp-docker.jar
COPY target/spring-boot-jiobp-docker.jar /app/spring-boot-jiobp-docker.jar
ENTRYPOINT ["java","-jar","spring-boot-jiobp-docker.jar"]

# ENV ARTIFACT_NAME=backend
# ENV APP_HOME=/usr/app
# WORKDIR $APP_HOME
# COPY "apps/$ARTIFACT_NAME/build/libs/$ARTIFACT_NAME-[0-9]\.[0-9]\.[0-9].jar" ./$ARTIFACT_NAME.jar
#
# EXPOSE 8080
# EXPOSE 3306
# EXPOSE 443
# EXPOSE 80
# CMD java -jar ${JAVA_FLAGS} "$APP_HOME/$ARTIFACT_NAME.jar"