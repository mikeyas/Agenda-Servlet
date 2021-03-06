package Agenda;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private List <Pessoa> pessoas;
	
	public Agenda(){
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void addPessoa(Pessoa p){
		this.pessoas.add(p);
	}
	
	public void removePessoa(Pessoa p){
		this.pessoas.remove(p);
	}
	
	public Pessoa getContato(int index){
		return pessoas.get(index);
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Pessoa imprimeAgenda(){
		
		for(int i=0;i<pessoas.size(); i++){
			return pessoas.get(i);
		}
		return null;
	}
	
	
}
