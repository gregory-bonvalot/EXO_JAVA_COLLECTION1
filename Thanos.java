import java.util.*;

public class Thanos {

    public static void main(String[] args) {

       Hero blackWidow = new Hero ("Black Widow", 34);
       Hero captainAmerica = new Hero ("Captain America", 100);
       Hero vision = new Hero ("Vision", 3);
       Hero ironMan = new Hero ("Iron Man", 48);
       Hero scarlet = new Hero ("Scarlet Witch", 29);
       Hero thor = new Hero ("Thor", 1500);
       Hero spiderMan = new Hero ("Spider-Man", 18);
       Hero hulk = new Hero ("Hulk", 49);
       Hero doctorStrange = new Hero ("Doctor Strange", 42);
       
       
       ArrayList<Hero> listHeroes = new ArrayList<>();
       listHeroes.add(blackWidow);       // index 0
       listHeroes.add(captainAmerica);        // index 1
       listHeroes.add(vision); // index 2
       listHeroes.add(ironMan);       // index 3
       listHeroes.add(scarlet);       // index 4
       listHeroes.add(thor);        // index 5
       listHeroes.add(spiderMan); // index 6
       listHeroes.add(hulk);       // index 7
       listHeroes.add(doctorStrange);       // index 8

       // TODO 3 : It's Thor birthday, now he's 1501	
       thor.setAge(1501);
       // TODO 4 : Shuffle the heroes list	
       Collections.shuffle(listHeroes);
       // TODO 5 : Keep only the half of the list
       int halfSize = listHeroes.size()/2;
       //ArrayList<Hero> midListHero = new ArrayList<>();
       List<Hero> midListHero = listHeroes.subList(halfSize+1, listHeroes.size()); 
       
       for (Hero hero : midListHero) { // iterate though the list
            System.out.println(hero.getName());
        }/**/
       
       
       //List<String> arrlist2 = arrlist.subList(2, 4); 
       
       // print the subList 
      /* for (Hero hero : listHeroes) {
           System.out.println(hero.getName());
       }*/
       
      /* for(int i = halfSize; i <= listHeroes.size(); i++) {
    	  listHeroes.remove(i);
       }
         TODO 6 : Loop throught the list and display the name of the remaining heroes
      for (Hero hero : listHeroes) { // iterate though the list
          System.out.println(hero.getName());
      }*/
    }
}