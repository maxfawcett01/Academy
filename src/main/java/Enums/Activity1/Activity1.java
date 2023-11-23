package Enums.Activity1;


public class Activity1 {
    public void currentDemo() {

        // User enters Earth Weight
        double earthWeight = UserInput.getEarthWeight();

        // Calculate Earth Mass
        double earthMass = earthMass(earthWeight);

        // Calculate weight on other Planets
        planetWeights(earthMass);
    }
    private void planetWeights(double earthMass) {
        for (Planets planet : Planets.values()) {
            double mass = planet.getWeight();
            double radius = planet.getRadius();
            double surfaceGravity = surfaceGravity(mass, radius);
            double weight = surfaceGravity * earthMass;
            System.out.println("You would weigh " + weight + " Kg on the Planet " + planet.getName());
        }
    }
    private double surfaceGravity(double mass, double radius) {
        double G = 6.67300E-11;
        return G * mass / (radius * radius);
    }
    private double earthMass(double earthWeight) {
        double G = 6.67300E-11;
        double earthSurfaceGravity = G * Planets.EARTH.getWeight()/ (Planets.EARTH.getRadius() * Planets.EARTH.getRadius());
        return earthWeight / earthSurfaceGravity;
    }
}

