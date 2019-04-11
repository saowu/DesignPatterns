# DesignPatterns
> Java实现的设计模式案例  
本项目是学习《大话设计模式》一书的学习笔记，欢迎指正。 
## 一、设计原则  
    1.单一职责原则（SPR）：就一个类而言，应该仅有一个引起它变化的原因。
        如果一个类的职责过多，就等于把这些职责耦合在一起，一个职责的变化可能会削弱或者抑制这个类完成其他职责的能力。这种耦合会导致脆弱的设计，当变化发生时，设计会遭到意想
        不到的破坏。软件设计真正要做的内容，就是发现职责并把那些职责相互分离。如果你能够想到多于一个动机去改变一个类，那么这个类就具有多于一个职责。
    
    2.开放-封闭原则（OCP）：是说软件实体（类、模块、函数等）应该可以扩展，但是不可以修改。
        面对需求，对程序的改动是通过增加新代码，而不是更改现有代码。该原则是面向对象的核心。遵循这个原则可以带来巨大好处，也就是可维护、可扩展、可复用、灵活性好。开发人员
        应该仅对程序中频繁变化的那部分做出抽象，然而，对于应用程序中每个部分都刻意的抽象也不是个好主意。拒绝不成熟抽象和抽象本身同样重要。
        
    3.依赖倒转原则（DIP）：抽象不依赖细节，细节应该依赖抽象。
        A.高层模块不应该依赖低层模块。两个都应该依赖抽象。
        B.抽象不应该依赖细节。细节应该依赖抽象。
        依赖倒转其实可以说是面向对象设计的标志，用哪种语言来编写程序不重要，如果编写时考虑的都是如何针对抽象编程而不是针对细节编程，即程序中所有的依赖关系都是终止于抽象类
        或者接口，那就是面向对象设计，反之就是过程化设计了。
        
    4.里氏代换原则（LSP）:子类型必须能够替换掉它们的父类型。
        一个软件实体如果使用一个父类的话，那么一定适用于其子类，而且它察觉不出父类对象和子类对象的区别。也就是说，软件里面，把父类替换成它的子类，程序的行为没有变化。
     
    5.接口隔离原则(ISP)：使用多个专门的接口，而不使用单一的总接口，即客户端不应该依赖那些它不需要的接口。
        根据接口隔离原则，当一个接口太大时，我们需要将它分割成一些更细小的接口，使用该接口的客户端仅需知道与之相关的方法即可。每一个接口应该承担一种相对独立的角色，不干不
        该干的事，该干的事都要干。这里的“接口”往往有两种不同的含义：一种是指一个类型所具有的方法特征的集合，仅仅是一种逻辑上的抽象；另外一种是指某种语言具体的“接口”定义，
        有严格的定义和结构，比如Java语言中的interface。
         
    6.迪米特法则(LoD)：一个软件实体应当尽可能少地与其他实体发生相互作用。
        迪米特法则要求我们在设计系统时，应该尽量减少对象之间的交互，如果两个对象之间不必彼此直接通信，那么这两个对象就不应当发生任何直接的相互作用，如果其中的一个对象需要调
        用另一个对象的某一个方法的话，可以通过第三者转发这个调用。简言之，就是通过引入一个合理的第三者来降低现有对象之间的耦合度。
                
## 二、设计模式
    
####     1. 简单工厂模式-----计算器
```
package simple_factory_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Operation | 运算类| class | ---
OperationAdd | 加法类 | class | extends Operation
OperationSub | 减法类 | class | extends Operation
OperationMul | 乘法类 | class | extends Operation
OperationDiv | 除法类 | class | extends Operation
OperationDiv | 除法类 | class | extends Operation
OperationFactory | 运算工厂类 | class | ---
SimpleFactoryMode | 启动类 | class | ---
####     2. 策略模式-----商场促销
```
package strategy_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
BaseCharge | 收费算法类| abstract class | ---
DiscountCharge | 打折收费类 | class | extends BaseCharge
NormalCharge | 正常收费（无折扣） | class | extends BaseCharge
ReturnCharge | 返利收费 | class | extends BaseCharge
TypeEnum | 收费折扣类型 | enum | ---
ChargeContext | 策略算法上下文引用 | class | ----
StrategyMode | 启动类 | class | ---

#### 3.装饰模式-----穿衣系统
```
package decorator_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Component | 公共抽象类| abstract class | ---
Decorator | 装饰类 | class | extends Component
Persion | 人物类 | class | extends Component
BigTrouser | 工裤类 | class | extends Decorator
Sneaker | 鞋子类 | class | extends Decorator
TShirts | T恤类 | class | extends Decorator
DecoratorMode | 启动类 | class | ---

    
