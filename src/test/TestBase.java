package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBase {
        protected ClassPathXmlApplicationContext ctx;

        public TestBase() {
            super();
        }

        public void initCtx() {
            String cfg = "/applicationContext.xml";
            ctx = new ClassPathXmlApplicationContext(cfg);
        }

}

