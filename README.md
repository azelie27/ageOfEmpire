# ageOfEmpire

* Univers(String name, double length, double width, Carte carte)

* Carte(int[][] size, String name, Civilisation civilisation, Unites units)

* Civilisation(String name, int early, int late, ArrayList<Tribu> tribu) 

* Unites(ArrayList<Human> humans, ArrayList<Building> buildings, ArrayList<Ressource> ressources, ArrayList<Animal> animaux) 

* Tribu(String name, ArrayList<Human> human)

* Human(int pointdeVie, String armure) 
    * Hunter extends Human implements ActionsHumains
    * Pretre extends Human implements ActionsHumains
    * Villager extends Human implements ActionsHumains
    * Warrior extends Human implements ActionsHumains

* interface ActionsHumains 
    * attack()
    * mange()
    * construit()

* Building(ArrayList<Ressource> ressources, int[][] size) 
    * Chateau extends Building 
    * Ferme extends Building
    * Forge extends Building
    * Maison extends Building
   
* Ressource() // arbre, pierre, vegetaux, metal 
   _?????? heritage ?????_
   Arbre
   Pierre
   Vegetaux(int calorie, boolean comestible)
   Metal

* Animal(String race, boolean comestible, boolean mangeLesGens, boolean tropMignon)

**Type(Human human, Building building)**



