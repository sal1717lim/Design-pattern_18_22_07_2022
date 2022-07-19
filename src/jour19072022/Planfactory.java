package jour19072022;

public class Planfactory {
    public Plan getplan(String plan){
        if(plan.equals("Domestic")){
            return new Domesticplan();
        }else if(plan.equals("Commercial")){
            return new Commercialplan();

        } else if (plan.equals("Institutional")) {
            return new Institutionalplan();

        }else {
            return null;
        }
    }
}
