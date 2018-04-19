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
![github-01.jpg](/images/ac.jpg "github-01.jpg")
