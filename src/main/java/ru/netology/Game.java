package ru.netology;


import java.util.ArrayList;
import java.util.List;

public class Game {
    ArrayList<Player> players = new ArrayList<>();    // список элементов типа игрок
    private Player player1;
    private Player player2;

    public void register(Player player) {    // метод добавляет в список зарег.игроков
        players.add(player);   //добавляю игрока в список

    }

    public int round(String playerName1, String playerName2) {  // сравниваю силу игроков
        player1 = findByName(playerName1);   // нахожу игрока по имени
        player2 = findByName(playerName2);

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        } else if (player2.getStrength() > player1.getStrength()) {
            return 2;
        }
        return 0;

    }


    public  Player findByName(String name) {   // метод нахождение игрока по имени
        for (Player player : players)
            if (player.getName() == name) {
                return player;
            }

        throw new NotRegisteredException(name);  // выкидываем ошибку если не найден
    }


}
