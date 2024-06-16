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
public class Conversation implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * primary key
     */
    private Integer id;

    /**
     * Conversation name
     */
    private String title;

    /**
     * Foreign key Conversation creator user id
     */
    private Integer creatorId;

    /**
     * Conversation creation time
     */
    private Date createTime;

    /**
     * Conversation deletion time
     */
    private Date deleteTime;
}
