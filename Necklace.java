
public class Necklace implements Jewelery {

    private double radius;
    private double length;
    
    /**
     * @param radius
     * Sets Necklaces radius
     */
    public void setProperty(double radius) {
        this.radius = radius;
    }

    /**
     * @return length of Necklace
     * Gets length of Necklace for specify amount of used material
     */
    public String getLength() {
        length = 2 * radius * Math.PI;
        String Length = " "+length;
        return Length;
    }

    /**
     * @return details of Necklace
     */
    @Override
    public String getDetails() {
        return "Necklace... " + " Radius: " + radius + " Length: " + getLength() + " ";
    }
}