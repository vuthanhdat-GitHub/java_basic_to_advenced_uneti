package daythree;

import daythree.dto.AbstractDTO;
import daythree.dto.ExtendDTO;
import daythree.service.AbstractInter;
import daythree.service.impl.AbstractInterImpl;

public class Main {
    public static void main(String[] args) {
        AbstractDTO abstractDTO = new ExtendDTO();
        abstractDTO.printName("dat");
        AbstractInter abstractInter = new AbstractInterImpl();
        abstractInter.print("dat interface");
        abstractInter.print("dat" , "action" , "");
    }
}
