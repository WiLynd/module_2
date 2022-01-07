package apj_exam_c1021g1_hoangdangquocphu.model;

public class ImportProduct extends Product {
    private String importCost;
    private String importLocation;
    private String importTax;

    public ImportProduct() {
    }

    public ImportProduct(String productId, String productCode, String productName, String productCost, String productNumber, String productProducer, String importCost, String importLocation, String importTax) {
        super(productId, productCode, productName, productCost, productNumber, productProducer);
        this.importCost = importCost;
        this.importLocation = importLocation;
        this.importTax = importTax;
    }

    public String getImportCost() {
        return importCost;
    }

    public void setImportCost(String importCost) {
        this.importCost = importCost;
    }

    public String getImportLocation() {
        return importLocation;
    }

    public void setImportLocation(String importLocation) {
        this.importLocation = importLocation;
    }

    public String getImportTax() {
        return importTax;
    }

    public void setImportTax(String importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ExportProduct{" +
                "exportCost='" + importCost + '\'' +
                ", exportLocation='" + importLocation + '\'' +
                ", exportTax='" + importTax + '\'' +
                '}';
    }
}
