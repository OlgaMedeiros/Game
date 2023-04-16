package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class GameTest {

    @Test
    public void TestP1Win () {
        Game game = new Game();
        Player p1 = new Player(1, "p1", 15);
        Player p2 = new Player(2, "p2", 7);

        game.register(p1);
        game.register(p2);

        int expected = 1;
        int actual = game.round("p1", "p2");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestP2Win () {
        Game game = new Game();
        Player p1 = new Player(1, "p1", 7);
        Player p2 = new Player(2, "p2", 15);

        game.register(p1);
        game.register(p2);

        int expected = 2;
        int actual = game.round("p1", "p2");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestDraw () {
        Game game = new Game();
        Player p1 = new Player(1, "p1", 15);
        Player p2 = new Player(2, "p2", 15);

        game.register(p1);
        game.register(p2);

        int expected = 0;
        int actual = game.round("p1", "p2");

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestP1Reg () {
        Game game = new Game();
        Player p1 = new Player(1, "p1", 17);
        Player p2 = new Player(2, "p2", 27);

        game.register(p1);
        game.register(p2);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("p3", "p2")
        );
    }
    @Test
    public void TestP2Reg () {
        Game game = new Game();
        Player p1 = new Player(1, "p1", 45);
        Player p2 = new Player(2, "p2", 13);

        game.register(p1);
        game.register(p2);
        Assertions.assertThrows(NotRegisteredException.class,
                () -> game.round("p1", "p3")
        );
    }

}
