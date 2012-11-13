package com.example.exemplojackson;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onTransformarEmJson(View v) {

		// --> Transformando um objeto Funcionario em JSON
		Funcionario funcionario01 = new Funcionario("João", "Rua tal", new Date(1988, 4, 3));
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println(mapper.writeValueAsString(funcionario01));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// <-- Transformando um objeto Funcionario em JSON


		// --> Transformando uma lista de Funcionarios em JSON
		Funcionario funcionario02 = new Funcionario("Maria", "Rua teste", new Date(1909, 2, 8));

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(funcionario01);
		funcionarios.add(funcionario02);
		try {
			System.out.println(mapper.writeValueAsString(funcionarios));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// <-- Transformando uma lista de Funcionarios em JSON


		// --> Transformando um objeto Pagamento em JSON
		Pagamento pagamento01 = new Pagamento(funcionario01, 100.0);
		try {
			System.out.println(mapper.writeValueAsString(pagamento01));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// <-- Transformando um objeto Pagamento em JSON

		// --> Transformando uma lista de pagamentos em JSON
		Pagamento pagamento02 = new Pagamento(funcionario02, 1560.3);
		List<Pagamento> pagamentos = new ArrayList<Pagamento>();
		pagamentos.add(pagamento01);
		pagamentos.add(pagamento02);
		try {
			System.out.println(mapper.writeValueAsString(pagamentos));
		} catch (Exception e) {
			e.printStackTrace();
		}
		// <-- Transformando um objeto Pagamento em JSON
	}

	public void onTransformarEmObjeto(View v) {

		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = "{\"dataNascimento\":60536862000000,\"endereco\":\"Rua tal\",\"nome\":\"João\"}";
			Funcionario funcionario = mapper.readValue(json, Funcionario.class);
			System.out.println("funcionario: " + funcionario.getNome());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
