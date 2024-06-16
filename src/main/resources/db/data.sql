INSERT INTO `users`(`id`,`name`,`password`,`gender`,`signature`,`email`)
        VALUES (NULL, 0219047003425,'Huawei@2024','male','Abdulazeez_Isah','heissugarlucre@gmail.com');

INSERT INTO `users`(`id`,`name`,`password`,`gender`,`signature`,`email`)
        VALUES (NULL,0219047002012,'123456','male','Isaac_Avreson','isaac@gmail.com');

INSERT INTO `users`(`id`,`name`,`password`,`gender`,`signature`,`email`)
        VALUES (NULL,0219047003550,'123456','male','Mohammed_Usman','angibiusman@gmail.com');

INSERT INTO `contacts`(`id`,`name`,`email`)
        VALUES (1,0219047003425,'heissugarlucre@gmail.com');

INSERT INTO `contacts`(`id`,`name`,`email`)
        VALUES (2,0219047002012,'isaac@gmail.com');

INSERT INTO `contacts`(`id`,`name`,`email`)
        VALUES (3,0219047003550,'angibiusman@gmail.com');

INSERT INTO `user_contact`(`user_id`,`contact_id`,`name`)
        VALUES (1,2,'小可爱');

INSERT INTO `user_contact`(`user_id`,`contact_id`,`name`)
        VALUES (2,1,'大宝贝');

INSERT INTO `user_contact`(`user_id`,`contact_id`,`name`)
        VALUES (1,3,'c语言');

INSERT INTO `user_contact`(`user_id`,`contact_id`,`name`)
        VALUES (1,4,'语语言言');

INSERT INTO `conversations`(`title`,`creator_id`)
        VALUES ('hahhahhaha',1);

INSERT INTO `conversations`(`title`,`creator_id`)
        VALUES ('lalalalalal',1);

INSERT INTO `participants` (`conversation_id`,`user_id`,`type`)
        VALUES (1, 1, 'single');

INSERT INTO `participants` (`conversation_id`,`user_id`,`type`)
        VALUES (1, 2, 'single');

INSERT INTO `participants` (`conversation_id`,`user_id`,`type`)
        VALUES (1, 4, 'single');

INSERT INTO `participants` (`conversation_id`,`user_id`,`type`)
        VALUES (2, 1, 'single');

INSERT INTO `participants` (`conversation_id`,`user_id`,`type`)
        VALUES (2, 3, 'single');
