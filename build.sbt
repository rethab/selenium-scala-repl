name := "selenium-scala-repl"

version := "1.0"

scalaVersion := "2.11.7"
    
libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.48.2"

initialCommands := """
    import org.openqa.selenium.firefox.FirefoxDriver
    import org.openqa.selenium.By
"""
