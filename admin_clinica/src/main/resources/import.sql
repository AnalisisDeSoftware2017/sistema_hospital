INSERT INTO usuarios_sistema (apellido, email, fecha_creacion, is_active, is_locked, last_login, nombre, password, username,failed_login) VALUES ('Bogado','seebogado@hotmail.com',NOW() , true, false, NULL , 'Sebastian Emanuel Enrique', '$2a$10$PGf.XKl7glLRnYoHSp58h.hmXZHjTWY8HQTGYBkN/5hE7ihAhrTGy', 'palmeras',0);


/*Especialidad*/
insert into especialidad(nombre_especialidad)values('Ginecología');
insert into especialidad(nombre_especialidad)values('Odontología');
insert into especialidad(nombre_especialidad)values('Nutrición');
insert into especialidad(nombre_especialidad)values('Psiquiatría');
insert into especialidad(nombre_especialidad)values('Pediatría');
insert into especialidad(nombre_especialidad)values('Embriología');
insert into especialidad(nombre_especialidad)values('Dermatología');



/*Medico*/
insert into medico(apellido, codigo, nombre, numero_documento, tipo_documento)values('Bayarri','125','Jennifer', '38256098','DNI');
insert into medico(apellido, codigo, nombre, numero_documento, tipo_documento)values('Bogado','123','Sebastian', '38256096','DNI');
insert into medico(apellido, codigo, nombre, numero_documento, tipo_documento)values('Jimenez','127','Matias', '38256100','DNI');
insert into medico(apellido, codigo, nombre, numero_documento, tipo_documento)values('Nesponla','124','Daiana', '38256097','DNI');
insert into medico(apellido, codigo, nombre, numero_documento, tipo_documento)values('Rapetti','126','Pablo', '38256099','DNI');



/*Paciente*/
insert into paciente(apellido, codigo, nombre, numero_documento, tipo_documento)values('Bayarri','125','Jennifer', '38256098','DNI');
insert into paciente(apellido, codigo, nombre, numero_documento, tipo_documento)values('Bogado','123','Sebastian', '38256096','DNI');
insert into paciente(apellido, codigo, nombre, numero_documento, tipo_documento)values('Jimenez','127','Matias', '38256100','DNI');
insert into paciente(apellido, codigo, nombre, numero_documento, tipo_documento)values('Nesponla','124','Daiana', '38256097','DNI');
insert into paciente(apellido, codigo, nombre, numero_documento, tipo_documento)values('Rapetti','126','Pablo', '38256099','DNI');