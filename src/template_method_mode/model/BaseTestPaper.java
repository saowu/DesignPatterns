package template_method_mode.model;

/**
 * @description: 试卷父类
 * <p>
 * 黑板上老师抄的试题
 * @author: wuyanbo
 * @create: 2019-04-15 10:33
 **/

public abstract class BaseTestPaper {

    public void TestQuestion1() {

        System.out.println("1.有一磁盘，共有10个柱面，每个柱面20个磁道，每个盘面分成16个扇区。采用位示图对其存储空间进行管理。如果字长是16个二进制位，那么位示图共需( )字。");
        System.out.println("答案：" + answer1());
    }


    public abstract String answer1();


    public void TestQuestion2() {

        System.out.println("2.操作系统为每一个文件开辟一个存储区，在它的里面记录着该文件的有关信息。这就是所谓的( )。");
        System.out.println("答案：" + answer2());
    }


    public abstract String answer2();


}
