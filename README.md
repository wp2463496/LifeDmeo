Android Activity ABC页面跳转生命周期变化及activity + fragment生命周期变化

想必很多求职者在面试中也被问到过，这也是大家容易忽略的一个细节问题。

下面我将贴上测试结果及源码供大家参考学习和探讨：


A跳B，B跳C，关闭C：

A跳B，B跳C前关闭B，再关闭C：

A跳B，B跳C后关闭B，再关闭C  ：


Cactivity onCreate 加载 fragment


Cactivity + fragment ， 先关闭Bactivity 后关闭C activity


Cactivity onCreate 加载 fragment 关闭C activity

