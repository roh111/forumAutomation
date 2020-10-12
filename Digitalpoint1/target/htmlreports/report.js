$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("forumautomation.feature");
formatter.feature({
  "line": 1,
  "name": "Digital Point Forum page validation",
  "description": "",
  "id": "digital-point-forum-page-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Home page validation",
  "description": "",
  "id": "digital-point-forum-page-validation;home-page-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Home page of the forum web site",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user launch the home page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Home page loaded",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Title check completed successfully",
  "keyword": "And "
});
formatter.match({
  "location": "homepageValidation.home_page_of_the_forum_web_site()"
});
formatter.result({
  "duration": 6470197701,
  "status": "passed"
});
formatter.match({
  "location": "homepageValidation.user_launch_the_home_page()"
});
formatter.result({
  "duration": 1894183500,
  "status": "passed"
});
formatter.match({
  "location": "homepageValidation.home_page_loaded()"
});
formatter.result({
  "duration": 595400,
  "status": "passed"
});
formatter.match({
  "location": "homepageValidation.title_check_completed_successfully()"
});
formatter.result({
  "duration": 179972600,
  "status": "passed"
});
});