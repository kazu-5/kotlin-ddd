CREATE TABLE IF NOT EXISTS users
(
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    is_deleted BOOLEAN NOT NULL DEFAULT 0,
    created_on DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_on DATETIME ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
    );

INSERT INTO users (name, password) VALUES ("user1", "password");

CREATE TABLE IF NOT EXISTS tasks
(
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    user_id MEDIUMINT NOT NULL,
    foreign key fk_users (user_id) references users(id) on delete cascade on update cascade,
    created_on DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_on DATETIME ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

INSERT INTO tasks(name, user_id) VALUES ("task1", 1);