package tarefas.gui;

public class Tarefa {
	
	// ATRIBUTOS
	
	private int idTarefa; 
	private String nomeTarefa;
	private String descricaoTarefa;
	private String urgenciaTarefa;
	private String dificuldadeTarefa;
	private String tempoTarefa;
	
	static int proximoId = 1; // static cria o campo em uma classe e não em uma instância para permitir incrementar
	
	// GETTERS E SETTERS
	public String getNomeTarefa() {
		return nomeTarefa;
	}
	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}
	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}
	public void setDescricaoTarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}
	public String getUrgenciaTarefa() {
		return urgenciaTarefa;
	}
	public void setUrgenciaTarefa(String urgenciaTarefa) {
		this.urgenciaTarefa = urgenciaTarefa;
	}
	public String getDificuldadeTarefa() {
		return dificuldadeTarefa;
	}
	public void setDificuldadeTarefa(String dificuldadeTarefa) {
		this.dificuldadeTarefa = dificuldadeTarefa;
	}
	public String getTempoTarefa() {
		return tempoTarefa;
	}
	public void setTempoTarefa(String tempoTarefa) {
		this.tempoTarefa = tempoTarefa;
	}
	public int getIdTarefa() {
		return idTarefa;
	}
	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
	}
	
	
	// CONSTRUTORES
	public Tarefa() {
		this.idTarefa = proximoId();
	}
	
	public Tarefa(String nomeTarefa, String descricaoTarefa, String urgenciaTarefa,
			String dificuldadeTarefa, String tempoTarefa) {
		super();
		this.idTarefa = proximoId();
		this.nomeTarefa = nomeTarefa;
		this.descricaoTarefa = descricaoTarefa;
		this.urgenciaTarefa = urgenciaTarefa;
		this.dificuldadeTarefa = dificuldadeTarefa;
		this.tempoTarefa = tempoTarefa; 
	}
	
	// MÉTODOS	
	private static int proximoId() {
		return proximoId++;
	}
	
	// Aparecer apenas o nomeTarefa do objeto na Jlist
	@Override
	public String toString(){
		return getNomeTarefa();
	}
	
	
	
	

}

