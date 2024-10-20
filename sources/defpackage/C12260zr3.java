package defpackage;

import android.app.Activity;
import android.content.Context;
import org.chromium.chrome.browser.AppHooks;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zr3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C12260zr3 {
    public static C12260zr3 a;

    public void a(Context context, String str, PP pp, QP qp) {
    }

    public boolean c(String str) {
        return false;
    }

    public void d(Activity activity, String str, I5 i5) {
    }

    public static C12260zr3 b() {
        if (a == null) {
            a = AppHooks.get().q();
        }
        return a;
    }
}
