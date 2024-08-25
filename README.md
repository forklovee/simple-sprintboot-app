# 🍃Simple Spring Boot App
Simple web app that manages students with implemented RESTful API.

## Used dependencies
Downloaded via <a href=https://start.spring.io/>Spring Initializr</a>
<ul>
  <li>Spring Web</li>
  <li>Spring Data JPA</li>
  <li>PostgreSQL Driver</li>
</ul>

## Requests
As stated above, all basic RESTful API elements are present, meaning: GET, POST, PUT, DELETE.<br>
Usage of Postman is greatly advised, but you can do it any other way, no judging :).<br>

## Request Body Example
<code>{
    "firstName": "Solid",
    "surname": "Snake",
    "email": "solid.gear@otacon.net",
    "dateOfBirth": "1985-05-12"
}
</code>

## Database
I used PostgreSQL, the database needs to be set up manually.<br>
All database connection properties are contained in "src/main/resources/application.properties", naturally.<br>
Database name is "student" (lowcaps).<br>
Change username and password to yours, if needed (it probably is needed).<br>

## Credits
App created with a huge help of <a href="https://www.youtube.com/watch?v=9SGDpanrc8U">Amigoscode's Course</a>. <br><br>
It's not 1:1, cause I changed few things I considered weird.
