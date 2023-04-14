import org.example.FilmsManager;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FilmsManagerTest {

    @Test
    public void test() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("MovieI");
        manager.addFilm("MovieII");
        manager.addFilm("MovieIII");

        String[] actual = manager.findAll();
        String[] expected = { "MovieI", "MovieII", "MovieIII" };

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testFindLast() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("MovieI");
        manager.addFilm("MovieII");
        manager.addFilm("MovieIII");

        String[] actual = manager.findLast();
        String[] expected = { "MovieIII", "MovieII", "MovieI" };

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testFind() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("MovieI");
        manager.addFilm("MovieII");
        manager.addFilm("MovieIII");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");
        manager.addFilm("Movie6");
        manager.addFilm("Movie7");

        String[] actual = manager.findLast();
        String[] expected = { "Movie7","Movie6","Movie5", "Movie4", "MovieIII" };

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testFind2() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("MovieI");
        manager.addFilm("MovieII");
        manager.addFilm("MovieIII");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");
        String[] actual = manager.findLast();
        String[] expected = { "Movie5", "Movie4","MovieIII", "MovieII", "MovieI" };

        Assertions.assertArrayEquals(expected,actual);
    }

}
