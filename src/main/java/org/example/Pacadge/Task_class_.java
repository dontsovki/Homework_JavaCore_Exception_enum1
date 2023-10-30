package org.example.Pacadge;

public class Task_class_ {
    public enum Color{
        Red("ll"), Yelloo("65"), Blac("56"), Green("56");

        Color(String cod) {
            this.cod = cod;
        }

        private String cod;


        public String getCod(){
            return cod;
        }

    }
}
