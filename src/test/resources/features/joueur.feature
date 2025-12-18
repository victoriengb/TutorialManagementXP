Feature: Player Management
  En tant qu'utilisateur,
  Je veux pouvoir créer un joueur
  Afin de commencer à jouer.

  Scenario Outline: Creating a new player
    Given a new player
    And the player's nickname is created with <pseudo>
    And the player is created with <pointDeVie> health points
    And the player is created with <mana> mana points
    When the player is created with nickname, health points, and mana points
    Examples:
      | pseudo  | pointDeVie  | mana  |
      | "Sacha" | 100         | 100   |

  #Scenario Outline: Boosting mana with Empire camp
    #Given a new player
    #When the player joins the camp l'Empire
    #Then the player has a boost in <mana> of 50 points as he is in <camp>
    #Examples:
      #| mana  | camp    |
      #| 150   | Empire  |

  Scenario: Displaying player information
    Given a new player
    When I display the player information
    Then I get "Sacha PV 100 Mana 100"