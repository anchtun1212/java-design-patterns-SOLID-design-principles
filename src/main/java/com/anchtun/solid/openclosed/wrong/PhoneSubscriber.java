package com.anchtun.solid.openclosed.wrong;

import java.util.List;

import com.anchtun.solid.openclosed.model.CallHistory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneSubscriber {
    private Long subscriberId;
    private String address;
    private Long phoneNumber;
    private int baseRate;

	public double calculateBill() {
		List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
		long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
		return totalDuration * baseRate / 100;
	}
}
