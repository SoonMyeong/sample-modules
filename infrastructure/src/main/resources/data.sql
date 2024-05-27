create table IF not exists SAMPLE(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(200)  NOT NULL
);

insert into SAMPLE(username, email) values
('홍길동', 'user1@example.com')
, ('김철수', 'user2@example.com')
, ('김영희', 'user3@example.com');