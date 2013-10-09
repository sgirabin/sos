package com.rabincorp.sos.domain.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author isakrabin
 */
@Entity
public class BusinessCategory implements Serializable {
    
    @Id
    @Column(name ="category_id")
    private Long id;
    
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
