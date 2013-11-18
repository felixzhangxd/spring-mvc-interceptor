package biz.ezcom.spring.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LogbackInterceptor implements HandlerInterceptor {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * controller方法之前执行
     * 
     * @return false : 返回
     * @return true : 进入controller
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String s = String.format("preHandler() : %s", this.name);
        System.out.println(s);
//        HandlerMethod handlerMethod = (HandlerMethod) handler;
        return true;
    }

    /**
     * controller方法之后，页面渲染之前执行
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        String s = String.format("postHandle() : %s", this.name);
        System.out.println(s);
    }

    /**
     * c页面渲染之后执行
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        String s = String.format("afterCompletion() : %s", this.name);
        System.out.println(s);
    }
}
