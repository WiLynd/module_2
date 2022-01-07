package apj_exam_c1021g1_hoangdangquocphu.model;

public class ExportProduct extends  Product{
    private String exportCost;
    private String exportLocation;

    public ExportProduct() {
    }

    public ExportProduct(String productId, String productCode, String productName, String productCost, String productNumber, String productProducer, String exportCost, String exportLocation) {
        super(productId, productCode, productName, productCost, productNumber, productProducer);
        this.exportCost = exportCost;
        this.exportLocation = exportLocation;
    }

    public String getExportCost() {
        return exportCost;
    }

    public void setExportCost(String exportCost) {
        this.exportCost = exportCost;
    }

    public String getExportLocation() {
        return exportLocation;
    }

    public void setExportLocation(String exportLocation) {
        this.exportLocation = exportLocation;
    }

    @Override
    public String toString() {
        return "ExportProduct{" +
                "exportCost='" + exportCost + '\'' +
                ", exportLocation='" + exportLocation + '\'' +
                '}';
    }
}
