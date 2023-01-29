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

<h1>Etape 20:</h1>
Lors de l'éxécution de la requête de type SELECT, on retrouve bien l'ensemble du contenu que nous venons d'importer soit 2 lignes.

<h1>Etape 22:</h1>
Cette annotation nous permet de spécifier une variable d'instance à renseigner par Spring

<h1>Etape 30:</h1>
Afin d'ajouter le bootstrap, j'inclus le script bootstrap dans le header fragments et j'insert celui-ci sur l'ensemble de mes header.

<h1>TP Noté 2:</h1>
<h1>Etape 6:</h1>
<ol>
    <li>
Pour appeler MeteoConcept, nous avons besoin d'une clé api appelée token nous permettant de nous authentifier.
    </li>
    <li>
    Il faut appeler l'URL: 
"https://api.meteo-concept.com/api/forecast/daily?token=%TOKEN%&latlng=%LATITUDE%,%LONGITUDE%" en remplaçant les données entre %.
</li>
    <li>
Afin de transmettre les données nécéssaires à l'API meteoConcept, il faut utiliser la méthode HTTP GET.    
</li>
    <li>
    Afin de transmettre les données nécéssaires, nous pouvons appelé l'URL données ci-dessus en remplaçant les données %TOKEN%, %LATITUDE% et %LONGITUDE%.
</li>
    <li>
