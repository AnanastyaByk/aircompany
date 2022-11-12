package planes;

import java.util.Objects;

public abstract class Plane {
    private String modelOfPlane;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;

    protected Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.modelOfPlane = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModelOfPlane() {
        return modelOfPlane;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMinLoadCapacity() {
        return this.maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + modelOfPlane + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(modelOfPlane, plane.modelOfPlane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelOfPlane, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}