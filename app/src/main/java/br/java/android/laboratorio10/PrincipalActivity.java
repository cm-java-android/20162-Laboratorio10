package br.java.android.laboratorio10;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class PrincipalActivity extends ListActivity {

    private List<Moto> motos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        motos = new ArrayList<Moto>();

        Moto moto = null;

        moto = new Moto();
        moto.setModelo("Honda Biz");
        moto.setAnoFabricacao(2015);
        moto.setAutonomia(42.5f);
        moto.setBairro("Botafogo");
        moto.setEndereco("Rua Dois");
        moto.setCapacidadeTanque(8.2f);
        moto.setCilindradas(100);
        moto.setQuilometragem(4000);
        moto.setUf("RJ");
        moto.setCidade("Rio de Janeiro");

        motos.add(moto);

        moto = new Moto();
        moto.setModelo("Honda CG");
        moto.setAnoFabricacao(2013);
        moto.setAutonomia(35.5f);
        moto.setBairro("Urca");
        moto.setEndereco("Rua da Urca");
        moto.setCapacidadeTanque(9.2f);
        moto.setCilindradas(150);
        moto.setQuilometragem(3000);
        moto.setUf("RJ");
        moto.setCidade("Rio de Janeiro");

        motos.add(moto);

        moto = new Moto();
        moto.setModelo("Yamaha DragStar");
        moto.setAnoFabricacao(2008);
        moto.setAutonomia(18.5f);
        moto.setBairro("Tijuca");
        moto.setEndereco("Rua Conde de Bonfim");
        moto.setCapacidadeTanque(15.2f);
        moto.setCilindradas(600);
        moto.setQuilometragem(34000);
        moto.setUf("RJ");
        moto.setCidade("Rio de Janeiro");

        motos.add(moto);

        moto = new Moto();
        moto.setModelo("Suzuki Yes");
        moto.setAnoFabricacao(2015);
        moto.setAutonomia(25.5f);
        moto.setBairro("Botafogo");
        moto.setEndereco("Rua B");
        moto.setCapacidadeTanque(7.2f);
        moto.setCilindradas(125);
        moto.setQuilometragem(43000);
        moto.setUf("RJ");
        moto.setCidade("Rio de Janeiro");

        motos.add(moto);

        moto = new Moto();
        moto.setModelo("Harley Davidson");
        moto.setAnoFabricacao(1960);
        moto.setAutonomia(15.5f);
        moto.setBairro("Flamengo");
        moto.setEndereco("Rua Dez");
        moto.setCapacidadeTanque(21.2f);
        moto.setCilindradas(1600);
        moto.setQuilometragem(45000);
        moto.setUf("RJ");
        moto.setCidade("Rio de Janeiro");

        motos.add(moto);

        moto = new Moto();
        moto.setModelo("Honda Biz");
        moto.setAnoFabricacao(2011);
        moto.setAutonomia(42.5f);
        moto.setBairro("Copacabana");
        moto.setEndereco("Rua Três");
        moto.setCapacidadeTanque(8.2f);
        moto.setCilindradas(100);
        moto.setQuilometragem(4000);
        moto.setUf("RJ");
        moto.setCidade("Rio de Janeiro");

        motos.add(moto); // Crie umas cinco motos

        setListAdapter(new ArrayAdapter<Moto>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, motos));

        getListView()
                .setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                Moto moto = motos.get(i);

                                Intent intent = new Intent(
                                        PrincipalActivity.this, // Contexto origem
                                        DetalheMotoActivity.class); // Destino
                                intent.putExtra("moto", moto);
                                startActivity(intent);
                            }
                        });
    }
}
