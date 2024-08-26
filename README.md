# 🍃Simple Spring Boot App
Simple web app that manages students with implemented RESTful API.

## Used dependencies
Downloaded via <a href=https://start.spring.io/>Spring Initializr</a>
<ul>
  <li>Spring Web</li>
  <li>Spring Data JPA</li>
  <li>PostgreSQL Driver</li>
</ul>

## Sending Requests
Usage of software like Postman is advised.
### GET
Get request is commited while visiting:
<code>http://localhost:8080/api/v1/student</code><br>
It prints out all existing students on the website.
### POST
POST request needs a body like this:<br>
<code>{
    "firstName": "Solid",
    "surname": "Snake",
    "email": "solid.gear@otacon.net",
    "dateOfBirth": "1985-05-12"
}
</code>
### PUT
PUT request takes arguments entered in adress: <br><br>
<code>http://localhost:8080/api/v1/student/{id_to_update}?firstName=Alan&surname=Wake&email=alan.wake@outlook.com</code> <br><br>
Replace {id_to_update} with id of a student you want to update. <br>
Arguments firstName, surname and email are optional.

### DELETE
DELETE request takes an id of student to delete, entered in address: <br><br>
<code>http://localhost:8080/api/v1/student/{id_to_delete}</code>
<br><br>
Replace {id_to_delete} with id of a student you want to delete. <br>

## Database
I used PostgreSQL, the database needs to be set up manually.<br>
All database connection properties are contained in "src/main/resources/application.properties", naturally.<br>
Database name is "student" (lowcaps).<br>
Change username and password to yours, if needed (it probably is needed).<br>

## Credits
App created with a huge help of <a href="https://www.youtube.com/watch?v=9SGDpanrc8U">Amigoscode's Course</a>. <br><br>
It's not 1:1, cause I changed few things I considered weird.
