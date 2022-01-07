package apj_exam_c1021g1_hoangdangquocphu.model;

public abstract class Product {
    private String productId;
    private String productCode;
    private String productName;
    private String productCost;
    private String productNumber;
    private String productProducer;

    public Product() {
    }

    public Product(String productId, String productCode, String productName, String productCost, String productNumber, String productProducer) {
        this.productId = productId;
        this.productCode = productCode;
        this.productName = productName;
        this.productCost = productCost;
        this.productNumber = productNumber;
        this.productProducer = productProducer;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCost() {
        return productCost;
    }

    public void setProductCost(String productCost) {
        this.productCost = productCost;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductProducer() {
        return productProducer;
    }

    public void setProductProducer(String productProducer) {
        this.productProducer = productProducer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", productCost='" + productCost + '\'' +
                ", productNumber='" + productNumber + '\'' +
                ", productProducer='" + productProducer + '\'' +
                '}';
    }
}
