
public class Funcionario {

    IAvaliacao avaliacao;
    AvaliacaoAdapter persistencia;

    public Funcionario() {
        avaliacao = new AvaliacaoSkill();
        persistencia = new AvaliacaoAdapter(avaliacao);
    }

    public void setAvaliacao(String skill) {
        avaliacao.setAvaliacao(skill);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    // Método apenas para mostrar que está convertendo skill para nota através do adaptador
    public float getNota() {
        return persistencia.getNota();
    }

}