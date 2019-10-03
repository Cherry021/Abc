$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/Feature.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Testings",
  "description": "I want to use this template for my feature file",
  "id": "testings",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@Tests"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "",
  "description": "",
  "id": "testings;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@Smoke_Test"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user on the users login page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "any user login into website with username \"yogacharanreddy@gmail.com\" and password \"YOGA6906\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "click on the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.goToHackerRank()"
});
formatter.result({
  "duration": 15660836945,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "yogacharanreddy@gmail.com",
      "offset": 43
    },
    {
      "val": "YOGA6906",
      "offset": 84
    }
  ],
  "location": "StepDef.Login(String,String)"
});
formatter.result({
  "duration": 570437081,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.click_on_the_submit_button()"
});
formatter.result({
  "duration": 5048974753,
  "status": "passed"
});
});