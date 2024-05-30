# 使用官方的openjdk:21镜像作为基础镜像
FROM openjdk:21

# 设置工作目录
WORKDIR /app

# 将当前目录下的文件复制到镜像中
COPY ./hello-world-1.0.jar /app
COPY ./arthas-boot.jar /app


# 暴露容器端口，如果你的应用需要
EXPOSE 18090

# 使用ENTRYPOINT指令设置入口点脚本
ENTRYPOINT ["java", "-jar", "hello-world-1.0.jar"]
