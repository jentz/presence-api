presence-api
========================

## Overview

Provide the presence-json-api used for marshaling and demarshaling JSON
to Java.

### presence-jaxb2-api
The JAXB2 API is the automantically generated API created when processing the
XSD's. Note that we are NOT using these classes for anything other than to
give us a starting point for the real API which is the presence-json-api.

### presence-json-api
Check out the tests to see the marshaling in action

## Prereqs

- Install Java SDK 7
- Install [Maven 3.x](http://maven.apache.org/download.html) 

## Compiling

  mvn install

