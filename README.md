# aws-lambda-integration
Project for Spring Boot and AWS Lambda integration

Create Lambda Function via Management Console
Sign in to AWS Amazon and then click on Lambda under services. This page will show the lambda functions list, which is already created.

Here are the steps required to create our lambda:

“Select blueprint” and then select “Blank Function”
“Configure triggers” (in our case we don't have any triggers or events)
“Configure function”:
Name: Provide MethodHandlerLambda,
Description: Anything that describes our lambda function
Runtime: Select java8
Code Entry Type and Function Package: Select “Upload a .ZIP and Jar file” and click on “Upload” button. Select the file which contains lambda code.
Under Lambda function handler and role:
Handler name: Provide lambda function handler name com.java.gurpreet.aws.LambdaMethodHandler:handleRequest
Role name: If any other AWS resources are used in lambda function, then provide access by creating/using existing role and also define the policy template.
Under Advanced settings:
Memory: Provide memory that will be used by our lambda function.
Timeout: Select a time for execution of lambda function for each request.
Once you are done with all inputs, click “Next” which will show you to review the configuration.
Once a review is completed, click on “Create Function”.
6. Invoke the Function
Once the AWS lambda function is created, we'll test it by passing in some data:
Click on your lambda function from lists and then click on “Test” button
A popup window will appear which contains dummy value for sending data. Override the data with “Java” or "Gurpreet"
Click on “Save and test” button
On the screen, you can see the Execution result section with successfully returned output.
