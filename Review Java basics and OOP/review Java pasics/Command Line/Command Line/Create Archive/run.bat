del *.class
javac *.java
jar cfm HelloJava.jar MANIFEST.MF HelloJava.class
pause
java -jar HelloJava.jar
pause
rem appletviewer HelloApplet.html