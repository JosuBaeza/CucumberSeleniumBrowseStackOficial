
Feature: Categoria Carrito de Compra Pagina Magento
  como usuario quiero realizar compras en la pagina Magento y validar los productos que estan en el carrito de compra

  Scenario: Ingresar a la categoria Smartphone desde la pantalla Home
    Given  El usuario se encuentra en la pagina Home de la tienda
    When   hace click sobre el boton Mobile
    Then   Se debe redirigir a la pantalla mobile

  Scenario Outline: Agregar 2 Smartphone al carrito de compra
    Given  El usuario se encuentra en la pagina de Smartphones
    When   hace click sobre el boton Add To Cart en el celular Sony
    And    hace click sobre el boton Mobile
    And    Hace click sobre el boton Add To Cart en el celular Iphone
    And    hace click sobre el boton Mobile
    And    Hace click sobre el boton Add To Cart en el celular Samsung
    Then   Se deben agregar los 3 smartphones al carrito de manera correcta
    And    El Carrito no debe estar Vacio
    And    El total a pagar debe ser de <TotalCarrito>
    And    El subtotal a pagar debe ser de <SubTotal>
    Examples:
      |TotalCarrito  | SubTotal |
      |$730.00       |$730.00   |

