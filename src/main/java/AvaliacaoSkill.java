public class AvaliacaoSkill implements IAvaliacao {

    private String skill;

    @Override
    public String getAvaliacao() {
        return this.skill;
    }

    @Override
    public void setAvaliacao(String skill) {
        this.skill = skill;
    }
}
