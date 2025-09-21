select * from estados

select * from cidades

insert into cidades(
    nome, area, estado_id
)
values('Campinas', 795.7, 25);

insert into cidades(
    nome, area, estado_id
)
values('Rio de Janeiro', 1.2, 19)

insert into cidades(
    nome, area, estado_id
)
values(
    'Recife', 218.8, (SELECT id FROM estados where sigla = 'PE')
)

insert into cidades(nome, area, estado_id)
values('Belo Horizonte', 331.4, (select id from estados where sigla = 'MG'));

insert into cidades
    (nome, area, estado_id)
values
    ('Sao Bernardo do Campo', 409.5, (select id from estados where populacao = 45.1))

insert into `cidades`
(nome, area, estado_id)
values('Joao Pessoa', 211.5, (select id from estados where sigla = 'PB'))