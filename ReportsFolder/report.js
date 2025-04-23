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
  "name": "User menginputkan email yang ada dan password yang salah",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag4"
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
  "name": "User is directed to captcha verification page",
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
        "hahahihi@gmail.com",
        "abcdefgh"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User menginputkan email yang ada dan password yang salah",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginFacebook"
    },
    {
      "name": "@tag4"
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
  "name": "User enter the hahahihi@gmail.com and abcdefgh on Facebook Login Page in Bahasa Indonesia",
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
  "name": "User is directed to captcha verification page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_directed_to_captcha_verification_page()"
});
formatter.result({
  "status": "passed"
});
});