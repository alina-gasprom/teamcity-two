FROM openjdk:17-oracle
COPY build/libs/TeamCityTwo-0.0.1-SNAPSHOT.jar /applicationTwo.jar
ENTRYPOINT ["java", "-jar", "applicationTwo.jar"]