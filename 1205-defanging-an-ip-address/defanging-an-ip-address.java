class Solution {
    public String defangIPaddr(String address) {
        String new_add = address.replace(".", "[.]");  
        return new_add; 
    }
}