INSERT INTO ITEM (id, name) values (1, 'Girasoles');
INSERT INTO ITEM (id, name) values (2, 'Rosas');
INSERT INTO ITEM (id, name) values (3, 'Hortensias');
INSERT INTO ITEM (id, name) values (4, 'Hortensias');
INSERT INTO ITEM (id, name) values (5, 'Dalias');
INSERT INTO ITEM (id, name) values (6, 'Lirios');
INSERT INTO ITEM (id, name) values (7, 'Claveles');
INSERT INTO ITEM (id, name) values (8, 'Cannas índicas');
/*Contenedores*/
INSERT INTO Container (id, CONTAINER_STATE ) values (1, 'SIN_ENVIAR');
INSERT INTO Container (id, CONTAINER_STATE ) values (2, 'ENVIADO');
INSERT INTO Container (id, CONTAINER_STATE ) values (3, 'EN_REPARTICION');
INSERT INTO Container (id, CONTAINER_STATE ) values (4, 'ENTREGADO');
/*Pedidos*/
INSERT INTO Pedido (id, CONTAINER_STATE, TIME, CONTAINER_ID ) values (1, 'SIN_ENVIAR', sysdate(), 1);
INSERT INTO Pedido (id, CONTAINER_STATE, TIME, CONTAINER_ID ) values (2, 'ENVIADO', sysdate(), 2);
INSERT INTO Pedido (id, CONTAINER_STATE, TIME, CONTAINER_ID ) values (3, 'EN_REPARTICION', sysdate(), 3);
INSERT INTO Pedido (id, CONTAINER_STATE, TIME, CONTAINER_ID ) values (4, 'ENTREGADO', sysdate(), 4);
/*Items asociados al pedido*/
INSERT INTO ITEM_PEDIDO (id, QUANTITY, PEDIDO_ID, ITEM_ID) values (1 ,4, 1, 3);
INSERT INTO ITEM_PEDIDO (id, QUANTITY, PEDIDO_ID, ITEM_ID) values (2 ,5, 1, 4);
INSERT INTO ITEM_PEDIDO (id, QUANTITY, PEDIDO_ID, ITEM_ID) values (3 ,3, 1, 5);
INSERT INTO ITEM_PEDIDO (id, QUANTITY, PEDIDO_ID, ITEM_ID) values (4 ,2, 2, 3);
INSERT INTO ITEM_PEDIDO (id, QUANTITY, PEDIDO_ID, ITEM_ID) values (5 ,5, 2, 3);
INSERT INTO ITEM_PEDIDO (id, QUANTITY, PEDIDO_ID, ITEM_ID) values (6 ,5, 4, 4);
/* Clientes */
INSERT INTO Cliente (id, nombre ) values (1, 'Daniela');
INSERT INTO Cliente (id, nombre ) values (2, 'Valentina');
INSERT INTO Cliente (id, nombre ) values (3, 'Sebastian');
/* Recomendaciones */
INSERT INTO Recomendacion (id, cliente_id ) values (1, 1);
INSERT INTO Recomendacion (id, cliente_id ) values (2, 1);
INSERT INTO Recomendacion (id, cliente_id ) values (3, 2);
INSERT INTO Recomendacion (id, cliente_id ) values (4, 3);
/*Agregar pedidos al cliente*/
UPDATE Cliente set RECOMENDACION_ID = 1 where id = 1;
UPDATE Cliente set RECOMENDACION_ID = 2 where id = 2;
UPDATE Cliente set RECOMENDACION_ID = 3 where id = 3;
/* Recomendaciones clientes*/
INSERT INTO ITEM_RECOMENDACION_LIST  (ITEM_ID, RECOMENDACION_LIST_ID ) values (1, 1);
INSERT INTO ITEM_RECOMENDACION_LIST  (ITEM_ID, RECOMENDACION_LIST_ID ) values (2, 1);
INSERT INTO ITEM_RECOMENDACION_LIST  (ITEM_ID, RECOMENDACION_LIST_ID ) values (3, 1);
INSERT INTO ITEM_RECOMENDACION_LIST  (ITEM_ID, RECOMENDACION_LIST_ID ) values (3, 2);
INSERT INTO ITEM_RECOMENDACION_LIST  (ITEM_ID, RECOMENDACION_LIST_ID ) values (4, 2);
INSERT INTO ITEM_RECOMENDACION_LIST  (ITEM_ID, RECOMENDACION_LIST_ID ) values (5, 2);
INSERT INTO ITEM_RECOMENDACION_LIST  (ITEM_ID, RECOMENDACION_LIST_ID ) values (5, 3);
INSERT INTO ITEM_RECOMENDACION_LIST  (ITEM_ID, RECOMENDACION_LIST_ID ) values (6, 3);
