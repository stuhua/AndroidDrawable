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

# TODO
1. 四个构造函数的执行顺序？