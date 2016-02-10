#!/usr/bin/bash

Xvfb :1 -screen 0 1024x768x8 &
XVFB=$!
export DISPLAY=:1.5
java -jar $HOME/selenium-server-standalone-*.jar &
SELENIUM=$!
mvn clean verify -Pvisual-testing -Dtest=AnotherTest -Dintegration=wildfly82-remote
kill $XVFB
kill $SELENIUM
