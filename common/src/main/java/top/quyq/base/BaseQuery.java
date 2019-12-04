package top.quyq.base;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Quyq
 * 查询基类
 **/
@Data
public class BaseQuery implements Serializable {
    private static final long serialVersionUID = 3392905046977676885L;
    /**
     * 页码，默认1
     */
    private Integer page = 1;
    /**
     *  查询数量,默认10
     */
    private Integer pageSize = 10;
}