package com.jinhui.designpatterndemo.command;

import android.widget.Toast;

import com.jinhui.designpatterndemo.app.PatternApplication;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 */
public class NoCommand implements Command {

    @Override
    public void execute() {
        Toast.makeText(PatternApplication.getInstance(), "哥们,这个没效!", Toast.LENGTH_SHORT).show();
    }
}
