package entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "libros")
@Getter
@Setter
@NamedQueries({
        @NamedQuery(name = "Libro.All",
                query = "SELECT l FROM Libro l")
})
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "titulo", length = 100, nullable = false)
    private String titulo;
    private int anioPublicacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
