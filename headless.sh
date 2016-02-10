#!/usr/bin/bash

Xvfb :1 -screen 5 1024x768x8 &
XVFB=$!
java -jar $HOME/selenium-server-standalone-*.jar &
SELENIUM=$!
mvn clean verify -Pvisual-testing -Dtest=AnotherTest -Dintegration=wildfly82-remote
kill $XVFB
kill $SELENIUM
