- **mParentLL为Activity中的ViewGroup，通过findViewById找到**
- **mInnerView通过LayoutInflater.，通过findViewById找到**
# 第一种
``` java
    mInflater = LayoutInflater.from(this);
    mInnerView = mInflater.inflate(R.layout.textview, mParentLL, false);
    mParentLL.addView(mInnerView);
``` 
1. textview的layout_width、layout_height、gravity等参数有作用

2. View层次：FrameLayout(android:id/content)->LinearLayout(io.stuhua.androiddrawable:id/parent)->TextView(io.stuhua.androiddrawable:id/text)

# 第二种
```  java
    mInflater = LayoutInflater.from(this);
    mInnerView = mInflater.inflate(R.layout.textview, mParentLL, true);
    mParentLL.addView(mInnerView);
``` 

1. 运行报错: Caused by: java.lang.IllegalStateException: The specified child already has a parent. You must call removeView() on the child's parent first

2. 因为第二行textview就是mParentLL的子view，在第三行又addView

# 第三种
```  java
    mInflater = LayoutInflater.from(this);
    mInnerView = mInflater.inflate(R.layout.textview, null, false);
    mParentLL.addView(mInnerView);
``` 
1. textview的layout_width、layout_height、gravity等参数没有作用，显示成（math_parent,wrap_content）

2. View层次：FrameLayout(android:id/content)->LinearLayout(io.stuhua.androiddrawable:id/parent)->TextView(io.stuhua.androiddrawable:id/text)
# 第四种
```  java
    mInflater = LayoutInflater.from(this);
    mInnerView = mInflater.inflate(R.layout.textview, null, true);
    mParentLL.addView(mInnerView);
``` 
1. 与第三种效果一样

----
# 总结
1. mInnerView = mInflater.inflate(R.layout.textview, mParentLL, false);//首先使用

2. mInnerView = mInflater.inflate(R.layout.textview, null, false);//需要在textview外加一层布局，参数才会起作用
