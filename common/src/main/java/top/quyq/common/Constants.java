/*
 * Email:        quyongquan@qq.com
 * FileName:     Constants
 * CreationDate: 2019/12/3
 * Author:       渠永泉
 */
package top.quyq.common;

/**
 * @author Quyq
 * 通用常量
 **/

public interface Constants {

    /**
     * 状态
     */
    interface State {
        /**
         * 正常
         */
        Integer STATE_NORMAL = 1;
        /**
         * 异常
         */
        Integer STATE_LOCK = 2;
    }

    /**
     * 性别
     */
    interface gender {
        Integer GENDER_WOMAN = 0 ;
        Integer GENDER_MAN = 1;
        Integer GENDER_OTHER = 2;
    }
}
