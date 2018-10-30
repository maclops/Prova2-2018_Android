package dominio;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiEndpoint {
    @GET("precos")
    Call<Consulta> obterProduto();
}
