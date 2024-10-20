package defpackage;

import android.view.View;
import java.util.Arrays;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BP {
    public int a;
    public int b;
    public String c;
    public String d;
    public Callback e;
    public boolean f;
    public final Integer[] i;
    public boolean j;
    public final /* synthetic */ CP l;
    public boolean k = true;
    public Integer[] g = new Integer[0];
    public Integer[] h = new Integer[0];

    public final C12099zP a() {
        CP cp = this.l;
        return new C12099zP(C3776b83.a(AbstractC2884Wf.a(cp.a, this.a), cp.a.getResources().getString(this.b), this.c, new View.OnClickListener() { // from class: AP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BP bp = BP.this;
                String str = bp.d;
                CP cp2 = bp.l;
                O73.j(str, cp2.n, cp2.o, cp2.h, (Profile) cp2.p.get());
                if (bp.k) {
                    ((m) cp2.d).l(cp2.e, true, 0);
                }
                bp.e.onResult(view);
                C6862k73 c6862k73 = cp2.f;
                InterfaceC6518j73 interfaceC6518j73 = c6862k73.n;
                if (interfaceC6518j73 != null) {
                    interfaceC6518j73.a(CP.q);
                    c6862k73.n = null;
                }
            }
        }, this.j), Arrays.asList(this.i), Arrays.asList(this.g), Arrays.asList(this.h), this.f);
    }

    public BP(CP cp, Integer... numArr) {
        this.l = cp;
        this.i = numArr;
    }
}
