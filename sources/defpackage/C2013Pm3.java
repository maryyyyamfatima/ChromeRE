package defpackage;

import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pm3 */
/* loaded from: classes.dex */
public final class C2013Pm3 implements RO2 {
    public final C8840pt0 a;
    public final C3492aK1 b;

    @Override // defpackage.RO2
    public final boolean a(Object obj, C0543Ee2 c0543Ee2) {
        this.a.getClass();
        return true;
    }

    @Override // defpackage.RO2
    public final JO2 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        SI2 si2;
        boolean z;
        C3461aE0 c3461aE0;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof SI2) {
            z = false;
            si2 = (SI2) inputStream;
        } else {
            si2 = new SI2(inputStream, this.b);
            z = true;
        }
        ArrayDeque arrayDeque = C3461aE0.h;
        synchronized (arrayDeque) {
            c3461aE0 = (C3461aE0) arrayDeque.poll();
        }
        if (c3461aE0 == null) {
            c3461aE0 = new C3461aE0();
        }
        C3461aE0 c3461aE02 = c3461aE0;
        c3461aE02.a = si2;
        C4533dM1 c4533dM1 = new C4533dM1(c3461aE02);
        C1883Om3 c1883Om3 = new C1883Om3(si2, c3461aE02);
        try {
            C8840pt0 c8840pt0 = this.a;
            C12296zy a = c8840pt0.a(new C2766Vh1(c8840pt0.c, c4533dM1, c8840pt0.d), i, i2, c0543Ee2, c1883Om3);
            c3461aE02.g = null;
            c3461aE02.a = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(c3461aE02);
            }
            if (z) {
                si2.c();
            }
            return a;
        } catch (Throwable th) {
            c3461aE02.g = null;
            c3461aE02.a = null;
            ArrayDeque arrayDeque2 = C3461aE0.h;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(c3461aE02);
                if (z) {
                    si2.c();
                }
                throw th;
            }
        }
    }

    public C2013Pm3(C8840pt0 c8840pt0, C3492aK1 c3492aK1) {
        this.a = c8840pt0;
        this.b = c3492aK1;
    }
}
