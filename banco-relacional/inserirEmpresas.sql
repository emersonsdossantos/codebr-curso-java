insert into empresas
    (nome, cnpj)
values
    ('Bradesco', 15647126000120),
    ('Vale', 60679553000144),
    ('Cielo', 67840481000114);

alter table empresas modify cnpj varchar (14);

desc empresas;

desc `prefeitos`;

insert into empresas_unidades
    (empresa_id, cidade_id, sede)
values
    (1,1,1),
    (1,2,0),
    (2,1,0),
    (2,2,1);
