create table Actors(Name char(40), Movie char(80), Year int, Role char(40));

load data local infile '~/data/actors.csv' into table Actors
fields terminated by ',' optionally enclosed by '"';

select Name from Actors where Movie="Die Another Day";

drop table Actors;