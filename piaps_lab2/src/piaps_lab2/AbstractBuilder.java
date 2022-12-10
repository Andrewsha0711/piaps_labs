package piaps_lab2;

import java.util.ArrayList;

public abstract class AbstractBuilder {
    private String id;

    public AbstractBuilder() {
        this.id = "Default";
    }

    public AbstractBuilder(String idValue) {
        this.id = idValue;
    }

    public String getId() {
        return this.id;
    }

    // Установка статуса
    public void setStatus(AbstractProduct destination, boolean status) {
        destination.setStatus(status);
    }

    // Добавления нового типа частей
    public void addTypeOfParts(AbstractProduct destination, ArrayList<AbstractPart> newParts) {
        destination.addTypeOfParts(newParts);
    }

    // Добавление определенной части
    public void addPart(AbstractProduct destination, AbstractPart part, int i) {
        destination.addPart(part, i);
    }

    // Поиск существующей созданной коллекции
    public int findCollection(AbstractProduct destination, String className) {
        destination.cleanEmptyCollections();
        if (destination.getPartsList().size() != 0) {
            for (int i = 0; i < destination.getPartsList().size(); i++) {
                if (destination.getPartsList().get(i).get(0).getClass().getSimpleName().equals(className)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
