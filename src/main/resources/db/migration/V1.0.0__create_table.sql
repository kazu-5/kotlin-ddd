CREATE TABLE IF NOT EXISTS groups
(
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    created_on DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_on DATETIME ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);
INSERT INTO groups (name) VALUES ("group1");
INSERT INTO groups (name) VALUES ("group2");

CREATE TABLE IF NOT EXISTS users
(
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    is_deleted BOOLEAN NOT NULL DEFAULT 0,
    group_id MEDIUMINT NOT NULL,
    foreign key fk_groups (group_id) references groups(id) on delete cascade on update cascade,
    created_on DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_on DATETIME ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
    );
INSERT INTO users (name, password, group_id) VALUES ("user1", "password", 1);

CREATE TABLE IF NOT EXISTS tasks
(
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    user_id MEDIUMINT NOT NULL,
    foreign key fk_users (user_id) references users(id) on delete cascade on update cascade,
    group_id MEDIUMINT NOT NULL,
    foreign key fk_groups (group_id) references groups(id) on delete cascade on update cascade,
    created_on DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_on DATETIME ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);
INSERT INTO tasks(name, user_id, group_id) VALUES ("task1", 1, 1);