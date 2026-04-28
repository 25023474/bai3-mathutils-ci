#!/bin/bash

echo "Running Checkstyle..."

java -jar lib/checkstyle-10.12.4-all.jar \
  -c checkstyle.xml \
  src/main/java