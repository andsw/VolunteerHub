package ca.ontario.conestoga.volunteer_hub.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> implements Serializable {

	private String message;

	private boolean success;

	private T data;

  public static <T> Result<T> success(T data) {
    return Result.<T>builder().success(true).data(data).build();
  }

  public static <T> Result<T> error(String message) {
    return Result.<T>builder().success(false).message(message).build();
  }
}
