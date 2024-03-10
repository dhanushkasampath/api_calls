This project includes test projects of making exteranl calls using 
* REST TEMPLATE
* FEIGN CLIENT - A Declarative rest client
* WEB CLIENT - A http reactive client which support asynchronous and synchronous communication. its a part of spring webflux dependency

Had to use java 17 to use openfeign
Installed it on top of 11 using this command

sudo apt install openjdk-17-jdk-headless

below command can be used to switch between java versions

sudo update-alternatives --config java


use Below get calls to test this application after starting

http://localhost:3344/hellow/rest-template

http://localhost:3344/hellow/feign-client

http://localhost:3344/hellow/web-client