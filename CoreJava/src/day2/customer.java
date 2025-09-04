package day2;

public class customer {
    private int cid;
    private String name;
    private String city;

    // Getter and Setter for cid
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // toString method
    @Override
    public String toString() {
        return "Customer [cid=" + cid + ", name=" + name + ", city=" + city + "]";
    }
}