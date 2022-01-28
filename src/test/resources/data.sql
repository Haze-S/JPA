insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (1, 'martin', 'martin@fmail.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (2, 'aaaa', 'aaaa@fmail.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (3, 'bbbb', 'bbbb@fmail.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (4, 'cccc', 'cccc@fmail.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (5, 'martin', 'martin@dddd.com', now(), now());

insert into publisher(`id`, `name`) values  (1, '패캠');

insert into book(`id`, `name`, `publisher_id`, `deleted`, `status`) values (1, 'JPA', 1, false, 100);

insert into book(`id`, `name`, `publisher_id`, `deleted`, `status`) values (2, 'Spring', 1, false, 200);

insert into book(`id`, `name`, `publisher_id`, `deleted`, `status`) values (3, 'SpringBoot', 1, true, 100);

insert into review(`id`, `title`, `content`, `score`, `user_id`, `book_id`) values (1, '내 인생을 바꾼 책', '너무 좋아요', 5.0, 1, 1);

insert into review(`id`, `title`, `content`, `score`, `user_id`, `book_id`) values (2, '재미 없어요', '별로에요', 3.0, 2, 2);

insert into comment(`id`, `comment`, `review_id`) values (1, '저도 재밌었어요', 1);

insert into comment(`id`, `comment`, `review_id`) values (2, '별로....', 1);

insert into comment(`id`, `comment`, `review_id`) values (3, '저도 그냥 그랬어요.', 2);
