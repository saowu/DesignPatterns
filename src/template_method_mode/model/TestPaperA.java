package template_method_mode.model;

/**
 * @description: 学生A抄写的试卷及答案
 * @author: wuyanbo
 * @create: 2019-04-15 10:39
 **/

public class TestPaperA extends BaseTestPaper {


    @Override
    public String answer1() {
        return "A";
    }


    @Override
    public String answer2() {
        return "B";
    }
}
