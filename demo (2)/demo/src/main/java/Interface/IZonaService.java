package Interface;

import Entity.Zona;

import java.util.List;

public interface IZonaService {
    //Traer una lista de zonas
    public List<Zona> getZona();

    //Guardar un objeto de tipo Zona
    public void saveZona (Zona zona);

    //Eliminar un objeto pero lo buscamos por ID
    public void deleteZona (Integer id);

    //Buscar una zona por ID
    public Zona findZona (Long id);

    Zona findZona(Integer id);
}
