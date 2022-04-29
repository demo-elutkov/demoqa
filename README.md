# demoqa
1. I choose BDD framework (WebDriver, Junit, Cucumber, AssertJ).
2. Created in Intellij as Maven project with dependencies(POM). I took Selenium 3.
3. In support package you can find Hooks with @Before and @After.
In @Before I initialize my WebDriver with manager. I used a Chrome and local machine for demo. Chrome param and settings from chromium project, also I add Firefox. I put pageLoadTimeout = 60 sec; implicitlyWait = 2 sec. In methods I use explicit wait, I add implicit just for demo. Also I add deleteAllCookies() before each run.
In @After only driver.quit();
4. I have 3 layers:
	1st: Cucumber.feature files in resources.features package with Gherkin representation of test cases (Scenarios).
	2nd: TasksStepDefs.class in definitions package with test logic and assertions (Java methods).
	3rd: Page objects in pages package. I choose Page Factory with @FindBY, but also for demo I used in Alerts class dynamic xpath.

