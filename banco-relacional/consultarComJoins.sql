SELECT * FROM cidades c inner join prefeitos p on c.id = p.cidade_id;

SELECT * from cidades c left join prefeitos p on c.id = p.cidade_id 

SELECT * from cidades c left outer join prefeitos p on c.id = p.cidade_id 

SELECT * from cidades c right outer join prefeitos p on c.id = p.cidade_id 

SELECT * from cidades c right join prefeitos p on c.id = p.cidade_id 

SELECT * from cidades c left join prefeitos p on c.id = p.cidade_id 
UNION 
SELECT * from cidades c right join prefeitos p on c.id = p.cidade_id 

SELECT * from cidades c 

SELECT * from prefeitos p 