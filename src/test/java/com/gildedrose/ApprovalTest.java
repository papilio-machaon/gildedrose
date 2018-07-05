package com.gildedrose;

import com.oneeyedmen.okeydoke.junit.ApprovalsRule;
import org.junit.Rule;
import org.junit.Test;

public class ApprovalTest {
    @Rule
    public final ApprovalsRule approver = ApprovalsRule.fileSystemRule("src/test/resources/approval");

    @Test
    public void preservesBehaviour() {
        approver.assertApproved("foo");
    }
}
