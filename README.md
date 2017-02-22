# CircleProgress
该项目实现圆形进度条中百分比数值跟随进度动态移动的效果。参考了[https://github.com/lzyzsd/CircleProgress](https://github.com/lzyzsd/CircleProgress)。

示例如下图

![示意图](https://raw.githubusercontent.com/HubertJiang/CircleProgress/master/images/1.gif)

apk下载链接[下载地址](https://github.com/HubertJiang/CircleProgress/blob/master/images/demo-debug.apk?raw=true)

使用方法如下
```
 <com.hubert.circlelibrary.CircleProgress
        android:layout_width="300dp"
        android:layout_height="300dp"
        app:circle_progress="20"
        android:id="@+id/progress"
        android:layout_centerInParent="true"
        app:circle_text_size="12dp"
        app:circle_finished_color="@color/colorAccent"
        app:circle_unfinished_color="@color/colorPrimary"
        app:circle_angle="240" />
```
![示例图](https://raw.githubusercontent.com/HubertJiang/CircleProgress/master/images/2.png)

####注意
width的值要和height的值相同，也就是圆形时才可以。
实际开发中也可以根据具体的需求进行相应的开发和修改。