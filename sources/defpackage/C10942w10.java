package defpackage;

import android.os.Looper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: w10 */
/* loaded from: classes.dex */
public final /* synthetic */ class C10942w10 {
    public static void a(C7849n00 c7849n00) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            int i = S00.P;
            if (c7849n00.f == null) {
                return;
            }
            c7849n00.o(new C6383ik3(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
            return;
        }
        int i2 = S00.P;
        if (c7849n00.f == null) {
            return;
        }
        c7849n00.m(new C6383ik3(0, new Object[0]), "updateState:ComponentType.triggerStateUpdate");
    }
}
