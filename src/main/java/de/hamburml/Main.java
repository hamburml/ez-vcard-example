package de.hamburml;

import ezvcard.Ezvcard;
import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.property.StructuredName;

public class Main {

    public static void main(String[] args) {

        StructuredName name = new StructuredName();
        name.setGiven("hamb");
        name.setFamily("urml");

        VCard vcard = new VCard(VCardVersion.V2_1);
        vcard.setStructuredName(name);
        vcard.setFormattedName("hamburml");

        vcard.addNote("THISIS\nNOTE");

        System.out.println(Ezvcard.write(vcard).version(VCardVersion.V2_1).go());

    }
}