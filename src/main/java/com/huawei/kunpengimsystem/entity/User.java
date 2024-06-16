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
public class User implements Serializable {
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
     * Encrypted password
     */
    private String password;

    /**
     * gender：male or female
     */
    private String gender;

    /**
     * sign
     */
    private String signature;

    /**
     * Mail
     */
    private String email;

    /**
     * creation time
     */
    private Date createTime;

}
