package defpackage;

import org.chromium.chrome.browser.AppHooks;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: sh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9795sh {
    public static C9795sh a;

    public void a() {
    }

    public void c(Um4 um4) {
    }

    public void d(String str, String str2) {
    }

    public static C9795sh b() {
        if (a == null) {
            a = AppHooks.get().c();
        }
        return a;
    }
}
