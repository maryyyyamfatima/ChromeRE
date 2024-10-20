package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.chromium.base.Callback;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Q23 implements G23 {
    public final Callback a;
    public final C0231Bu0 b;
    public boolean c;

    public Q23(Context context, F23 f23, View view, ArrayList arrayList, int[] iArr, boolean z, WebContentsImpl webContentsImpl) {
        this.a = f23;
        C0231Bu0 c0231Bu0 = new C0231Bu0(context, view);
        this.b = c0231Bu0;
        N23 n23 = new N23(this);
        InterfaceC0751Fu0 interfaceC0751Fu0 = c0231Bu0.a;
        interfaceC0751Fu0.k(n23);
        interfaceC0751Fu0.j(iArr.length > 0 ? iArr[0] : -1);
        interfaceC0751Fu0.f(new C6097hu0(context, arrayList));
        interfaceC0751Fu0.h(z);
        interfaceC0751Fu0.g(new O23(this));
        GestureListenerManagerImpl.d(webContentsImpl).b(new P23(this));
    }

    public final void c(int[] iArr) {
        if (this.c) {
            return;
        }
        this.a.onResult(iArr);
        this.c = true;
    }

    @Override // defpackage.G23
    public final void b() {
        this.b.a.e();
    }

    @Override // defpackage.G23
    public final void a(boolean z) {
        C0231Bu0 c0231Bu0 = this.b;
        if (z) {
            c0231Bu0.a.dismiss();
            c(null);
        } else {
            this.c = true;
            c0231Bu0.a.dismiss();
        }
    }
}
