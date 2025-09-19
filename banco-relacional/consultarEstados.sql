SELECT * from estados;

select nome, sigla from estados;

select sigla, nome as 'Nomes dos Estados' from estados;

select sigla, nome as 'Nome do Estado'from estados where regiao = 'Sul';

SELECT nome, sigla, populacao from estados where populacao > 0.5;

select nome, sigla, populacao 
from estados 
where regiao = 'sudeste' and populacao >= 10.0 
order by populacao desc;

select nome, regiao, populacao
from estados
where populacao >= 1.8
order by populacao desc;

