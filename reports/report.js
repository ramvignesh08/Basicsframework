$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Login_page.feature");
formatter.feature({
  "name": "Login functionality for opencart website",
  "description": "\t\t\t\tAs a user of the open cart website\n\t\t\t\tI want to be login with in my account\n\t\t\t\tSo that I can access my account related features and manage by orders",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i am on the opencart login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage_Stepdef.i_am_on_the_opencart_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@noissue"
    }
  ]
});
formatter.step({
  "name": "I have entered valid username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage_Stepdef.i_have_entered_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPage_Stepdef.i_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage_Stepdef.i_should_be_logged_in_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "i am on the opencart login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage_Stepdef.i_am_on_the_opencart_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigating to the forgotten password page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@noissue"
    }
  ]
});
formatter.step({
  "name": "I click on the forgotten password link",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPage_Stepdef.i_click_on_the_forgotten_password_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to the forgot password page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage_Stepdef.i_should_be_redirected_to_the_forgot_password_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});