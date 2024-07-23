package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

    public void copiar() {
        System.out.println("Equipamento Multifuncional: COPIANDO.");
        
    }

    public void digitalizar() {
        System.out.println("Equipamento Multifuncional: DIGITALIZANDO.");
        
    }

    public void imprimir() {
        System.out.println("Equipamento Multifuncional: IMPRIMINDO.");
        
    }
    
}
