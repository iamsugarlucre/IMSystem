package com.huawei.kunpengimsystem.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UserContact implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * primary key-user id
     */
    private Integer userId;

    /**
     * primary key-contact id
     */
    private Integer contactId;

    /**
     * Contact name
     */
    private String name;

    /**
     * creation time
     */
    private Date createTime;
}
