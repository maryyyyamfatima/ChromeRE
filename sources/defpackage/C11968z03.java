package defpackage;

import J.N;
import java.util.concurrent.TimeUnit;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: z03, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11968z03 implements J44 {
    public long a = -1;
    public C11625y03 g;

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    public static C11968z03 a(Tab tab) {
        C11968z03 c11968z03 = (C11968z03) tab.F().b(C11968z03.class);
        if (c11968z03 == null) {
            return null;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - c11968z03.a);
        C7928nE c7928nE = UN.a;
        if (!(seconds >= ((long) N.M37SqSAy("SearchResumptionModuleAndroid", "tab_expiration_time", 3600)))) {
            return c11968z03;
        }
        tab.F().c(C11968z03.class);
        return null;
    }
}
