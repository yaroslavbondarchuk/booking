package com.weboot.book.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Yaroslav Bondarchuk
 *         Date: 02.01.2016
 *         Time: 17:50
 */
@Entity
public class Master extends User {
    @Enumerated(EnumType.STRING)
    private MasterType type;

    @OneToMany
    private Set<ProvidedService> providedServices;

    public MasterType getType() {
        return type;
    }

    public void setType(MasterType type) {
        this.type = type;
    }

    public Set<ProvidedService> getProvidedServices() {
        return providedServices;
    }

    public void setProvidedServices(Set<ProvidedService> providedServices) {
        this.providedServices = providedServices;
    }
}
