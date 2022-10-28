package com.anchtun.solid.openclosed.wrong;

import java.util.List;

import com.anchtun.model.InternetSessionHistory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//For example, if you look at ISPSubscriber and the PhoneSubscriber, there are some properties that are
//definitely common across these two classes.
//So there is some duplication here that can be avoided.
//And there is another issue here.
//Let's say that the company adds a new service in future.
//Let's say, for example, it adds VoIP service.
//Then we will write a new subscriber and that this information will be duplicated for VoIP subscribers

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ISPSubscriber {
	private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private int baseRate;
    private long freeUsage;

	public double calculateBill() {
		List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
		long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
		long chargeableData = totalData - freeUsage;
		return chargeableData * baseRate / 100;
	}
}
