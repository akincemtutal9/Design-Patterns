public class Ring implements Jewelery {

    private double radius;
    private double length;

    /**
     * @param radius
     * Sets Rings radius
     */
    public void setProperty(double radius) {
        this.radius = radius;
    }

    /**
     * @return length of Ring
     * Gets length of Ring for specify amount of used material
     */
    public String getLength() {
        length = 2 * radius * Math.PI;
        String Length = " "+length;
        return Length;
    }

    /**
     * @return details of Ring
     */
    @Override
    public String getDetails() {
        return "Ring... " + " Radius: " + radius + " Length: " + getLength() + " ";
    }
}