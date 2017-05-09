- Context - View中随处都会用到

- AttributeSet - XML属性（当从XML inflate的时候）

- int defStyleAttr - 应用到View的默认风格（定义在主题中）

- int defStyleResource - 如果没有使用defStyleAttr，应用到View的默认风格

- 第一属于程序内实例化时采用，之传入Context即可

- 第二个用于layout文件实例化，会把XML内的参数通过AttributeSet带入到View内

- 第三个主题的style信息，也会从XML里带入

- 一般继承View类，知晓熟悉使用前两个方法即可，后面的都很少用到。

# 第一种
```  java
    public CustomView(Context context) {
        super(context);
    }
``` 

# 第二种
```  java
    public CustomView(Context context, AttributeSet attrs) {
           super(context, attrs);
    }
``` 

# 第三种
```  java
    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
           super(context, attrs, defStyleAttr);
    }
``` 

# 第四种
```  java
     public CustomView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            super(context, attrs, defStyleAttr, defStyleRes);
     }
``` 

# 执行顺序
- 在代码中直接new一个Custom View实例的时候,会调用第一个构造函数.这个没有任何争议.

- 在xml布局文件中调用Custom View的时候,会调用第二个构造函数.这个也没有争议.

- 在xml布局文件中调用Custom View,并且Custom View标签中还有自定义属性时,这里调用的还是第二个构造函数.

- 也就是说,系统默认只会调用Custom View的前两个构造函数,至于第三个构造函数的调用,通常是我们自己在构造函数中主动调用的（例如,在第二个构造函数中调用第三个构造函数）.

- 至于自定义属性的获取,通常是在构造函数中通过obtainStyledAttributes函数实现的.这里先介绍一下如何生成Custom View的自定义属性.