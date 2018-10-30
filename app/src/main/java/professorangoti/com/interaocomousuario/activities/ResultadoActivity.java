package professorangoti.com.interaocomousuario.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dominio.ApiEndpoint;
import dominio.Consulta;
import professorangoti.com.interaocomousuario.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

/*        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://provaddm2018.atwebpages.com/precos")
                .addConverterFactory(GsonConverterFactory.create(gson)).build();
        ApiEndpoint apiService = retrofit.create(ApiEndpoint.class);
        Call<Consulta> call = apiService.obterProduto();

        call.enqueue(new Callback<Consulta>() {
            @Override
            public void onResponse(Call<Consulta> call, Response<Consulta> response) {

            }

            @Override
            public void onFailure(Call<Consulta> call, Throwable t) {

            }
        });
*/
    }


}
