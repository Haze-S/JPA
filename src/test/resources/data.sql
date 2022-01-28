insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (1, 'martin', 'martin@fmail.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (2, 'aaaa', 'aaaa@fmail.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (3, 'bbbb', 'bbbb@fmail.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (4, 'cccc', 'cccc@fmail.com', now(), now());

insert into user (`id`, `name`, `email`, `created_at`, `updated_at`) values (5, 'martin', 'martin@dddd.com', now(), now());

insert into publisher(`id`, `name`) values  (1, '패캠');

insert into book(`id`, `name`, `publisher_id`, `deleted`, `status`) values (1, 'JPA', 1, false, 100);

insert into book(`id`, `name`, `publisher_id`, `deleted`, `status`) values (2, 'Spring', 1, false, 200);

insert into book(`id`, `name`, `publisher_id`, `deleted`, `status`) values (3, 'SpringBoot', 1, true, 100);
