package com.example.nicolas.shootemup;

import android.graphics.Bitmap;
import android.graphics.Point;

import java.util.List;

/**
 * Created by Vincent on 19/11/2016.
 */

public class ShipPNJ extends Ship {

    private Behavior behavior;
    private int coin;

    public ShipPNJ(Point position, Bitmap bitmap, Collider collider, int cmp, int healthPoint, int currentHealth, int shield, List<Weapon> availableWeapon, Weapon activeWeapon, Behavior behavior, int coin) {
        super(position, bitmap, collider, cmp, healthPoint, currentHealth, shield, availableWeapon, activeWeapon);
        this.behavior = behavior;
        this.coin = coin;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}