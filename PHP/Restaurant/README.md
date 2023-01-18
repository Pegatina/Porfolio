# Restaurant
### Eng:
Web application for delivery in a restaurant.
The application must allow:
- Consult categories (meats, salads, pasta, etc) and select them.
- Consult the dishes of a selected category.
- Adding dishes to the order (one or more units).
- Consult the cart with the order at any time.
- Place the order, which will be entered into the database.

To access it, it is necessary to log in with a valid user (reusing a registration and login already done (CRUD)).

Databases:
- users (name, password, e-mail)
- dishes (code, category, name, description and price)
- orders (user, date and dishes).

The application automatically generates the menu based on the data in the DB, as well as the drop-down menus, stores the choice in a session array and displays it before payment.
___
### Esp:
Aplicación web de pedidos a domicilio para un restaurante.
La aplicación debe permitir:
- Consultar las categorías (carnes, ensaladas, pasta, etc) y seleccionarlas.
- Consultar los platos de una categoría seleccionada.
- Añadir platos al pedido (una o más unidades).
- Consultar el carrito con el pedido en cualquier momento.
- Realizar el pedido, lo cual lo introducirá en la base de datos.

Para acceder a ella es necesario iniciar sesión con un usuario válido (reutilizando un registro e inicio de sesión ya hechos (CRUD)).

Bases de datos:
- usuarios (nombre, contraseña, correo)
- platos (código, categoría, nombre, descripción y precio)
- pedidos(usuario, fecha y platos).

La aplicación genera automáticamente el menú en base a los datos de la BBDD, así como los desplegables, almacena la elección en un array de sesión y lo desglosa antes de pagar.
