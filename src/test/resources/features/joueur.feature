Feature: Player Management

  Scenario: Creating a new player
    Given a new player
    Then the player's nickname is "Sacha"
    And the player has 100 health points
    And the player has 100 mana points

  Scenario: Boosting mana with Empire camp
    Given a new player
    And the player joins the "Empire" camp
    When the player boosts their mana
    Then the player has 150 mana points

  Scenario: Displaying player information
    Given a new player
    When I display the player information
    Then I get "Sacha PV 100 Mana 100"