# Apache Struts 1.3.10 

## About

This is a fork of Apache struts 1 which is EOL : [https://struts.apache.org/struts1eol-announcement.html](https://struts.apache.org/struts1eol-announcement.html)

The principal effort is to patch against published vulnerabilities.
Currently there are the fixed vulnerabilities:
 * [CVE-2008-2025](https://nvd.nist.gov/vuln/detail/CVE-2008-2025)
 * [CVE-2012-1007](https://nvd.nist.gov/vuln/detail/CVE-2012-1007)
 * [CVE-2014-0114](https://nvd.nist.gov/vuln/detail/CVE-2014-0114)
 * [CVE-2015-0899](https://nvd.nist.gov/vuln/detail/CVE-2015-0899)
 * [CVE-2016-1181](https://nvd.nist.gov/vuln/detail/CVE-2016-1181)
 * [CVE-2016-1182](https://nvd.nist.gov/vuln/detail/CVE-2016-1182)
 

## License

[The Apache Software License, Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt)


## Getting with Maven
If you are using Maven, you can add Struts 1 to your project using this dependency in your pom.xml

```
	<dependency>
		<groupId>com.github.albfernandez.struts</groupId>
		<artifactId>struts-core</artifactId>
		<version>1.3.10-ayg-07-SNAPSHOT</version>
	</dependency>
	<dependency>
		<groupId>com.github.albfernandez.struts</groupId>
		<artifactId>struts-el</artifactId>
		<version>1.3.10-ayg-07-SNAPSHOT</version>
	</dependency>
	<dependency>
		<groupId>com.github.albfernandez.struts</groupId>
		<artifactId>struts-taglib</artifactId>
		<version>1.3.10-ayg-07-SNAPSHOT</version>
	</dependency>
	<dependency>
		<groupId>com.github.albfernandez.struts</groupId>
		<artifactId>struts-tiles</artifactId>
		<version>1.3.10-ayg-07-SNAPSHOT</version>
	</dependency>
```

GroupId is ``com.github.albfernandez.struts``, and available artifacts are:

 * struts-core
 * struts-el
 * struts-extras
 * struts-faces
 * struts-mailreader-dao
 * struts-parent
 * struts-scripting
 * struts-taglib
 * struts-tiles