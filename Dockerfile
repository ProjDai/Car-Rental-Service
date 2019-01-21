FROM java:8
ADD /car-pooling-available-cars-service-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "/car-pooling-available-cars-service-0.0.1-SNAPSHOT.jar"]
