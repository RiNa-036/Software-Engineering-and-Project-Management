package org.lifelink.service;

import org.lifelink.model.BloodRequest;
import org.lifelink.model.Donor;
import java.util.List;

public class MatchingService {
    private final DonorService donorService = new DonorService();

    // This is a simple search filter, not a clinical compatibility decision.
    public List<Donor> suggestPotentialDonors(BloodRequest request) {
        return donorService.findPotentialDonors(request.getBloodGroup(), request.getDistrict());
    }
}
