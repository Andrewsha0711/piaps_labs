package piaps_lab2;

import java.util.ArrayList;

public class AbstractProduct {
	private boolean completenessStatus;
	// Коллекция групп частей
	private ArrayList<ArrayList<AbstractPart>> partsList;
	
	public AbstractProduct() {
		this.partsList = new ArrayList<>();
		this.completenessStatus = false;
	}
	// Получение списка частей определенного типа
	public ArrayList<AbstractPart> getParts(int i) {
		return this.partsList.get(i);	
	}
	// Получение списка типов частей
	public ArrayList<ArrayList<AbstractPart>> getPartsList() {
		return this.partsList;	
	}
	// Получение статуса готовности
	public boolean getStatus() {
		return this.completenessStatus;
	}
	// Установка статуса
	public void setStatus(boolean status) {
		this.completenessStatus = status;
	}
	// Добавления нового типа частей
	public void addTypeOfParts(ArrayList<AbstractPart> newParts) {
		this.partsList.add(newParts);
	}
	// Добавление определенной части
	public void addPart(AbstractPart part, int i) {
		this.partsList.get(i).add(part);
	}
	// Удаление пустых коллекций
	public void cleanEmptyCollections() {
		for(int i = 0; i < this.partsList.size(); i++) {
			if(this.partsList.get(i).size() == 0) {
				this.partsList.remove(i);
			}
		}
	}
	public String getInfo() {
		String str = "";
		for(int k=0; k < this.partsList.size(); k++) {
			if(this.partsList.get(k).size()>0)
				for(int i = 0; i<this.partsList.get(k).size(); i++) {
					str+=this.partsList.get(k).get(i).getClass().getSimpleName();
					str+=" ";
				}
		}
		return str;
	}
}
