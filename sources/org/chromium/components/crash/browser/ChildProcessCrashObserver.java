package org.chromium.components.crash.browser;

import defpackage.AbstractC0185Bl;
import defpackage.AbstractC4851eH1;
import defpackage.AbstractC9076qb1;
import defpackage.C0781Ga0;
import defpackage.C6941kN;
import defpackage.RunnableC3482aI1;
import defpackage.V60;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class ChildProcessCrashObserver {
    public static C6941kN a;

    public static void childCrashed(int i) {
        if (a == null) {
            AbstractC4851eH1.f("ChildCrashObserver", "Ignoring crash observed before a callback was registered...", new Object[0]);
            return;
        }
        C0781Ga0 c0781Ga0 = new C0781Ga0(V60.a.getCacheDir());
        c0781Ga0.f();
        File[] g = c0781Ga0.g(Pattern.compile("\\.dmp" + Integer.toString(i) + "\\z"));
        File file = g.length > 0 ? g[0] : null;
        if (file != null) {
            AbstractC0185Bl.e.execute(new RunnableC3482aI1(file));
        } else {
            AbstractC4851eH1.a("BrowserInitializer", AbstractC9076qb1.a("Missing dump for child ", i), new Object[0]);
        }
    }
}
