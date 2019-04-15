package template_method_mode;

import template_method_mode.model.BaseTestPaper;
import template_method_mode.model.TestPaperA;
import template_method_mode.model.TestPaperB;

/**
 * @description: 模板方法模式
 * <p>
 * 老师在黑板上手抄试题
 * 学生AB将题抄到纸上一边做题
 * 模板方法模式实现了很好的代码复用性
 * @author: wuyanbo
 * @create: 2019-04-15 10:32
 **/

public class TemplateMethodMode {

    public static void main(String[] args) {
        BaseTestPaper testPaperA = new TestPaperA();
        BaseTestPaper testPaperB = new TestPaperB();
        testPaperA.TestQuestion1();
        testPaperB.TestQuestion2();
    }
}
