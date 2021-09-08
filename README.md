# logindemo
登录注册功能
首页网址：http://localhost:8081/user/index

登录逻辑：
1. 填写表单提交后，先根据id查询数据库中的User是否已经注册过
2. 对账号、密码做空值判断，为空输出提示语
3. 用mapper查询，验证账号对应的邮箱是否已经激活，以及密码和验证码是否正确
4. 登录后将登录信息上传到数据库，并且设置token生成登录凭证，验证用户登录有效期
5. 设置登录状态为1

注册逻辑：
1. 填写表单提交后，先根据id查询数据库中的User是否已经注册过
2. 对账号、密码、邮箱等做空值判断，为空输出提示语
3. 用mapper查询，验证账号和邮箱是否已经被注册过
4. 新用户，将用户信息插入数据库，注意密码加入六位随机字符后，再用MD5加密
5. 发送邮箱激活邮件

验证码

1 验证码主要用kaptcha技术生成，在配置类中设置图片大小以及内容文字size，通过textproducer.char.string 设置用来生成验证码的字符，再用length设置验证码字符数

2 调用Producer接口下的两个方法生成图片和文字

3 将验证码存入HttpSession中，将图片输出给浏览器

4 登录时从HttpSession将验证码取出来，和用户输入的code进行对比

token
1 用UUID.randomUUID()生成随机的token，即ticket
2 设置过期时间Expired为当前时间往后推移expiredSeconds
3 创建cookies对象，将token以及过期时间存入
4 用户每次登录会先验证是否包含token，有的话判断是否过期，未过期表示仍在有效期，否则重新登录


