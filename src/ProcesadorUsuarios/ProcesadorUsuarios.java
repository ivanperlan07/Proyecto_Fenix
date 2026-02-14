package ProcesadorUsuarios;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase procesa listas de usuarios. Contiene 'code smells' intencionados.
 */
/**
 * Esta clase se encarga de procesar y clasificar una lista de usuarios 
 * según su rol asignado.
 */
public class ProcesadorUsuarios {
	/**
     * Procesa la lista de entrada y genera un informe de texto.
     * @param listaUsuariosRaw Lista de strings con formato "nombre:rol"
     * @return Un resumen formateado con administradores e invitados
     */
    private static final int ROL_ADMIN = 1;
    private static final int ROL_INVITADO = 2;

    // Método con 'code smells': largo, números mágicos, malos nombres.
    public String procesarLista(List<String> listaUsuariosRaw) {
        String admins = "";
        String invitados = "";

        for (String entradaUsuario : listaUsuariosRaw) {
            String[] parts = entradaUsuario.split(":"); // Formato "nombre:rol"
            
            if (parts.length == 2) {
                String nombreUsuario = parts[0];
                int codigoRol = Integer.parseInt(parts[1]);

                // Número Mágico: 1 es Admin
                if (codigoRol == ROL_ADMIN) {
                    admins += nombreUsuario + ",";
                } 
                // Número Mágico: 2 es Invitado
                else if (codigoRol == ROL_INVITADO) {
                    invitados += nombreUsuario + ",";
                }
            }
        }
        
        return generarInformeFinal(admins, invitados);
    }

    private String generarInformeFinal(String admins, String invitados) {
        return "Admins: " + admins + " | Invitados: " + invitados;
    }
}