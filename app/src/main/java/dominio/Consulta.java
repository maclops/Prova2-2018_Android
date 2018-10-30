package dominio;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Consulta {

    @SerializedName("produto")
    @Expose
    private String produto;
    @SerializedName("valor")
    @Expose
    private String valor;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}
