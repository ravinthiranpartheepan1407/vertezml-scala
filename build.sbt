name := "vertezml"
version := "0.1"
scalaVersion := "2.11.12"
publishMavenStyle := true
publishTo := Some("Sonatype Snapshots Nexus" at "https://oss.sonatype.org/content/repositories/snapshots")
credentials += Credentials("Sonatype Nexus Repository Manager", "my.artifact.repo.net", "admin", "admin123")
publishArtifact in Test := false
pomIncludeRepository := { _ => false }
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
homepage := Some(url("https://github.com/ravinthiranpartheepan1407/vertezml-scala"))