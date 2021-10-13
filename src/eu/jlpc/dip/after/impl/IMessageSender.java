package eu.jlpc.dip.after.impl;

import eu.jlpc.dip.after.extd.People;

public interface IMessageSender {

	void sendEmail(People person, String message);

}