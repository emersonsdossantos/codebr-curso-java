select * from prefeitos;

select * from `cidades`

insert into prefeitos
    (nome, cidade_id)
values
    ("Dário Saadi", 1),
    ('Eduardo Paes', 2),
    ('João Henrique Campos', 3),
    ('Álvaro Damião', 4),
    ('Jessica Cormick', 5);

insert into prefeitos
    (nome, cidade_id)
values
    ('Zenaldo Coutinho', null)

insert into prefeitos
    (nome, cidade_id)
values
    ('Rafael Greca', null)

-- Não pode inserido pois a coluna cidade_id é Unique Key
insert into prefeitos
    (nome, cidade_id)
values
    ('Maria Zuma', 2)