package com.services;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class MessageService 
{
static Map<Integer,Message> messages= new HashMap<>();

static
{
	messages.put(1, new Message(1,"Mehvish",LocalDate.of(1997, 10, 06)));
	messages.put(2, new Message(2,"Bhakti",LocalDate.of(2019, 12, 11)));
	messages.put(3, new Message(3,"Tanaya",LocalDate.of(1998, 12, 06)));
	messages.put(4, new Message(4,"Java",LocalDate.of(2009,10,18)));
}
public List<Message> getAllMessages(){
	Collection<Message> coll=messages.values();
	List<Message> msglist = new ArrayList(coll);
	
	return msglist;
	
}
public Message getMessageById(int id) {
		return messages.get(id);
}

public Message addMessage(Message m) {
	int sizeofcoll = messages.size();
	int newid = sizeofcoll+1;
	m.setId(newid);
	messages.put(m.getId(),m);
	return m;
}

public Message delMessage(int id) {
	messages.remove(id);
	return getMessageById(id);
}
public Message updateMessage(Message m) {
	messages.put(m.getId(),m);
	return m;
}
}
