-- write your code in PostgreSQL 9.4

/*
insert into participation values ('John', 2003);
insert into participation values ('Lyla', 1994);
insert into participation values ('Faith', 1996);
insert into participation values ('John', 2002);
insert into participation values ('Carol', 2000);
insert into participation values ('Carol', 1999);
insert into participation values ('John', 2001);
insert into participation values ('Carol', 2002);
insert into participation values ('Lyla', 1996);
insert into participation values ('Lyla', 1997);
insert into participation values ('Carol', 2001);
insert into participation values ('John', 2009);
*/

WITH tabelSementara AS (
    SELECT *, year - ROW_NUMBER() OVER (
        PARTITION BY name ORDER BY year
    ) 
    AS grupSementara
    FROM participation
), tabelFinal AS (
    SELECT *, COUNT(*) OVER (
        PARTITION BY name, grupSementara
    )
    AS grupFinal
    from tabelSementara
)
SELECT name
FROM tabelFinal
WHERE grupFinal >= 3
GROUP BY name
ORDER BY name;
