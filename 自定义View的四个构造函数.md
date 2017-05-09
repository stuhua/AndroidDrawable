## 第一种
```  java
    public CustomView(Context context) {
        super(context);
    }
``` 

## 第二种
```  java
    public CustomView(Context context, AttributeSet attrs) {
           super(context, attrs);
    }
``` 

## 第三种
```  java
    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
           super(context, attrs, defStyleAttr);
    }
``` 

## 第四种
```  java
     public CustomView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            super(context, attrs, defStyleAttr, defStyleRes);
     }
``` 