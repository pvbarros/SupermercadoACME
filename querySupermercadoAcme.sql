create schema `supermercado_acme`;
use `supermercado_acme`;

create table `supermercado_acme`.`produto`(
`id` int not null,
`preco` float, 
`peso` float, 
`nome` varchar(50),
`tipo` char,
primary key(`id`))

create table `supermercado_acme`.`gondola`(
`id` int not null,
`local` varchar(50), 
`total` float,
primary key(`id`))

create table `supermercado_acme`.`carrinho`(
`id` int not null, 
`nome` varchar(100), 
`total` float,
primary key(`id`))

create table `supermercado_acme`.`usuario`(
`id` int not null,
`nome` varchar(150), 
`userID` varchar(150), 
`password` varchar(150),
`email` varchar(150),
`perfil` varchar(100),
primary key(`id`))

select * from `supermercado_acme`.`produto`
select * from `supermercado_acme`.`gondola`
select * from `supermercado_acme`.`carrinho`
select * from `supermercado_acme`.`usuario`



