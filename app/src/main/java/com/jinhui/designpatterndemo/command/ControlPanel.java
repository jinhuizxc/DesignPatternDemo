package com.jinhui.designpatterndemo.command;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 遥控器按钮  一共9个按钮
 */
public class ControlPanel {

    private static final int CONTROL_SIZE = 9;

    private Command[] commands;

    public ControlPanel() {

        commands = new Command[CONTROL_SIZE];
        for (int i = 0; i < CONTROL_SIZE; i++) {
            commands[i] = new NoCommand();
        }
    }

    /**
     * 模拟点击按钮
     */
    public void keyPressed(int index) {
        commands[index].execute();
    }

    /**
     * 设置每个按钮对应的位置
     */
    public void setCommands(int index, Command command) {
        commands[index] = command;
    }
}
