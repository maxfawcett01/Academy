package Enums.Demo;


public enum PrimaryColour {
    RED(685.0), BLUE(475.0), YELLOW(508.0);

    private final double waveLength;

    PrimaryColour(double waveLength) {
        this.waveLength = waveLength;
    }


}
