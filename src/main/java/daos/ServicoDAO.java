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
        try (Connection connection =  ConnectionFactory.getConnection()){
            String sql = ("update servico set nome = ?, descricao= ?, valor= ? where id_servico = ?");

            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setString(1, servicos.getNome());
            prepareStatement.setString(2, servicos.getDescricao());
            prepareStatement.setDouble(3, servicos.getValor());
            prepareStatement.setLong(4, servicos.getId());

            prepareStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return servicos;
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
        String sql = "select id_servico, nome, descricao, valor from servico where id_servico = ?";

        Servicos servicos = null;
        try (Connection connection = ConnectionFactory.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, id);

            ResultSet result = preparedStatement.executeQuery();
            while(result.next()){
                long pk = result.getLong("id_servico");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                double valor = result.getDouble("valor");

                servicos = new Servicos(pk, nome, descricao, valor);


            }

        }
        catch (SQLException ex){
            throw new RuntimeException(ex);
        }


        return Optional.ofNullable(servicos);
    }
}
