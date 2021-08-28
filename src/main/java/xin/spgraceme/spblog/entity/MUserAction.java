package xin.spgraceme.spblog.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author spgraceme
 * @since 2021-08-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class MUserAction implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 动作类型
     */
    private String action;

    /**
     * 得分
     */
    private Integer point;

    /**
     * 关联的帖子ID
     */
    private String postId;

    /**
     * 关联的评论ID
     */
    private String commentId;

    private LocalDateTime created;

    private LocalDateTime modified;


}
