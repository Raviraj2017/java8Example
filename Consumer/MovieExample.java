import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Movie {
    String name;
    String hero;
    String heroine;

    Movie(String name, String hero, String heronie) {
        this.name = name;
        this.hero = hero;
        this.heroine = heronie;
    }

    @Override
    public String toString() {
        return "{" + name + " " + hero + " " + heroine + "}";
    }
}

class MovieExample {
    static List<Movie> l = new ArrayList<>();

    public static void main(String[] args) {
        populate(l);
        Consumer<Movie> c = m -> {
            System.out.println("Movie Name " + m.name);
            System.out.println("Movie Hero " + m.hero);
            System.out.println("Movie Heronie " + m.heroine);
            System.out.println();
        };
        for (Movie m : l) {
            c.accept(m);

        }
    }

    static void populate(List<Movie> l) {
        l.add(new Movie("Bahubali", "Prabhat", "Anuksha"));
        l.add(new Movie("Rayees", "Sharukh", "Sunny"));
        l.add(new Movie("Dangal", "Ameer", "Ritu"));
        l.add(new Movie("Sulatan", "Salman", "Anuksha"));

    }
}