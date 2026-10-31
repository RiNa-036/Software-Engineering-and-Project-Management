package org.lifelink.model;

public class Donor extends User {
    private String bloodGroup;
    private String district;
    private boolean available;

    public Donor(int id, String name, String email, String bloodGroup, String district, boolean available) {
        super(id, name, email, "DONOR");
        this.bloodGroup = bloodGroup; this.district = district; this.available = available;
    }
    public String getBloodGroup() { return bloodGroup; }
    public String getDistrict() { return district; }
    public boolean isAvailable() { return available; }
}
