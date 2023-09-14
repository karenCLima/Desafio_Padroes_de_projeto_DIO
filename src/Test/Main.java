package Test;

import Facade.Facade;
import Singleton.SingletonEager;
import Singleton.SingletonHolder;
import Singleton.SingletonLazy;
import Strategy.Comportamento;
import Strategy.ComportamentoAgressivo;
import Strategy.ComportamentoDefensivo;
import Strategy.ComportamentoNormal;
import Strategy.Robo;

public class Main {

	public static void main(String[] args) {
		// Singleton
		SingletonLazy singletonLazy = SingletonLazy.getInstance();
		System.out.println(singletonLazy);
		
		SingletonEager singletonEager = SingletonEager.getInstance();
		System.out.println(singletonEager);
		
		SingletonHolder singletonHolder = SingletonHolder.getInstance();
		System.out.println(singletonHolder);
		
		//Strategy
		Robo robo = new Robo();
		Comportamento comportamentoNormal = new ComportamentoNormal();
		Comportamento comportamentoDefensivo = new ComportamentoDefensivo();
		Comportamento comportamentoAgressivo = new ComportamentoAgressivo();
		
		robo.setComportamento(comportamentoDefensivo);
		robo.mover();
		robo.setComportamento(comportamentoNormal);
		robo.mover();
		robo.setComportamento(comportamentoAgressivo);
		robo.mover();
		
		//Facade
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");

	}

}
