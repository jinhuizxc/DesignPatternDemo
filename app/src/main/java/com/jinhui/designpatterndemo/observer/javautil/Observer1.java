package com.jinhui.designpatterndemo.observer.javautil;

import android.util.Log;
import android.widget.Toast;

import com.jinhui.designpatterndemo.app.PatternApplication;

import java.util.Observable;
import java.util.Observer;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/18.
 *
 * 最后是我们的使用者：
 */
public class Observer1 implements Observer {


    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3d){
            SubjectFor3d subjectFor3d = (SubjectFor3d) o;
            Log.e("SubjectFor3d:", "subjectFor3d's msg -- >" + subjectFor3d.getMsg());
//            Toast.makeText(PatternApplication.getInstance(), "subjectFor3d's msg -- >" + subjectFor3d.getMsg(), Toast.LENGTH_SHORT).show();
        }
        if (o instanceof SubjectForSSQ){
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            Log.e("SubjectForSSQ:", "subjectForSSQ's msg -- >" + subjectForSSQ.getMsg());
//            Toast.makeText(PatternApplication.getInstance(), "subjectForSSQ's msg -- >" + subjectForSSQ.getMsg(), Toast.LENGTH_SHORT).show();
        }
    }
}
