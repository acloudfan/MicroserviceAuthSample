Microservices application on Cloud Foundry / PaaS platform are by default not protected against unauthorized access. This is due to the fact that when an application is created with a route (URL) that route is reachable from the internet (or intranet in case of private PaaS). This demo code shows how you can protect your microservice app (one of the many options)....Read more about the issue in my blog and also check out the other options available to you:

http://acloudfan.com/protecting-microservices-on-paas

To test you need to follow the steps below:

1. Download and import the code in IDE/Eclipse
2. Change the manifest file for name/host 
3. Create the user provided service > cf cups MSRestAuthorization -p '{"clientkey":"clientkey", "clientsecret":"clientsecret"}'
4. cf push the application

1. Create the consumer application and bind to the common auth USP instance
2. Bind the application to the USP - X_AUTHORIZATION_UPS_NAME: MSRestAuthorization.....you may use the cloud utilities that I am using in this sample to read the credntials
2. For protected set the header X_MS_CLIENT_KEY=clientkey
3. For protected set the header X_MS_CLIENT_SECRET=clientsecret

OR you may use the Postman or any REST client tool to test

Do share your thoughts
