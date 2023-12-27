mvn archetype:generate "-DgroupId=com.mycompany.app" "-DartifactId=my-app" "-DarchetypeArtifactId=maven-archetype-quickstart"  "-DinteractiveMode=false"
mvn package
java -cp .\target\my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
java -cp ".\target\my-app-1.0-SNAPSHOT.jar;C:\Users\Dzheb\.m2\repository\com\google\code\gson\gson\2.9.1\gson-2.9.1.jar" com.mycompany.app.App
mvn package -P development