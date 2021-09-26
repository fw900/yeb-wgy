package com.fw.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页公共返回对象
 *
 * @author FW900
 * @date 2021-09-26 11:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RespPageBean {

    // 总条数
    private Long total;
    // 数据
    private List<?> data;
}
