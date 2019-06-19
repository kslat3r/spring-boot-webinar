## Getting started with Spring Boot as a Node.js developer

### 20th June 2019

---

### Please feel free to jump in with any questions at any point during the webinar

---

### What we will cover

* What the JVM is and how it works with your application
* What Maven is and how to use it
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
  * `brew tap caskroom/versions`
  * `brew cask install java8`
* Maven 3 installed on your system
  * `brew install maven` (if it is not already installed, check with `maven -version`)
* A Java IDE (I use IntelliJ community edition, but Eclipse is also good)
  * `https://www.jetbrains.com/idea/`
  * `https://www.eclipse.org/downloads/`

---

## Let's go!

---

### Please clone the following repository from Github

#### https://github.com/kslat3r/spring-boot-webinar
#### Navigate to the `src/` directory in a text editor or import the project into your IDE

---

## JVM

---

>  Java virtual machine (JVM) is a virtual machine that enables a computer to run Java programs as well as programs written in other languages that are also compiled to Java bytecode.

---

#### JVM architecture

![JVM architecture](https://github.com/kslat3r/spring-boot-webinar/raw/master/deck/assets/image/jvm-architecture.png)

---

#### Features of the JVM

* Platform independence 
  * Write once, run anywhere
* Memory management
  * Memory allocation
  * Garbage collection
* Exception handling
  * Issues in your application will not affect the underlying OS
* Security
  * Sandbox environment for execution of application code that disallows interaction with OS resources
* Memory safe references
* Multiple implementations (languages)
  * Scala
  * Kotlin
  * Jython
  * Jruby

---

#### Benefits of the JVM

* Run your code on any operating system that implements the JVM specification
* Multiple choices of implementation of the specification
  * OpenJDK HotSpot
  * Oracle JDK/JRE
* JIT compilation

---

#### Negatives of the JVM

* Performance
  * Java bytecode cannot be optimised for a specific hardware set
* Single point of failure
  * If the JVM has a bug, it may cause your application to fail
* Memory footprint
* Startup time

---

## Maven

---

#### Features of Maven

---

#### How Maven is not NPM

---

## Spring Boot Generator
### `https://start.spring.io/`

---

### Walkthrough of a simple Spring Boot RESTful application

---

### Thank-you all very much!

### Please complete the following survey

### https://www.surveymonkey.co.uk/r/VKFRQKS