package br.java.android.laboratorio10;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetalheMotoActivity extends Activity {

    private Moto detalhe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalhe_moto);

        detalhe = (Moto) getIntent().getExtras().getSerializable("moto");

        ((TextView)findViewById(R.id.modeloTextView)).setText(detalhe.getModelo());

        ((TextView)findViewById(R.id.modeloTextView))
                .setText(detalhe.getModelo());
        ((TextView)findViewById(R.id.cilindradasTextView))
                .setText(detalhe.getCilindradas() + " cc");
        ((TextView)findViewById(R.id.quilometragemTextView))
                .setText(detalhe.getQuilometragem() + " Km");
        ((TextView)findViewById(R.id.anoFabricacaoTextView))
                .setText("Fabricado em: " + detalhe.getAnoFabricacao());
        ((TextView)findViewById(R.id.autonomiaTextView))
                .setText(detalhe.getAutonomia() + " Km/l");
        ((TextView)findViewById(R.id.capacidadeTanqueTextView))
                .setText(detalhe.getCapacidadeTanque() + " litros");
        ((TextView)findViewById(R.id.enderecoTextView))
                .setText(detalhe.getEndereco());
        ((TextView)findViewById(R.id.bairroTextView))
                .setText(detalhe.getBairro());
        ((TextView)findViewById(R.id.cidadeTextView))
                .setText(detalhe.getCidade());
        ((TextView)findViewById(R.id.ufTextView)).setText(detalhe.getUf());

        ((TextView)findViewById(R.id.contatoTextView))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView email = (TextView) view;
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("plain/text");
                        intent.putExtra(Intent.EXTRA_EMAIL,
                                new String[] {email.getText().toString()});
                        intent.putExtra(Intent.EXTRA_SUBJECT,"Informações sobre a moto ID "
                                + detalhe.getId());
                        intent.putExtra(Intent.EXTRA_TEXT,"Gostaria de receber informações " +
                                "sobre a moto " + detalhe.getModelo());
                       startActivity(Intent.createChooser(intent,
                                "Escolha uma aplicação para enviar"));

                    }
                });

        ((TextView)findViewById(R.id.telefoneTextView))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView tel = (TextView) view;
                        Intent intent = new Intent(Intent.ACTION_CALL);
                        intent.setData(Uri.parse("tel:" + tel.getText().toString()));
                        startActivity(intent);
                    }
                });

        ((TextView)findViewById(R.id.maisInfoButton))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("http://developer.android.com"));
                        startActivity(intent);
                    }
                });
    }
}
