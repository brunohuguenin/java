package aulas.aula36.teste;

import aulas.aula36.dominio.Contato;
import aulas.aula36.dominio.Endereco;
import aulas.aula36.dominio.Telefone;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Robervaldo da Costa Pinto");
        //contato.setEndereco("Logo ali com a esquina Já tá Perto");
        //contato.setTelefone("21 4002-8922");

        // Criar o objeto Endereco
        Endereco end = new Endereco();
        end.setNomeRua("Tá chegando com a Travessa Me Perdi");
        end.setNumero("n/a");
        end.setComplemento(" - ");
        end.setCidade("Albãnia");
        end.setEstado("Xique-Xique");
        end.setCep("258-365");

        contato.setEndereco(end);


        // Criar o objeto Telefone
        Telefone phone = new Telefone();
        phone.setNumero("7777-6666");
        phone.setDdd("21");
        phone.setTipo("Telemóvel");

        Telefone phone2 = new Telefone();
        phone2.setNumero("9857-5555");
        phone2.setDdd("11");
        phone2.setTipo("SmartPhone Android");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = phone;
        telefones[1] = phone2;

        contato.setTelefones(telefones);

        System.out.println(end);
        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.printf("Estado: %s - Cidade: %s%n", contato.getEndereco().getEstado(),
                    contato.getEndereco().getCidade());
        }

//        if (contato != null &&  contato.getTelefone() != null) {
//            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero()
//                    + " " + contato.getTelefone().getTipo());
//        }

        if (contato != null && contato.getTelefones() != null){
            for (Telefone tel : contato.getTelefones()) {
                System.out.println(tel.getDdd() + " " + tel.getNumero()
                  + " " + tel.getTipo());
            }
        }
    }
}
