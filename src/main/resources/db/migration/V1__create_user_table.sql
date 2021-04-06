CREATE TABLE IF NOT EXISTS mini_chatroom.user (
    id VARCHAR(36) NOT NULL,
    PRIMARY KEY (id),
    name TEXT NOT NULL,
    login_name TEXT NOT NULL,
    email TEXT,
    phone TEXT,
    created_at TIMESTAMP Default CURRENT_TIMESTAMP,
    last_modified_at TIMESTAMP Default NULL,
    last_login_at TIMESTAMP Default NULL,
    UNIQUE (login_name)
);
INSERT INTO mini_chatroom.user (
        id,
        name,
        login_name,
        email,
        phone,
        created_at
    )
VALUES(
        '674c400f-8f44-45b7-b900-15fb13c03df7',
        'Jerry',
        'j001',
        'jerry@gmail.com',
        '18011405254',
        '2021-04-03T14:29:49.700+00:00'
    ),
    (
        '39dcd71c-bd79-4a42-8283-fa25f80010ef',
        'Tom',
        't001',
        'tom@gmail.com',
        '18380471427',
        '2021-04-03T14:29:49.200+00:00'
    ),
    (
        'efb227e6-374c-4267-b3c9-c1f18868e02e',
        'Bill',
        'b001',
        'bill@gmail.com',
        '15182309758',
        '2021-04-03T14:29:49.100+00:00'
    ),
    (
        '6992c1a9-487c-4b50-81d6-a7ca24338e0e',
        'Atom',
        'a001',
        'atom@gmail.com',
        '13778024361',
        '2021-04-03T14:29:49.130+00:00'
    );
INSERT INTO mini_chatroom.user (
        id,
        name,
        login_name,
        email,
        phone
    )
VALUES (
        '5adc3f20-86a7-488d-ace2-d6574fc28e08',
        'Keven',
        'k001',
        'keven@gmail.com',
        '15981107828'
    );
