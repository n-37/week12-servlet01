package com.hgs;

public class Test3 {
    public static void main(String[] args) {
        // 1. 初始化播放列表
        String[] songs = {
                "稻香 - 周杰伦",
                "七里香 - 周杰伦",
                "海底 - 一支榴莲",
                "孤勇者 - 陈奕迅",
                "爱你 - 王心凌"
        };
        MusicPlayer.initPlayList(songs);

        // 2. 显示播放列表
        MusicPlayer.showPlayList();

        // 3. 测试指定序号播放
        System.out.println("\n--- 测试指定序号播放 ---");
        MusicPlayer.playByIndex(0);  // 播放第1首
        MusicPlayer.playByIndex(2);  // 播放第3首
        MusicPlayer.playByIndex(10); // 测试无效索引

        // 4. 测试随机播放
        System.out.println("\n--- 测试随机播放 ---");
        for (int i = 0; i < 3; i++) {
            MusicPlayer.playRandom();
        }
    }
}