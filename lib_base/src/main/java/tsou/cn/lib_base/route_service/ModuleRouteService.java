package tsou.cn.lib_base.route_service;

import com.alibaba.android.arouter.launcher.ARouter;

import tsou.cn.lib_base.provider.IChatModuleService;

/**
 * Created by Administrator on 2017/12/5 0005.
 * <p>
 * 服务的发现
 */

public class ModuleRouteService {

    public static String getUserName(String userId) {
        IChatModuleService chatModuleService = ARouter.getInstance().navigation(IChatModuleService.class);
        if (chatModuleService != null) {
            return chatModuleService.getUserName(userId);
        }
        return "";
    }

}
