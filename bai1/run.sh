#!/bin/bash

echo "Cleaning..."
rm -rf out
mkdir -p out

echo "Compiling main source..."
javac -encoding UTF-8 -cp "lib/*" -d out $(find src/main/java -name "*.java")

echo "Compiling test source..."
javac -encoding UTF-8 -cp "out;lib/*" -d out $(find src/test/java -name "*.java")

echo "Running tests..."
java -cp "out;lib/*" org.junit.platform.console.ConsoleLauncher --scan-class-path