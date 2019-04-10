#!/bin/bash
javac -cp ./src ./src/no/bragalund/*.java -d ./out 
jar cvfm executable.jar ./src/no/bragalund/META-INF/manifest.mf -C ./out .
java -jar executable.jar 2 
