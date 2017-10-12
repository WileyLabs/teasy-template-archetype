# teasy-template-archetype

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.wiley/teasy-template-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.wiley/teasy-template-archetype)

This is a maven archetype template to get started using teasy from scratch.
# Description
Coming soon...
# Usage
You will need to have the following soft installed:
* java 8+
* maven 3+

[Use this guide for the Intellij IDEA](https://github.com/WileyLabs/teasy-template-archetype/wiki/Intellij-IDEA-set-up-guide)

From your console:

in your console go to the folder where you want the template to be generated

run the following command:

`mvn archetype:generate -DarchetypeGroupId=com.wiley -DarchetypeArtifactId=teasy-template-archetype -DarchetypeVersion=${archetypeVersion} -DteasyVersion=${teasyVersion} -DgroupId=${groupId} -DartifactId=${artifactId} -Dversion=${version}`

where 
`${archetypeVersion}` is a maven-central version [![](https://maven-badges.herokuapp.com/maven-central/com.wiley/teasy-template-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.wiley/teasy-template-archetype), or in the `pom.xml` `<version>1.0.3-beta</version>` field e.g. `1.0.3-beta`

`${teasyVersion}` is a maven-central version [![](https://maven-badges.herokuapp.com/maven-central/com.wiley/teasy/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.wiley/teasy), or in the `pom.xml` `<teasy.version>1.0.14-beta</teasy.version>` field e.g. `1.0.14-beta`

`${groupId}` e.g. `com.my_organization_name`

`${artifactId}` e.g. `teasy-template`

`${version}` e.g. `1.0`

all these data can be changed later in `pom.xml` of a template

import generated project to your favourite IDE and you're ready to play with it

# Contributing

We're just getting started here, but please post issues if you have any!

Feel free to join our gitter chat:
https://gitter.im/teasy-test-framework/Lobby

# License

MIT
