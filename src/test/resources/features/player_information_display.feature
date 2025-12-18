Feature: Player Information Display
  As a user,
  I want to see my player's current stats
  So that I can track my progress.

  Scenario Outline: Displaying different player stats
    Given a player with nickname <pseudo>, <pv> PV, and <mana> Mana
    When I display the player information
    Then I get <expected>

    Examples:
      | pseudo  | pv  | mana | expected                |
      | "Sacha" | 100 | 100  | "Sacha PV 100 Mana 100" |
      | "Lucie" | 75  | 50   | "Lucie PV 75 Mana 50"   |