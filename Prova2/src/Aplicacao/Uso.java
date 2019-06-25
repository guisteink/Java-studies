package Aplicacao;

import java.io.*;
import java.util.*;

import codigos.Agenda;
import codigos.Data;
import codigos.Evento;
import codigos.Horario;
import codigos.Lembrete;
import codigos.Meta;
import codigos.Periodo;

public class Uso {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		Agenda itens_agenda = new Agenda();

		// ******* Estaticos pra teste *****
		// *************************************
		Horario hr1 = new Horario(13, 00);
		Horario hr2 = new Horario(13, 00);
		Data dt1 = new Data("02/05/2002");
		Data dt2 = new Data("02/05/2002");
		int prioridade2 = 4;
		String reg = "Aula de Estrutura de Dados", desc = "Arvores Binarias de Busca";
		Meta meta_1 = new Meta(prioridade2, hr1, hr2, dt1, dt2, reg, desc);
		// System.out.println(meta_1.toString());

		itens_agenda.insere(meta_1);

		Horario hr11 = new Horario(07, 00);
		Horario hr22 = new Horario(10, 30);
		Data dt11 = new Data("26/06/2022");
		Data dt22 = new Data("26/06/2022");
		String local2 = "Ceunes";
		String reg2 = "Aula de Programação Orientada a Objetos", desc2 = "Professor Henrique";
		Evento evento_1 = new Evento(local2, hr11, hr22, dt11, dt22, reg2, desc2);
		itens_agenda.insere(evento_1);
		// System.out.println(evento_1.toString());

		Horario hr111 = new Horario(18, 00);
		Horario hr222 = new Horario(13, 30);
		Data dt111 = new Data("26/06/2022");
		Data dt222 = new Data("22/05/2032"); // **************** evento nao deve ter data final menor
		Horario tempo_aviso = new Horario();
		String reg22 = "Jogo de futebol", desc22 = "Sao mateus";
		Lembrete lembrete_1 = new Lembrete(dt111,dt222,hr111,hr222,reg22,desc22,tempo_aviso);
		itens_agenda.insere(lembrete_1);
		
		
		Data datateste1 = new Data("20/05/1850");
		Data datateste2 = new Data("10/10/2500");
		System.out.println(itens_agenda.IntervaloDeData(datateste1, datateste2));
		
		
		 //System.out.println(itens_agenda.toString());

		//itens_agenda.remove(evento_1);

		// System.out.println(itens_agenda.toString());

		//System.out.println(itens_agenda.itensEventos());

		int menu = 1000;
		String registro, descricao;
		String local;
		int aviso_horas, aviso_min;
		int diaInicio, mesInicio, anoInicio;
		int diaFim, mesFim, anoFim;
		int hInicio, minInicio;
		int hFim, minFim;

