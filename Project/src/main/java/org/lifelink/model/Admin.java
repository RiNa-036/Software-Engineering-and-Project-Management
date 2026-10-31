package org.lifelink.model;

public class Admin extends User {
    public Admin(int id, String name, String email) {
        super(id, name, email, "ADMIN");
    }
    public boolean canReviewRequests() { return true; }
}
