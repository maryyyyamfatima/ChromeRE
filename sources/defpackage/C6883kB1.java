package defpackage;

import android.content.ComponentName;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kB1 */
/* loaded from: classes.dex */
public final class C6883kB1 implements InterfaceC6518j73 {
    public final /* synthetic */ C7227lB1 a;

    @Override // defpackage.InterfaceC6518j73
    public final void a(ComponentName componentName) {
        EI2.g("LightweightReactions.TimeTo.ShareGif", this.a.f(), 10L, AbstractC10659vB1.a, 40);
        EI2.b("LightweightReactions.GifShared", true);
        EI2.h(3, 4, "LightweightReactions.Funnel");
        EI2.h(!componentName.equals(CP.q) ? 1 : 0, 2, "LightweightReactions.ShareDestination");
    }

    @Override // defpackage.InterfaceC6518j73
    public final void onCancel() {
        EI2.g("LightweightReactions.TimeTo.DismissShare", this.a.f(), 10L, AbstractC10659vB1.a, 40);
        EI2.b("LightweightReactions.GifShared", false);
    }

    public C6883kB1(C7227lB1 c7227lB1) {
        this.a = c7227lB1;
    }
}
