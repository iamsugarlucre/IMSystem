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
public class Participant implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * primary key
     */
    private Integer id;

    /**
     * Foreign key-conversation id
     */
    private Integer conversationId;

    /**
     * Foreign key-user's id
     */
    private Integer userId;

    /**
     * type：single，group
     */
    private String type;

    /**
     * Creation time
     */
    private Date createTime;
}
