

public class AvaliacaoAdapter extends AvaliacaoNota {

    private IAvaliacao avaliacaoSkill;

    public AvaliacaoAdapter(IAvaliacao avaliacaoSkill) {
        this.avaliacaoSkill = avaliacaoSkill;
    }

    public String recuperarAvaliacao() {
        if (this.getNota() >= 9.0f)
            avaliacaoSkill.setAvaliacao("LIDER");
        else
        if (this.getNota() >= 8.0f)
            avaliacaoSkill.setAvaliacao("SENIOR");
        else
        if (this.getNota() >= 7.0f)
            avaliacaoSkill.setAvaliacao("PLENO");
        else
            avaliacaoSkill.setAvaliacao("JUNIOR");
        return avaliacaoSkill.getAvaliacao();
    }

    public void salvarAvaliacao() {
        if (avaliacaoSkill.getAvaliacao().equals("LIDER"))
            this.setNota(9.0f);
        else
        if (avaliacaoSkill.getAvaliacao().equals("SENIOR"))
            this.setNota(8.0f);
        else
        if (avaliacaoSkill.getAvaliacao().equals("PLENO"))
            this.setNota(7.0f);
        else
            this.setNota(0.0f);
    }
}
