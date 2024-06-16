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
public class Attachment implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * primary key
     */
    private Integer id;

    /**
     * Foreign key-information id
     */
    private Integer messageId;

    /**
     * File address
     */
    private String fileAddress;

    /**
     * File check code
     */
    private String fileCheckCode;

    /**
     * File creation time
     */
    private Date createTime;
}
