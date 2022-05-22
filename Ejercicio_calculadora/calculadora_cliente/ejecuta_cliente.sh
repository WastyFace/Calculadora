#/bin/sh
javac -cp ./thrift_java/libthrift-0.13.0.jar:./thrift_java/slf4j-api-1.7.30.jar:./thrift_java/slf4j-nop-1.7.30.jar:./gen-java:. ClienteCalculadora.java
java -cp ./thrift_java/libthrift-0.13.0.jar:./thrift_java/slf4j-api-1.7.30.jar:./thrift_java/slf4j-nop-1.7.30.jar:./gen-java:. ClienteCalculadora