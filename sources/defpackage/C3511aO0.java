package defpackage;

import android.view.ActionMode;
import android.view.ViewStub;
import org.chromium.chrome.browser.findinpage.a;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: aO0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3511aO0 {
    public a a;
    public final ViewStub b;
    public final InterfaceC10590uz3 c;
    public final WindowAndroid d;
    public final ActionMode.Callback e;
    public final C12157za2 f = new C12157za2();
    public final C9861ss g;

    public C3511aO0(ViewStub viewStub, InterfaceC10590uz3 interfaceC10590uz3, C10285u6 c10285u6, KO3 ko3, C9861ss c9861ss) {
        this.b = viewStub;
        this.c = interfaceC10590uz3;
        this.d = c10285u6;
        this.e = ko3;
        this.g = c9861ss;
    }

    public final void a(boolean z) {
        a aVar = this.a;
        if (aVar == null) {
            return;
        }
        aVar.d(z);
    }

    public final void b() {
        if (this.a == null) {
            a aVar = (a) this.b.inflate();
            this.a = aVar;
            aVar.m = this.c;
            aVar.x(aVar.n());
            a aVar2 = this.a;
            aVar2.r = this.d;
            aVar2.g.setCustomSelectionActionModeCallback(this.e);
            this.a.t = new ZN0(this);
        }
        C9861ss c9861ss = this.g;
        if (c9861ss != null && C9861ss.b()) {
            if (c9861ss.b[12] != null) {
                c9861ss.d(12);
            }
            c9861ss.a(this.a, 12);
        }
        this.a.b();
    }
}
