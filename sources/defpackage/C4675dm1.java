package defpackage;

import com.google.research.ink.core.jni.NativeEngine;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dm1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4675dm1 implements InterfaceC6882kB0 {
    public static final T82 b = new T82(new C4331cm1(), "InputAction Pool");
    public C3988bm1 a;

    @Override // defpackage.InterfaceC6882kB0
    public final void b(U02 u02) {
        C3988bm1 c3988bm1 = this.a;
        NativeEngine nativeEngine = (NativeEngine) u02;
        nativeEngine.nativeEngineDispatchInput(nativeEngine.c, c3988bm1.a, c3988bm1.b, c3988bm1.c, c3988bm1.d, c3988bm1.e, c3988bm1.f, c3988bm1.g, c3988bm1.h, c3988bm1.i);
    }

    @Override // defpackage.InterfaceC6882kB0
    public final void a() {
        C3988bm1 c3988bm1 = this.a;
        c3988bm1.getClass();
        C3988bm1.j.a.add(c3988bm1);
        this.a = null;
        b.a.add(this);
    }

    public final String toString() {
        return "<InputAction " + String.valueOf(this.a) + ">";
    }
}
