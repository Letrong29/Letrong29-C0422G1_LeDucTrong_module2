package ss16_IO_doc_ghi_file.bai_tap;

public class Country {
    private int id;
    private String acronymOfCountry;
    private String nameCountry;

    public Country() {
    }

    public Country(int id, String acronymOfCountry, String nameCountry) {
        this.id = id;
        this.acronymOfCountry = acronymOfCountry;
        this.nameCountry = nameCountry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcronymOfCountry() {
        return acronymOfCountry;
    }

    public void setAcronymOfCountry(String acronymOfCountry) {
        this.acronymOfCountry = acronymOfCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public String toString() {
        return id + "," + acronymOfCountry + "," + nameCountry;
    }
}
