package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7908nA implements InterfaceC0096At0 {
    public InterfaceC1944Oz a;
    public C7526m33 b;
    public AccessibilityManager c;
    public boolean d;
    public final /* synthetic */ C8252oA e;

    public C7908nA(C8252oA c8252oA) {
        this.e = c8252oA;
    }

    @Override // defpackage.InterfaceC0096At0
    public final boolean b() {
        return !this.d && ((C8252oA) this.a).b() == 2;
    }

    @Override // defpackage.InterfaceC0096At0
    public final boolean a() {
        return b() && this.b.e();
    }
}
