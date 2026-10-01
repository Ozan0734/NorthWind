package kodlamaio.northwind.entities.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private Integer id; // int yerine Integer

    // @Column(name="category_id")
    // private Integer categoryId; // int yerine Integer

    @Column(name="product_name")
    private String productName;

    @Column(name="unit_price")
    private Double unitPrice; // double yerine Double (NULL gelebilir)

    @Column(name="unit_in_stock")
    private Short unitInStock; // short yerine Short (NULL gelebilir)

    @Column(name="quantity_per_unit")
    private String quantityPerUnit;


    @ManyToOne()
    @JoinColumn (name="category_id")
    private Category category;


    // Parametresiz Constructor
    public Product() {
    }

    // Parametreli Constructor
    public Product(Integer id, Integer categoryId, String productName, Double unitPrice, Short unitInStock, String quantityPerUnit) {
        super();
        this.id = id;
        // this.categoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
        this.quantityPerUnit = quantityPerUnit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

/*     public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    } */

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Short getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(Short unitInStock) {
        this.unitInStock = unitInStock;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}