package Service;

import Entity.Administrator;
import Interface.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Repository.TurnPointRepository;

import java.util.List;

@Service


public class AdminServiceImpl implements IAdminService {
    @Autowired
    TurnPointRepository repository;

    @Override
    public Administrator saveAdmin(Administrator admin) {
        return repository.save(admin);
    }

    @Override
    public List<Administrator> listAdmin() {
        return null;
    }

    @Override
    public Administrator updateAdmin(Administrator admin, Long document) {
        return null;
    }

    @Override
    public void deleteAdmin(Long document) {
    }

}

