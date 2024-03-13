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
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * primary key
     */
    private Integer id;

    /**
     * Foreign key conversation id
     */
    private Integer conversationId;

    /**
     * Foreign key sends the user's id
     */
    private Integer senderId;

    /**
     * Type of information: text, photo, file
     */
    private String messageType;

    /**
     * information
     */
    private String messageContext;

    /**
     * Information creation time
     */
    private Date createTime;

    /**
     * Information deletion time
     */
    private Date deleteTime;
}
