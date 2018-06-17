package com.example.guest_20.chess3;
import java.util.*;

/**
 * Created by Guest_20 on 6/17/2018.
 */

public class Player {
    private String id;

    public Player(){
        this(1);
    }

    public Player(int x){
        if(x==1)
            id = "NORTH";
        else if(x==2)
            id = "SOUTH";
    }

}
