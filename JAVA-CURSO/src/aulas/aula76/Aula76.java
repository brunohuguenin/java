package aulas.aula76;

public class Aula76 {
    public static void main(String[] args) {

        String curso = "Curso ";
        String java = "Java";

        System.out.println(curso + java);

        String cursoJava = curso + java;

        System.out.println(cursoJava);

        String resultado2Com2 = "Resultado 2+2 = " + (2+2);
        System.out.println(resultado2Com2);

        String resultado2Com2_ = "Resultado 2+2 = " + 2+2;
        System.out.println(resultado2Com2_);

        String dez = String.valueOf(10);
        System.out.println(dez);

        String concatenacao = "Lorem ipsum dolor sit amet. Ab consectetur eligendi vel modi omnis ea possimus magnam insunt velit. " +
                "\nAut rerum accusamus sit minima consequatur non similique aliquam vel sequi nostrum." +
                "\nAb amet vero et consectetur illo vel totam sunt non quibusdam ipsa et aliquam illum!" +
                "\nId quia sint qui cupiditate natus qui galisum reiciendis et voluptate harum est maxime quia et ducimus" +
                "perferendis. \nEst neque laboriosam aut ipsum rerum eum dolorem voluptatem et error quia sed ipsa" +
                "veritatis! \nUt sint autem qui laborum quia sit consequatur tempore et blanditiis odio in architecto nemo.";

        System.out.println(concatenacao);

        String concatenacao2 = "Lorem ipsum dolor sit amet. Ab consectetur eligendi vel modi omnis ea possimus magnam in sunt velit.";
        concatenacao2 += "\nAut rerum accusamus sit minima consequatur non similique aliquam vel sequi nostrum.";
        concatenacao2 += "\nAb amet vero et consectetur illo vel totam sunt non quibusdam ipsa et aliquam illum!\n Id quia";
        concatenacao2 += "Id quia sint qui cupiditate natus qui galisum reiciendis et voluptate harum est maxime quia et ducimus perferendis";
        concatenacao2 += "Est neque laboriosam aut ipsum rerum eum dolorem voluptatem et error quia sed ipsa veritatis!";
        concatenacao2 += "Ut sint autem qui laborum quia sit consequatur tempore et blanditiis odio in architecto nemo.";
    }
}
