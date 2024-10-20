package defpackage;

import java.lang.reflect.Method;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ov2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8511ov2 {
    public void a(Throwable th, Throwable th2) {
        AbstractC0087Ar1.e(th, "cause");
        AbstractC0087Ar1.e(th2, "exception");
        Method method = AbstractC8167nv2.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public XG2 b() {
        return new CH0();
    }
}
