organization := "net.opentsdb"

name         := "OpenTSDB"

version      := "0.1.0"

scalaVersion := "2.9.1"

resolvers += "Atlassian Internal" at "https://m2proxy.atlassian.com/repository/internal"

libraryDependencies ++= Seq(
  "org.jboss.netty" % "netty" % "3.2.5.Final" withSources(),
  "ch.qos.logback" % "logback-core" % "0.9.30",
  "ch.qos.logback" % "logback-classic" % "0.9.30",
  "org.apache.zookeeper" % "zookeeper" % "3.3.1" intransitive()
)

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.6" % "test->default",
  "junit" % "junit-dep" % "4.8.2" % "test",
  "org.hamcrest" % "hamcrest-core" % "1.3.RC2" % "test",
  "org.hamcrest" % "hamcrest-library" % "1.3.RC2" % "test",
  "org.mockito" % "mockito-core" % "1.8.5" % "test",
  "org.powermock" % "powermock-api-mockito" % "1.4.9" % "test",
  "org.powermock" % "powermock-module-junit4" % "1.4.9" % "test"
)