package Controller;

import Entity.Zona;
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
    public List<Zona> getZona() {
        return izonaService.getZona();
    }

    @PostMapping("/crear")
    public String createZona(@RequestBody Zona zona) {
        izonaService.saveZona(zona);
        return "La zona fue creada correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteZona(@PathVariable Integer id) {
        izonaService.deleteZona(id);
        return "La zona fue borrada correctamente";
    }

    //URL:PUERTO/zonas/editar/4/nombre & direccion & descripcion
    @PutMapping("/editar/{id}")
    public Zona editZona(@PathVariable Long id,
                         @RequestParam("nombre") String nuevoNombre,
                         @RequestParam("direccion") String nuevaDireccion,
                         @RequestParam("descripcion") String nuevaDescripcion) {
        Zona zona = izonaService.findZona(id);

        zona.setNombre(nuevoNombre);
        zona.setDescripcion(nuevaDescripcion);
        zona.setDireccion(nuevaDireccion);

        izonaService.saveZona(zona);
        return zona;
    }
}
