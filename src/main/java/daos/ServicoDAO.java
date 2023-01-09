package daos;

import classesetc.Servicos;
import infra.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ServicoDAO implements ServicosDAO{

    @Override
    public Servicos inserir(Servicos servicos) {

        try (Connection connection =  ConnectionFactory.getConnection()){
            String sql = ("insert into servico (nome, descricao, valor) values (?, ?, ?)");

            PreparedStatement prepareStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepareStatement.setString(1, servicos.getNome());
            prepareStatement.setString(2, servicos.getDescricao());
            prepareStatement.setDouble(3, servicos.getValor());

            prepareStatement.executeUpdate();

            ResultSet resultSet = prepareStatement.getGeneratedKeys();
            resultSet.next();

            long generatedID = resultSet.getLong("id_servico");
            servicos.setId(generatedID);

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
    public List<Servicos> listarTudo() {

        String sql = "select id_servico, nome, descricao, valor from servico";

        List<Servicos> servico = new ArrayList<>();

        try (Connection connection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet result = preparedStatement.executeQuery();
            while(result.next()){
                long id = result.getLong("id_servico");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                double valor = result.getDouble("valor");

                Servicos servicos = new Servicos(id, nome, descricao, valor);
                servico.add(servicos);


            }

        }
        catch (SQLException ex){
            throw new RuntimeException(ex);
        }


        return servico;
    }

    @Override
    public Optional<Servicos> listarPorID(long id) {
        return Optional.empty();
    }
}
