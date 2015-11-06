# AES-iOS-Android  -iOS与Java通过AES加解密的通用接口（亲测通过）

jce_policy-6.zip 下载链接：http://www.oracle.com/technetwork/java/javase/downloads/jce-6-download-429243.html

下载解压后将里边的两个jar包(local_policy.jar,US_export_policy.jar)替换掉jdk安装路径下security文件夹中的两个包。

要实现在java端用PKCS7Padding填充，需要用到bouncycastle组件来实现，bcprov-jdk16-139.jar 下载链接：http://www.bouncycastle.org
