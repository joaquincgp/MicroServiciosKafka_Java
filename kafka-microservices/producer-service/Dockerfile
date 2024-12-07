# Usar la imagen base de OpenJDK 17 (Slim)
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado por Maven al contenedor
COPY target/producer-service-0.0.1-SNAPSHOT.jar app.jar

# Configurar el comando de entrada para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]

