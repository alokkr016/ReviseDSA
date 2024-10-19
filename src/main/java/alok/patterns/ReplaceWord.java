package alok.patterns;

public class ReplaceWord {
    public static void main(String[] args) {
        // Original string
        String originalString = """
                Of course! Here's a Hindi song with lots of "dil" for you:
                                
                ---
                                
                **दिल की बातें** \s
                *(Dil Ki Baatein)*
                                
                *Verse 1:* \s
                दिल कहता है, तुझसे कुछ कहूँ \s
                दिल की हर धड़कन में तेरा नाम लूँ \s
                दिल की राहों में बस तू ही तू है \s
                दिल की चाहतों में तू हर पल नए
                                
                *Chorus:* \s
                दिल-ए-दीवाना, तुझपे ही फ़िदा \s
                दिल कहता है, तू है मेरी दुआ \s
                दिल चाहता है, तुझसे प्यार करूँ \s
                दिल की दुनिया में बस तुझे भर लूँ
                                
                *Verse 2:* \s
                दिल की ख़्वाहिशें, तेरे संग जुड़ी \s
                दिल की आरज़ू, तुझमें ही छुपी \s
                दिल का हर सपना, बस तुझसे है \s
                दिल को अब कुछ और चाहिए नहीं
                                
                *Chorus:* \s
                दिल-ए-दीवाना, तुझपे ही फ़िदा \s
                दिल कहता है, तू है मेरी दुआ \s
                दिल चाहता है, तुझसे प्यार करूँ \s
                दिल की दुनिया में बस तुझे भर लूँ
                                
                *Bridge:* \s
                दिल की हर धड़कन तुझसे है बंधी \s
                दिल की कहानी अब तेरे संग लिखी \s
                दिल से दिल का ये बंधन सदा रहे \s
                दिल को दिल से अब कभी जुदा न करे
                                
                *Chorus (Outro):* \s
                दिल-ए-दीवाना, तुझपे ही फ़िदा \s
                दिल कहता है, तू है मेरी दुआ \s
                दिल चाहता है, तुझसे प्यार करूँ \s
                दिल की दुनिया में बस तुझे भर लूँ
                                
                ---
     
                """;
        
        // Replace "दिल" with "Jaan"
        String replacedString = originalString.replace("दिल", "Lund");
        
        // Output the result
        System.out.println("Original String: " + originalString);
        System.out.println("Replaced String: " + replacedString);
    }
}
