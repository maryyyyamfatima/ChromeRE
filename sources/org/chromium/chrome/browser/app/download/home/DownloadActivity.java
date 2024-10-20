package org.chromium.chrome.browser.app.download.home;

import android.os.Bundle;
import defpackage.A5;
import defpackage.AbstractActivityC0159Bf3;
import defpackage.AbstractC0913Ha2;
import defpackage.AbstractC1741Nk1;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC5103f04;
import defpackage.AbstractC7803ms0;
import defpackage.C0221Bs0;
import defpackage.C0351Cs0;
import defpackage.C12157za2;
import defpackage.C3070Xq0;
import defpackage.C4998ej;
import defpackage.C8490os;
import defpackage.C9519rs0;
import defpackage.InterfaceC8146ns;
import defpackage.RunnableC8147ns0;
import defpackage.ZX1;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.download.DownloadUtils;
import org.chromium.chrome.browser.download.home.toolbar.DownloadHomeToolbar;
import org.chromium.chrome.browser.profiles.OTRProfileID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class DownloadActivity extends AbstractActivityC0159Bf3 {
    public C9519rs0 C;
    public A5 D;
    public ZX1 E;
    public String F;
    public final C3070Xq0 G = new C3070Xq0(this);
    public OTRProfileID H;

    @Override // defpackage.AbstractActivityC0159Bf3, defpackage.AbstractActivityC4038bu3, defpackage.LM, defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.F = bundle == null ? "chrome-native://downloads/" : bundle.getString("current_url");
        AbstractC0913Ha2.a();
        boolean j = AbstractC2281Ro1.j(getIntent(), "org.chromium.chrome.browser.download.SHOW_PREFETCHED_CONTENT", false);
        this.D = new A5(new WeakReference(this));
        this.H = OTRProfileID.a(AbstractC2281Ro1.u("org.chromium.chrome.browser.download.OTR_PROFILE_ID", getIntent().getExtras()));
        C0221Bs0 c0221Bs0 = new C0221Bs0();
        c0221Bs0.e = true;
        c0221Bs0.a = this.H;
        c0221Bs0.b = true;
        c0221Bs0.f = DownloadUtils.i();
        c0221Bs0.g = j;
        C0351Cs0 c0351Cs0 = new C0351Cs0(c0221Bs0);
        ZX1 zx1 = new ZX1(new C4998ej(this));
        this.E = zx1;
        C9519rs0 a = AbstractC7803ms0.a(this, c0351Cs0, this.B, zx1);
        this.C = a;
        setContentView(a.h);
        if (!j) {
            this.C.b(this.F);
        }
        C9519rs0 c9519rs0 = this.C;
        C12157za2 c12157za2 = c9519rs0.a;
        C3070Xq0 c3070Xq0 = this.G;
        c12157za2.a(c3070Xq0);
        PostTask.c(AbstractC5103f04.a, new RunnableC8147ns0(c9519rs0, c3070Xq0));
        final C9519rs0 c9519rs02 = this.C;
        Objects.requireNonNull(c9519rs02);
        C8490os.a(this, this.l, new InterfaceC8146ns() { // from class: Wq0
            @Override // defpackage.InterfaceC8146ns
            public final boolean onBackPressed() {
                boolean z;
                boolean z2;
                C9519rs0 c9519rs03 = (C9519rs0) InterfaceC6771js0.this;
                C7526m33 c7526m33 = c9519rs03.b.c.k;
                if (c7526m33.e()) {
                    c7526m33.b();
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    DownloadHomeToolbar downloadHomeToolbar = c9519rs03.d.i;
                    if (downloadHomeToolbar.b0) {
                        downloadHomeToolbar.I();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        return false;
                    }
                }
                return true;
            }
        });
    }

    @Override // defpackage.LM, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.F;
        if (str != null) {
            bundle.putString("current_url", str);
        }
    }

    @Override // defpackage.VS0, android.app.Activity
    public final void onResume() {
        super.onResume();
        DownloadUtils.a(AbstractC1741Nk1.c(this.H));
    }

    @Override // defpackage.LM, androidx.appcompat.app.a, defpackage.VS0, android.app.Activity
    public final void onDestroy() {
        this.C.a.d(this.G);
        this.C.a();
        this.E.b();
        super.onDestroy();
    }

    @Override // defpackage.LM, defpackage.InterfaceC3562aY1
    public final ZX1 N() {
        return this.E;
    }

    @Override // defpackage.VS0, defpackage.AbstractActivityC6817k00, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.D.f(i, strArr, iArr);
    }
}
