# Overview

This project is created as part of **Kaiburr Assessment**. This project cover following tasks.

1. _Java REST API example_
3. _CI-CD Pipeline_

# Getting Started

## Java REST API example

This project requires an IDE that support spring boot applications. Intellij IDEA is recommended however you can choose your favourite IDE.

### Building the project

* After clonning the project setup **Java SDK** and **Maven**.
* This project requires MongoDB connection with authentication.
    * MongoDB installation [guide](https://www.mongodb.com/docs/manual/installation/).
    * To create your own database with authentication follow the [guide](https://www.mongodb.com/docs/manual/tutorial/create-users/).
* Setup environment variables to authenticate with mongodb. To know how to setup environment variables follow the [guide](https://www.schrodinger.com/kb/1842). If you're using IntelliJ you can setup in IDE it self. [click here](https://www.twilio.com/blog/set-up-env-variables-intellij-idea-java) to know how to setup.
  following values should be added.
    * MONGOUSER= yourusername
    * MONGOPASS= yourpassword
    * MONGODB= databasename
    * MONGOHOST= localhost
* Before runnig the application mongodb should be started. Enter command  ```mongod``` to start mongodb.

* Now run the application.
* You can access application in <http://{yourhostname}:8080/api>

### Api requests

`GET` <br>

* /api
* /api{concern_id} &nbsp; - To get specific server with id
* /api{concern_name} &nbsp; - To list all the servers similar to provided name <br/>
* **Error Response:** <br>
  If no server present with ID or no similar servers present with the name , following error occur.
    * **Code:** 404 "Not Found" <br>

`PUT`<br>

* /api
    * body:
      {
      "id": "1234",
      "name": "cesntos",
      "language": "java",
      "framework": "spring"
      } <br>

`DELETE` <br>
* /api{concern_id}

### Output
**GET with id**
![Get](https://github.com/shanureddy4/WebApiTask/blob/master/Screenshots/GET.png)
**GET similar with name**
![Get](https://github.com/shanureddy4/WebApiTask/blob/master/Screenshots/getsimilar%20with%20name.png)
**GET all**
![Get](https://github.com/shanureddy4/WebApiTask/blob/master/Screenshots/GETALL.png)
**GET id exception**
![Get](https://github.com/shanureddy4/WebApiTask/blob/master/Screenshots/GetIDException.png)
**GET with names exception**
![Get](https://github.com/shanureddy4/WebApiTask/blob/master/Screenshots/similarnameException.png)
## CI-CD pipeline with Github Actions
With Githubactions this project implemented CI-CD pipeline. Whenever repository file changes
following actions automated 
  * Build project with maven
  * Builds docker image with 'Dockerfile'
  * Pushes Image into docker hub.
 ### Output
 **GithubActions process**
 ![GithubActions](https://github.com/shanureddy4/WebApiTask/blob/master/Screenshots/githubactions.png)
 **Docker Hub**
 ![Docker Hub](https://github.com/shanureddy4/WebApiTask/blob/master/Screenshots/DockerHub.png)
