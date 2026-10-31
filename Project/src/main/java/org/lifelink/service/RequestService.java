package org.lifelink.service;

import org.lifelink.model.BloodRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RequestService {
    private final List<BloodRequest> requests = new ArrayList<>();
    private int nextId = 1;

    // In-memory demonstration only; data is lost when the application restarts.
    public BloodRequest create(BloodRequest request) {
        requests.add(request);
        return request;
    }
    public List<BloodRequest> getAll() {
        return Collections.unmodifiableList(requests);
    }
    public int nextId() { return nextId++; }
}
