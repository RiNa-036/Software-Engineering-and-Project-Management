package org.lifelink.model;

import java.time.LocalDate;

public class BloodRequest {
    private int id;
    private String requesterName;
    private String bloodGroup;
    private int units;
    private String district;
    private String hospital;
    private LocalDate requiredDate;
    private String status;

    public BloodRequest(int id, String requesterName, String bloodGroup, int units,
                        String district, String hospital, LocalDate requiredDate) {
        this.id=id; this.requesterName=requesterName; this.bloodGroup=bloodGroup;
        this.units=units; this.district=district; this.hospital=hospital;
        this.requiredDate=requiredDate; this.status="PENDING";
    }
    public int getId() { return id; }
    public String getRequesterName() { return requesterName; }
    public String getBloodGroup() { return bloodGroup; }
    public int getUnits() { return units; }
    public String getDistrict() { return district; }
    public String getHospital() { return hospital; }
    public LocalDate getRequiredDate() { return requiredDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status=status; }
}
