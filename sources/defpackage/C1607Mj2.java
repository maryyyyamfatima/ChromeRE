package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.chrome.browser.partnercustomizations.PartnerBrowserCustomizations;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mj2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1607Mj2 extends AbstractC0185Bl {
    public boolean h;
    public final /* synthetic */ Context i;
    public final /* synthetic */ PartnerBrowserCustomizations j;

    public final void n() {
        C10648v91 c10648v91;
        PartnerBrowserCustomizations partnerBrowserCustomizations = this.j;
        partnerBrowserCustomizations.d = true;
        ArrayList arrayList = partnerBrowserCustomizations.e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        arrayList.clear();
        if (!this.h || (c10648v91 = partnerBrowserCustomizations.f) == null) {
            return;
        }
        c10648v91.e();
    }

    public C1607Mj2(Context context, PartnerBrowserCustomizations partnerBrowserCustomizations) {
        this.j = partnerBrowserCustomizations;
        this.i = context;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void j(Object obj) {
        n();
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        n();
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        try {
            if (((this.i.getApplicationInfo().flags & 1) == 1) && !h()) {
                C8069nf0 c8069nf0 = new C8069nf0();
                if (h()) {
                    return null;
                }
                PartnerBrowserCustomizations partnerBrowserCustomizations = this.j;
                partnerBrowserCustomizations.getClass();
                try {
                    partnerBrowserCustomizations.b = c8069nf0.c();
                } catch (Exception e) {
                    AbstractC4851eH1.f("PartnerCustomize", "Partner disable incognito mode read failed : ", e);
                }
                if (h()) {
                    return null;
                }
                PartnerBrowserCustomizations partnerBrowserCustomizations2 = this.j;
                partnerBrowserCustomizations2.getClass();
                try {
                    partnerBrowserCustomizations2.c = c8069nf0.b();
                } catch (Exception e2) {
                    AbstractC4851eH1.f("PartnerCustomize", "Partner disable bookmarks editing read failed : ", e2);
                }
                if (h()) {
                    return null;
                }
                this.h = this.j.f(c8069nf0);
                return null;
            }
            return null;
        } catch (Exception e3) {
            AbstractC4851eH1.f("PartnerCustomize", "Fetching partner customizations failed", e3);
            return null;
        }
    }
}
