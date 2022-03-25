package com.projetofinal.projetofinal;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class Controlador {

	@Autowired
	ContaRepositorio contaRepositorio;

	private GerenciaContas gerenciaContas = new GerenciaContas();

	Controlador(ContaRepositorio contaRepositorio) {
		this.contaRepositorio = contaRepositorio;

		List<ContaEntidade> contas = contaRepositorio.findAll();
		for (ContaEntidade conta : contas) {
			System.out.println(conta.getNumero());

			if (conta.getTipo().equals("Conta Corrente")) {
				gerenciaContas.criarContaCorrente(conta.getNumero());
			} else {
				gerenciaContas.criarContaEspecial(conta.getNumero(), conta.getLimite());
			}
		}
	};

	@PostMapping("/")
	public String conta(
			@RequestParam(value = "tipo") String tipo,
			@RequestParam(value = "limite") double limite) {

		ContaEntidade conta = new ContaEntidade();
		Long ultimoId;

		switch (tipo) {
			case "corrente":

				try {
					ultimoId = gerenciaContas.pegarUltimo().getNumero() != null
							? gerenciaContas.pegarUltimo().getNumero()
							: 0;
					conta = contaRepositorio.save(new ContaEntidade(ultimoId, "corrente", 0));
					gerenciaContas.criarContaCorrente(conta.getId());

				} catch (Exception e) {
					return "Erro ao criar conta corrente";

				}
				break;

			case "especial":

				try {
					ultimoId = gerenciaContas.pegarUltimo().getNumero() != null 
						? gerenciaContas.pegarUltimo().getNumero() 
						: 0;
					conta = contaRepositorio.save(new ContaEntidade(ultimoId, "especial", limite));

					gerenciaContas.criarContaEspecial(
							conta.getId(),
							conta.getLimite());

				} catch (Exception e) {
					return "Erro ao criar conta especial";
				}

				break;

			default:
				return "Tipo de conta inválido selecione uma das sequinte {corrente, especial}";

		}

		return "Conta adicionada com sucesso";
	}

	@PostMapping("/deposito")
	public String deposito(
			@RequestParam(value = "numero") Long numero,
			@RequestParam(value = "valor") double valor) {

		int depositoResultado = gerenciaContas.depositar(numero, valor);
		if (depositoResultado > 0) {

			try {
				Optional<ContaEntidade> contaDados = this.contaRepositorio.findById(numero);
				if (contaDados.isPresent()) {
					ContaEntidade conta = contaDados.get();
					conta.setSaldo(conta.getSaldo() + valor);
					contaRepositorio.save(conta);
				}
				;

			} catch (Exception e) {
				return "Erro ao depositar";
			}

			return "Depósito realizado com sucesso";
		}

		return "Conta não encontrada!";
	};

	@PostMapping("/saque")
	public String saque(
			@RequestParam(value = "numero") Long numero,
			@RequestParam(value = "valor") double valor) {

		int saqueResultado = gerenciaContas.sacar(numero, valor);

		if (saqueResultado == 1) {

			try {
				Optional<ContaEntidade> contaDados = this.contaRepositorio.findById(numero);
				if (contaDados.isPresent()) {
					ContaEntidade conta = contaDados.get();
					conta.setSaldo(conta.getSaldo() - valor);
					contaRepositorio.save(conta);
				}
				;

			} catch (Exception e) {
				return "Erro ao sacar";
			}

			return "Saque realizado com sucesso";
		}
		if (saqueResultado == 0)
			return "Saque insuficiente";

		return "Conta inexistente!";
	};

	@GetMapping("/consulta")
	public String consulta(
			@RequestParam(value = "numero") Long numero) {

		double saldo = gerenciaContas.pegarSaldo(numero);

		if (saldo >= 0) {
			return "Saldo da conta Nº " + numero + ": " + saldo;
		}

		return "Conta Nº " + numero + " não encontrada";

	};

	@GetMapping("/list")
	public String lista() {
		return gerenciaContas.listarContas();

	};
}
