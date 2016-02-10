#!/usr/bin/bash
killall Xvfb
Xvfb :99 -screen 5 1024x768x8 &
XVFB=$!
export DISPLAY=':99.5'
java -jar $HOME/selenium-server-standalone-*.jar &
SELENIUM=$!
mvn clean verify -Pvisual-testing -Dtest=AnotherTest -Dintegration=wildfly82-remote
kill $XVFB
kill $SELENIUM
