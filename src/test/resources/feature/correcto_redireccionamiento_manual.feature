# language:es
# Author:Juan Felipe Puerta
Característica: Análisis de las funcionalidades del registro de un nuevo usuario
  yo como usuario deseo realizar registro de un usuario nuevo, y verificando los criterios de aceptacion.


  @manual1*
  Escenario:abrir modulo empleado
    Dado que el usuario está en la página web
    Cuando el usuario selecciona la opción "empleos"
    Entonces se redirige a la pagina en el modulo "empleos"


  @manual2*
   Escenario:registro valido en portal de empleos
    Dado que el usuario este en el modulo "ir al portal de empleos"
    Cuando el usuario llene los campos de texto
    Entonces se hace registro exitoso



  @manual3*
  Escenario:informacion modulo que es ser choucair
    Dado que el usuario este en modulo empelados
    Cuando el usuario selecciona la opcion "que es ser choucair"
    Entonces se desliza dentro de la pagina mostrando la informacion



  @manual4*
  Escenario:testear modulo cursos generales para ingenieros
    Dado el usuario esta en todos los cursos
    Cuando se da click en uno de los links
    Entonces se redirige la pagina a la informaciond e tal curso
