package defpackage;

import android.app.Activity;
import com.android.chrome.R;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;
import org.chromium.base.task.PostTask;
import org.chromium.chrome.browser.download.DownloadUtils;
import org.chromium.chrome.browser.profiles.OTRProfileID;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.LoadUrlParams;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Xs0 */
/* loaded from: classes.dex */
public final class C3080Xs0 extends AbstractC5426fx implements InterfaceC6428is0 {
    public final C2950Ws0 l;
    public C9519rs0 m;
    public final String n;

    @Override // defpackage.InterfaceC5451g12
    public final String q() {
        return "downloads";
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [wj, Ws0] */
    public C3080Xs0(Activity activity, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3, ZX1 zx1, final OTRProfileID oTRProfileID, C7857n12 c7857n12) {
        super(c7857n12);
        Object obj = ThreadUtils.a;
        C0221Bs0 c0221Bs0 = new C0221Bs0();
        c0221Bs0.e = true;
        c0221Bs0.a = oTRProfileID;
        c0221Bs0.b = false;
        c0221Bs0.f = DownloadUtils.i();
        C9519rs0 a = AbstractC7803ms0.a(activity, new C0351Cs0(c0221Bs0), viewOnClickListenerC1069If3, zx1);
        this.m = a;
        a.a.a(this);
        PostTask.c(AbstractC5103f04.a, new RunnableC8147ns0(a, this));
        this.n = activity.getString(R.string.0_resource_name_obfuscated_res_0x7f140621);
        ?? r3 = new InterfaceC11179wj() { // from class: Ws0
            @Override // defpackage.InterfaceC11179wj
            public final void o(Activity activity2, int i) {
                Profile e;
                if (i == 3) {
                    OTRProfileID oTRProfileID2 = OTRProfileID.this;
                    if (oTRProfileID2 == null) {
                        e = Profile.d();
                    } else {
                        e = Profile.d().e(oTRProfileID2);
                    }
                    DownloadUtils.a(e.g());
                }
            }
        };
        this.l = r3;
        ApplicationStatus.e(r3, activity);
        d(this.m.h);
    }

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final void n(String str) {
        this.k = str;
        this.m.b(str);
    }

    @Override // defpackage.InterfaceC5451g12
    public final String getTitle() {
        return this.n;
    }

    @Override // defpackage.InterfaceC6428is0
    public final void b(String str) {
        if (str.equals(this.k)) {
            return;
        }
        LoadUrlParams loadUrlParams = new LoadUrlParams(str, 0);
        loadUrlParams.o = true;
        this.a.b(loadUrlParams, false);
    }

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final void destroy() {
        this.m.a.d(this);
        this.m.a();
        this.m = null;
        ApplicationStatus.h(this.l);
        super.destroy();
    }
}
