
Feature: Categoria Pagina Magento
    como usuario quiero realizar compras en la pagina Magento y navegar por la pagina para ver diferentes productos.


    Scenario: Ingresar a la categoria Smartphone desde la pantalla Home
        Given  El usuario se encuentra en la pagina Home de la tienda
        When   hace click sobre el boton Mobile
        Then   Se debe redirigir a la pantalla mobile


