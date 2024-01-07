public class Defanging_an_IP_Address_1108 {
    public String defangIPaddr(String address) {

        //Using replace(char characterToBeReplaced, char newChar) method to replace occurrence
        // of all the periods(.) with [.] in the String of given IP address
        // This method takes 2 arguments -> arg 1 = A character that will be replaced by the new character
        //                                   arg 2 = New character to replace the old character with
        return address.replace(".", "[.]");

    }
}
