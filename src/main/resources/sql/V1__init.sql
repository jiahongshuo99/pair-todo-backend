-- 创建用户表
CREATE TABLE IF NOT EXISTS user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    account_id BIGINT NOT NULL UNIQUE,
    username VARCHAR(64) NOT NULL,
    password VARCHAR(255) NOT NULL,
    phone VARCHAR(20) NOT NULL UNIQUE,
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- 创建 pair 表
CREATE TABLE IF NOT EXISTS pair (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id_1 BIGINT NOT NULL,
    user_id_2 BIGINT NOT NULL,
    status TINYINT NOT NULL,  -- pair关系状态：0-已解除；1-生效中
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


CREATE TABLE IF NOT EXISTS todo (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,

    -- 标题与描述
    title VARCHAR(255) NOT NULL,
    description TEXT,

    -- 创建人和指派对象
    creator_id BIGINT NOT NULL,
    assignee_id BIGINT NOT NULL,  -- 可与 creator_id 相同，或为配对用户

    -- 是否为共享任务
    is_shared BOOLEAN DEFAULT FALSE,

    -- 任务类型：0-一次性，1-周期性
    type TINYINT NOT NULL,

    -- 时间范围
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,

    -- 周期规则（针对周期性任务）
    recurrence_type TINYINT, -- 1-每天，2-每周，3-每月
    recurrence_count INT, -- 每周期执行次数，如每周执行3次

    -- 当前任务状态：0-未完成，1-已完成
    status TINYINT DEFAULT 0,

    -- 数据维护字段
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);