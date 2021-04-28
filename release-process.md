# Release Process

This guide provides a chronological steps which goes through release tagging, staging, verification and publishing.


## Check the SNAPSHOT builds and pass the tests

Check that the project builds in java 8 and java 11.

```bash
mvn clean package install verify -Prelease
JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/ mvn clean package install verify -Prelease
```

## Set version and build 

```bash
# change release in poms and README.md 
mvn -Prelease clean package install deploy
git add -A
git commit -S -m 'Release <x.x.x>'
git tag -a <x.x.x> -m "Tagging release <x.x.x>"
git push
git push --tags
```


## Prepare next iteration

```bash
# change release in poms
git add -A
git commit -S -m 'Next release cycle'
git push
```

## Create release and upload artifacts to Github

Manually creating the release in Github project page, and upload generated artifacts.
