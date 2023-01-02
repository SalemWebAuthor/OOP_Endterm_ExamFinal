abstract class AbstractGUI {
    protected String type;
    protected String material;
    protected double weight;
    protected double basePrice;

    protected double wholesale;

    protected double retail;


    public AbstractGUI(String type, String material, double weight,double basePrice,double wholesale,double retail) {
        this.type = type;
        this.material = material;
        this.weight = weight;
        this.basePrice = basePrice;
        this.wholesale = wholesale;
        this.retail = retail;
    }

    public abstract void createAndShowGUI();
}
