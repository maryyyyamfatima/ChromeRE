package org.chromium.chrome.browser.init;

import defpackage.AbstractC5103f04;
import defpackage.C9915t12;
import defpackage.RC;
import defpackage.RunnableC10258u12;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class NativeStartupBridge {
    public static void loadFullBrowser() {
        if (RC.a().e()) {
            return;
        }
        PostTask.c(AbstractC5103f04.a, new RunnableC10258u12(new C9915t12()));
    }
}
