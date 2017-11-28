rm *.class
javac -target 1.7 -cp soot-2.5.0.jar:. RunStronglyLiveVariablesNew.java $1.java
java -cp soot-2.5.0.jar:.  RunStronglyLiveVariablesNew $1
