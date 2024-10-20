package org.chromium.chrome.browser.feedback;

import J.N;
import defpackage.AbstractC0185Bl;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC5103f04;
import defpackage.C6841k40;
import defpackage.X30;
import defpackage.Y30;
import java.net.MalformedURLException;
import java.net.URL;
import org.chromium.base.task.PostTask;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class ConnectivityChecker {
    public static void executeCallback(Object obj, int i) {
        ((C6841k40) obj).a(i);
    }

    public static void a(boolean z, C6841k40 c6841k40) {
        String str = z ? "https://clients4.google.com/generate_204" : "http://clients4.google.com/generate_204";
        if (!N.MGhgrVHC(str)) {
            AbstractC4851eH1.f("feedback", "Predefined URL invalid.", new Object[0]);
            PostTask.c(AbstractC5103f04.a, new X30(c6841k40));
            return;
        }
        try {
            new Y30(new URL(str), c6841k40).c(AbstractC0185Bl.e);
        } catch (MalformedURLException e) {
            AbstractC4851eH1.f("feedback", "Failed to parse predefined URL: " + e, new Object[0]);
            PostTask.c(AbstractC5103f04.a, new X30(c6841k40));
        }
    }
}
