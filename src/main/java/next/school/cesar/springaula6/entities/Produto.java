package next.school.cesar.springaula6.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Produto {
   
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_produto;
    private String nome;
    private int quantidade;
    private double preco;
    private Categoria categoria;
}
