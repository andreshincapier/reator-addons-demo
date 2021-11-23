package co.com.andreshincapier.mutants.mongodb;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Clase que representa la entidad de base de datos
 */
@Data
@Document(collection = "DNAAnalysis")
@NoArgsConstructor
class MutantsData {

    @Id
    private String id;
    private String type;
    private String dnaChain;
}
