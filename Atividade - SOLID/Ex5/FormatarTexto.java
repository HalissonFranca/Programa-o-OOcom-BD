package Ex5;

public abstract class FormatarTexto {
    public String formatar(Texto t) {
        if (t.getEstilo().equals("maiusculo")){
            return t.getTexto().toUpperCase();
        }else if (t.getEstilo().equals("negrito")){
            return "</b>" + t.getTexto() + "</b>";
        }
        return t.getTexto();
    }
}
