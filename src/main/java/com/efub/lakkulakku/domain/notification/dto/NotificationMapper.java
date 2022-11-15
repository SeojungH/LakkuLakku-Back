package com.efub.lakkulakku.domain.notification.dto;

import com.efub.lakkulakku.domain.notification.entity.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationMapper {

	public static NotificationResDto toNotificationResDto(Notification entity) {
		if (entity == null)
			return null;

		return NotificationResDto.builder()
				.id(entity.getId())
				.message(entity.getMessage())
				.build();
	}
}