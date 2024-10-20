package defpackage;

import org.chromium.content.browser.input.ImeAdapterImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.ui.base.EventForwarder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kt1 */
/* loaded from: classes2.dex */
public final class C1397Kt1 implements InterfaceC8775pi1, J44 {
    public final EventForwarder a;
    public boolean g = true;

    @Override // defpackage.InterfaceC8775pi1
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    @Override // defpackage.InterfaceC8775pi1
    public final /* synthetic */ void f() {
    }

    public C1397Kt1(WebContentsImpl webContentsImpl) {
        this.a = webContentsImpl.r0();
        ImeAdapterImpl.b(webContentsImpl).n.add(this);
    }

    @Override // defpackage.InterfaceC8775pi1
    public final void o(boolean z, boolean z2) {
        this.g = !z;
    }
}
