package family;

public class Familytest {
    public static void main(String[] args) {
        Family a =new Family();
        Address aAddress=new Address();

        a.name="sanjay";
        aAddress.streetname="nehru nagar";
        aAddress.city="suryapet";
        aAddress.flatno="302";
        aAddress.pincode=508213;
        aAddress.country="india";


        Family [] akid=new Family[2];

        Family akid1=new Family();

        akid1.name="ram";
        Address baddress=new Address();
        baddress.streetname="sri sri nagar";
        baddress.city="suryapet";
        baddress.flatno="565";
        baddress.pincode=244355;
        baddress.country="india";




        Family akid2=new Family();

        akid2.name="ramya";
        Address caddress=new Address();
        caddress.streetname="lb nagar";
        caddress.city="hyd";
        caddress.flatno="887";
        caddress.pincode=887755;
        caddress.country="india";


        System.out.println(a.name);
        System.out.println(aAddress.streetname);
        System.out.println(aAddress.city);
        System.out.println(aAddress.flatno);
        System.out.println(aAddress.pincode);
        System.out.println(aAddress.country);


        System.out.println(akid1.name);
        System.out.println(baddress.streetname);
        System.out.println(baddress.city);
        System.out.println(baddress.flatno);
        System.out.println(baddress.pincode);
        System.out.println(baddress.country);


        System.out.println(akid2.name);
        System.out.println(caddress.streetname);
        System.out.println(caddress.city);
        System.out.println(caddress.flatno);
        System.out.println(caddress.pincode);
        System.out.println(caddress.country);






    }

}
