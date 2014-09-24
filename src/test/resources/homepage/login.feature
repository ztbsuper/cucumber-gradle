Feature: Login
  提供正确的用户名和密码，应该返回登陆成功提示。 提供错误的用户名和密码，应该提示错误

  Scenario Outline: correct username & password
    Given open the page
    And set username <username>
    And set password <password>
    When I click login button
    Then I should get my username <username> on the page

    Examples:
      |username|password|
      |right|right|

  Scenario Outline: incorrect username & password
    Given open the page
    And set username <username>
    And set password <password>
    When I click login button
    Then I should get login failed information on the page

    Examples:
      |username|password|
      |wrong|wrong|

