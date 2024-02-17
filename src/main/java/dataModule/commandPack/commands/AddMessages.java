package dataModule.commandPack.commands;

import java.util.LinkedHashMap;
import java.util.Set;

public class AddMessages {
    private final LinkedHashMap<String, String> massages = new LinkedHashMap<>();
    //length = 10
    public AddMessages(){
        massages.put("name", "Установите поле name: не может быть пустым");
        massages.put("x", "Установите 'x' координату: не может быть > 718");
        massages.put("y", "Установите 'y' координату: условий нет");
        massages.put("price", "Установите поле price: не может быть пустым, должно быть > 0");
        massages.put("discount", "Установите поле discount: не может быть пустым, значение должно находиться в диапазоне (0;100]");
        massages.put("refundable", "Установите поле refundable: может быть только true или false");
        massages.put("type", "Установите поле type: не может быть null. Возможные значения: VIP, USUAL, BUDGETARY, CHEAP");
        massages.put("eventName", "Установите поле name события: не может быть пустым");
        massages.put("date", "Установите поле date события: не может быть пустым. Формат ввода: yyyy-MM-ddTHH:mm:ss, например 2024-02-16T12:30:45");
        massages.put("eventType", "Установите поле eventType события: не может быть пустым. Возможные значения: EXPOSITION, BASEBALL, E_SPORTS");

    }
        public String getMassageByKey(String key){
            return massages.get(key);
        }
        public Set<String> keySet(){
            return massages.keySet();
        }
        public String get(String key){
            return massages.get(key);
        }

}
