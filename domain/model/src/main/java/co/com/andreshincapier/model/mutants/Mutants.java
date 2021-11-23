package co.com.andreshincapier.model.mutants;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Mutants {

    private String id;
    private String type;
    private String dnaChain;
}
