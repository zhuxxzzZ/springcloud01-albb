package com.JackGuo.Springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment  implements Serializable {
    /**
    * payment支付id
    */
    private Long id;

    /**
    * 支付流水号
    */
    private String serial;
}