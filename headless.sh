#!/usr/bin/bash
Xvfb :99 -screen 5 1024x768x8 &
XVFB=$!
export DISPLAY=':99.5'
mvn clean verify -Pvisual-testing -Dtest=AnotherTest -Dintegration=wildfly82-remote
kill $XVFB
