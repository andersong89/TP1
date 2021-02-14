import java.util.Scanner;

public class Meses {

	public static void main() {

		int mes,ano,i,temperatura=0,contadormenor=99999,contmaior=0,j=0,l=0;
		double contadormedia=0;
		System.out.println("Escreva o ano das temperaturas aferidas ");
		Scanner sc = new Scanner(System.in);
		ano = sc.nextInt();

		if(ano<=2020 && ano>=2012) {

			System.out.println("Escreva o mes: ");
			mes = sc.nextInt();

			switch(mes) {

			case 1: 

				GerarNumeros n = new GerarNumeros();
				n.main();

				break;

			case 2:

				if(ano == 2012 || ano == 2016 || ano== 2020) {
					System.out.println("Insira as temperaturas: ");
					for(i=0;i<5;i++) {
						temperatura= sc.nextInt();
						contadormedia=contadormedia + temperatura;
						if(contadormenor>temperatura) {
							contadormenor=temperatura;
							j++;

						}

						if(contmaior<temperatura) {
							contmaior=temperatura;
							l++;
						}

					}

					System.out.println("A media das temperaturas em fevereiro e  "+ contadormedia/5+" graus");
					System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/2/"+ano);
					System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/2/"+ano);
				}	

				else {
					System.out.println("Insira as temperaturas: ");
					for(i=0;i<4;i++) {
						temperatura= sc.nextInt();
						contadormedia=contadormedia + temperatura;
						if(contadormenor>temperatura) {
							contadormenor=temperatura;
							j++;

						}

						if(contmaior<temperatura) {
							contmaior=temperatura;
							l++;
						}

					}

					System.out.println("A media das temperaturas em fevereiro e  "+ contadormedia/4+" graus");
					System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/2/"+ano);
					System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/2/"+ano);
				}	


				break;

			case 3:

				System.out.println("Insira as temperaturas: ");
				for(i=0;i<5;i++) {
					temperatura= sc.nextInt();
					contadormedia=contadormedia + temperatura;
					if(contadormenor>temperatura) {
						contadormenor=temperatura;
						j++;

					}

					if(contmaior<temperatura) {
						contmaior=temperatura;
						l++;
					}

				}

				System.out.println("A media das temperaturas em março e  "+ contadormedia/5+" graus");
				System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/3/"+ano);
				System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/3/"+ano);

				break;

			case 4:

				System.out.println("Insira as temperaturas: ");
				for(i=0;i<5;i++) {
					temperatura= sc.nextInt();
					contadormedia=contadormedia + temperatura;
					if(contadormenor>temperatura) {
						contadormenor=temperatura;
						j++;

					}

					if(contmaior<temperatura) {
						contmaior=temperatura;
						l++;
					}

				}

				System.out.println("A media das temperaturas em abril e  "+ contadormedia/5+" graus");
				System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/4/"+ano);
				System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/4/"+ano);

				break;

			case 5:

				System.out.println("Insira as temperaturas: ");
				for(i=0;i<5;i++) {
					temperatura= sc.nextInt();
					contadormedia=contadormedia + temperatura;
					if(contadormenor>temperatura) {
						contadormenor=temperatura;
						j++;

					}

					if(contmaior<temperatura) {
						contmaior=temperatura;
						l++;
					}

				}

				System.out.println("A media das temperaturas em maio e  "+ contadormedia/5+" graus");
				System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/5/"+ano);
				System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/5/"+ano);

				break;

			case 6:

				System.out.println("Insira as temperaturas: ");
				for(i=0;i<5;i++) {
					temperatura= sc.nextInt();
					contadormedia=contadormedia + temperatura;
					if(contadormenor>temperatura) {
						contadormenor=temperatura;
						j++;

					}

					if(contmaior<temperatura) {
						contmaior=temperatura;
						l++;
					}

				}

				System.out.println("A media das temperaturas em junho e  "+ contadormedia/5+" graus");
				System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/6/"+ano);
				System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/6/"+ano);

				break;


			case 7:

				System.out.println("Insira as temperaturas: ");
				for(i=0;i<5;i++) {
					temperatura= sc.nextInt();
					contadormedia=contadormedia + temperatura;
					if(contadormenor>temperatura) {
						contadormenor=temperatura;
						j++;

					}

					if(contmaior<temperatura) {
						contmaior=temperatura;
						l++;
					}

				}

				System.out.println("A media das temperaturas em julho e  "+ contadormedia/5+" graus");
				System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/7/"+ano);
				System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/7/"+ano);

				break;

			case 8:

				System.out.println("Insira as temperaturas: ");
				for(i=0;i<5;i++) {
					temperatura= sc.nextInt();
					contadormedia=contadormedia + temperatura;
					if(contadormenor>temperatura) {
						contadormenor=temperatura;
						j++;

					}

					if(contmaior<temperatura) {
						contmaior=temperatura;
						l++;
					}

				}

				System.out.println("A media das temperaturas em Agosto e  "+ contadormedia/5+" graus");
				System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/8/"+ano);
				System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/8/"+ano);

				break;

			case 9:

				System.out.println("Insira as temperaturas: ");
				for(i=0;i<5;i++) {
					temperatura= sc.nextInt();
					contadormedia=contadormedia + temperatura;
					if(contadormenor>temperatura) {
						contadormenor=temperatura;
						j++;

					}

					if(contmaior<temperatura) {
						contmaior=temperatura;
						l++;
					}

				}

				System.out.println("A media das temperaturas em Setembro e  "+ contadormedia/5+" graus");
				System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/9/"+ano);
				System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/9/"+ano);

				break;

			case 10:

				System.out.println("Insira as temperaturas: ");
				for(i=0;i<5;i++) {
					temperatura= sc.nextInt();
					contadormedia=contadormedia + temperatura;
					if(contadormenor>temperatura) {
						contadormenor=temperatura;
						j++;

					}

					if(contmaior<temperatura) {
						contmaior=temperatura;
						l++;
					}

				}

				System.out.println("A media das temperaturas em Outubro e  "+ contadormedia/5+" graus");
				System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/10/"+ano);
				System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/10/"+ano);

				break;

			case 11:

				System.out.println("Insira as temperaturas: ");
				for(i=0;i<5;i++) {
					temperatura= sc.nextInt();
					contadormedia=contadormedia + temperatura;
					if(contadormenor>temperatura) {
						contadormenor=temperatura;
						j++;

					}

					if(contmaior<temperatura) {
						contmaior=temperatura;
						l++;
					}

				}

				System.out.println("A media das temperaturas em Novembro e  "+ contadormedia/5+" graus");
				System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/11/"+ano);
				System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/11/"+ano);

				break;

			case 12:

				System.out.println("Insira as temperaturas: ");
				for(i=0;i<5;i++) {
					temperatura= sc.nextInt();
					contadormedia=contadormedia + temperatura;
					if(contadormenor>temperatura) {
						contadormenor=temperatura;
						j++;

					}

					if(contmaior<temperatura) {
						contmaior=temperatura;
						l++;
					}

				}

				System.out.println("A media das temperaturas em Dezembro e  "+ contadormedia/5+" graus");
				System.out.println("A menor temperatura do mes foi "+contadormenor+" graus no dia " +j+"/12/"+ano);
				System.out.println("A Maior temperatura do mes foi "+contmaior+" graus no dia " +l+"/12/"+ano);

				break;

			default:
				System.out.println("Digite SOMENTE números entre 1 e 12");

				break;

			}
		}
		else {
			System.out.println("Ano invalido digite novamente : ");
			ano = sc.nextInt();
		}

	}
}
