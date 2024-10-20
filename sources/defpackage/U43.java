package defpackage;

import com.google.research.ink.core.jni.NativeDocumentImpl;
import com.google.research.ink.core.jni.NativeEngine;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes5.dex */
public final class U43 implements InterfaceC6882kB0 {
    public final NativeDocumentImpl a;

    @Override // defpackage.InterfaceC6882kB0
    public final /* synthetic */ void a() {
    }

    public final String toString() {
        return "<SetDocumentAction>";
    }

    public U43(T02 t02) {
        if (!(t02 instanceof NativeDocumentImpl)) {
            throw new RuntimeException("I don't know how you did this, but you broke the universe by constructing a NativeDocument that isn't a NativeDocumentImpl. Well played!");
        }
        this.a = (NativeDocumentImpl) t02;
    }

    @Override // defpackage.InterfaceC6882kB0
    public final void b(U02 u02) {
        NativeEngine nativeEngine = (NativeEngine) u02;
        long j = nativeEngine.c;
        this.a.getClass();
        nativeEngine.nativeEngineSetDocument(j, 0L);
    }
}
