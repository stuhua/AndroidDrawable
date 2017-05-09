- **mParentLL为Activity中的ViewGroup，通过findViewById找到**
- **mInnerView通过LayoutInflater.，通过findViewById找到**
## 第一种
``` java
    mInflater = LayoutInflater.from(this);
    mInnerView = mInflater.inflate(R.layout.textview, mParentLL, false);
    mParentLL.addView(mInnerView);
``` 
**id  dump UI 图片为parent->text，text的参数起作用**
## 第二种
```  java
    mInflater = LayoutInflater.from(this);
    mInnerView = mInflater.inflate(R.layout.textview, null, false);
    mParentLL.addView(mInnerView);
``` 

## 第三种
```  java
    mInflater = LayoutInflater.from(this);
    mInnerView = mInflater.inflate(R.layout.textview, mParentLL, true);
    mParentLL.addView(mInnerView);
``` 

## 第四种
```  java
    mInflater = LayoutInflater.from(this);
    mInnerView = mInflater.inflate(R.layout.textview, null, true);
    mParentLL.addView(mInnerView);
``` 

