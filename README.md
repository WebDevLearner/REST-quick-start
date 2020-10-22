# REST-quick-start

This is a quick start to building a RESTful web service using Spring Boot. It does not use any database but uses a HashMap to temporarily store objects.

This application demonstrates the following:

The application processes the CRUD (Create Read Update Delete) requests.
The application has some basic validation builtin for creating users e.g. name, email password etc cannot be blank, email field to include @, minimum password length to be 8 characters etc.
The application will accept & respond to XML & JSON requests.
The application has centralized way of handling exceptions and also provides few custom exceptions.
The project uses various packages & sub-packages to organize classes e.g. ui package for presentation layer,"userservice" for service layer and "exceptions" for centralized & custom exceptions handling etc.


Here are some endpoints that you can call:
1. Creating a new resource: 

Request URL: http://localhost:8080/users/
Method: POST
Accept: application/json
Content-Type: application/json


Request Body will be of the following format: 

{
	"firstName":"Test",
	"lastName":"User",
	"password":"12345678",
	"email":"test@test.com"
}

Response:
{
    "firstName": "Test",
    "lastName": "User",
    "email": "test@test.com",
    "userId": "14aacbae-f47d-48f0-a38d-a4c53847f66d"
}


2. To extract request parameters & use default values if no parameters are provided.

Request URL: http://localhost:8080/users/?page=1&limit=25&sort=desc
Method: GET

Response:
get users was called with page = 1 and limit = 25 and sort = desc

Default Response:
get users was called with page = 1 and limit = 50 and sort = desc


3. To find a user by userId

http://localhost:8080/users/{userId} e.g.
http://localhost:8080/users/14aacbae-f47d-48f0-a38d-a4c53847f66d
Method: GET
Accept: application/json
Content-Type: application/json

Response:
{
    "firstName": "Test",
    "lastName": "User",
    "email": "test@test.com",
    "userId": "14aacbae-f47d-48f0-a38d-a4c53847f66d"
}

4. To update user by userId
http://localhost:8080/users/{userId} e.g.
http://localhost:8080/users/14aacbae-f47d-48f0-a38d-a4c53847f66d
Method: PATCH
Accept: application/json
Content-Type: application/json

Request Body:
{
	"firstName":"test2",
	"lastName":"user"
}

Response Body:
{
    "firstName": "test2",
    "lastName": "user",
    "email": "test@test.com",
    "userId": "14aacbae-f47d-48f0-a38d-a4c53847f66d"
}

5. To Delete user by userId
http://localhost:8080/users/{userId} e.g.
http://localhost:8080/users/14aacbae-f47d-48f0-a38d-a4c53847f66d
Method: DELETE

Status: 204 No Content
