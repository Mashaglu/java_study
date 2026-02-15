package lesson3;

import java.util.UUID;

public class ProductCredit {
    private UUID id;
    private String name;
    private boolean isActive;
    private String arrangement;

    public ProductCredit() {}

    public ProductCredit(UUID id, String name, boolean isActive, String arrangement) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.arrangement = arrangement;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (validateName(name)) {
            this.name = name;
        }
        this.name = "unknown";
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getArrangement() {
        return arrangement;
    }

    public void setArrangement(String arrangement) {
        this.arrangement = arrangement;
    }

    private boolean validateName(String name) {
        return name != null && !name.isEmpty();
    }
}
