package com.rabincorp.sos.domain.entity;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author isakrabin
 */
public abstract class BaseEntity {

    private String createdBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    
    private String lastUpdateBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateDate;
    
    private String deletedBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedDate;
    
}
