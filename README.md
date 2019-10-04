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

#### 4.代理模式-----送礼物

```
package proxy_mode
```

##### a.静态代理方式
```
package proxy_mode.static_proxy_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
IGiveGift | 送礼物接口| interface | ---
Suitors | 追求者 | class | implements IGiveGift
Proxy | 代理类 | class | implements IGiveGift
StaticProxyMode | 启动类 | class | ---


##### b.jdk动态代理方式
```
package proxy_mode.dynamic_proxy_mode.jdk_dynamic_proxy
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
IGiveGift | 送礼物接口| interface | ---
Suitors | 追求者 | class | implements IGiveGift
JdkProxy | 代理类 | class | implements InvocationHandler
JdkDynamicProxy | 启动类 | class | ---

##### c.cglib动态代理方式
```
package proxy_mode.dynamic_proxy_mode.cglib_dynamic_proxy
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Suitors | 追求者 | class | implements IGiveGift
CglibProxy | 代理类 | class | implements MethodInterceptor
CglibDynamicProxy | 启动类 | class | ---

需要导入[cglib-2.2.8.jar](https://mvnrepository.com/artifact/cglib/cglib/3.2.8)
    
####     5. 工厂模式-----计算器
```
package factory_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Operation | 运算类| class | ---
OperationAdd | 加法类 | class | extends Operation
OperationSub | 减法类 | class | extends Operation
OperationMul | 乘法类 | class | extends Operation
OperationDiv | 除法类 | class | extends Operation
IFactory | 运算工厂接口 | interface | ---
AddFactory | 加法工厂类 | class | implements IFactory
SubFactory | 减法工厂类 | class | implements IFactory
MulFactory | 乘法工厂类 | class | implements IFactory
DivFactory | 除法工厂类 | class | implements IFactory
FactoryMode | 启动类 | class | ---

相比简单工厂模式，工厂模式遵循开放-封闭原则，但增加了开发量。


####     6. 原型模式-----印简历

##### a.浅拷贝
```
package prototype_mode.shallow_copy_model
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Resume | 简历类| class | implements Cloneable
Address | 地址类 | class | ---
PrototypeMode | 启动类 | class | ---

##### b.深拷贝-1

```
package prototype_mode.deep_copy_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Resume_1 | 简历类| class | implements Cloneable
Address_1 | 地址类 | class | implements Cloneable
PrototypeMode | 启动类 | class | ---

##### c.深拷贝-2

```
package prototype_mode.deep_copy_mode2
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Resume_2 | 简历类| class | implements Cloneable
Address_2 | 地址类 | class | implements Serializable
PrototypeMode | 启动类 | class | ---

- **浅拷贝**：对值类型的成员变量进行值的复制,对引用类型的成员变量仅仅复制引用,不复制引用的对象。  
- **深拷贝**：对值类型的成员变量进行值的复制,对引用类型的成员变量也进行引用对象的复制。

####     7. 模板方法模式-----抄试题
```
package template_method_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
BaseTestPaper | 黑板试卷类| abstract class | ---
TestPaperA | 手抄试卷A类 | class | extends BaseTestPaper
TestPaperA | 手抄试卷B类 | class | extends BaseTestPaper
TemplateMethodMode | 启动类 | class | ---

模板方法模式实现了很好的代码复用性。

####     8. 外观方法模式-----炒股票
```
package facade_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Stock | 股票类| class | ---
Realty | 房地产类 | class | ---
NationalDebt | 国债类 | class | ---
Fund | 基金类 | class | ---
FacadeMode | 启动类 | class | ---

完美体现了依赖倒转原则和迪米特法则的思想。

####     9. 建造者模式-----产品生产线
```
package builder_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
BaseBuilder | 建造者抽象类| abstract class | ---
ConcreteBuilder1 | 具体建造者类1 | class | extends BaseBuilder
ConcreteBuilder2 | 具体建造者类2 | class | extends BaseBuilder
Product | 产品类 | class | ---
Director | 指挥者类 | class | ---
BuilderMode | 启动类 | class | ---

建造者模式是在当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时适用的模式。

####     10. 观察者模式-----员工偷懒
```
package observer_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
BaseObserver | 抽象观察者| abstract class | ---
BaseSubject | 抽象通知者 | abstract class | ---
Boss | 老板类 | class | ---
Employee | 员工类 | class | extends BaseObserver
Reception | 前台类 | class | extends BaseSubject
ObserverMode | 启动类 | class | ---

当一个对象改变需要同时改变其他对象的时候使用观察者模式（发布-订阅模式）。

####     11. 抽象工厂模式+反射-----切换DB源
```
package abstract_factory_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
IUser | 操作用户接口 | interface | ---
IDepartment | 操作部门接口 | interface | ---
User | 用户实体 | class | ---
Department | 部门实体 | class | ---
MySqlUser | mysql数据源-User | class | implements IUser
MySqlDepartment | mysql数据源-Department | class | implements IUser
SqlServerUser | sqlserver数据源-User | class | implements IDepartment
SqlServerDepartment | sqlserver数据源-Department | class | implements IDepartment
DBEnum | 反射-全限定名 | enum | ---
DataSourceFactory | 数据源切换工厂 | class | ---
AbstractFactoryMode | 启动类 | class | ---

注意:[简单工厂、抽象工厂和抽象工厂模式的区别](https://blog.csdn.net/jerry11112/article/details/80618420)。

####     12. 状态模式-----工作状态
```
package state_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
State | 状态抽象类 | abstract | ---
Work | 工作类 | class | ---
ForenoonStare | 上午工作状态类 | class | extends State
NoonState | 中午工作状态类 | class | extends State
AfternoonState | 下午工作状态类 | class | extends State
EveningState | 晚间工作状态 | class | extends State
SleepingState | 睡眠状态类 | class | extends State
RestState | 下班休息状态类 | class | extends State
StateMode | 状态模式启动类 | class | extends State


状态模式：当一个对象的内在状态改变时允许改变其行为，这个对象看起来像是改变了其类。

####     13. 适配器模式
```
package adapter_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Target | 客户期待的接口 | interface | ---
Adaptee | 需要适配的类 | class | ---
Adapter | 适配器类 | class | implements Target
AdapterMain | 适配器启动类 | class | ---


适配器模式：将一个类的接口转换成客户希望的另一个接口。该模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

####     14. 备忘录模式
```
package memento_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Originator | 发起人类 | class | ---
Memento | 备忘录类 | class | ---
Caretaker | 管理者类 | class | ---
MementoMode | 备忘录模式启动类 | class | ---


备忘录模式：在不破坏封装性的前提下，捕获一个对象的内部状态。这样以后就可以将该对象恢复到原先保存的状态。

####     14. 组合模式
```
package composite_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Component | 对象默认接口 | abstract | ---
Composite | 枝结点 | class | extends Component
Leaf | 叶子结点 | class | extends Component
CompositeMode | 组合模式启动类 | class | ---


组合模式：将对象组成树形结构以表示‘部分-整体’的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。

####     14. 迭代器模式
```
package iterator_mode
```
类名 | 释义 | 类型 | 依赖关系 
---|---|---|---
Iterator | 迭代器抽象类 | abstract | ---
Aggregate | 聚集抽象类 | abstract | ---
ConcreteIterator | 正序迭代器类 | class | extends Iterator
ConcreteIteratorDesc | 逆序迭代器类 | class | extends Iterator
ConcreteAggregate | 具体聚集类 | class | extends Aggregate
IteratorMode | 迭代器模式启动类 | class | ---


迭代器模式：提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露该对象的内部表示。