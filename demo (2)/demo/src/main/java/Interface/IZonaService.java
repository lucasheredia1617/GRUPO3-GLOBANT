package Interface;

import Entity.Zone;

import java.util.List;

public interface IZonaService {
    //Traer una lista de zonas
    public List<Zone> getZona();

    //Guardar un objeto de tipo Zona
    public void saveZona (Zone zone);

    //Eliminar un objeto pero lo buscamos por ID
    public void deleteZona (Integer id);

    //Buscar una zona por ID
    public Zone findZona (Long id);

    Zone findZona(Integer id);
}
