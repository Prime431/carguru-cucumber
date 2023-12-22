#regression
Feature: Search functionality

#  @regression
  Scenario Outline: user should find the car
    Given   I am on homepage
    When    I mouse hover on buy+sell tab
    And     I click Search Cars link
    Then    I navigate to new and used car search page
    And     I select make "<make>"
    And     I select model "<model>"
    And     I select location "<location>"
    And     I select price "<price>"
    And     I click on Find My Next Car tab
    Then    I should see the make "<make>" in results

    Examples:
      | make | model  | location          | price    |
      | Audi | A3     | NSW - South Coast | $200,000 |
      | BMW  | 320i   | NSW - Sydney      | $150,000 |
      | Ford | Endura | NSW - New England | $50,000  |

  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on buy+sell tab
    And I click Used link
    Then I navigate to Used Cars For Sale page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make     | model   | location           | price    |
      | Suzuki   | Alto    | NT - All           | $200,000 |
      | Nissan   | E20     | NT - South         | $200,000 |
      | Mahindra | Scorpio | ACT - All          | $200,000 |
      | Mazda    | 2       | NSW - Central West | $200,000 |
      | Ford     | Ranger  | NSW - Newcastle    | $200,000 |
      | Tesla    | Model X | NSW - Newcastle    | $200,000 |
