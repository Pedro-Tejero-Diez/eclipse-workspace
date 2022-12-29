db = connect( 'mongodb://localhost/pizzeria' );

db.provincias.insertMany([{_id: 1, nombre: 'Alicante'}, {_id: 2, nombre: 'Burgos'}, {_id: 3, nombre: 'Caceres'}, 
{_id: 4, nombre: 'Barcelona'}, {_id: 5, nombre: 'Madrid'}, {_id: 6, nombre: 'Alava'}, {_id: 7, nombre: 'Zaragoza'}]);

db.localidades.insertMany([{_id: 1, nombre: 'Sant Joan', provincia: {"$ref": "provincias", "$id": 1}},
 {_id: 2, nombre: 'Plasencia', provincia: {"$ref": "provincias", "$id": 3}}, 
 {_id: 3, nombre: 'Barcelona', provincia: {"$ref": "provincias", "$id": 4}}, 
 {_id: 4, nombre: 'Vitoria', provincia: {"$ref": "provincias", "$id": 6}}, 
 {_id: 7, nombre: 'Casetas', provincia: {"$ref": "provincias", "$id": 7}},
 {_id: 6, nombre: 'Cenicientos', provincia: {"$ref": "provincias", "$id": 5}},
{_id: 5, nombre: 'Quintanar', provincia: {"$ref": "provincias", "$id": 2}}]);


db.clientes.insertMany([{nombre: 'Peter', apellidos: "Parker", direccion: "calle agapito, 5 1-1", codigo: "02589", 
telefono: "936648978", localidad: {"$ref": "localidades", "$id": 6, }, provincia: {"$ref": "provincias", "$id": 5}},
{nombre: 'Juan', apellidos: "Sanchez", direccion: "avenida fragua, 225", codigo: "43056", telefono: "946648978",
localidad: {"$ref": "localidades", "$id": 4, }, provincia: {"$ref": "provincias", "$id": 6}},
{nombre: 'Manolo', apellidos: "Velez", direccion: "calle viridiana, S/n bajos", telefono: "938648978", codigo: "08589",
 localidad: {"$ref": "localidades", "$id": 3, }, provincia: {"$ref": "provincias", "$id": 4}},
{nombre: 'Maria', apellidos: "quesada", direccion: "calle olvido, 24, 4-3", telefono: "985268978", codigo: "24890", 
localidad: {"$ref": "localidades", "$id": 2, }, provincia: {"$ref": "provincias", "$id": 3}}]);

db.burgers.insertMany([{_id:1, nombre: 'BigMac', descripcion: "Hamburguesa sin queso", imagen: "www.images.com/burger1.jpg", precio: 14.5}, 
{_id:2, nombre: 'whopper', descripcion: "Hamburguesa con lechuga", imagen: "www.images.com/burger2.jpg", precio: 13.5},
{_id:3, nombre: 'queso', descripcion: "Hamburguesa con queso", imagen: "www.images.com/burger3.jpg", precio: 16.25}]);


db.bebidas.insertMany([{_id:1, nombre: 'Coke', descripcion: "cocacola normal", imagen: "www.images.com/bebida1.jpg", precio: 3.5}, 
{_id:2, nombre: 'agua', descripcion: "Agua mineral", imagen: "www.images.com/bebida2.jpg", precio: 2.5},
{_id:3, nombre: 'limon', descripcion: "fanta limon", imagen: "www.images.com/bebida3.jpg", precio: 3.25}]);

db.categorias_pizza.insertMany([{_id: 1, nombre: 'queso'}, {_id: 2, nombre: 'sin queso'}, {_id: 3, nombre: 'focaccia'}]);

db.pizzas.insertMany([{_id:1, nombre: 'romana', descripcion: "pizza sin queso", imagen: "www.images.com/pizza1.jpg", categoria: {"$ref": "categorias_pizza", "$id": 2}, precio: 14.5}, 
{_id:2, nombre: 'cuatro quesos', descripcion: "pizza con cuatro quesos", imagen: "www.images.com/pizza2.jpg", categoria: {"$ref": "categorias_pizza", "$id": 1}, precio: 16.5},
{_id:3, nombre: 'ajo perejil', descripcion: "focaccia con ajo y peregil", imagen: "www.images.com/pizza3.jpg", categoria: {"$ref": "categorias_pizza", "$id": 3}, precio: 12.25},]);

db.tiendas.insertMany([{_id: 1, nombre: 'Goya', direccion: "calle olvido, 24, 4-3", telefono: "915268978", codigo: "28890", 
localidad: {"$ref": "localidades", "$id": 6}, provincia: {"$ref": "provincias", "$id": 5}},
{_id: 2, nombre: 'Caceres', direccion: "calle Mayor, 20, 4-3", telefono: "925268978", codigo: "24890", 
localidad: {"$ref": "localidades", "$id": 2}, provincia: {"$ref": "provincias", "$id": 3}}, 
{_id: 3, nombre: 'Bilbo', direccion: "calle ria, 224, 4-3", telefono: "935268978", codigo: "43890", 
localidad: {"$ref": "localidades", "$id": 4 }, provincia: {"$ref": "provincias", "$id": 6}}]);

db.empleados.insertMany([{_id:1, nombre: 'Julian', apellidos: "Marquez", NIF: "123456789L", telefono: "965897412", puesto: "repartidor", 
tienda: {"$ref": "tiendas", "$id": 3}},
{_id:2, nombre: 'Marga', apellidos: "de Tomas", NIF: "568456789L", telefono: "915897412", puesto: "repartidor", 
tienda: {"$ref": "tiendas", "$id": 1}}, 
{_id:3, nombre: 'Juana', apellidos: "Real", NIF: "256486789L", telefono: "93897412", puesto: "cocinero", 
tienda: {"$ref": "tiendas", "$id": 5}}]);

db.comandas.insertMany([{fecha: "2021-06-16T19:01:24.337Z", tienda: {"$ref": "tiendas", "$id": 1}, empleado: {"$ref": "empleados", "$id": 1}, 
tipo: "reparto", burger: {tipo: {"$ref": "burgers", "$id": 1}, cantidad: 2}, bebida: {tipo: {"$ref": "bebidas", "$id": 1}, cantidad: 2}, cliente: {tipo: {"$ref": "clientes", "$id": 1}}},
 {fecha: "2021-06-16T20:01:24.337Z", tienda: {"$ref": "tiendas", "$id": 2}, empleado: {"$ref": "empleados", "$id": 2}, 
tipo: "reparto", pizza: {tipo: {"$ref": "pizzas", "$id": 1}, cantidad: 2}, bebida: {tipo: {"$ref": "bebidas", "$id": 3}, cantidad: 2}, 
cliente: {tipo: {"$ref": "clientes", "$id": 3}}}, 
{fecha: "2021-06-16T19:31:24.337Z", tienda: {"$ref": "tiendas", "$id": 3}, empleado: {"$ref": "empleados", "$id": 2}, 
tipo: "reparto", burger: {tipo: {"$ref": "burgers", "$id": 1}, cantidad: 2}, pizza: {tipo: {"$ref": "pizzas", "$id": 3}, cantidad: 2},  bebida: {tipo: {"$ref": "bebidas", "$id": 1}, cantidad: 2},
 cliente: {tipo: {"$ref": "clientes", "$id": 1}}}]);







