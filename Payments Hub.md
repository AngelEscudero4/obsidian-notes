Sara - PO - Scrum master (escribe requisitos, reune con cliente, quien prueba antes de ok del despliegue), 
HEctor Ankore ingeniero intermediario entre PO y resto de ing, va a todas reunionens del ldiseño, mantiene parte tecnica de micros por si no entienden requisitos. Principalmente ayudar al squad
Jorge lleva 2 años, xwings desde junio, ingeniero, 

Cada squad tiene sus micros, 

payment hub para procesar pagos, parte de pagos de santander españa (bic + santander españa)

Estan intentando que haya mas componentes core para que sea utilizado por todos, xwings es un squad local,cumple con requisitos de santander esàña

2 iniciativas, crp plus y target 2, 12 micros 

Springboot mantener al dia versiones, postgre, redis, kafka para eventos, elastic, en flijo de un pago generan eventos para registro y para que sea consumido por varios, tambien rabbit, mqs de ibm, spring cloud stream, api, autenticacion interna de payment hub, otra para servicios del santander, y tercer tipo solo en algunos. Ellos no se alimentan por fichers, siempre por una cola o con apis, 

ellos son como un conector conectando servicios antiguos de españa y mandarlo a payment hub

Pair programming por teams, suele haber salas por donde se mueven, 

sprints de 2 semanas, ahora estan en fase del proyecto que terminan desarrollos grandes, llegan peticiones de cambios, organizan en backlog y las sacan cuanto antes

agile lo tienen todo, usan pivotal trucker para tickets, 

github publico dentro de una organizacion, por ahora usan comcores, squad son 9 ingenieros, la idea es crear nuevo squad (2 equipos para neuvos desarrollos para un proyecto muy grande pero no saben fechas, para reducir carga de trabajo ir enseñando para los desarrollos grandes, en sistemas de pagos habia dos lenguajes de pago, estan migrando todos lo bancos al nuevo) en el caso de santander ES estan usando el stma legacy pero enviar a payment hub para contabilizar y terminar de procesar

Los que entramos nuevos trabajar con  parejas, aprendiendo y formacion y luego ya cuando se sepa como dividir los micros convertir en dos equipos. 

trabajan con mac, santande envia equipo con credenciales, 

me dan unas charlas para como funcionan las cosas, a nivel tecnologico spring. 

mac+ intellij (con licencia) -- se puede trabajar conl a version community sin problema. 

Normalmente el onboarding suelen hacerlo mas rapido ahora. crean usuario del santander, permisos, grupos, etc

Lo mas bloqueante es al pedir el portatil pedir acceso de admin al portatil, ser root del portatil. 

horario flexible daily a las 9.30, 

hacer horas en otro momento, (entrar el viernes a las 8)

festivos de comunidad de madrid, 

hora de comida aprox 2-3 (para coordinar por parejas)

