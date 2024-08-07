package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	public Ferrari(){
		this(380);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 350;
	}
	
//	@Override
//	void acelerar() {
//		velocidade += 15;
//	}

}
