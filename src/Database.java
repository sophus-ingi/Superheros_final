import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> heroliste;

    public void deleteSuperhero(String name) {
        for (Superhero hero : heroliste) {
            if (hero.getName().equalsIgnoreCase(name)) {
                heroliste.remove(hero);
                return;
            }
        }
        System.out.println("No superheroes found with the given name.");
    }

    public Database() {
        this.heroliste = new ArrayList<>();
    }

    public void addHero(String name, String realName, String superPower, int yearCreated, String race, String strength) {
        Superhero superhero = new Superhero(name, realName, superPower, yearCreated, race, strength);
        heroliste.add(superhero);
    }

    public void searchSuperhero(String partialName) {
        boolean found = false;

        for (Superhero hero : heroliste) {
            if (hero.getName().toLowerCase().contains(partialName.toLowerCase())) {
                System.out.println("Superhero name: " + hero.getName());
                System.out.println("Superhero Realname: " + hero.getRealName());
                System.out.println("Superhero Power: " + hero.getSuperPower());
                System.out.println("Superhero Strength: " + hero.getStrength());
                System.out.println("Superhero Race: " + hero.getRace());
                System.out.println("Superhero was created in the year: " + hero.getYearCreated());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No superheroes found with the given name.");

        }
    }

    public ArrayList<Superhero> getHeroliste() {
        return heroliste;
    }
}