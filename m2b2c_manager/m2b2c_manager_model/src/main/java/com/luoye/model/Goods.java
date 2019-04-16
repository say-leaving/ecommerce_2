package com.luoye.model;

import java.math.BigDecimal;

public class Goods {
    private Integer id;

    private Integer brandId;

    private String title;

    private String model;

    private Integer placeOrigin;

    private Integer inventory;

    private String inventoryUnit;

    private String images;

    private String price;

    private BigDecimal minPrice;

    private BigDecimal maxPrice;

    private Integer buyMinNumber;

    private Integer buyMaxNumber;

    private Byte isDeductionInventory;

    private Byte isShelves;

    private Byte photoCount;

    private Integer salesCount;

    private Integer accessCount;

    private Integer isDeleteTime;

    private Integer addTime;

    private Integer updTime;

    public Goods(Integer id, Integer brandId, String title, String model, Integer placeOrigin, Integer inventory, String inventoryUnit, String images, String price, BigDecimal minPrice, BigDecimal maxPrice, Integer buyMinNumber, Integer buyMaxNumber, Byte isDeductionInventory, Byte isShelves, Byte photoCount, Integer salesCount, Integer accessCount, Integer isDeleteTime, Integer addTime, Integer updTime) {
        this.id = id;
        this.brandId = brandId;
        this.title = title;
        this.model = model;
        this.placeOrigin = placeOrigin;
        this.inventory = inventory;
        this.inventoryUnit = inventoryUnit;
        this.images = images;
        this.price = price;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.buyMinNumber = buyMinNumber;
        this.buyMaxNumber = buyMaxNumber;
        this.isDeductionInventory = isDeductionInventory;
        this.isShelves = isShelves;
        this.photoCount = photoCount;
        this.salesCount = salesCount;
        this.accessCount = accessCount;
        this.isDeleteTime = isDeleteTime;
        this.addTime = addTime;
        this.updTime = updTime;
    }

    public Goods() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Integer getPlaceOrigin() {
        return placeOrigin;
    }

    public void setPlaceOrigin(Integer placeOrigin) {
        this.placeOrigin = placeOrigin;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getInventoryUnit() {
        return inventoryUnit;
    }

    public void setInventoryUnit(String inventoryUnit) {
        this.inventoryUnit = inventoryUnit == null ? null : inventoryUnit.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getBuyMinNumber() {
        return buyMinNumber;
    }

    public void setBuyMinNumber(Integer buyMinNumber) {
        this.buyMinNumber = buyMinNumber;
    }

    public Integer getBuyMaxNumber() {
        return buyMaxNumber;
    }

    public void setBuyMaxNumber(Integer buyMaxNumber) {
        this.buyMaxNumber = buyMaxNumber;
    }

    public Byte getIsDeductionInventory() {
        return isDeductionInventory;
    }

    public void setIsDeductionInventory(Byte isDeductionInventory) {
        this.isDeductionInventory = isDeductionInventory;
    }

    public Byte getIsShelves() {
        return isShelves;
    }

    public void setIsShelves(Byte isShelves) {
        this.isShelves = isShelves;
    }

    public Byte getPhotoCount() {
        return photoCount;
    }

    public void setPhotoCount(Byte photoCount) {
        this.photoCount = photoCount;
    }

    public Integer getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(Integer salesCount) {
        this.salesCount = salesCount;
    }

    public Integer getAccessCount() {
        return accessCount;
    }

    public void setAccessCount(Integer accessCount) {
        this.accessCount = accessCount;
    }

    public Integer getIsDeleteTime() {
        return isDeleteTime;
    }

    public void setIsDeleteTime(Integer isDeleteTime) {
        this.isDeleteTime = isDeleteTime;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Integer updTime) {
        this.updTime = updTime;
    }
}