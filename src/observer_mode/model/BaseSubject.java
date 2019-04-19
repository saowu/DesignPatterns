package observer_mode.model;

import java.util.LinkedList;
import java.util.List;

/**
 * @description: 抽象通知者
 * @author: wuyanbo
 * @create: 2019-04-19 19:26
 **/

public abstract class BaseSubject {
    //观察者序列
    private List<BaseObserver> observerList = new LinkedList<>();

    /**
     * 添加观察者
     *
     * @param baseObserver 观察者
     */
    public void attach(BaseObserver baseObserver) {
        observerList.add(baseObserver);
    }

    /**
     * 移除观察者
     *
     * @param baseObserver 观察者
     */
    public void detach(BaseObserver baseObserver) {
        observerList.remove(baseObserver);
    }

    /**
     * 通知方法
     * 状态改变通知观察者做出改变
     */
    public void notifyObserver() {
        observerList.forEach((o) -> {
            o.update();
        });
    }


}
