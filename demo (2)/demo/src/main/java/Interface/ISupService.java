package Interface;

import Entity.Supervisor;

import java.util.List;

public interface ISupService {

    Supervisor saveSup(Supervisor sup);

    List<Supervisor> listSup();

    Supervisor updateSup(Supervisor sup, Long document);

    void deleteSup(Long document);

}
