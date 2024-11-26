SRC_DIR = /Users/yitengtang/Desktop/heima/day05-code/src
BUILD_DIR = .

all:
    javac -d $(BUILD_DIR) $(SRC_DIR)/com/yiteng/arraydemo/*.java

run:
    java com.yiteng.arraydemo.ArrayDemo1

