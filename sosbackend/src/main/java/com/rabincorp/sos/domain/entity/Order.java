package com.rabincorp.sos.domain.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author isakrabin
 */

@Entity
public class Order implements Serializable{
    
    @Id
    @Column(name="ORDER_ID")
    private Long id;
    
    @OneToMany(mappedBy = "order")
    private Collection<OrderItem> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
