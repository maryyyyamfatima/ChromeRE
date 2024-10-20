package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gv0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5759gv0 implements InterfaceC6103hv0 {
    public Long a;

    @Override // defpackage.InterfaceC6103hv0
    public final boolean a() {
        if (this.a == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                this.a = Long.valueOf(((Long) declaredMethod.invoke(null, "ro.build.version.oneui")).longValue());
            } catch (Exception unused) {
                this.a = -1L;
            }
        }
        return this.a.longValue() >= 40100;
    }
}
