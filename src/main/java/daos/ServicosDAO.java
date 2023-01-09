package daos;

import classesetc.Servicos;

import java.util.List;
import java.util.Optional;

public interface ServicosDAO {

    Servicos inserir(Servicos servicos);
    Servicos atualizar(Servicos servicos);

    void apagar (long id);
    List<Servicos> listarTudo();
    Optional<Servicos> listarPorID(long id);

}
