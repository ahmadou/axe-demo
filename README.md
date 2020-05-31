# axe-demo

Projet Démo.
Se connecte juste sur la home page ,lance une analyse via la librairie Axe et intègre le rapport au rapport Serenity qui sera disponible dans /target/site/serenity/index.html.

Modifier le fichier  src/test/resources/serenity.conf pour changer l'url par défaut.
firefox ne necessite normalement pas de driver pour le reste il faudra dl le driver en s'inspirant de ce qui est fait pour chrome.

Pour lancer les test : mvn verify

testé sur AMazon et Nocibé pour le moment
