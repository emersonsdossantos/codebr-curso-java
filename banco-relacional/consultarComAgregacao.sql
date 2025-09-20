select
    regiao as 'Região',
    sum(populacao) as 'Total'
from estados
GROUP BY regiao
order by total desc;
    

select sum (populacao) as 'Total' from estados;

select avg(populacao) as "Total" from estados;

select regiao as 'Região', sum (populacao) as 'Total'
from estados
GROUP BY regiao
order BY total desc;