package Service;

import Entity.Administrator;
import Interface.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Repository.TurnPointRepository;

import java.util.List;

@Service


public class AdminServiceImpl implements IAdminService {
    Administrator admin = new Administrator(2,"Matias");

    @Autowired
    TurnPointRepository repository;

    @Override
    public Administrator saveAdmin(Administrator admin) {
        return repository.save(admin);
    }

    @Override
    public List<Administrator> listAdmin() {
        return listAdmin();
    }

    @Override
    public Administrator updateAdmin(Administrator admin, Long document) {
        return null;
    }

    @Override
    public void deleteAdmin(Long document) {
    }

}

