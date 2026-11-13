package com.campus;

import java.util.Scanner;

/**
 * V1.0 项目初始化：程序入口 + 控制台登录。
 *
 * <p>版本约束（任务1）：本阶段全部逻辑写在主类中，不做分层、不抽工具类，
 * 故意形成代码耦合，为后续迭代（任务2~任务10）制造重构空间。</p>
 *
 * @author 课程设计
 * @version V1.0
 */
public class SystemMain {

    /** 内置管理员账号（V1.0 阶段硬编码） */
    private static final String ADMIN_USERNAME = "admin";

    /** 内置管理员密码（V1.0 阶段硬编码） */
    private static final String ADMIN_PASSWORD = "123456";

    /** 内置学生账号（V1.0 阶段硬编码） */
    private static final String STUDENT_USERNAME = "student";

    /** 内置学生密码（V1.0 阶段硬编码） */
    private static final String STUDENT_PASSWORD = "123456";

    /**
     * 程序入口：基于 Scanner 读取账号密码，校验后区分管理员 / 学生身份。
     *
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("        校园资源预约管理系统  V1.0（登录）");
        System.out.println("==================================================");
        System.out.println("内置测试账号：admin / 123456（管理员），student / 123456（学生）");

        while (true) {
            System.out.print("\n请输入账号（输入 exit 退出系统）：");
            if (!scanner.hasNextLine()) {
                break;
            }
            String username = scanner.nextLine().trim();
            if ("exit".equalsIgnoreCase(username)) {
                break;
            }

            System.out.print("请输入密码：");
            if (!scanner.hasNextLine()) {
                break;
            }
            String password = scanner.nextLine().trim();

            if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
                // 管理员登录成功
                System.out.println("登录成功！欢迎您，管理员【admin】。");
                System.out.println("提示：V1.0 仅实现登录功能，管理员业务菜单将在任务6 迭代。");
                break;
            } else if (STUDENT_USERNAME.equals(username) && STUDENT_PASSWORD.equals(password)) {
                // 学生登录成功
                System.out.println("登录成功！欢迎您，学生【student】。");
                System.out.println("提示：V1.0 仅实现登录功能，学生业务菜单将在任务6 迭代。");
                break;
            } else {
                // 登录失败，允许重试
                System.out.println("登录失败：账号或密码错误，请重新输入。");
            }
        }

        System.out.println("系统已退出，感谢使用。");
        scanner.close();
    }
}

