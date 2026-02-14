package ProcesadorUsuarios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class ProcesadorUsuariosTest {
    @Test
    void testProcesarLista() {
        ProcesadorUsuarios pu = new ProcesadorUsuarios();
        String resultado = pu.procesarLista(Arrays.asList("admin", "invitado"));
        assertNotNull(resultado);
    }
}