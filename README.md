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
Prints out all students.<br><br>
<b>address: http://localhost:8080/api/v1/student</code></b>
### POST
Creates new student.<br><br>
<b>address: http://localhost:8080/api/v1/student</b><br><br>
POST request needs a body like this:<br>
<code>{
    "firstName": "Solid",
    "surname": "Snake",
    "email": "solid.gear@otacon.net",
    "dateOfBirth": "1985-05-12"
}
</code>
### PUT
Updates student of given id.
<br><br>
<b>address: http://localhost:8080/api/v1/student/{id_to_update}?firstName=Alan&surname=Wake&email=alan.wake@outlook.com</b><br><br>
Replace {id_to_update} with id of a student you want to update. <br>
Arguments firstName, surname and email are optional.

### DELETE
Deletes student of given id.
<br><br>
<b>address: http://localhost:8080/api/v1/student/{id_to_delete}</b><br><br>
Replace {id_to_delete} with id of a student you want to delete. <br>

## Database
I used PostgreSQL, the database needs to be set up manually.<br>
All database connection properties are contained in "src/main/resources/application.properties", naturally.<br>
Database name is "student" (lowcaps).<br>
Change username and password to yours, if needed (it probably is needed).<br>

## Credits
App created with a huge help of <a href="https://www.youtube.com/watch?v=9SGDpanrc8U">Amigoscode's Course</a>. <br><br>
It's not 1:1, cause I changed few things I considered weird.
