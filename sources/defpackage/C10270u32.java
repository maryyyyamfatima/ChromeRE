package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import org.chromium.chrome.browser.ntp.NewTabPageLayout;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: u32 */
/* loaded from: classes.dex */
public final class C10270u32 extends C3848bM3 {
    public final /* synthetic */ C10613v32 g;

    @Override // defpackage.C3848bM3, defpackage.VL3
    public final void a(int i, PL3 pl3) {
        C10613v32 c10613v32 = this.g;
        if (c10613v32.E) {
            return;
        }
        super.a(i, pl3);
        Iterator it = c10613v32.r.iterator();
        while (true) {
            C11814ya2 c11814ya2 = (C11814ya2) it;
            if (!c11814ya2.hasNext()) {
                break;
            }
            C6514j7 c6514j7 = (C6514j7) c11814ya2.next();
            c6514j7.getClass();
            if (pl3.a.d == 0) {
                c6514j7.a = c10613v32.a.getUrl().e();
            }
        }
        if (i != 6) {
            EI2.k((System.nanoTime() - c10613v32.C) / 1000000, "NewTabPage.MostVisitedTime");
        }
    }

    @Override // defpackage.C3848bM3, defpackage.VL3
    public final void b(List list) {
        C10613v32 c10613v32 = this.g;
        if (c10613v32.E) {
            return;
        }
        super.b(list);
        NewTabPageLayout newTabPageLayout = c10613v32.v;
        if (newTabPageLayout.v) {
            return;
        }
        newTabPageLayout.v = true;
        newTabPageLayout.j();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10270u32(C10613v32 c10613v32, Context context, Profile profile, C9162qp3 c9162qp3, ViewOnClickListenerC1069If3 viewOnClickListenerC1069If3) {
        super(context, profile, c9162qp3, viewOnClickListenerC1069If3);
        this.g = c10613v32;
    }
}
