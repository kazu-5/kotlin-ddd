-- ユーザテーブル作成
CREATE TABLE IF NOT EXISTS users
(
    id MEDIUMINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    is_deleted BOOLEAN NOT NULL DEFAULT 0,
    created_on DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_on DATETIME ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
    ) ENGINE=InnoDB;

-- ユーザデータ初期化
INSERT INTO users (name, password) VALUES ("もりもり", "password");