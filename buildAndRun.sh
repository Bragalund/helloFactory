#!/bin/bash
javac -cp ./src ./src/no/bragalund/*.java -d ./out -classpath ./deps/junit-4.12.jar  
jar cvfm executable.jar ./src/no/bragalund/META-INF/manifest.mf -C ./out .
java -jar executable.jar 2 
