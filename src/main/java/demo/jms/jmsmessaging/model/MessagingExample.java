package demo.jms.jmsmessaging.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessagingExample implements Serializable {

//    static final long serialVersionUID = 42;

    private UUID uuid;
    private String message;
}