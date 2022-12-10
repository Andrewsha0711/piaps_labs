package piaps_lab6;

public class Faculty implements Observer {
        public String info;

        public Faculty() {
                this.info = "";
        }

        @Override
        public void update(Object object) {
                // TODO Auto-generated method stub
                if (object instanceof String) {
                        this.info += "\n" + (String) object;
                }
        }
}
