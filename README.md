WEB: 
Créer une application web à l'aide de Spring

JPA:
Utilisation de Spring et Hibernate pour gérer une base de données SQL

Hibernate:
Hibernate est un framework Java qui fournit un mappage objet-relationnel. Cela signifie que Hibernate mappe des classes Java à des tables de base de données

H2:
Permet de créer un base de données SQL

Devtools:
Permet de configurer et de lancer rapidement le projet

Thymeleaf:
permet de créer de l'HTML, XML, JavaScript, CSS and text

<h1>Etape 13:</h1>
<ol>
    <li>
        La configuration de l'url d'appel est paramétré dans la class "HelloWordController" grâce à l'annotation  '@GetMapping("/greeting")'
    </li>
    <li>
        Le choix du fichier HTML à afficher est effectué dans le class HelloWordController grâce à l'instruction 'return "greeting"' où greeting est le nom de la page HTMl à afficher.
    </li>
    <li>
        Le nom affiché est récupéré à l'aide de la class HelloWordController grâce à la valeur de nameGET et est ensuite transmis à la page HTML sous la forme d'un attribut 'nomTemplate' afin d'être affiché.
    </li>
</ol>


<h1>Etape 17:</h1>
La classe Address est été créer dans la base de données de H2.

<h1>Etape 18:</h1>
Hiberbernate permet d'implémenter automatiquement une table dans une base de données grâce à partir de classes java

<h1>Etape 19:</h1>
Cette Etape ne fonctionnant pas avec la table ADDRESS généré par hibernate, nous avons du insert nous même les valeurs depuis la console de h2.

<h1>Etape 20:</h1>
Lors de l'éxécution de la requête de type SELECT, on retrouve bien l'ensemble du contenu que nous venons d'importer soit 2 lignes.

<h1>Etape 22:</h1>
Cette annotation nous permet de spécifier une variable d'instance à renseigner par Spring

<h1>Etape 30:</h1>
Afin d'ajouter le bootstrap, j'inclus le script bootstrap dans le header fragments et j'insert celui-ci sur l'ensemble de mes header.



