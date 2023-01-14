package Service;

import Entity.Zona;
import Interface.IZonaService;
import Repository.IZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ImpZonaService implements IZonaService {
    @Autowired
    IZonaRepository izonaRepository;

    @Override
    public List<Zona> getZona() {
        List <Zona> zona = izonaRepository.findAll();
        return zona;
    }

    @Override
    public void saveZona(Zona zona) {
        izonaRepository.save(zona);
    }

    @Override
    public void deleteZona(Integer id) {
        izonaRepository.deleteById(id);
    }

    @Override
    public Zona findZona(Long id) {
        return null;
    }

    @Override
    public Zona findZona(Integer id) {
        Zona zona = izonaRepository.findById(id).orElse(null);
        return zona;
    }
}
