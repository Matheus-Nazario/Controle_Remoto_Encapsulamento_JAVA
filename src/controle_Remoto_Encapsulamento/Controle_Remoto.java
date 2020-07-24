package controle_Remoto_Encapsulamento;

class Controle_Remoto {

	public static void main(String[] args) {
	
		Estr_Controle_Remoto controle = new Estr_Controle_Remoto();
		
		controle.ligar();
		controle.play();
		
		controle.maisVolume();
		
		
		
		controle.fecharMenu();
	}

}
