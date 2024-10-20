package defpackage;

import android.content.ComponentName;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: n73, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7894n73 implements InterfaceC6518j73 {
    public final /* synthetic */ C12010z73 a;

    @Override // defpackage.InterfaceC6518j73
    public final void a(ComponentName componentName) {
        EI2.h(0, 3, "WebShare.ShareOutcome");
        this.a.a(0);
    }

    @Override // defpackage.InterfaceC6518j73
    public final void onCancel() {
        EI2.h(2, 3, "WebShare.ShareOutcome");
        this.a.a(3);
    }

    public C7894n73(C12010z73 c12010z73) {
        this.a = c12010z73;
    }
}
