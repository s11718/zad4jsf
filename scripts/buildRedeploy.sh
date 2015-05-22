#!/bin/sh

echo "************ UNDEPLOYING *******************"
asadmin undeploy zad4jsf
echo "************ BUILDING **********************"
mvn package
echo "************ DEPLOYING *********************"
asadmin deploy target/zad4jsf.war
