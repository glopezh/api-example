# Usa una imagen base que contenga Ubuntu
FROM ubuntu:20.04

# Actualiza los repositorios e instala Apache HTTP Server
RUN apt-get update && apt-get install -y apache2

# Instala OpenJDK para Java 11
RUN apt-get install -y openjdk-11-jdk

# Copia tu archivo JAR de la API al contenedor
COPY target/MiApi-1.0-SNAPSHOT.jar /app.jar

# Exponer el puerto 80 para el servidor Apache
EXPOSE 80

# Configura Apache para redirigir las solicitudes a tu API en Java
RUN echo "ServerName localhost" >> /etc/apache2/apache2.conf
RUN echo "ProxyPass /api http://localhost:8080/" >> /etc/apache2/sites-available/000-default.conf
RUN echo "ProxyPassReverse /api http://localhost:8080/" >> /etc/apache2/sites-available/000-default.conf

# Comando para iniciar Apache y ejecutar la API Java
CMD ["bash", "-c", "service apache2 start && java -jar /app.jar"]

