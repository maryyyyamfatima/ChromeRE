package defpackage;

import org.chromium.base.Callback;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: uL */
/* loaded from: classes.dex */
public final /* synthetic */ class C10364uL implements Callback {
    public final /* synthetic */ C11736yL a;
    public final /* synthetic */ Callback g;
    public final /* synthetic */ InterfaceC0079Ap3 h;
    public final /* synthetic */ boolean i;

    public /* synthetic */ C10364uL(C11736yL c11736yL, C11421xQ2 c11421xQ2, InterfaceC7697ma2 interfaceC7697ma2, boolean z) {
        this.a = c11736yL;
        this.g = c11421xQ2;
        this.h = interfaceC7697ma2;
        this.i = z;
    }

    @Override // org.chromium.base.Callback
    public final ZE e0(Object obj) {
        return new ZE(this, obj);
    }

    @Override // org.chromium.base.Callback
    public final void onResult(Object obj) {
        Callback callback = this.g;
        InterfaceC0079Ap3 interfaceC0079Ap3 = this.h;
        boolean z = this.i;
        WebContents webContents = (WebContents) obj;
        C11736yL c11736yL = this.a;
        c11736yL.getClass();
        SelectionPopupControllerImpl.k(webContents).k = new C11393xL(c11736yL.b, webContents, callback, interfaceC0079Ap3, z);
    }
}
