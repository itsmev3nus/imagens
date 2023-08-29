class atividade{
   private String titulo, gerencia, entrada, impressão; 
   private int num;
     double saque, deposito, rendimento;
     public static int totalcontas;
        private double saldo;
              atividade(String titulo){
                this.titulo = titulo;

            }
            atividade(){
                this.totalcontas = this.totalcontas +1;
            }
        void deposito(double paradise){
                double finn = this.saldo + paradise;
                this.saldo = finn;

    }
        public double getSALDO(){
            return this.saldo;

        }
        public String getTitulo(){
            return this.titulo;

        }



}
 