		while (menu != 0) {
			System.out.println("\nDeseja inserir que tipo de item na agenda?\n");
			System.out.println("Meta (1)\nLembrete (2)\nEvento (3)\nSair (4)");
			menu = new Scanner(System.in).nextInt();

			// Registro e descricao do ItemAgenda
			System.out.println("Registre o titulo:\n");
			registro = new Scanner(System.in).next();
			System.out.println("Descrição da tarefa:\n");
			descricao = new Scanner(System.in).next();

			// Inicio do ItemAgenda
			System.out.println("Dados de inicio da tarefa!\nDia de inicio: ");
			diaInicio = new Scanner(System.in).nextInt();
			System.out.println("\tMes de inicio: ");
			mesInicio = new Scanner(System.in).nextInt();
			System.out.println("\tAno de inicio: ");
			anoInicio = new Scanner(System.in).nextInt();
			Data data_inicio = new Data(diaInicio, mesInicio, anoInicio);
			System.out.println("\nHora de inicio: ");
			hInicio = new Scanner(System.in).nextInt();
			System.out.println("\tMinutos de inicio: ");
			minInicio = new Scanner(System.in).nextInt();
			Horario hora_inicio = new Horario(hInicio, minInicio);

			// Fim do evento ItemAgenda
			System.out.println("Dados do fim da tarefa\nDia de fim: ");
			diaFim = new Scanner(System.in).nextInt();
			System.out.println("\tMes de fim: ");
			mesFim = new Scanner(System.in).nextInt();
			System.out.println("\tAno de fim: ");
			anoFim = new Scanner(System.in).nextInt();
			Data data_fim = new Data(diaFim, mesFim, anoFim);
			System.out.println("\nHora de fim: ");
			hFim = new Scanner(System.in).nextInt();
			System.out.println("\tMinutos de fim: ");
			minFim = new Scanner(System.in).nextInt();
			Horario hora_fim = new Horario(hFim, minFim);
			Periodo periodo = new Periodo(hora_inicio, hora_fim, data_inicio, data_fim);

			if (menu == 1) {
				System.out.println("Prioridade da meta: \n");
				int prioridade = new Scanner(System.in).nextInt();
				Meta _meta = new Meta(prioridade, hora_inicio, hora_fim, data_inicio, data_fim, registro, descricao);
				itens_agenda.insere(_meta);
				System.out.println("\n\nMeta inserida na agenda! \n");
			}
			if (menu == 2) {
				System.out.println("A tarefa começa em quanto tempo?\nHoras: ");
				aviso_horas = new Scanner(System.in).nextInt();
				System.out.println("\nMinutos: ");
				aviso_min = new Scanner(System.in).nextInt();
				Lembrete _lembrete = new Lembrete(periodo, registro, descricao, aviso_horas, aviso_min);
				itens_agenda.insere(_lembrete);
				System.out.println("\n\nLembrete inserido na agenda \n");
			}
			if (menu == 3) {
				System.out.println("Onde sera o evento? ");
				local = new Scanner(System.in).next();
				Evento _evento = new Evento(local, hora_inicio, hora_fim, data_inicio, data_fim, registro, descricao);
				itens_agenda.insere(_evento);
				System.out.println("\n\nEvento inserido na agenda!\n");
			}
		}
		menu = 8;
		while (menu != 0) {
			System.out.println("/n/nO que deseja fazer com a agenda?/n/n");
			System.out.println("(1) Mostrar todos os itens\n");
			System.out.println("(2) Mostrar todos os itens em um intervalo de datas\n");
			System.out.println("(3) Mostrar as metas (prioridade maior)\n");
			System.out.println("(4) Mostrar os lembretes (lembrete mais proximo)\n");
			System.out.println("(5) Mostrar eventos (ordem alfabética de locais)\n");
			System.out.println("(6) Salvar a agenda\n");
			System.out.println("(7) Recuperar a agenda\n");
			System.out.println("(0) Finalizar\n\n");
			menu = input.nextInt();

			if (menu == 1) {
				System.out.println("\n\nAgenda de tarefas!!!\n");
				System.out.println(itens_agenda.getAgenda().toString());
			}
			if (menu == 2) {
				System.out.println("Dados de inicio da tarefa!\nDia de inicio: ");
				diaInicio = new Scanner(System.in).nextInt();
				System.out.println("\tMes de inicio: ");
				mesInicio = new Scanner(System.in).nextInt();
				System.out.println("\tAno de inicio: ");
				anoInicio = new Scanner(System.in).nextInt();
				Data data_inicio = new Data(diaInicio, mesInicio, anoInicio);

				System.out.println("Dados do fim da tarefa\nDia de fim: ");
				diaFim = new Scanner(System.in).nextInt();
				System.out.println("\tMes de fim: ");
				mesFim = new Scanner(System.in).nextInt();
				System.out.println("\tAno de fim: ");
				anoFim = new Scanner(System.in).nextInt();
				Data data_fim = new Data(diaFim, mesFim, anoFim);

				Agenda _intervalo = new Agenda();
				_intervalo = (Agenda) itens_agenda.IntervaloDeData(data_inicio, data_fim);
				_intervalo.toString();

			}
			if (menu == 3) {
				Agenda _metas = new Agenda();
				_metas = (Agenda) itens_agenda.itensMetas();
				_metas.toString();
			}
			if (menu == 4) {
				Agenda _lembretes = new Agenda();
				_lembretes = (Agenda) itens_agenda.itensLembretes();
				_lembretes.toString();
			}
			if (menu == 5) {
				Agenda _eventos = new Agenda();
				_eventos = (Agenda) itens_agenda.itensEventos();
				_eventos.toString();
			}
			if (menu == 6) {
				try {
					BufferedWriter arqSaida;
					arqSaida = new BufferedWriter(new FileWriter("a.txt"));
					arqSaida.write(itens_agenda.toString() + "\r\n");
					arqSaida.close();

				} catch (FileNotFoundException e) {
					System.out.println("Arquivo não encontrado");
				} catch (IOException e) {
					System.out.println("Problemas na leitura ou gravação do arquivo");
				} catch (Exception e) {
					e.getMessage();
				}
			}

			if (menu == 7) {
				try {
					BufferedReader arqEnt;
					arqEnt = new BufferedReader(
							new FileReader("C:\\Users\\guilh\\eclipse-workspace\\Prova02\\agenda.txt"));
					int i;
					while ((i = arqEnt.read()) != -1)
						System.out.print((char) i);
					arqEnt.close();

				} catch (FileNotFoundException e) {
					System.out.println("Arquivo não encontrado");
				} catch (IOException e) {
					System.out.println("Problemas na leitura ou gravação do arquivo");
				} catch (Exception e) {
					e.getMessage();
				}
			}
		}
	}
}

