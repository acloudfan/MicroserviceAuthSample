BootcampJaxRS Sample
====================

This project contains a JAX RS Application

## Download this app as a zip file and import it in eclipse

## To Build
Right click on project and click on Run As->Maven
Type "Clean install" and run

## Use instructions provided to push application to cloud

## Running with Maven
#  I HAVE NOT TRIED IT - Please let me know if it works
This project can be build with [Apache Maven](http://maven.apache.org/). The project uses [Liberty Maven Plug-in][] to automatically download and install Liberty profile runtime from the [Liberty repository](https://developer.ibm.com/wasdev/downloads/). Liberty Maven Plug-in is also used to create, configure, and run the application on the Liberty server. 

Use the following steps to run the application with Maven:

1. Execute full Maven build. This will cause Liberty Maven Plug-in to download and install Liberty profile server.
    ```bash
    $ mvn clean install
    ```

2. To run a local Liberty server with the JavaHelloWorldApp sample execute:
    ```bash
    $ mvn liberty:run-server
    ```

Once the server is running, the application will be available under [http://localhost:9080/BootampTemplate]


3. To push the application to Bluemix using the cf command line tool:
    ```bash
    $ cf push <appname> -p target/JavaHelloWorldApp.war
    ```

