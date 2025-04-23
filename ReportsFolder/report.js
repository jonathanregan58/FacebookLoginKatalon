$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "Login Facebook",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFacebook"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User menginputkan email yang ada dan password yang benar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag5"
    }
  ]
});
formatter.step({
  "name": "User is on Facebook Login Page in Bahasa Indonesia",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter the \u003cEmail\u003e and \u003cPassword\u003e on Facebook Login Page in Bahasa Indonesia",
  "keyword": "When "
});
formatter.step({
  "name": "User click the Log in button on Facebook Login Page in Bahasa Indonesia",
  "keyword": "And "
});
formatter.step({
  "name": "User is successfully logged in on Facebook in Bahasa Indonesia",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "jonathan.regan58@yahoo.com",
        "Jregan58@_"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User menginputkan email yang ada dan password yang benar",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginFacebook"
    },
    {
      "name": "@tag5"
    }
  ]
});
formatter.step({
  "name": "User is on Facebook Login Page in Bahasa Indonesia",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_is_on_facebook_login_page_in_bahasa_indonesia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the jonathan.regan58@yahoo.com and Jregan58@_ on Facebook Login Page in Bahasa Indonesia",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_enter_the_and_on_facebook_login_page_in_bahasa_indonesia(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Log in button on Facebook Login Page in Bahasa Indonesia",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_click_the_log_in_button_on_facebook_login_page_in_bahasa_indonesia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is successfully logged in on Facebook in Bahasa Indonesia",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_successfully_logged_in_on_facebook_in_bahasa_indonesia()"
});
formatter.result({
  "status": "passed"
});
});