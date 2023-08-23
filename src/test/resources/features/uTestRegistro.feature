# Autor: José Oliveros Misath
  #language:es

Característica: Llenar un formulario de registro de usuario

  Esquema del escenario: : Creacion exitosa del usuario
    Dado El usuario ingresa a <url>
    Cuando Rellena el formulario
      | pais   | ciudad   | zip   | computador   | version   | idioma   | dispositivo   | modelo   | sistemaop   | contrasenia   | validarcontrasenia   |
      | <pais> | <ciudad> | <zip> | <computador> | <version> | <idioma> | <dispositivo> | <modelo> | <sistemaop> | <contrasenia> | <validarcontrasenia> |
    Entonces Podra confirmar el registro
    Ejemplos:
      | url               | pais    | ciudad    | zip | computador | version | idioma  | dispositivo | modelo  | sistemaop   | contrasenia   | validarcontrasenia |
      | https://utest.com | Germany | Frankfurt | 453 | Windows    | 10      | Spanish | Alcatel     | Crystal | Android 1.5 | Jose90031971! | Jose90031971!      |
