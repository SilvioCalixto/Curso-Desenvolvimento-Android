package devandroid.silvio.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.silvio.applistacurso.R;
import devandroid.silvio.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        // Atribuir conteúdo, dados, valores para o Objeto
        // Conforme o seu MODELO, Template
        pessoa.setPrimeiroNome("Silvio");
        pessoa.setSobreNome("Calixto");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("1-961077860");

    }
}