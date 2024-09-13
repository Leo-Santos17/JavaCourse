package poo;

public class Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	// Relação Bidirecional
	Carro carro;
	Motor(Carro carro)
	{
		this.carro = carro;
	}
	
	int giros() 
	{
		if(!ligado)
		{
			return 0;
		}
		else {
			return (int) Math.round(fatorInjecao*3000);
		}
	}
}