Réponse de l'API: <br>
{<br>
"city":<br>
{"insee":"72257","cp":72700,"name":"Rouillon","latitude":48.0005,"longitude":0.1422,"altitude":92},<br>
"update":"2023-01-29T11:31:30+01:00",<br>
"forecast":<br>
[<br>
{<br>
"insee":"72065",<br>
"cp":72650,<br>
"latitude":48.0358,<br>
"longitude":0.1567,<br>
"day":0,     <span class="text">=>   Prévision du jour 0 donc aujourd'hui</span><br>
"datetime":"2023-01-29T01:00:00+0100",<br>
"wind10m":5,<br>
"gust10m":25,<br>
"dirwind10m":306,<br>
"rr10":0,<br>
"rr1":0,<br>
"probarain":10,<br>
"weather":1, <span class="text">=>   Prévision de la méteo: d'après le tableau fourni par l'api, 1 = "Peu nuageux"</span><br>
"tmin":-1,<span class="text">=>   Prévision de température minimale</span><br>
"tmax":6, <span class="text">=>   Prévision de température maximale</span><br>
"sun_hours":5,<br>
"etp":0,<br>
"probafrost":90,<br>
"probafog":60,<br>
"probawind70":0,<br>
"probawind100":0,<br>
"gustx":25<br>
},<br>
{<br>
"insee":"72065",<br>
"cp":72650,<br>
"latitude":48.0358,<br>
"longitude":0.1567,<br>
"day":1,     <span class="text">=>   Prévision du jour 1 donc demain (J+1)</span><br>
"datetime":"2023-01-30T01:00:00+0100",<br>
"wind10m":10,<br>
"gust10m":34,<br>
"dirwind10m":246,<br>
"rr10":0.2,<br>
"rr1":0.2,<br>
"probarain":60,<br>
"weather":10, <span class="text">=>   Prévision de la méteo: d'après le tableau fourni par l'api, 10 = "Pluie faible"</span><br>
"tmin":4,```diff + <span class="text">=>   Prévision de température minimale</span>```<br>
"tmax":10,<span class="text">=>   Prévision de température maximale</span><br>
"sun_hours":1,<br>
"etp":0,<br>
"probafrost":20,<br>
"probafog":50,<br>
"probawind70":0,<br>
"probawind100":0,<br>
"gustx":34<br>
},<br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":2,"datetime":"2023-01-31T01:00:00+0100","wind10m":10,"gust10m":22,"dirwind10m":279,"rr10":0,"rr1":0,"probarain":0,"weather":3,"tmin":0,"tmax":8,"sun_hours":3,"etp":0,"probafrost":70,"probafog":20,"probawind70":0,"probawind100":0,"gustx":22},<span class="text">=>   Prévision du jour 1 donc demain (J+2)</span><br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":3,"datetime":"2023-02-01T01:00:00+0100","wind10m":15,"gust10m":29,"dirwind10m":292,"rr10":0.2,"rr1":0.2,"probarain":30,"weather":5,"tmin":5,"tmax":9,"sun_hours":2,"etp":0,"probafrost":30,"probafog":0,"probawind70":0,"probawind100":0,"gustx":36},<span class="text">=>   Prévision du jour 1 donc demain (J+3)</span><br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":4,"datetime":"2023-02-02T01:00:00+0100","wind10m":10,"gust10m":24,"dirwind10m":303,"rr10":0,"rr1":0,"probarain":40,"weather":3,"tmin":1,"tmax":7,"sun_hours":5,"etp":0,"probafrost":70,"probafog":0,"probawind70":0,"probawind100":0,"gustx":24},<span class="text">=>   Prévision du jour 1 donc demain (J+4)</span><br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":5,"datetime":"2023-02-03T01:00:00+0100","wind10m":10,"gust10m":18,"dirwind10m":27,"rr10":0,"rr1":0,"probarain":20,"weather":3,"tmin":1,"tmax":7,"sun_hours":5,"etp":0,"probafrost":70,"probafog":30,"probawind70":0,"probawind100":0,"gustx":18},<span class="text">=>   Prévision du jour 1 donc demain (J+5)</span><br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":6,"datetime":"2023-02-04T01:00:00+0100","wind10m":10,"gust10m":27,"dirwind10m":41,"rr10":0,"rr1":0,"probarain":10,"weather":3,"tmin":1,"tmax":8,"sun_hours":5,"etp":1,"probafrost":70,"probafog":0,"probawind70":0,"probawind100":0,"gustx":27},<span class="text">=>   Prévision du jour 1 donc demain (J+6)</span><br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":7,"datetime":"2023-02-05T01:00:00+0100","wind10m":10,"gust10m":24,"dirwind10m":42,"rr10":0,"rr1":0,"probarain":10,"weather":3,"tmin":1,"tmax":8,"sun_hours":5,"etp":1,"probafrost":70,"probafog":0,"probawind70":0,"probawind100":0,"gustx":24},<br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":8,"datetime":"2023-02-06T01:00:00+0100","wind10m":10,"gust10m":24,"dirwind10m":95,"rr10":0,"rr1":0,"probarain":10,"weather":3,"tmin":0,"tmax":7,"sun_hours":5,"etp":1,"probafrost":70,"probafog":0,"probawind70":0,"probawind100":0,"gustx":24},<br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":9,"datetime":"2023-02-07T01:00:00+0100","wind10m":10,"gust10m":24,"dirwind10m":121,"rr10":0,"rr1":0,"probarain":40,"weather":3,"tmin":0,"tmax":6,"sun_hours":5,"etp":1,"probafrost":70,"probafog":0,"probawind70":0,"probawind100":0,"gustx":24},<br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":10,"datetime":"2023-02-08T01:00:00+0100","wind10m":10,"gust10m":21,"dirwind10m":98,"rr10":0,"rr1":0,"probarain":40,"weather":3,"tmin":0,"tmax":6,"sun_hours":4,"etp":1,"probafrost":70,"probafog":20,"probawind70":0,"probawind100":0,"gustx":21},<br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":11,"datetime":"2023-02-09T01:00:00+0100","wind10m":10,"gust10m":19,"dirwind10m":188,"rr10":0,"rr1":0,"probarain":50,"weather":3,"tmin":1,"tmax":7,"sun_hours":5,"etp":1,"probafrost":70,"probafog":30,"probawind70":10,"probawind100":0,"gustx":19},<br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":12,"datetime":"2023-02-10T01:00:00+0100","wind10m":15,"gust10m":23,"dirwind10m":198,"rr10":0.2,"rr1":0.2,"probarain":50,"weather":3,"tmin":1,"tmax":7,"sun_hours":5,"etp":1,"probafrost":70,"probafog":20,"probawind70":0,"probawind100":0,"gustx":31},<br>
{"insee":"72065","cp":72650,"latitude":48.0358,"longitude":0.1567,"day":13,"datetime":"2023-02-11T01:00:00+0100","wind10m":15,"gust10m":21,"dirwind10m":194,"rr10":0,"rr1":0,"probarain":50,"weather":3,"tmin":2,"tmax":7,"sun_hours":5,"etp":1,"probafrost":70,"probafog":0,"probawind70":10,"probawind100":0,"gustx":21}<br>
]<br>
}<br>
</li>
</ol>





