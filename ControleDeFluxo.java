public class ControleDeFluxo{
    public static void main(String [] args){
        int mes = 12;
        int dia = 2;
        int num = 6;

        if(mes == 1){
            System.out.println("Janeiro");
        } else if(mes == 2){
            System.out.println("Fevereiro");
        } else if(mes == 3){
            System.out.println("Marco");
        } else if(mes == 4){
            System.out.println("Abril");
        } else if(mes == 5){
            System.out.println("Maio");
        } else if(mes == 6){
            System.out.println("Junho");
        } else if(mes == 7){
            System.out.println("Julho");
        } else if(mes == 8){
            System.out.println("Agosto");
        } else if(mes == 9){
            System.out.println("Setembro");
        } else if(mes == 10){
            System.out.println("Outubro");
        } else if(mes == 11){
            System.out.println("Novembro");
        } else if(mes == 12){
            System.out.println("Dezembro");
        } else {
            System.out.println("Mes invalido");
        }

        if(mes == 7 || mes == 12 || mes == 1){
            System.out.println("Ferias");
        }

        switch(dia){
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda");
            break;
            case 3:
            System.out.println("Terca");
            break;
            case 4:
            System.out.println("Quarta");
            break;
            case 5:
            System.out.println("Quinta");
            break;
            case 6:
            System.out.println("Sexta");
            break;
            case 7:
            System.out.println("Sabado");
            break;
            default:
            System.out.println("Dia invalido");
            break;
        }

        switch(num){
            case 1:
            System.out.println("Certo");
            break;
            case 2:
            System.out.println("Certo");
            break;
            case 3:
            System.out.println("Certo");
            break;
            case 4:
            System.out.println("Errado");
            break;
            case 5:
            System.out.println("Talvez");
            break;
            default:
            System.out.println("Valor indefinido");
            break;
        }
    }
}