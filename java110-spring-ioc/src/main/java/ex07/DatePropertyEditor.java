package ex07;

import java.beans.PropertyEditorSupport;
import java.sql.Date;


//String ==> java.sql.Date 프로토 타입 변환기
public class DatePropertyEditor extends PropertyEditorSupport{

    public DatePropertyEditor() {
        System.out.println("DatePropertyEditor() 호출됨!");
    }
    
    
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
      
        System.out.println("DatePropertyEditor.setAsText() 호출됨!");
        //String을 java.sql.Date 객체로 만들어야 할 경우
       // 스프링 IoC컨테이너는 이 메서드를 호출한다.,
       // 그러면 다음ㅁ과 같이 문자열을 java.sql.Date객체로 만들어
        Date date= Date.valueOf(text);
        
        //내부필드에 저장한다.
        this.setValue(date);
        
        //스프링 IoC 컨테이너는 이 메서드를 호출한 후,
        // 변환된 값을 꺼내기 위해 getValue()를 호출하여 그 리턴값을 사용한다.
        
        
    }

    @Override
    public Object getValue() {
        //이 메서드는 오버라이딩 할 필요가 없다.
        // 다만 
        
        System.out.println("DatePropertyEditor.getValue()");
        return super.getValue();
    }
    
}
