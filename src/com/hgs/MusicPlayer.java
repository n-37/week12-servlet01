package com.hgs;

import java.util.Random;

public class MusicPlayer {

    private static String[] musicPlayList;

    public static void initPlayList(String[] songs) {
        musicPlayList = songs;
    }

    public static void playRandom() {
        // 先判断播放列表是否为空
        if (musicPlayList == null || musicPlayList.length == 0) {
            System.out.println("播放列表为空，无法播放音乐");
            return;
        }

        // 生成随机索引
        Random random = new Random();
        int randomIndex = random.nextInt(musicPlayList.length);

        // 播放随机选中的歌曲
        System.out.println("正在随机播放：" + musicPlayList[randomIndex]);
    }


    public static void playByIndex(int index) {
        // 先判断播放列表是否为空
        if (musicPlayList == null || musicPlayList.length == 0) {
            System.out.println("播放列表为空，无法播放音乐");
            return;
        }

        // 判断索引是否合法
        if (index < 0 || index >= musicPlayList.length) {
            System.out.println("无效的歌曲序号，请重新输入");
            return;
        }

        // 播放指定序号的歌曲
        System.out.println("正在播放第" + (index + 1) + "首歌曲：" + musicPlayList[index]);
    }

    public static void showPlayList() {
        // 先判断播放列表是否为空
        if (musicPlayList == null || musicPlayList.length == 0) {
            System.out.println("播放列表为空");
            return;
        }

        System.out.println("=== 音乐播放列表 ===");
        for (int i = 0; i < musicPlayList.length; i++) {
            System.out.println((i + 1) + ". " + musicPlayList[i]);
        }
        System.out.println("===================");
    }

}