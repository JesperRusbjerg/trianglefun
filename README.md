# Project description

## Program
Given the length of three sides the program will calculate wether a triangle is: scalene, equilateral, isosceles or "not a triangle"

## Frontend
- Frontend built in Angular
- Connects directly to the backend - Dependant on which way the backend is deployed you can configure the base Url in the "api.service.ts" file. By default it connects to the backend running in the cloud
- Ways of accesing the Frontend:

1) It is currently fully operational with the deployed backend and accessible on: http://138.68.69.204:4200/
2) cd into the triangleFrontend folder and run "npm install" followed by "ng serve" - You must have npm and angular installed to do the second option
3) A Dockerfile has been created for the deployment, simply cd into the folder and build the image. Port which is exposed is: 80. If you choose this option please read the docker description at the bottom of the document.

## Backend
- Rest API built in Java Spring Boot
- Has a single POST endpoint on /triangle
- Expects following JSON-input in body:
  
  {

    "aside": number,

    "bside": number,

    "cside": number,

    "triangleDefinition": ""
  
  }
- The backend is found in the triangleBackendd folder
- Ways of trying the backend:

1) It is deployed on http://138.68.69.204:4201/triangle
2) It is a maven project and can be started in IDE's/command line through the jar file. It will deploy on localhost:8080
3) A Dockerfile has been created for the deployment, simply cd into the folder and build the image. Port which is exposed is: 8080. If you choose this option please read the docker description at the bottom of the document.




## Docker

Change the url in the frontend in the "api.service.ts" file to the docker url (Description of how to do so is in the file)

Should you choose to build the docker images and run the program through docker, simply build the images and then run the following commands:

docker run -d --name trifront -p 4200:80 "INSERT DOCKER IMAGE TAG"

docker run -d --name triback -p 4201:8080 "INSERT DOCKER IMAGE TAG"

The frontend will now be available on localhost:4200 and the backend on localhost:4201
