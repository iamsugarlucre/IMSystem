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
public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * primary key
     */
    private Integer id;

    /**
     * username
     */
    private String name;

    /**
     * Mail
     */
    private String email;

    /**
     * Time to become a contact
     */
    private Date createTime;

}
