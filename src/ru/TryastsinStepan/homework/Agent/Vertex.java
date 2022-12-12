package ru.TryastsinStepan.homework.Agent;

import ru.TryastsinStepan.homework.courier.Courier;
import ru.TryastsinStepan.homework.order.Order;

public class Vertex {
    private Courier courier[];  // метка А например
    public boolean wasVisited;

    public Vertex(final Courier courier[]) {
        this.courier = courier;
        wasVisited = false;
    }

    public Courier[] getLabel() {
        return this.courier;
    }

    public boolean isWasVisited() {
        return this.wasVisited;
    }

    public void setWasVisited(final boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}