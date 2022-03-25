public class Brightness extends JeweleryDecorator {

    private int brightness;
    private Jewelery jewelery;

    public Brightness(Jewelery jewelery) {
        this.jewelery = jewelery;
    }

    /**
     * @param brightness
     * Sets Brightness of jewellery Decoration part.
     */
    public void setProperty(int brightness) {
        this.brightness = brightness;
    }

    /**
     * @return detail of jewellery brightness
     */
    @Override
    public String getDetails() {
        return jewelery.getDetails() + " Brightness: " + brightness;
    }
}