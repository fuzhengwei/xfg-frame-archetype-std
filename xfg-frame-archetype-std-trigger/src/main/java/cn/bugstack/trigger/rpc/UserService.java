package cn.bugstack.trigger.rpc;

import cn.bugstack.api.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@Slf4j
@DubboService(version = "1.0.0", timeout = 450)
public class UserService implements IUserService {

    @Override
    public String queryUserInfo(String req) {
        return "查询用户信息";
    }

}
