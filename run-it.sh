javac -target 1.7 -cp soot-2.5.0.jar:. RunVeryBusyAnalysis.java $1.java
java -cp soot-2.5.0.jar:.  RunVeryBusyAnalysis $1
