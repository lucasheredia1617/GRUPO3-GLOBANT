package Service;

import Entity.Supervisor;
import Interface.ISupService;
import Repository.SupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Repository.TurnPointRepository;

import java.util.List;

@Service

public class SupServiceImpl implements ISupService {

    @Autowired
    SupRepository repository;

    @Override
    public Supervisor saveSup(Supervisor sup) {
        return repository.save(sup);
    }

    @Override
    public List<Supervisor> listSup() {
        return null;
    }

    @Override
    public Supervisor updateSup(Supervisor sup, Long document) {
        return null;
    }

    @Override
    public void deleteSup(Long document) {

    }
}
