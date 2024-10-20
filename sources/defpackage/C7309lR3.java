package defpackage;

import org.chromium.base.Callback;
import org.chromium.chrome.browser.toolbar.top.ToolbarTablet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lR3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C7309lR3 implements Callback {
    public final /* synthetic */ InterfaceC11299x32 a;

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        int i = ToolbarTablet.U;
        float max = Math.max(1.0f - (((Float) obj).floatValue() * 2.5f), 0.0f);
        InterfaceC11299x32 interfaceC11299x32 = this.a;
        interfaceC11299x32.j(max);
        interfaceC11299x32.d(max);
    }
}
