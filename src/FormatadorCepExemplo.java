public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatadp = formatarCep("2376506");
            System.out.println(cepFormatadp);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com as regras de megócio");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}