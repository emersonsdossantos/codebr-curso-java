package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	Ferrari(){
		this(380);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 350;
	}
	
//	@Override
//	void acelerar() {
//		velocidade += 15;
//	}

}
