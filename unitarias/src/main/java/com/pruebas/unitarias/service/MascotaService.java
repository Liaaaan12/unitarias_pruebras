package com.pruebas.unitarias.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.unitarias.model.Mascota;
import com.pruebas.unitarias.repository.MascotaRpository;

@Service
public class MascotaService {
@Autowired
private MascotaRpository mascotaRpository;

public Mascota guardarMascota(Mascota mascota) {
    return mascotaRpository.save(mascota);
    
}

public List<Mascota> listarMascotas() {
    return mascotaRpository.findAll();
}

public Optional<Mascota> obtenerMascotaPorId(Long id) {
    return mascotaRpository.findById(id);
}

public Mascota actualizarMascota(Long id, Mascota mascotaActualizada) {
    if (mascotaRpository.existsById(id)) {
        mascotaActualizada.setId(id);
        return mascotaRpository.save(mascotaActualizada);
    }
    return null; // O lanzar una excepción si no se encuentra la mascota
}

public void eliminarMascota(Long id) {
    mascotaRpository.existsById(id);
// O lanzar una excepci
}
}

