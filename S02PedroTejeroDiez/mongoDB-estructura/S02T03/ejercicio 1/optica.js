db = connect( 'mongodb://localhost/optica' );
db.proveedores.insertMany([{nombre: 'Don Draper', direccion: "calle ventura rodriguez, 35 1-1", telefono: "915648978", fax:"915647889", nif: "25456879H"},
{nombre: 'Rayban', direccion: "calle agapito, 5 1-1", telefono: "936648978", fax:"936647889", nif: "12345879K"},
{nombre: 'Nike', direccion: "avenida orense, 235 bajos", telefono: "986648978", fax:"986647889", nif: "98765423H"},
{nombre: 'Jander', direccion: "calle lopiol, s/n", telefono: "943648978", fax:"943547889", nif: "11111111K"}]);

db.gafas.insertMany([{marca: 'Rayban', grd_izq: 2.51, grd_der: 3.17, montura: "pasta", color: "rojo", color_vidr: "azul", precio: 346.4, proveedor: {nombre: 'Rayban', direccion: "calle agapito, 5 1-1", telefono: "936648978", fax:"936647889", nif: "12345879K"}, vendedor: {nombre: "daniel"}, cliente: {nombre: 'Piter', direccion: "calle ventura rodriguez, 35 1-1", telefono: "915648978", email: "piter@gmail.com"}},
{marca: 'Nike', grd_izq: 2.17, grd_der: 2.15, montura: "metal", color: "plata", color_vidr: "azul", precio: 546.4, proveedor: {nombre: 'Don Draper', direccion: "calle ventura rodriguez, 35 1-1", telefono: "915648978", fax:"915647889", nif: "25456879H"}, vendedor: {nombre: "Julian"}, cliente: {nombre: 'Juan', direccion: "avenida fragua, 225", telefono: "946648978", email: "juan@gmail.com"}},
{marca: 'Sol', grd_izq: 1.32, grd_der: 0.25, montura: "flotante", color: "azul", color_vidr: "azul", precio: 246.4, proveedor: {nombre: 'Nike', direccion: "avenida orense, 235 bajos", telefono: "986648978", fax:"986647889", nif: "98765423H"}, vendedor: {nombre: "daniel"}, cliente: {nombre: 'Manolo', direccion: "calle viridiana, S/n bajos", telefono: "938648978", email: "manuel@gmail.com"}},
{marca: 'sunglasses', grd_izq: 4.51, grd_der: 4.0, montura: "pasta", color: "negro", color_vidr: "azul", precio: 327.2, proveedor: {nombre: 'Jander', direccion: "calle lopiol, s/n", telefono: "943648978", fax:"943547889", nif: "11111111K"}, vendedor: {nombre: "Julian"}, cliente: {nombre: 'Maria', direccion: "calle olvido, 24, 4-3", telefono: "985268978", email: "maria@gmail.com"}}]);

db.clientes.insertMany([{nombre: 'Piter', direccion: "calle ventura rodriguez, 35 1-1", telefono: "915648978", email: "piter@gmail.com", fecha_reg: new Date(), referente: ""},
{nombre: 'Juan', direccion: "avenida fragua, 225", telefono: "946648978", email: "juan@gmail.com", fecha_reg: new Date(), referente: {nombre: 'Maria', direccion: "calle olvido, 24, 4-3", telefono: "985268978", email: "maria@gmail.com"}},
{nombre: 'Manolo', direccion: "calle viridiana, S/n bajos", telefono: "938648978", email: "manuel@gmail.com", fecha_reg: new Date(), referente: ""},
{nombre: 'Maria', direccion: "calle olvido, 24, 4-3", telefono: "985268978", email: "maria@gmail.com", fecha_reg: new Date(), referente: {nombre: 'Maria', direccion: "calle olvido, 24, 4-3", telefono: "985268978", email: "maria@gmail.com"}}]);

db.usuarios.insertMany([{nombre: "daniel"}, {nombre: "Julian"}])