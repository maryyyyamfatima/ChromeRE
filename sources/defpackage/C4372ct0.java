package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.chrome.browser.download.DownloadManagerService;
import org.chromium.chrome.browser.profiles.OTRProfileID;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ct0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4372ct0 {
    public final ArrayList a = new ArrayList();
    public final C12157za2 b = new C12157za2();
    public final Q83 c;

    public C4372ct0() {
        Q83 q83 = O83.a;
        this.c = q83;
        if (q83.c("PendingDownloadNotifications")) {
            Iterator it = DownloadManagerService.m(q83, "PendingDownloadNotifications").iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (C3685at0.b(str).a > 0) {
                    this.a.add(C3685at0.b(str));
                }
            }
        }
    }

    public final void a(C3685at0 c3685at0, boolean z) {
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C3685at0 c3685at02 = (C3685at0) it.next();
            if (c3685at02.f.equals(c3685at0.f)) {
                if (c3685at02.equals(c3685at0)) {
                    return;
                } else {
                    it.remove();
                }
            }
        }
        arrayList.add(c3685at0);
        d(z);
        C11814ya2 c11814ya2 = (C11814ya2) this.b.iterator();
        if (c11814ya2.hasNext()) {
            X5.a(c11814ya2.next());
            C6161i50 c6161i50 = c3685at0.f;
            throw null;
        }
    }

    public final void c(C6161i50 c6161i50) {
        boolean z;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((C3685at0) it.next()).f.equals(c6161i50)) {
                it.remove();
                z = true;
                break;
            }
        }
        if (z) {
            d(false);
        }
    }

    public final C3685at0 b(C6161i50 c6161i50) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((C3685at0) arrayList.get(i)).f.equals(c6161i50)) {
                return (C3685at0) arrayList.get(i);
            }
            i++;
        }
    }

    public final void d(boolean z) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                DownloadManagerService.t(this.c, "PendingDownloadNotifications", hashSet, z);
                return;
            }
            C3685at0 c3685at0 = (C3685at0) arrayList.get(i);
            StringBuilder a = AbstractC10761vV3.a(AbstractC8207o22.a(new StringBuilder("7,"), c3685at0.a, ","));
            C6161i50 c6161i50 = c3685at0.f;
            StringBuilder a2 = AbstractC10761vV3.a(Y5.a(AbstractC10761vV3.a(Y5.a(a, c6161i50.a, ",")), c6161i50.b, ","));
            OTRProfileID oTRProfileID = c3685at0.b;
            String str = "1";
            StringBuilder a3 = AbstractC10761vV3.a(Y5.a(AbstractC10761vV3.a(Y5.a(AbstractC10761vV3.a(Y5.a(a2, oTRProfileID != null ? OTRProfileID.serialize(oTRProfileID) : "", ",")), c3685at0.c ? "1" : "0", ",")), c3685at0.e ? "1" : "0", ","));
            if (!c3685at0.g) {
                str = "0";
            }
            StringBuilder a4 = AbstractC10761vV3.a(Y5.a(a3, str, ","));
            a4.append(c3685at0.d);
            hashSet.add(a4.toString());
            i++;
        }
    }
}
