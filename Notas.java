
    package notas;

    import javax.swing.JOptionPane;

    public class Notas {


        public static void main(String[] args) {
            
       
           String nome= JOptionPane.showInputDialog(null,"Digite o nome do aluno","Boletim",-1);
           String x= JOptionPane.showInputDialog(null,"Digite a primeira nota","Boletim",-1);
            int n1= Integer.parseInt(x);
            
         
            x= JOptionPane.showInputDialog(null,"Digite a primeira nota","Boletim",-1);
            int n2= Integer.parseInt(x);
            x=JOptionPane.showInputDialog(null,"Digite a terceira nota","Boletim",-1);
            int n3= Integer.parseInt(x);
           double media=(n1+n2+n3)/3;
                    if(media>6){
            JOptionPane.showMessageDialog(null,"Você passou!","Boletim",-1);

        }else{
        JOptionPane.showMessageDialog(null,"Reprovado","Boletim",-1);
    }

        }
    }
