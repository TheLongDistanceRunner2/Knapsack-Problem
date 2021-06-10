public class Item {
    private int quantityOfThisKindOfItem;
    private int numberInArray;
    private double weight;
    private double price;
    private double quotient;

    public Item(double price, double weight, int numberInArray, int quantityOfThisKindOfItem) {
        this.price = price;
        this.weight = weight;
        this.quotient = price / weight;
        //==========
        this.numberInArray = numberInArray;
        this.quantityOfThisKindOfItem = quantityOfThisKindOfItem;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuotient() {
        return quotient;
    }

    public void setQuotient(double quotient) {
        this.quotient = quotient;
    }

    public int getNumberInArray() {
        return numberInArray;
    }

    public void setNumberInArray(int numberInArray) {
        this.numberInArray = numberInArray;
    }

    public int getQuantityOfThisKindOfItem() {
        return quantityOfThisKindOfItem;
    }

    public void setQuantityOfThisKindOfItem(int quantityOfThisKindOfItem) {
        this.quantityOfThisKindOfItem = quantityOfThisKindOfItem;
    }
}
