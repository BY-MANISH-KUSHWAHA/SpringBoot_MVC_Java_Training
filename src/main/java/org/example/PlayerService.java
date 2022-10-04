package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PlayerService {

    private List<Player> players = Arrays.asList(
            new Player(1,"Manish","Indian",22),
            new Player(2,"Arjun","Asian",24),
            new Player(3,"Sharma","Korean",26),
            new Player(4,"Vishal","American",28)
            );

    public Player getPlayerByName(String name){
        return players.stream().filter(p -> p.getName().equals(name)).findFirst().get();
    }

    public Player getPlayerById(int id){
        return players.stream().filter(p -> p.getId() == id).findFirst().get();
    }


}
