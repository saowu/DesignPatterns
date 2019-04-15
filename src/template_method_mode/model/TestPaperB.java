package template_method_mode.model;

/**
 * @description: 学生B抄写的试题及答案
 * @author: wuyanbo
 * @create: 2019-04-15 10:42
 **/

public class TestPaperB extends BaseTestPaper {


    @Override
    public String answer1() {
        return "C";
    }


    @Override
    public String answer2() {
        return "D";
    }
}
