package daos;

import classesetc.Servicos;
import infra.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class ServicoDAO implements ServicosDAO{

    @Override
    public Servicos inserir(Servicos servicos) {

        try (Connection connection =  ConnectionFactory.getConnection()){
            String sql = ("insert into servico (nome, descricao, valor) values (?, ?, ?)");

            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, servicos.getNome());
            prepareStatement.setString(2, servicos.getDescricao());
            prepareStatement.setDouble(3, servicos.getValor());

            prepareStatement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return servicos;
    }

    @Override
    public Servicos atualizar(Servicos servicos) {
        return null;
    }

    @Override
    public void apagar(long id) {

    }

    @Override
    public List<Servicos> findALL() {
        return null;
    }

    @Override
    public Optional<Servicos> findById(long id) {
        return Optional.empty();
    }
}
