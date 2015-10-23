package criptografia.algoritmos;

public interface IEncryptor {

	public String[] encrypt(String mensajeEncriptar, String tipoAlgoritmo) throws Exception;

}
