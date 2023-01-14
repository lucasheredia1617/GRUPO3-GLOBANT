package Interface;

import Entity.Administrator;

import java.util.List;

public interface IAdminService {

    Administrator saveAdmin(Administrator admin);

    List<Administrator> listAdmin();

    Administrator updateAdmin(Administrator admin, Long document);

    void deleteAdmin(Long document);
}

