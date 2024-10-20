package defpackage;

import com.google.research.ink.core.jni.NativeEngine;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nX */
/* loaded from: classes5.dex */
public final class C8023nX implements InterfaceC6882kB0 {
    public final C7313lS2 a;

    @Override // defpackage.InterfaceC6882kB0
    public final /* synthetic */ void a() {
    }

    public C8023nX(C7313lS2 c7313lS2) {
        this.a = c7313lS2;
    }

    @Override // defpackage.InterfaceC6882kB0
    public final void b(U02 u02) {
        NativeEngine nativeEngine = (NativeEngine) u02;
        nativeEngine.nativeEngineHandleCommand(nativeEngine.c, this.a.toByteArray());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<CommandAction:");
        C7313lS2 c7313lS2 = this.a;
        if (c7313lS2.j == 9) {
            sb.append(" addElement");
        }
        if (c7313lS2.j == 11) {
            sb.append(" setBackgroundColor");
        }
        if (c7313lS2.j == 10) {
            sb.append(" backgroundImage");
        }
        if (c7313lS2.j == 4) {
            sb.append(" cameraPosition");
        }
        if (c7313lS2.j == 18) {
            sb.append(" deselectAll");
        }
        if (c7313lS2.j == 7) {
            sb.append(" flagAssignment");
        }
        if (c7313lS2.j == 6) {
            sb.append(" imageExport");
        }
        if (c7313lS2.j == 5) {
            sb.append(" pageBounds");
        }
        if (c7313lS2.j == 15) {
            sb.append(" sequencePoint");
        }
        if (c7313lS2.j == 16) {
            sb.append(" setCallbackFlags");
        }
        if (c7313lS2.j == 53) {
            sb.append(" setCameraConstraints");
        }
        if (c7313lS2.j == 54) {
            sb.append(" setCameraMovementConstraints");
        }
        if (c7313lS2.j == 12) {
            sb.append(" setOutOfBoundsColor");
        }
        if (c7313lS2.j == 13) {
            sb.append(" setPageBorder");
        }
        if (c7313lS2.j == 1) {
            sb.append(" setViewport");
        }
        if (c7313lS2.j == 2) {
            sb.append(" toolParams");
        }
        sb.append(">");
        return sb.toString();
    }
}
