This project objective is to analyse the parallel execution options for cucumber projects.

Starting version 4.0.0 Cucumber project supports native parallel execution.
This can be achieved using the JUnit/TestNG runner capabilities.

This project exemplifies the parallel execution capability of Cucumber using JUnit with Maven Surefire plugin.
It takes a default configuration for _maven-surefire-plugin_

```
<configuration>
    <parallel>both</parallel>
    <threadCount>4</threadCount>
</configuration>
```
 
Because of the concurrent stream of events during execution the team have adjusted the test event listeners. 
Due to this (I think) all the test events will be output after execution (need to check impact on memory of large 
executions cycles?!). Also an additional timeline plugin was create - pretty nice - which show the execution cycles 
of all feature throughout time.

Bellow is an example of JUnit Cuke Runner:

```
@RunWith(Cucumber.class)
@CucumberOptions(
         glue = "org.madsol.tas",
         features = "src/test/resources/features",
         plugin = {
                 "pretty",
                 "timeline:target/timeline-report",
                 "json:target/json-report/cucumber.json"
         })
public class CukeRunnerTest {
}
 ```