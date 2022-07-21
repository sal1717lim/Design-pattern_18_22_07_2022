package jour21072022.Observer;

public class EmailListener implements Event{
    public String name;

    public EmailListener(String name) {
        this.name = name;
    }

    @Override


    public void update(String fileEvent) {
        if (fileEvent.equals("Ouverture")){
            System.out.println(this.name+":ouverture de Mail");
        }else if(fileEvent.equals("Save")){
            System.out.println(this.name+":Save Mail");
        }
    }
}
