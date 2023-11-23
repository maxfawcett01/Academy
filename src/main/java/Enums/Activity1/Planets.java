package Enums.Activity1;

public enum Planets {
    MERCURY     ("Mercury", 3.303e+23, 2.4397e6),
    VENUS       ("Venus",4.869e+24,6.0518e6),
    EARTH   	("Earth",5.976e+24, 6.37814e6),
    MARS    	("Mars",6.421e+23, 3.3972e6),
    JUPITER 	("Jupiter",1.9e+27, 7.1492e7),
    SATURN  	("Saturn",5.688e+26, 6.0268e7),
    URANUS  	("Uranus",8.686e+25, 2.5559e7),
    NEPTUNE 	("Neptune",1.024e+26, 2.4746e7),
    PLUTO   	("Pluto",1.27e+22, 1.137e6);

    private final String name;
    private final double weight;
    private final double radius;

    Planets(String name, double weight, double radius) {
        this.name = name;
        this.weight = weight;
        this.radius = radius;
    }
    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getRadius() {
        return radius;
    }
}
