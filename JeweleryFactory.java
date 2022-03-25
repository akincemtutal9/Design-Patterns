public class JeweleryFactory {

    /**
     * @param jeweleryType
     * @return According to type creates the jewelry that customer wants
     */
    public static Jewelery create(String jeweleryType) {
        if (jeweleryType == null)
            return null;
        if (jeweleryType.equalsIgnoreCase("1"))
            return new Bracelet();
        else if (jeweleryType.equalsIgnoreCase("2"))
            return new Necklace();
        else if (jeweleryType.equalsIgnoreCase("3"))
            return new Ring();

        return null;
    }
}