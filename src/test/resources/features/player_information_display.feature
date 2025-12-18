Feature: Player Information Display
  As a user,
  I want to see my player's current stats
  So that I can track my progress.

  Scenario: Displaying player information
    Given a player with nickname "Sacha", 100 PV, and 100 Mana
    When I display the player information
    Then I get "Sacha PV 100 Mana 100"