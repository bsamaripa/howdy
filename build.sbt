name := "howdy"

organization := "com.howdy"

version := "0.1.0"

scalaVersion := "2.11.7"

scalacOptions := Seq(
  "-Xfatal-warnings",
  "-feature",
  "-language:implicitConversions",
  "-Xlint:_",
  "-deprecation",
  "-unchecked"
)

parallelExecution in Test := true

fork in Test := true

libraryDependencies ++= Seq(
  "org.apache.httpcomponents" %  "httpasyncclient"  % "4.1.1",
  "org.apache.httpcomponents" %  "httpclient"       % "4.5.1",
  "org.apache.httpcomponents" %  "httpmime"         % "4.5.1",
  "org.json4s"                %% "json4s-core"      % "3.3.0",
  "org.json4s"                %% "json4s-jackson"   % "3.3.0"
)

