package ru.whoy.hello.entity;

import javafx.util.Builder;
import org.junit.Test;


import static org.assertj.core.api.Assertions.*;

public class TaskTest {

    @Test
    public void test_task_creation_with_builder() {
        String simpleName = "simple name";
        Task task = new Task.TaskBuilder().setName(simpleName).build();

        assertThat(task.getName()).isEqualTo(simpleName);
    }

    @Test
    public void test_account_creation_with_builder() {
        String userId = "userid";
        Account account = Account.newBuilder().setUserId(userId).build();

        assertThat(account.getUserId()).isEqualTo(userId);
    }

}