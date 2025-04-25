package estudosJava.generics;

public class Par<T, U> {
	private T primeiro;
	private U segundo;
	
	public Par(T primeiro, U segundo) {
		this.primeiro = primeiro;
		this.segundo = segundo;
	}
	
	 public T getPrimeiro() {
	     return primeiro;
	 }

	 public U getSegundo() {
	     return segundo;
	 }
	 
	 public void exibirPar() {
		 System.out.println("Par: (" + primeiro  + ", " + segundo + ")");
	 }
}
