# Planets API

This is a RESTful API for managing information about planets.

To set up and run the server, you need to create a MySQL database, add a file `/src/main/resources/application.properties` which the following content, and grant permissions to the MySQL user as well. Don't forget to replace fields like `database name`, `user name`, and `user password`.

```
spring.jpa.hibernate.ddl-auto=update    
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/{database name}
spring.datasource.username={user name}    
spring.datasource.password={user password}    
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```
Now, go to the root project and run the command below to download a specific version of Gradle locally.
```sh 
gradle wrapper
```
Then, run this Gradle task:
```sh
./gradlew bootRun
```
## REST API Methods
You might want to access the endpoints using the following cURL commands.

GET
```sh
curl http://localhost:8080/planets/api/{id}
curl http://localhost:8080/planets/api/
```
POST
```sh
curl -X POST \
  -H "Content-Type: application/json" \
  -d '{
        "name": "Venus",
        "description": "Earth\u0027s sister",
        "relativeEarthRadius": "0.949",
        "relativeEarthMass": "0.815",
        "relativeEarthGravity": "0.904",
        "orbitPosition": "1"
      }' \
  http://localhost:8080/planets/api/
```
UPDATE
```sh
curl -X PUT \
  -H "Content-Type: application/json" \
  -d '{
        "name": "Venus",
        "description": "Earth\u0027s sister",
        "relativeEarthRadius": "0.949",
        "relativeEarthMass": "0.815",
        "relativeEarthGravity": "0.904",
        "orbitPosition": "2"
      }' \
  http://localhost:8080/planets/api/{id}
```
DELETE
```sh
curl -X DELETE http://localhost:8080/planets/api/{id}
```
