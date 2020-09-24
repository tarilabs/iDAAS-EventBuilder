package com.redhat.idaas.eventbuilder.parsers.clinical;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.redhat.idaas.eventbuilder.pojos.clinical.MessageHeader;
//import com.redhat.idaas.eventbuilder.pojos.clinical.MessageHeader;

import org.junit.jupiter.api.Test;

public class MSHSegmentTest {

    @Test
    public void parseMSHSegment() {
        String msgBody = "MSH|^~\\&|HIS|RIH|EKG|EKG|199904140038||ADT^A01|ADT.1.2.3.4.5|P|2.2\r"
            + "PID|0001|00009874|00001122|A00977|SMITH^JOHN^M|MOM|19581119|F|NOTREAL^LINDA^M|C|564 SPRING ST^^NEEDHAM^MA^02494^US|0002|(818)565-1551|(425)828-3344|E|S|C|0000444444|252-00-4414||||SA|||SA||||NONE|V1|0001|I|D.ER^50A^M110^01|ER|P00055|11B^M011^02|070615^BATMAN^GEORGE^L|555888^NOTREAL^BOB^K^DR^MD|777889^NOTREAL^SAM^T^DR^MD^PHD|ER|D.WT^1A^M010^01|||ER|AMB|02|070615^NOTREAL^BILL^L|ER|000001916994|D||||||||||||||||GDD|WA|NORM|02|O|02|E.IN^02D^M090^01|E.IN^01D^M080^01|199904072124|199904101200|199904101200||||5555112333|||666097^NOTREAL^MANNY^P\r"
            + "NK1|0222555|NOTREAL^JAMES^R|FA|STREET^OTHER STREET^CITY^ST^55566|(222)111-3333|(888)999-0000|||||||ORGANIZATION\r"
            + "PV1|0001|I|D.ER^1F^M950^01|ER|P000998|11B^M011^02|070615^BATMAN^GEORGE^L|555888^OKNEL^BOB^K^DR^MD|777889^NOTREAL^SAM^T^DR^MD^PHD|ER|D.WT^1A^M010^01|||ER|AMB|02|070615^VOICE^BILL^L|ER|000001916994|D||||||||||||||||GDD|WA|NORM|02|O|02|E.IN^02D^M090^01|E.IN^01D^M080^01|199904072124|199904101200|||||5555112333|||666097^DNOTREAL^MANNY^P\r"
            + "PV2|||0112^TESTING|55555^PATIENT IS NORMAL|NONE|||19990225|19990226|1|1|TESTING|555888^NOTREAL^BOB^K^DR^MD||||||||||PROD^003^099|02|ER||NONE|19990225|19990223|19990316|NONE\r"
            + "AL1||SEV|001^POLLEN\r"
            + "GT1||0222PL|NOTREAL^BOB^B||STREET^OTHER STREET^CITY^ST^77787|(444)999-3333|(222)777-5555||||MO|111-33-5555||||NOTREAL GILL N|STREET^OTHER STREET^CITY^ST^99999|(111)222-3333\r"
            + "IN1||022254P|4558PD|BLUE CROSS|STREET^OTHER STREET^CITY^ST^00990||(333)333-6666||221K|LENIX|||19980515|19990515|||PATIENT01 TEST D||||||||||||||||||02LL|022LP554\r";
        
        MessageHeader mshSegmentDetails;
        mshSegmentDetails = MSHSegment.parseMSHSegment(msgBody);

        assertEquals("RIH", mshSegmentDetails.getFacilityId());
        assertEquals("19990414", mshSegmentDetails.getMessageDate());
        assertEquals("199904140038", mshSegmentDetails.getMessageDateTime());
        assertEquals("A01", mshSegmentDetails.getMessageEvent());
        assertEquals("00", mshSegmentDetails.getMessageHour());
        assertEquals("ADT.1.2.3.4.5", mshSegmentDetails.getMessageId());
        assertEquals("0038", mshSegmentDetails.getMessageTime());
        assertEquals("ADT", mshSegmentDetails.getMessageType());
        assertNull(mshSegmentDetails.getMessageVendor());
        assertEquals("2.2", mshSegmentDetails.getMessageVersion());
        assertEquals("HIS", mshSegmentDetails.getSendingApp());
        assertEquals("RIH_HIS_ADT_ADT.1.2.3.4.5", mshSegmentDetails.getUniqueMessageId());
    }
}