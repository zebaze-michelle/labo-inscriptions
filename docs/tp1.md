# TP2 – premier projet versionné, buildé et testé

## Objectif
Calculer les frais d'inscription selon le niveau, avec réduction boursier
et réduction pour inscription anticipée.

## Démarche
1. Projet Spring Boot généré avec Maven (Java 17).
2. Tests écrits avant le code (rouge), puis code minimal (vert).
3. Workflow Git : branche feature, Pull Request, relecture par le binôme,
   branche `main` protégée.

## Règles métier
- L1, L2, L3 : 50 000 FCFA ; M1, M2 : 75 000 FCFA
- Boursier : moitié prix
- Inscription avant le 30/09/2026 : -10 %
- Niveau inconnu : IllegalArgumentException

## Résultats
- `mvn clean test` : BUILD SUCCESS (8 tests)
- Push direct sur `main` refusé (GH013)
- Test cassé volontairement : échec observé puis corrigé

## Difficultés rencontrées
- Accolade en trop dans les classes (erreur « implicitly declared classes »)
- Dépôt privé : règles de protection non appliquées sans abonnement,
  dépôt passé en public