package sample;

public class Provjera {
    public Provjera(){}


    public boolean provjeriOdsjek(String n) {
        if(n.toUpperCase().equals("EE") || n.toUpperCase().equals("RI") || n.toUpperCase().equals("AE") || n.toUpperCase().equals("TK")) return true;
        return false;
    }

    public boolean provjeriGodine(String n) {
        if(n.toLowerCase().equals("prva") || n.toLowerCase().equals("druga") || n.toLowerCase().equals("treca")) return true;
        return false;
    }

    public boolean provjeriCiklus(String n) {
        if(n.toLowerCase().equals("bachelor") || n.toLowerCase().equals("master") || n.toLowerCase().equals("doktorski ciklus") || n.toLowerCase().equals("strucni studij")) return true;
        return false;
    }

    public boolean provjeriMail(String n) {
        if(n.length()>0 && n.contains("@")) return true;
        return false;
    }

    public boolean provjeriImePrezime(String s){
        if(s.length()<20 && s.length()>=1) return true;
        return false;
    }

    public boolean provjeriIndeks(String n) {
        if(n.length()>0 && n.length()<=5){
            try{
                Integer.parseInt(n);
            } catch (NumberFormatException e){
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean provjeriTelefon(String n) {
        if(n.length()==0) return true;
        if(n.length()==9){
            try{
                Long.parseLong(n);
            } catch (NumberFormatException e){
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean provjeriJMBG(String n) {
        int vel = n.length();
        if(vel == 13){
            try{
                Long.parseLong(n);
            } catch (NumberFormatException e){
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean provjeriDatumRodjenja(String n, String jmbg) {
        if(n.length() == 10) {
            String poredbe = n.substring(0, 2);
            poredbe += n.substring(3, 5);
            poredbe += n.substring(7, 10);

            if (jmbg.contains(poredbe)) return true;
        }
        return false;
    }

    public boolean provjeriAdresu(String n){
        return true;
    }
}
