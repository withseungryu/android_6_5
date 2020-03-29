# android_6_5

###
  <Button
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id ="@+id/button1"
        android:txt="@string/strBtn1"
        />
      
### @string -> string 파일에서 수정 가능하다. strBtn1 => className
### java file에서 button을 썻는데 빨간 글씨로 생성되면 --> alt+enter 를 누르면 자동적으로 import시켜준다

-------------------------------------------------
button1 = (Button)findViewById(R.id.button1);
### 내가 사용하는 버튼의  설정

### 안드로이드 - 계산기 만들기
