package defpackage;

import com.google.research.ink.core.jni.NativeEngine;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zK3 */
/* loaded from: classes5.dex */
public final class C12078zK3 implements InterfaceC6882kB0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ BK3 b;

    @Override // defpackage.InterfaceC6882kB0
    public final /* synthetic */ void a() {
    }

    public C12078zK3(BK3 bk3, long j) {
        this.b = bk3;
        this.a = j;
    }

    @Override // defpackage.InterfaceC6882kB0
    public final void b(U02 u02) {
        NativeEngine nativeEngine = (NativeEngine) this.b.b;
        nativeEngine.nativeEngineRunAndDispose(nativeEngine.c, this.a);
    }
}
