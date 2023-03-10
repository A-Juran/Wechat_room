package la.iit.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author juran
 * @since 2023-03-13 16:50:30
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sys_User")
@Accessors(chain = true)
public class SysUser{
    //用户Id
    @TableId(type = IdType.AUTO)
    private Long id;
    //用户名
    @TableField("nick_name")
    private String nickName;
    //头像
    @TableField("avatar_url")
    private String avatarUrl;
    //性别
    @TableField("sex")
    private Gender sex;
    //用户唯一标识
    @TableField("open_id")
    private String openId;
    //平台账号唯一标识
    @TableField("union_id")
    private String unionId;

    @TableField("is_improve")
    private boolean isImprove;
    //版本/乐观锁字段
    @Version
    @TableField("version")
    private Long version;
    //创建时间
    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;
    //更新时间
    @TableField(value = "update_time",fill = FieldFill.UPDATE)
    private Date updateTime;

    /**
     * 性别
     */
    public enum Gender {
        MAN("MAN"),
        FEMALE("FEMALE");
        private String value;

        Gender(String sex) {
            this.value = sex;
        }

        public String value() {
            return this.value;
        }
    }

}

