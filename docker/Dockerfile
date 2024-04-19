# 使用官方的Ubuntu 24.04镜像作为基础镜像
FROM ubuntu-jdk21:1.0

# 设置工作目录
WORKDIR /app

# 将当前目录下的文件复制到镜像中
COPY hello-world-1.0.jar /app


# 暴露容器端口，如果你的应用需要
EXPOSE 18090

# 使用ENTRYPOINT指令设置入口点脚本
ENTRYPOINT ["java", "-jar", "hello-world-1.0.jar"]
