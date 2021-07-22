Feature: Categoria Pagina Magento
  como usuario quiero revisar la informacion personal que tengo ingresada en la pagina Magento

  Background :
    Given  el usuario ingreso a la pagina
    And    hace click en Account
    And    hace click en MyAccount

  Scenario Outline: Validar mensaje de bienvenida
    Given el usuario esta en MyAccount
    When  busca informacion de su perfil
    Then  el mensaje de bienvenida debe ser <mensajeBienvenida>
    Examples:
      |mensajeBienvenida           |
      |"Hello, josue baeza baeza!" |


  Scenario Outline: Validar titulo NEWSLETTERS
    Given el usuario esta en MyAccount
    When  busca informacion de su perfil
    Then  el titulo de NEWSLETTERS debe ser <NEWSLETTERS>
    Examples:
      |NEWSLETTERS         |
      |"NEWSLETTERS"       |

