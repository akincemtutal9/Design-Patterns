public class Opacity extends JeweleryDecorator {

    private int opacity;
    private Jewelery jewelery;

    Opacity(Jewelery jewelery) {
        this.jewelery = jewelery;
    }

    /**
     * @param opacity
     * Sets Opacity of jewellery Decoration part.
     */
    public void setProperty(int opacity) {
        this.opacity = opacity;
    }

    /**
     * @return detail of jewellery opacity
     */
    @Override
    public String getDetails() {
        return jewelery.getDetails() + " Opacity: " + opacity;
    }
}