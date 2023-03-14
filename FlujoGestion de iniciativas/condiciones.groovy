//solo los estados "EN VALIDACION-10011", "EN ESTIMACION-10012", "EN APROBACION-10013"
(issue.status.id == 10011 || issue.status.id == 10012 || issue.status.id == 10013) &&
//solo los usuarios con rol Líder Business Analyst
user.getProjectRoles(issue.project).map(roles => roles).some(roles=> roles.id == 10017) &&
//BA Asignado NO debe ser null
issue.customfield_10312 != null &&
//Aprobación Cancelado == null
issue.customfield_10242 == null &&
//Aprobación Suspendido == null
issue.customfield_10233 == null