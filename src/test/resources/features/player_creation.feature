Feature: Player Creation
  As a user,
  I want to create a player with initial stats
  So that I can start playing.

  Scenario Outline: Creating a new player
    Given I want to create a player with nickname <pseudo>
    And with <pointDeVie> health points
    And with <mana> mana points
    When I create the player
    Then the player's nickname is <pseudo>
    And the player has <pointDeVie> health points

    Examples:
      | pseudo  | pointDeVie | mana |
      | "Sacha" | 100        | 100  |
      | "Lucie" | 150        | 80   |
      | "Marc"  | 90         | 120  |
      | "Marc"  | 90         | 120  |