package net.thefallenmoon.fmc.ui.material.bounds;

import net.thefallenmoon.fmc.ui.material.ComponentBounds;

public class WidthHeightComponentBounds implements ComponentBounds {
    private final float x;
    private final float y;
    private final float width;
    private final float height;

    public WidthHeightComponentBounds(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getX() {
        return x;
    }

    @Override
    public float getY() {
        return y;
    }

    @Override
    public float getWidth() {
        return width;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public float getEndX() {
        return x + width;
    }

    @Override
    public float getEndY() {
        return y + height;
    }
}
