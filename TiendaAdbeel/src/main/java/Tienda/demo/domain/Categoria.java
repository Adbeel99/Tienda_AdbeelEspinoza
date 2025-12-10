package Tienda.demo.domain;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
@SuppressWarnings("unused")
public class Categoria implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;

    @Column(unique = true, nullable = false, length = 50)
    private String descripcion;
    
    @Column(length = 1024)
    private String rutaImagen;
    
    @Column(name = "activo")
    private Boolean activo;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;
}