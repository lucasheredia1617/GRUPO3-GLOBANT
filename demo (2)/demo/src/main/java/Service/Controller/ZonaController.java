package Service.Controller;

import Entity.Zone;
import Interface.IZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("localhost:8080/zonas")
public class ZonaController {
    @Autowired
    IZonaService izonaService;

    @GetMapping("/traer")
    public List<Zone> getZona() {
        return izonaService.getZona();
    }

    @PostMapping("/crear")
    public String createZona(@RequestBody Zone zone) {
        izonaService.saveZona(zone);
        return "La zona fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteZona(@PathVariable Integer id) {
        izonaService.deleteZona(id);
        return "La zona fue borrada correctamente";
    }

    //URL:PUERTO/zonas/editar/4/nombre & direccion & descripcion
    @PutMapping("/editar/{id}")
    public Zone editZona(@PathVariable Long id,
                         @RequestParam("nombre") String nuevoNombre,
                         @RequestParam("direccion") String nuevaDireccion,
                         @RequestParam("descripcion") String nuevaDescripcion) {
        Zone zone = izonaService.findZona(id);

        zone.setNombre(nuevoNombre);
        zone.setDescripcion(nuevaDescripcion);
        zone.setDireccion(nuevaDireccion);

        izonaService.saveZona(zone);
        return zone;
    }
}
