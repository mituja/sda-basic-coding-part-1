package com.sda.vipuser;

public class VIPUser extends User {
    public VIPUser(String name, String lastName, String email, Integer vipCardNumber) {
        super(name, lastName, email);
        setVipCardNumber(vipCardNumber);

    }

    private Integer vipCardNumber;

    public Integer getVipCardNumber() {
        return vipCardNumber;
    }

    public void setVipCardNumber(Integer vipCardNumber) {
        if (checkCard(vipCardNumber)) {
            this.vipCardNumber = vipCardNumber;
        } else{
            this.vipCardNumber = null;
        }
    }

    private boolean checkCard(Integer vipCardNumber) {
        return vipCardNumber > 999 && vipCardNumber % 2 == 0;
    }

    @Override
    public String toString() {
        return super.toString() + "VIPUser{" +          //super.toString() wywołuje metode z klasy user, gdzie wrzucamy do stringa imie, nazwisko, emial
                "vipCardNumber=" + vipCardNumber +
                '}';
    }

    public static void main(String[] args) {
        VIPUser vipUser = new VIPUser("john", "doe", "email", 2344);
        System.out.println(vipUser);
    }
}
