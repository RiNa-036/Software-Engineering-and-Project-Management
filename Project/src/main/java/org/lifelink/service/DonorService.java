package org.lifelink.service;

import org.lifelink.model.Donor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DonorService {
    private final List<Donor> demoDonors = new ArrayList<>();

    public DonorService() {
        demoDonors.add(new Donor(1, "Sample Profile 01", "demo1@example.test", "A+", "Tangail", true));
        demoDonors.add(new Donor(2, "Sample Profile 02", "demo2@example.test", "B+", "Dhaka", true));
        demoDonors.add(new Donor(3, "Sample Profile 03", "demo3@example.test", "O-", "Mymensingh", false));
        demoDonors.add(new Donor(4, "Sample Profile 04", "demo4@example.test", "AB+", "Jamalpur", true));
    }
    public List<Donor> findPotentialDonors(String bloodGroup, String district) {
        return demoDonors.stream()
            .filter(d -> d.isAvailable())
            .filter(d -> bloodGroup == null || bloodGroup.isBlank() || d.getBloodGroup().equalsIgnoreCase(bloodGroup))
            .filter(d -> district == null || district.isBlank() || d.getDistrict().equalsIgnoreCase(district))
            .collect(Collectors.toList());
    }
}
