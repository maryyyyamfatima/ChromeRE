package defpackage;

import java.util.HashMap;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ru3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2313Ru3 implements J44 {
    public static final Object g = new Object();
    public final HashMap a = new HashMap();

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    public static C2313Ru3 a(Tab tab) {
        K44 F = tab.F();
        C2313Ru3 c2313Ru3 = (C2313Ru3) F.b(C2313Ru3.class);
        return c2313Ru3 != null ? c2313Ru3 : (C2313Ru3) F.d(C2313Ru3.class, new C2313Ru3());
    }

    public final Object b(String str) {
        Object obj = this.a.get(str);
        if (obj != g) {
            return obj;
        }
        return null;
    }

    public final void c(Object obj, String str) {
        HashMap hashMap = this.a;
        if (obj == null) {
            obj = g;
        }
        hashMap.put(str, obj);
    }
}
