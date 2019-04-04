# Spring Boot - Location based web socket application
spring-boot-websocket

> In this appliction you will know how to create Location based web socket application with Spring Boot in simplest way.

### Let’s Setup Environment

1. Maven 3 or any latest version
2. JDK 1.8 / JDK 1.9 or any latest version
3. Eclipse Kepler / Eclipse Juno / Eclipse Neon or any latest version

### Extract that project and import in eclipse.

> File > Import > Existing Maven Projects > Click ``Next`` > Select project root directory > Click ``Finish``



### Project Description

## Definition: 
-	Create Web Socket Endpoint that is receiving location from users.
-	Web socket broadcast all user's location to all connected users.
-	Display Map on page.
-	User can select his location and press Live Button.
-	Upon clicking on live button, his location will be shared every 10 seconds to the server via WEB SOCKET.
-	Display all other user's location in the Map.

## Solution: 

# Technology used: 
Server Side = 	Spring Boot for web application
                Spring Web Socket for managing socket communication from server side

Client Side = 	Html5 Geolocation from browser for getting user’s live actual location from web page
		            SockJS for web socket communication from web page
		            Bootstrap for web page design
		            Jquery for web page interaction

> In this project I haven’t used any database for storing the data. I have stored data in memory.

Bellow I have described screenshot of the application,


# That's It...you are ready to Run

> Right click to project > Run As > Spring Boot App

go to http://localhost:8080/


## Meta

Rutvik Patel - rrpatel003@gmail.com

Distributed under the GPL V3.0 license. See ``LICENSE`` for more information.
