$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TrelloCreateDashBoard.feature");
formatter.feature({
  "line": 2,
  "name": "Trello Create Dashboard For the first time",
  "description": "",
  "id": "trello-create-dashboard-for-the-first-time",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TrelloSmokeTest"
    },
    {
      "line": 1,
      "name": "@TrelloRegressionTests"
    }
  ]
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Create DashBoard if there is no dashboards available to the user",
  "description": "",
  "id": "trello-create-dashboard-for-the-first-time;create-dashboard-if-there-is-no-dashboards-available-to-the-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "User is on Dashboard page with title \"Create Your Board | Trello\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User enters \"Holiday planning\" in the title",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters \"\u003cThings to do list1\u003e\" \"\u003cThings to do list2\u003e\" \"\u003cThings to do list3\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User gets on Trello Dashboard",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "trello-create-dashboard-for-the-first-time;create-dashboard-if-there-is-no-dashboards-available-to-the-user;",
  "rows": [
    {
      "cells": [
        "Things to do list 1",
        "Things to do list 2",
        "Things to do list 3"
      ],
      "line": 26,
      "id": "trello-create-dashboard-for-the-first-time;create-dashboard-if-there-is-no-dashboards-available-to-the-user;;1"
    },
    {
      "cells": [
        "Book Flight",
        "Book Hotel",
        "Book Car"
      ],
      "line": 27,
      "id": "trello-create-dashboard-for-the-first-time;create-dashboard-if-there-is-no-dashboards-available-to-the-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2324427033,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Login with Existing User",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User is on Trello Home Page \"https://trello.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Clicks on Sign In Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User on SignIn Page with title \"Log in to Trello\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters credentials as \"mabdullah997861@gmail.com\" and \"Password@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks Login button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://trello.com/",
      "offset": 29
    }
  ],
  "location": "HomePage.user_is_on_Trello_Home_Page(String)"
});
formatter.result({
  "duration": 3591558095,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.user_Clicks_on_Sign_In_Button()"
});
formatter.result({
  "duration": 300399763,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Log in to Trello",
      "offset": 32
    }
  ],
  "location": "SignInPage.user_on_SignIn_Page_with_title(String)"
});
formatter.result({
  "duration": 1921977550,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mabdullah997861@gmail.com",
      "offset": 28
    },
    {
      "val": "Password@123",
      "offset": 60
    }
  ],
  "location": "SignInPage.user_enters_credentials_as_and(String,String)"
});
formatter.result({
  "duration": 5535557136,
  "status": "passed"
});
formatter.match({
  "location": "SignInPage.user_clicks_Login_button()"
});
formatter.result({
  "duration": 5226177139,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Create DashBoard if there is no dashboards available to the user",
  "description": "",
  "id": "trello-create-dashboard-for-the-first-time;create-dashboard-if-there-is-no-dashboards-available-to-the-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TrelloSmokeTest"
    },
    {
      "line": 1,
      "name": "@TrelloRegressionTests"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User is on Dashboard page with title \"Create Your Board | Trello\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User enters \"Holiday planning\" in the title",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters \"\u003cThings to do list1\u003e\" \"\u003cThings to do list2\u003e\" \"\u003cThings to do list3\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User gets on Trello Dashboard",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Create Your Board | Trello",
      "offset": 38
    }
  ],
  "location": "DashBoardPage.user_is_on_Dashboard_page_with_title(String)"
});
formatter.result({
  "duration": 7686674118,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat pageObject.DashBoardPagePO.verifyPage(DashBoardPagePO.java:43)\n\tat stepDefinition.DashBoardPage.user_is_on_Dashboard_page_with_title(DashBoardPage.java:35)\n\tat ✽.Given User is on Dashboard page with title \"Create Your Board | Trello\"(TrelloCreateDashBoard.feature:14)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Holiday planning",
      "offset": 13
    }
  ],
  "location": "DashBoardPage.user_enters_in_the_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashBoardPage.user_clicks_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cThings to do list1\u003e",
      "offset": 13
    },
    {
      "val": "\u003cThings to do list2\u003e",
      "offset": 36
    },
    {
      "val": "\u003cThings to do list3\u003e",
      "offset": 59
    }
  ],
  "location": "DashBoardPage.user_enters(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashBoardPage.user_clicks_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashBoardPage.user_clicks_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashBoardPage.user_clicks_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 685488076,
  "status": "passed"
});
formatter.uri("TrelloCreateUser.feature");
formatter.feature({
  "line": 1,
  "name": "Trello Create User Login",
  "description": "",
  "id": "trello-create-user-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1510507238,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "verify signin page",
  "description": "",
  "id": "trello-create-user-login;verify-signin-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TrelloSmokeTest"
    },
    {
      "line": 4,
      "name": "@TrelloRegressionTests"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Trello Home Page \"https://trello.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Click on Create User Button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User on SignIn Page with title \"Create a Trello Account\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://trello.com/",
      "offset": 29
    }
  ],
  "location": "HomePage.user_is_on_Trello_Home_Page(String)"
});
formatter.result({
  "duration": 3336249486,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.user_Click_on_Create_User_Button()"
});
formatter.result({
  "duration": 2763797086,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create a Trello Account",
      "offset": 32
    }
  ],
  "location": "SignInPage.user_on_SignIn_Page_with_title(String)"
});
formatter.result({
  "duration": 19538647,
  "status": "passed"
});
formatter.after({
  "duration": 284637352,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Create User and Dashboard",
  "description": "",
  "id": "trello-create-user-login;create-user-and-dashboard",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "User is on Trello Home Page \"https://trello.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User Click on Create User Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User on Create User Page with title \"Create a Trello Account\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters \"testtrello\" and \"@gmail.com\" in the email text box",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks continue button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters Password \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User clicks on Signup Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User is on Dashboard page with title \"Create Your Board | Trello\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters \"Holiday planning\" in the title",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters \"\u003cThings to do list1\u003e\" \"\u003cThings to do list2\u003e\" \"\u003cThings to do list3\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User gets on Trello Dashboard",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "trello-create-user-login;create-user-and-dashboard;",
  "rows": [
    {
      "cells": [
        "Things to do list 1",
        "Things to do list 2",
        "Things to do list 3"
      ],
      "line": 30,
      "id": "trello-create-user-login;create-user-and-dashboard;;1"
    },
    {
      "cells": [
        "Book Flight",
        "Book Hotel",
        "Book Car"
      ],
      "line": 31,
      "id": "trello-create-user-login;create-user-and-dashboard;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1476475607,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Create User and Dashboard",
  "description": "",
  "id": "trello-create-user-login;create-user-and-dashboard;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "User is on Trello Home Page \"https://trello.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User Click on Create User Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User on Create User Page with title \"Create a Trello Account\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters \"testtrello\" and \"@gmail.com\" in the email text box",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks continue button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters Password \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User clicks on Signup Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User is on Dashboard page with title \"Create Your Board | Trello\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User enters \"Holiday planning\" in the title",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enters \"\u003cThings to do list1\u003e\" \"\u003cThings to do list2\u003e\" \"\u003cThings to do list3\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User clicks next button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User gets on Trello Dashboard",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://trello.com/",
      "offset": 29
    }
  ],
  "location": "HomePage.user_is_on_Trello_Home_Page(String)"
});
formatter.result({
  "duration": 2946540948,
  "status": "passed"
});
formatter.match({
  "location": "HomePage.user_Click_on_Create_User_Button()"
});
formatter.result({
  "duration": 2437997378,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create a Trello Account",
      "offset": 37
    }
  ],
  "location": "CreateUserPage.user_on_Create_User_Page_with_title(String)"
});
formatter.result({
  "duration": 24606744,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testtrello",
      "offset": 13
    },
    {
      "val": "@gmail.com",
      "offset": 30
    }
  ],
  "location": "CreateUserPage.user_enters_and_in_the_email_text_box(String,String)"
});
formatter.result({
  "duration": 468424406,
  "status": "passed"
});
formatter.match({
  "location": "CreateUserPage.user_clicks_continue_button()"
});
formatter.result({
  "duration": 284082310,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 22
    }
  ],
  "location": "CreateUserPage.user_enters_Password(String)"
});
formatter.result({
  "duration": 6478006550,
  "status": "passed"
});
formatter.match({
  "location": "CreateUserPage.user_clicks_on_Signup_Button()"
});
formatter.result({
  "duration": 152292250,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create Your Board | Trello",
      "offset": 38
    }
  ],
  "location": "DashBoardPage.user_is_on_Dashboard_page_with_title(String)"
});
formatter.result({
  "duration": 179636693,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat pageObject.DashBoardPagePO.verifyPage(DashBoardPagePO.java:43)\n\tat stepDefinition.DashBoardPage.user_is_on_Dashboard_page_with_title(DashBoardPage.java:35)\n\tat ✽.And User is on Dashboard page with title \"Create Your Board | Trello\"(TrelloCreateUser.feature:19)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Holiday planning",
      "offset": 13
    }
  ],
  "location": "DashBoardPage.user_enters_in_the_title(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashBoardPage.user_clicks_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cThings to do list1\u003e",
      "offset": 13
    },
    {
      "val": "\u003cThings to do list2\u003e",
      "offset": 36
    },
    {
      "val": "\u003cThings to do list3\u003e",
      "offset": 59
    }
  ],
  "location": "DashBoardPage.user_enters(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashBoardPage.user_clicks_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashBoardPage.user_clicks_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashBoardPage.user_clicks_next_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 1314781879,
  "status": "passed"
});
});