# TinyCar — Application de calcul de prix pour véhicules

Projet pédagogique réalisé dans le cadre de ma formation, visant à découvrir progressivement les bases du langage Java : variables, structures conditionnelles, boucles, tableaux et fonctions.

## Objectif

Développer une application en console permettant de calculer le prix TTC d'un véhicule (puis d'accessoires) à partir de différents paramètres : taux de TVA, remises, fidélité client, etc. Le projet est découpé en 5 missions progressives, chacune introduisant un nouveau concept du langage.

## Structure du projet

```
java/Tinycar/
├── Mission1.java   — Variables, calcul du prix TTC, saisie utilisateur
├── Mission2.java   — Conditions : remises, TVA véhicule électrique, code d'accès, carte de fidélité
├── Mission3.java   — Boucles : recommencer un calcul, traiter n produits, tentatives limitées
├── Mission5.java   — Fonctions et procédures : affichage, calcul TTC, statistiques
└── mission4/
    ├── question1/  — Tableaux fixes (5 accessoires inventés)
    ├── question2/  — Tableaux fixes avec prix saisis par l'utilisateur
    ├── question3/  — Tableaux de taille dynamique + somme totale
    └── question4/  — Statistiques : prix min, max, moyen
```

## Concepts abordés

| Mission | Notions Java |
|---|---|
| Mission 1 | Variables (`double`, `String`), `Scanner`, opérations arithmétiques |
| Mission 2 | `if` / `else`, opérateur ternaire, `switch` |
| Mission 3 | Boucle `while`, boucle `for`, compteurs |
| Mission 4 | Tableaux (`String[]`, `double[]`), parcours, recherche min/max |
| Mission 5 | Procédures (`void`), fonctions avec retour, paramètres |

## Exécution

Chaque mission est indépendante et peut être compilée et exécutée séparément :

```bash
cd java/Tinycar
javac Mission1.java
java Mission1
```

Pour la Mission 4, se placer dans le dossier de la question concernée :

```bash
cd java/Tinycar/mission4/question1
javac Question1.java
java Question1
```
