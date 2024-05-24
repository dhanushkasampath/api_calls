This project includes test projects of making exteranl calls using 
* REST TEMPLATE
* FEIGN CLIENT - A Declarative rest client
* WEB CLIENT - A http reactive client which support asynchronous and synchronous communication. its a part of spring webflux dependency
* HTTP CLIENT - Introduced by java 11. So now no need want to depend on external library to make remote calls. cz java it self support it. So this may be the best solution when compared to others

Had to use java 17 to use openfeign
Installed it on top of 11 using this command

sudo apt install openjdk-17-jdk-headless

below command can be used to switch between java versions

sudo update-alternatives --config java


use Below get calls to test this application after starting

http://localhost:3344/hellow/rest-template

http://localhost:3344/hellow/feign-client

http://localhost:3344/hellow/web-client

http://localhost:3344/hellow/http-client

You can access the swagger using below endpoint
http://localhost:3344/swagger-ui/index.html