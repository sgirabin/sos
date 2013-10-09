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
public class PurchaseOrder extends BaseEntity implements Serializable{
    
    @Id
    @Column(name = "order_id")
    private Long id;
    
    @OneToMany(mappedBy = "order")
    private Collection<PurchaseOrderItem> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<PurchaseOrderItem> getItems() {
        return items;
    }

    public void setItems(Collection<PurchaseOrderItem> items) {
        this.items = items;
    }


    
}
