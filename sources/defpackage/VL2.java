package defpackage;

import com.google.research.ink.core.jni.NativeEngine;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class VL2 implements InterfaceC6882kB0 {
    public final String a;

    @Override // defpackage.InterfaceC6882kB0
    public final /* synthetic */ void a() {
    }

    public final String toString() {
        return "<RejectTextureUriAction>";
    }

    public VL2(String str) {
        this.a = str;
    }

    @Override // defpackage.InterfaceC6882kB0
    public final void b(U02 u02) {
        NativeEngine nativeEngine = (NativeEngine) u02;
        nativeEngine.nativeEngineRejectTextureUri(nativeEngine.c, this.a);
    }
}
