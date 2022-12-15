USE universidad;
SELECT apellido1, apellido2, nombre FROM persona WHERE tipo = "alumno" ORDER BY apellido1, apellido2, nombre;
SELECT nombre, apellido1, apellido2 FROM persona WHERE tipo = "alumno" AND telefono IS NULL;
SELECT nombre, apellido1, apellido2, fecha_nacimiento FROM persona WHERE tipo = "alumno" AND fecha_nacimiento >= "1999-01-01";
SELECT nombre, apellido1, apellido2 FROM persona WHERE tipo = "profesor" AND telefono IS NULL AND nif REGEXP "K$";
SELECT * FROM asignatura WHERE cuatrimestre = 1 AND curso = 3 AND id_grado = 7;
SELECT apellido1, apellido2, p.nombre, d.nombre FROM persona p JOIN profesor ON p. id = id_profesor  JOIN departamento d ON d.id= id_departamento  ORDER BY apellido1, apellido2, p.nombre;
SELECT a.nombre, anyo_inicio, anyo_fin  FROM persona p JOIN alumno_se_matricula_asignatura ama ON id_alumno = p.id JOIN asignatura a ON a.id = id_asignatura JOIN curso_escolar ce ON ce.id = id_curso_escolar  WHERE nif = "26902806M";
SELECT DISTINCT d.nombre FROM profesor pf JOIN asignatura a ON a.id_profesor = pf.id_profesor JOIN departamento d ON  d.id = pf.id_departamento JOIN grado g ON a.id_grado = g.id WHERE g.id = 4;
SELECT DISTINCT p.nombre FROM persona p JOIN alumno_se_matricula_asignatura ON p.id = id_alumno JOIN asignatura a ON id_asignatura = a.id JOIN curso_escolar ce ON ce.id = id_curso_escolar WHERE anyo_inicio = 2018;
SELECT d.nombre AS departamento, apellido1, apellido2, p.nombre FROM persona p JOIN profesor pf ON id_profesor = p.id LEFT JOIN departamento d ON id_departamento = d.id ORDER BY d.nombre, apellido1, apellido2, p.nombre;
SELECT apellido1, apellido2, p.nombre FROM persona p JOIN profesor pf ON id_profesor = p.id WHERE id_departamento IS NULL;
SELECT id_profesor, d.nombre AS departamento FROM departamento d LEFT JOIN profesor p ON id_departamento = d.id WHERE id_departamento IS NULL;
SELECT p.nombre FROM profesor pf JOIN persona p ON pf.id_profesor = p.id LEFT JOIN asignatura a ON pf.id_profesor = a.id_profesor WHERE a.id IS NULL;
SELECT a.nombre FROM asignatura a LEFT JOIN profesor p ON p.id_profesor = a.id_profesor WHERE a.id_profesor IS NULL;
SELECT count(nombre) AS total FROM persona WHERE tipo = "alumno";
SELECT count(nombre) AS total FROM persona WHERE fecha_nacimiento BETWEEN "1999-01-01" AND "1999-12-31";
SELECT d.nombre AS "depto.", count(id_profesor) AS suma_profs FROM departamento d JOIN profesor pf ON id_departamento = d.id GROUP BY d.id ORDER BY suma_profs DESC;
SELECT d.nombre AS "depto.", count(id_profesor) AS suma_profs FROM departamento d LEFT JOIN profesor pf ON id_departamento = d.id GROUP BY d.id ORDER BY suma_profs DESC;
SELECT g.nombre AS grado, count(a.id) AS asignatura FROM grado g LEFT JOIN asignatura a ON id_grado = g.id GROUP BY g.id ORDER BY asignatura DESC;
SELECT g.nombre AS grado, count(a.id) AS num_as FROM grado g JOIN asignatura a ON id_grado = g.id  GROUP BY g.id HAVING num_as > 40;
SELECT g.nombre, a.tipo, SUM(creditos) FROM asignatura a JOIN grado g ON id_grado = g.id GROUP BY g.id, a.tipo;
SELECT anyo_inicio, COUNT(DISTInct id_alumno) AS numero_alumnos FROM curso_escolar ce JOIN alumno_se_matricula_asignatura ON  id_curso_escolar = ce.id GROUP BY ce.id;
SELECT pf.id_profesor, p.nombre, apellido1, apellido2, COUNT(a.id) AS num_asig FROM profesor pf LEFT JOIN asignatura a ON a.id_profesor = pf.id_profesor JOIN persona p ON p.id = pf.id_profesor GROUP BY pf.id_profesor ORDER BY num_asig DESC;
SELECT * FROM persona WHERE tipo = "alumno" ORDER BY fecha_nacimiento DESC LIMIT 1;
SELECT DISTINCT pf.id_profesor, p.nombre FROM persona p RIGHT JOIN profesor pf ON p.id = pf.id_profesor LEFT JOIN asignatura a ON pf.id_profesor = a.id_profesor WHERE id_departamento IS NOT NULL AND a.id_profesor IS NULL; 


