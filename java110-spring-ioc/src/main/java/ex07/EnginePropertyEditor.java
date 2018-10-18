package ex07;

import java.beans.PropertyEditorSupport;
import java.sql.Date;


//String ==> java.sql.Date 프로토 타입 변환기
public class EnginePropertyEditor extends PropertyEditorSupport{

    public EnginePropertyEditor() {
        System.out.println("EnginePropertyEditor() 호출됨!");
    }
    
    
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
      
        System.out.println("EnginePropertyEditor.setAsText() 호출됨!");
        //String을 java.sql.Date 객체로 만들어야 할 경우
       // 스프링 IoC컨테이너는 이 메서드를 호출한다.,
       // 그러면 다음ㅁ과 같이 문자열을 java.sql.Date객체로 만들어
        
        String [] values = text.split(",");
                Engine engine = new Engine();
         engine.setMaker(values[0]);
         engine.setValve(Integer.parseInt(values[1]));
         engine.setDiesel(Boolean.parseBoolean(values[2]));
        //내부필드에 저장한다.
        this.setValue(values);
        
        //스프링 IoC 컨테이너는 이 메서드를 호출한 후,
        // 변환된 값을 꺼내기 위해 getValue()를 호출하여 그 리턴값을 사용한다.
        
        
    }

    @Override
    public Object getValue() {
        //이 메서드는 오버라이딩 할 필요가 없다.
        // 다만 
        
        System.out.println("EnginePropertyEditor.getValue()");
        return super.getValue();
    }
    
}
