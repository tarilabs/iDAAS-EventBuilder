# Change Directory to solution on local machine
echo "iDAAS - Connect Clinical Middle Tier"
cd /Users/alscott/Development/IntelliJ/OpenSource-iDAAS/iDAAS-EventBuilder/

/usr/local/bin/mvn clean install
echo "Maven Build Completed"
/usr/local/bin/mvn package
echo "Maven Release Completed"
