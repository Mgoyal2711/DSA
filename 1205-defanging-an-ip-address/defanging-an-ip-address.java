class Solution {
    public String defangIPaddr(String address) {
        String adress2 = address.replace(".","[.]");
        return adress2;
    }
}