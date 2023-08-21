# Autor: José Oliveros Misath
  #language:es

Característica: Llenar un formulario de registro de usuario
  Escenario: Creacion exitosa del usuario
    Dado El usuario ingresa a https://utest.com
    Cuando Rellena el formulario
    Entonces Podra confirmar el registro
