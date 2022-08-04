package com.efub.lakkulakku.domain.comment.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@NoArgsConstructor
public class CommentReqDto {

	private UUID diaryId;
	private String content;
	private boolean isSecret;
	private UUID parentId;

	@Builder
	public CommentReqDto(UUID diaryId, String content, boolean isSecret, UUID parentId) {

		this.diaryId = diaryId;
		this.content = content;
		this.isSecret = isSecret;
		this.parentId = parentId;
	}
}