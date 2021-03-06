package com.slowteetoe.helloworld.api;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Saying {
	private long id;

	@Length(max = 3)
	private String content;

	public Saying() {
		// Jackson req'd
	}

	public Saying(long id, String content) {
		this.id = id;
		this.content = content;
	}

	@JsonProperty
	public long getId() {
		return this.id;
	}

	@JsonProperty
	public String getContent() {
		return this.content;
	}
}
