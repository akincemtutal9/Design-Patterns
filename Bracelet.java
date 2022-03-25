public class Bracelet implements Jewelery {

    private double radius;
    private double length;

    /**
     * @param radius
     * Sets Bracelets radius
     */
    public void setProperty(double radius) {
        this.radius = radius;
    }

    /**
     * @return length of Bracelet
     * Gets length of bracelet for specify amount of used material
     */
    public String getLength() {
        length = 2 * radius * Math.PI;
        String Length = " "+length;
        return Length;
    }

    /**
     * @return details of Bracelet 
     */
    @Override
    public String getDetails() {
        return "Bracelet... " + " Radius: " + radius + " Length: " + getLength()+ " ";
    }
}