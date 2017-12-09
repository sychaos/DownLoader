package cloudist.cc.library;

import cloudist.cc.library.db.DownloadModel;

/**
 * Created by cloudist on 2017/12/10.
 */

public class DownLoader {

    // 维护一个db对象
    // 维护一个线程池对象

    // 找对应的DownloadModel
    private DownloadModel find(int id) {
        return new DownloadModel();
    }

    // 可能并不对
    private void start(int id) {
        DownloadModel downloadModel = find(id);
        if (downloadModel == null) {
        } else {
        }
        // 开一个线程 搞起 具体怎么更新得看源码
    }

    private void stop(int id) {
        // 线程池干掉
        // 暂停的处理不能太过粗糙
    }
}
