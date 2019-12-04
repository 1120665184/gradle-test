/*
 * Email:        quyongquan@qq.com
 * FileName:     BaseEntity
 * CreationDate: 2019/12/3
 * Author:       渠永泉
 */
package top.quyq.base;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Quyq
 * 基类
 **/
@Data
@Accessors(chain = true)
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -2859129875145192257L;
    private String id;
    private LocalDateTime createdTime;
    private LocalDateTime modifyTime;

}
