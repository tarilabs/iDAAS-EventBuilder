# iDAAS-EventBuilder
iDAAS Event Builder - enabling anyone leveraging the iDAAS platform to be able to build customd POJOs to represent data in the shape and type needed. This componet starts with over 100 POJOs to try and enable developers. 

# Usage
As of this release we do not yet have a POM release for it to be implemented into other projects easily. This project once downloaded should be implemented iDAAS Components, most commonly added into iDAAS Connect components or iDAAS DREAM. The intent is to create a POM File as we continue forward.

# POM Files
This project also contains a POM file to pull in needed third party libraries.

# Building and Running
The following commands can be used within ANY numerous components of the solution (when not applicable the components will have specific compile, build and package instructions).

mvn clean install

To package the solution to a single jar:

mvn package

Build the package for implementationL

java -jar <jarfile.jar>
