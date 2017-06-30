Este proyecto es de analisis de software:

<b><u>Integrantes:</u></b>
<ul>
    <li>Bayarri Jennifer</li>
    <li>Gomez Nespola Daiana</li>
    <li>Bogado Sebastián</li>
    <li>Jimenez Matías</li>
    <li>Rapetti Pablo</li>
</ul>


*Configuracion del entorno de desarrollo:*
<ol>
<li> <h4>Descargar el jdk de java 1.8 </h4>
    <h5>En caso de tenerlo, configurar el path de java. Agregando la variable de entorno JAVA_HOME (Dentro de System variables) apuntando  al
    bin que se encuentra en la carpeta dentro del jdk. Por ejemplo en mi caso seria algo como: C:\Program Files\Java\jdk1.8.0_131\bin
        Si queres probar si lo tenes bien instalado o que version de java tenes instalada tenes que correr: "java -version". </h5>
        <b>Despues de esto se debe cerrar la terminal</b></li>
    <li>
        <h4>Instalar maven.</h4>
        <ul>
            <li>De la siguiente pagina: https://maven.apache.org/download.cgi tienen que descargarlo.</li>
            <li>Configurar la variable de entorno M2_HOME (C:\maven) y M2 (%M2_HOME%\bin</li>
            <li>Iniciar nuevamente la consola: y correr: "mvn -version"</li>
        </ul>
    </li>
    <li>Clonar el proyecto</li>
    <li>Pararse con la consola sobre el proyecto y ejecutar el comando "mvn clean install"</li>
    <li>
        <ul>
            <li>Eclipse: <br/>
                    File -> import -> maven -> Existing Maven Projects (Seleccionar la carpeta -> El proyecto)  <br/>
                    En caso de no importar correctamente el proyecto, pararse sobre la carpeta del proyecto en la terminal y correr <br/>   "mvn clean eclipse:clean eclipse:eclipse"
            </li>
            <li>IntelliJ: open -> Buscas la carpeta del proyecto, ingresas, seleccionas el pom y clickeas Open as project</li>
        </ul>
    </li>
   
</ol>
   Configuracion para correr el desarrollo:
    Si tenes el jar compilado crear un archivo llamado application.properties en la misma carpeta donde se encuentra el jar. 
    Ver mas info en la seccion de properties 

   
    Properties:
    #Seteo con que clase se va a manejar Hibernate
    spring.datasource.driverClassName
    #Seteo con que dialecto se va a manejar Hibernate
    spring.jpa.database-platform
    
    #La url sobre la cual se tiene que hacer la conexion a la base de datos
    spring.datasource.url=jdbc:mysql://localhost:3306/clinica_laureles
    #El nombre del usuario con el cual se va a conectar a la base de datos
    spring.datasource.username=root
    #La password de ese usuario
    spring.datasource.password=seeb143
    #Que queries se van a ejecutar. Valores posibles: create, create-drop, update, none
    spring.jpa.hibernate.ddl-auto=update
    #Mostrar consultas que se van a realizar
    spring.jpa.show-sql=true
    
    #Esto es para algo que necesitaba para realizar las queries de busqueda sobre medicos y pacientes
    spring.jpa.properties.hibernate.current_session_context_class=org.springframework.orm.hibernate5.SpringSessionContext
    #Esto esta para decirle que pueda generar las tablas
    spring.jpa.properties.javax.persistence.schema-generation.create-source=metadata
    #Que scripts son los que se van a generar
    spring.jpa.properties.javax.persistence.schema-generation.scripts.action=create
    #En que archivo se van a generar cuando se corra el proyecto
    spring.jpa.properties.javax.persistence.schema-generation.scripts.create-target=create_mysql.sql

  
    
  
###Properties para MYSQL  
 
spring.datasource.url=jdbc:mysql://localhost:3306/clinica_laureles
spring.datasource.username=root
spring.datasource.password=seeb143
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.properties.hibernate.current_session_context_class=org.springframework.orm.hibernate5.SpringSessionContext
spring.jpa.properties.javax.persistence.schema-generation.create-source=metadata
spring.jpa.properties.javax.persistence.schema-generation.scripts.action=create
spring.jpa.properties.javax.persistence.schema-generation.scripts.create-target=create_mysql.sql

  
  
  
  

### Properties PostgresSQL tengo que ver si funciona (Todavia no lo probe)
spring.datasource.url=jdbc:postgresql://localhost:5432/clinica_laureles
spring.datasource.username=postgres
spring.datasource.password=seeb143
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.datasource.driverClassName=org.postgresql.Driver
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.current_session_context_class=org.springframework.orm.hibernate5.SpringSessionContext
spring.jpa.properties.javax.persistence.schema-generation.create-source=metadata
spring.jpa.properties.javax.persistence.schema-generation.scripts.action=create
spring.jpa.properties.javax.persistence.schema-generation.scripts.create-target=create_postgres.sql
  
  
  

