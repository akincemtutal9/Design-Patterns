public class Purity extends JeweleryDecorator {

    private int purity;
    private Jewelery jewelery;

    public Purity(Jewelery jewelery) {
        this.jewelery = jewelery;
    }

    /**
     * @param purity
     * Sets Purity of jewellery Decoration part.
     */
    public void setProperty(int purity) {
        this.purity = purity;
    }

    /**
     * @return detail of jewellery Purity
     */
    @Override
    public String getDetails() {
        return jewelery.getDetails() + " Purity: " + purity;
    }

    /**
     * @return purity
     */
    public int getPurity(){
        return purity;
    }
}