INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Tiago', 'Brown', 'tiago@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Sandra', 'Green', 'sandra@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);


INSERT INTO tb_client(name, cpf, income,birth_Date,children) VALUES ('Maria Silva','12345678901',6500.0, TIMESTAMP WITH TIME ZONE '1994-07-20T10:30:00Z',2);
INSERT INTO tb_client(name, cpf, income,birth_Date,children) VALUES ('Antonio Souza','81316298051',3500.0, TIMESTAMP WITH TIME ZONE '1980-07-20T10:30:00Z',2);
INSERT INTO tb_client(name, cpf, income,birth_Date,children) VALUES ('Tiago Baratieri','87353264098',2500.0, TIMESTAMP WITH TIME ZONE '1950-07-20T10:30:00Z',2);
INSERT INTO tb_client(name, cpf, income,birth_Date,children) VALUES ('Marcio Almeida Silva','45958947087',6500.0, TIMESTAMP WITH TIME ZONE '1960-07-20T10:30:00Z',2);
INSERT INTO tb_client(name, cpf, income,birth_Date,children) VALUES ('Sandra Cristina','51095792024',5600.0, TIMESTAMP WITH TIME ZONE '1950-07-20T10:30:00Z',2);
INSERT INTO tb_client(name, cpf, income,birth_Date,children) VALUES ('Rodrigo Lemos','56727348049',9300.0, TIMESTAMP WITH TIME ZONE '1982-07-20T10:30:00Z',2);
INSERT INTO tb_client(name, cpf, income,birth_Date,children) VALUES ('Carlos Mourão','87421961089',6400.0, TIMESTAMP WITH TIME ZONE '1968-07-20T10:30:00Z',2);
INSERT INTO tb_client(name, cpf, income,birth_Date,children) VALUES ('Aline Morais','78517457056',2100.0, TIMESTAMP WITH TIME ZONE '1990-07-20T10:30:00Z',2);
INSERT INTO tb_client(name, cpf, income,birth_Date,children) VALUES ('Rafael Gonzales','88602310005',4500.0, TIMESTAMP WITH TIME ZONE '1980-07-20T10:30:00Z',2);
INSERT INTO tb_client(name, cpf, income,birth_Date,children) VALUES ('Alice Silva','04503323067',3500.0, TIMESTAMP WITH TIME ZONE '1998-07-20T10:30:00Z',2);