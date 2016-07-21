name := "TweetsAnalysis"

version := "1.0"

scalaVersion := "2.11.8"

mainClass in (Compile,run) := Some("SentimentAnalyzer.TweetsAnalyzer")


libraryDependencies ++= Seq(
  "edu.stanford.nlp" % "stanford-corenlp" % "3.5.2",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.5.2" classifier "models"
)