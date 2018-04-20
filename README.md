ActivityTest
===================================
对于Android 活动的学习
### 关于intent
    intent的用法很多
		这里只讲intent启动活动（第一行代码第二章的内容）
		显示intent
		（1）Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
		     startActivity(intent);
		（2）Intent intent = new Intent();
		     intent.setClass(FirstActivity.this, SecondActivity.class);
		     startActivity(intent);
		隐式intent
		先指定  <action android:name="com.lyp.activitytest.ACTION_START" />和<category android:name="com.lyp.activitytest.MY_CATEGORY" />
		然后 Intent intent=new Intent("com.lyp.activitytest.ACTION_START");
		intent.addCategory("com.lyp.activitytest.MY_CATEGORY");来启动活动
		也可以通过隐式intent在活动之间传递信息
		putExtra方法来发送信息，getExtra方法来接受信息 
		如果在启动活动的时候希望获取信息可以通过 startActivityForResult方法启动
### 活动的周期
![github-01.jpg](/img/ac.jpg "github-01.jpg")
### 活动的启动模式
	1.standard模式
	默认的活动启动模式，会重复创建活动，如果重复进入一个活动数次，就会重复创建几次这个活动，返回时也需要重复返回
	2.singleTop模式
	保证栈顶只有一个活动，但如果FirstActivity不在栈顶时，再度返回FirstActivity时还会重新创建新的实例，造成重复创建栈顶活动的问题
	3.singleTask模式
	解决了重复创建栈顶活动的问题
	4.singleInstance模式
	启动一个新的返回栈来管理这个活动，在允许其他程序访问时，可以共用这个返回栈，达到共享活动实例的效果
