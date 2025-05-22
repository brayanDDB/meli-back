FROM openjdk:17.0.2
WORKDIR /app/meliback
COPY . .
RUN ./mvnw clean package
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "./target/meli-back-0.0.1-SNAPSHOT.jar"]