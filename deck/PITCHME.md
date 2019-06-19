## Getting started with Spring Boot as a Node.js developer

### 20th June 2019

---

### What we will cover

* What Maven is and how to use it
* What the JVM is and how it works with your application
* How to create a Spring Boot application quickly and easily using the online generator
* A walkthrough of a simple RESTful application with database connectivity

---

### What this is not

* A walkthrough of basic Java concepts
* A comparison between Express.js/Loopback and Spring Boot
* A production-ready implementation (e.g. no tests!)

---

## Prerequisites

---

* Java 8 installed on your system
* Maven 2 installed on your system
* A Java IDE (I use IntelliJ community edition, but Eclipse is also good)

---

## Let's go!

---

### Please clone the following repository from Github

#### https://github.com/kslat3r/serverless-alexa-skill-hackathon

* Checkout the branch `step-one`

---

## Creating your Servless framework template

---

### Steps to complete:

* `npm install -g serverless`
* `serverless create --template aws-nodejs --path src`
* Update src/serverless.yml with correct service name

---

## Setting up your provider credentials

---

![Provider credentials](https://www.youtube.com/embed/KngM5bfpttA)

---

### Steps to complete:

* Login via http://aws.amazon.com
* Search for IAM
* Add new user "serverless"
* Click "programmatic access"
* Attach a policy
* Click on "AdministratorAccess"
* Create the user
* Download the credentials
* `serverless config credentials --provider aws --key xxx --secret yyy`

---

## Publishing our example function

* Checkout the branch `step-two`

---

### Steps to complete:

* `cd src`
* Deploy the function
  * `serverless deploy -v`
  * `serverless deploy function -f hello`
* Invoke the function
  * `serverless invoke -f hello -l`
* Fetch the logs
  * `serverless logs -f hello`

---

## Building our random fact generator

---

### Specs to complete:

* Build our random fact generator code
* Remove our test function
* Test our new function

---

### Creating our Alexa skill

* Checkout the branch `step-three`

---

### Specs to complete:

* Navigate to https://developer.amazon.com/alexa/console/ask
* Login
* Create skill
* Enter skill name
* Use custom skill model
* Start from scratch

---
 
* Add Skill Invocation Name
* Add RandomFactIntent
* Retrieve ARN of Lambda function
* Update serverless.yml
* Redeploy randomFact function
* Add ARN to Endpoint dialog

---

* Save model
* Build model
* Test model!

---

### Thank-you all very much!

### Please complete the following survey

### https://www.surveymonkey.co.uk/r/YJ9WQMJ