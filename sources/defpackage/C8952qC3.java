package defpackage;

import android.content.Context;
import android.view.View;
import org.chromium.chrome.browser.toolbar.top.c;
import org.chromium.chrome.browser.toolbar.top.e;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qC3 */
/* loaded from: classes.dex */
public final class C8952qC3 extends AbstractC2126Qj1 {
    public final C8266oC3 e;
    public final C8619pE3 f;
    public Integer g;

    public C8952qC3(Context context, C3166Yj1 c3166Yj1, InterfaceC3036Xj1 interfaceC3036Xj1, Runnable runnable, C8266oC3 c8266oC3, C8619pE3 c8619pE3) {
        super(context, c3166Yj1, interfaceC3036Xj1, runnable);
        this.e = c8266oC3;
        this.f = c8619pE3;
    }

    @Override // defpackage.InterfaceC1477Lj1
    public final void b() {
        ES3 es3;
        a(null, false);
        View view = this.d;
        C8266oC3 c8266oC3 = this.e;
        if (!c8266oC3.c) {
            c8266oC3.c = true;
            c8266oC3.b = view;
            ((ZC3) c8266oC3.a).q.addView(view);
        }
        e eVar = this.f.a.x.k;
        c cVar = eVar.c;
        if (cVar != null) {
            es3 = cVar.d;
        } else {
            es3 = eVar.b.r;
        }
        this.g = Integer.valueOf(es3.b.a());
    }

    @Override // defpackage.InterfaceC1477Lj1
    public final void hide(int i) {
        ES3 es3;
        C8266oC3 c8266oC3 = this.e;
        if (c8266oC3.c) {
            c8266oC3.c = false;
            ((ZC3) c8266oC3.a).q.removeView(c8266oC3.b);
            c8266oC3.b = null;
        }
        int intValue = this.g.intValue();
        e eVar = this.f.a.x.k;
        c cVar = eVar.c;
        if (cVar != null) {
            es3 = cVar.d;
        } else {
            es3 = eVar.b.r;
        }
        es3.b.c(intValue);
        this.g = null;
        this.c.b();
    }
}
