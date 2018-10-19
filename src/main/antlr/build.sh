#!/bin/bash
FILE="A1_lexer"
ANTLR=$(echo $CLASSPATH | tr ':' '\n' | grep -m 1 "antlr-4.7.1-complete.jar")
java -jar $ANTLR $FILE.g4
javac $FILE*.java