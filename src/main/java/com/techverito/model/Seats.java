package com.techverito.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Seats {
	private List<String> platinum = new ArrayList<>();
	private List<String> gold = new ArrayList<>();
	private List<String> silver = new ArrayList<>();
}
