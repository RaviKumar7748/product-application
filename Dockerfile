FROM maven:3.8.5-jdk-11

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean install

EXPOSE 8080

CMD ["java", "-jar", "target/*.jar"]