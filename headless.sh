#!/usr/bin/bash

Xvfb :1 -screen 0 1024x768x8 &
export DISPLAY=:1.5
java -jar selenium-server-standalone-*.jar
mvn clean verify -Pvisual-testing -Dtest=AnotherTest -Dintegration=wildfly82-remote

