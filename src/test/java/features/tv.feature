
Feature: Categoria TV
  como usuario quiero navegar en la pestaña de Televisores

  Scenario: Ingresar a la categoria TV desde la pantalla Home
    Given  El usuario se encuentra en la pagina Home de la tienda
    When   hace click sobre el boton TV
    Then   Se debe redirigir a la pantalla TV

  Scenario Outline: Validar precios de los televisores
    Given El usuario se encuentra en la pagina de televisores
    When  hace click sobre el boton TV
    Then  Se debe redirigir a la pantalla TV
    And   El valor de TV marca Lg debe ser <Valor>
    And   El valor de la TV marca Samsung debe ser <Valor2>
    Examples:
      |Valor  | Valor2 |
      |$61500 |70000   |

  Scenario Outline: Validar el titulo de los televisores
   Given El usuario se encuentra en la pagina Home de la tienda
   When  Hace click sobre el boton TV
   Then  La primera TV debe tener el siguiente titulo <Titulo1>
   And   La segunda TV debe tener el siguiente titulo <Titulo2>
   Examples:
     |Titulo1  | Titulo2        |
     |"LG LCD" |"SAMSUNG LCD"   |
