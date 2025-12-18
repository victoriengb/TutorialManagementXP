Feature: Camp Bonus System
  As a player,
  I want to receive camp-specific bonuses
  So that my camp choice matters strategically.

  Scenario: Empire camp boosts mana
    Given a player in the "Empire" camp
    When the player boosts their mana
    Then the player has 150 mana points