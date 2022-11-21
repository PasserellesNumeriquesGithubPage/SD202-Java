public class Brand {
    //Brand Name
    private String brandName;
    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    //Brand Type
    private String brandType;
    public String getBrandType() {
        return brandType;
    }
    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    //Brand Age
    private String brandLocation;
    public String getbrandLocation() {
        return brandLocation;
    }
    public void setbrandLocation(String brandLocation) {
        this.brandLocation = brandLocation;
    }

    //Brand Owner
    private String brandOwner;
    public String getBrandOwner() {
        return brandOwner;
    }
    public void setBrandOwner(String brandOwner) {
        this.brandOwner = brandOwner;
    }

    public Brand(String brandName, String brandType, String brandLocation, String brandOwner){
        this.brandName = brandName;
        this.brandType = brandType;
        this.brandLocation = brandLocation;
        this.brandOwner = brandOwner;
    }
    public String Introduction(){
        
        return "Added Brand\nBrand Name: "+getBrandName()+"\nBrand Type: "+getBrandType()+"\nBrand Location: "+getbrandLocation()+"\nBrand Owner: "+getBrandOwner(); 
    }
    public void landingPage(){
        System.out.println("========================\n"
                          +"|| Choose from below: ||\n"
                          +"|| 1. Add Brand       ||\n"
                          +"|| 2. Remove Brand    ||\n"
                          +"|| 3. Display Brand   ||\n"
                          +"|| 4. Exit Program    ||\n"
                          +"==-> Select Option <-===");
    }
    public Brand(){}
    void changeBrandType(String toChangedBrandType){
        setBrandType(toChangedBrandType);
    }
    void changeBrandLocation(String toChangedBrandLocation){
        setbrandLocation(toChangedBrandLocation);
    }
    void changeBrandOwner(String toChangeBrandOwner){
        setBrandOwner(toChangeBrandOwner);
    }
}
// System.out.println("Choose from below:");
// System.out.println("1. Add Brand");
// System.out.println("2. Remove Brand");
// System.out.println("3. Display Brand");
// System.out.println("4. Exit Program");
// System.out.println("Select Option:");
