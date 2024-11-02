
# JaxWebservices

Ce projet est une application Java basée sur Spring Boot, implémentant des services web RESTful. L'API offre des fonctionnalités pour gérer des comptes (`Compte`) et renvoie des données en formats XML et JSON selon les préférences du client.
## Video 
[Watch the video](https://drive.google.com/file/d/1F6EX0j5nOVeOyutJ6hBzo12OQeMdZ8-x/view?usp=drive_link).
## Structure du Projet

Voici une vue d'ensemble de l'arborescence des fichiers dans le projet :

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── ma
│   │   │       └── emsi
│   │   │           └── jaxwebservices
│   │   │               ├── config
│   │   │               │   └── Myconfig.java
│   │   │               ├── controller
│   │   │               │   └── CompteController.java
│   │   │               ├── entity
│   │   │               │   └── Compte.java
│   │   │               │   └── TypeCompte.java
│   │   │               └── repository
│   │   │                   └── CompteRepository.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
```

### Détails des Packages

- **config** : contient la classe `Myconfig` pour la configuration de l’application.
- **controller** : contient le contrôleur principal `CompteController` qui gère les requêtes HTTP pour les entités `Compte`.
- **entity** : contient les classes de l'entité, telles que `Compte` et `TypeCompte`, qui définissent les modèles de données.
- **repository** : contient `CompteRepository`, qui est l'interface permettant l'accès à la base de données pour l’entité `Compte`.

## Configuration

Les propriétés de l'application sont définies dans le fichier `application.properties` situé dans le dossier `src/main/resources`. Assurez-vous que la configuration de la base de données et d’autres paramètres spécifiques à votre environnement sont corrects avant de lancer l'application.

## Exécution de l'Application

Pour exécuter l'application, utilisez la commande suivante :

```bash
mvn spring-boot:run
```

Une fois démarrée, l'application sera accessible à l'adresse `http://localhost:8082`.

