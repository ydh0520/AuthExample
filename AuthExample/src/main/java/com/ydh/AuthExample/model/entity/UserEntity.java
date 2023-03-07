package com.ydh.AuthExample.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

@Data
public class UserEntity {
	@Id
	String id;
	String password;
}
