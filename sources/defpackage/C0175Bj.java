package defpackage;

import org.chromium.base.ThreadUtils;
import org.chromium.components.crash.CrashKeys;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175Bj implements InterfaceC11522xj {
    public String a;

    @Override // defpackage.InterfaceC11522xj
    public final void n(int i) {
        Object obj = ThreadUtils.a;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        String str = z ? "app_foreground" : "app_background";
        if (str.equals(this.a)) {
            return;
        }
        this.a = str;
        CrashKeys.getInstance().set(2, str);
    }
}
