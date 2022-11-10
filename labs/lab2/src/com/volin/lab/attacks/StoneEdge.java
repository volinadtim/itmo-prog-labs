package com.volin.lab.attacks;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() < 0.125) {
            return 2;
        }
        return 1;
    }

    @Override
    protected String describe() {
        return "использует Stone Edge";
    }
}