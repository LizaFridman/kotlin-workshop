package day1.lecture2.exercises

/**
 * Fill in the functions below
 */
fun main() {
    //Uncomment when done
    assert(returnLastNameWithIf("Hadas") == "Peled")
    assert(returnLastNameWithIf("Gil") == "Unknown")

    assert(returnLastNameWithWhenStatment("Hadas") == "Peled")
    assert(returnLastNameWithWhenStatment("Gil") == "Goldzweig")
    assert(returnLastNameWithWhenStatment("Eden") == "Bugdary")
   assert(returnLastNameWithWhenStatment("Refael") == "Unknown")
    //Uncomment when done
}

/**
 * return the person last name using an [if] expression based on first name
 *
 * @return "Peled" if first name is "Hadas"
 * @return "Unknown" if anything else
 */
fun returnLastNameWithIf(firstName: String): String {
//    //Write your code below this line
    return if (firstName.equals("Hadas")) {
        "Peled"
    } else {
        "Unknown"
    }
}

/**
 * return the person last name using a [when] expression based on first name
 *
 * @return "Peled" if first name is "Hadas"
 * @return "Goldzweig" if first name is "Gil"
 * @return "Bugdary" if first name is "Eden"
 * @return "Unknown" if the first name is not "Gil" or "Hadas" or "Eden"
 */
fun returnLastNameWithWhenStatment(firstName: String): String {
    //Write your code below this line
    return when (firstName) {
        "Hadas" -> "Peled"
        "Gil" -> "Goldzweig"
        "Eden" -> "Bugdary"
        else -> "Unknown"
    }
}