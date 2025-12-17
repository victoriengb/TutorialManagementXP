# language: fr
Fonctionnalité: Gestion des joueurs

  Scénario: Création d'un nouveau joueur
    Étant donné un nouveau joueur
    Alors le pseudo du joueur est "Sacha"
    Et le joueur a 100 points de vie
    Et le joueur a 100 points de mana

  Scénario: Boost de mana avec le camp Empire
    Étant donné un nouveau joueur
    Et le joueur rejoint le camp "Empire"
    Quand le joueur booste son mana
    Alors le joueur a 150 points de mana

  Scénario: Affichage des informations du joueur
    Étant donné un nouveau joueur
    Quand j'affiche les informations du joueur
    Alors j'obtiens "Sacha PV 100 Mana 100"