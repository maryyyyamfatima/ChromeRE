package defpackage;

import J.N;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.site_settings.WebsitePreferenceBridge;
import org.chromium.content_public.browser.BrowserContextHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: io4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6408io4 implements Serializable {
    public final C6751jo4 a;
    public final C6751jo4 g;
    public C4498dF1 j;
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public C6408io4(C6751jo4 c6751jo4, C6751jo4 c6751jo42) {
        this.a = c6751jo4;
        this.g = c6751jo42;
    }

    public final boolean j() {
        C6751jo4 c6751jo4;
        return (!this.a.f().equals("*") || (c6751jo4 = this.g) == null || c6751jo4.f().equals("*")) ? false : true;
    }

    public final int b(C6408io4 c6408io4) {
        C6751jo4 c6751jo4;
        C6751jo4 c6751jo42;
        if (this == c6408io4) {
            return 0;
        }
        if (j()) {
            c6751jo4 = this.g;
        } else {
            c6751jo4 = this.a;
        }
        if (c6408io4.j()) {
            c6751jo42 = c6408io4.g;
        } else {
            c6751jo42 = c6408io4.a;
        }
        int compareTo = c6751jo4.compareTo(c6751jo42);
        if (compareTo != 0) {
            return compareTo;
        }
        if (c() == null) {
            return c6408io4.c() == null ? 0 : -1;
        }
        if (c6408io4.c() == null) {
            return 1;
        }
        return c().compareTo(c6408io4.c());
    }

    public final String g() {
        C6751jo4 c6751jo4;
        if (j()) {
            c6751jo4 = this.g;
        } else {
            c6751jo4 = this.a;
        }
        return c6751jo4.f();
    }

    public final C6751jo4 c() {
        if (j()) {
            return null;
        }
        return this.g;
    }

    public final C1128Ir2 f(int i) {
        return (C1128Ir2) this.i.get(Integer.valueOf(i));
    }

    public final L50 e(int i) {
        return (L50) this.h.get(Integer.valueOf(i));
    }

    public final void l(int i, L50 l50) {
        this.h.put(Integer.valueOf(i), l50);
    }

    public final Integer d(Profile profile, int i) {
        if (f(i) != null) {
            C1128Ir2 f = f(i);
            String str = f.h;
            String str2 = f.g;
            if (str2 == null) {
                str2 = str;
            }
            return Integer.valueOf(N.MrCE1oma(profile, f.i, str, str2));
        }
        if (e(i) != null) {
            return e(i).i;
        }
        return null;
    }

    public final void k(BrowserContextHandle browserContextHandle, int i, int i2) {
        if (f(i) != null) {
            C1128Ir2 f = f(i);
            String str = f.h;
            String str2 = f.g;
            if (str2 == null) {
                str2 = str;
            }
            N.MKKuVgiF(browserContextHandle, f.i, str, str2, i2);
            return;
        }
        L50 e = e(i);
        C6751jo4 c6751jo4 = this.a;
        if (i == 25) {
            if (e == null) {
                e = new L50(25, c6751jo4.d(), 2);
                l(i, e);
            }
        } else if (i == 2) {
            if (e == null) {
                e = new L50(2, c6751jo4.h, Integer.valueOf(i2));
                l(i, e);
            }
            if (i2 == 2) {
                FI2.a("JavascriptContentSetting.EnableBy.SiteSettings");
            } else {
                FI2.a("JavascriptContentSetting.DisableBy.SiteSettings");
            }
        } else if (i == 30) {
            if (e == null) {
                e = new L50(30, c6751jo4.h, Integer.valueOf(i2));
                l(i, e);
            }
            if (i2 == 2) {
                FI2.a("SoundContentSetting.MuteBy.SiteSettings");
            } else {
                FI2.a("SoundContentSetting.UnmuteBy.SiteSettings");
            }
        }
        if (e != null) {
            String str3 = e.h;
            if (str3 == null) {
                str3 = "*";
            }
            int i3 = e.a;
            if (i3 == 0) {
                str3.equals("*");
            }
            N.M2hAJhrO(browserContextHandle, i3, e.g, str3, i2);
        }
    }

    public final boolean i(int i) {
        C1128Ir2 f = f(i);
        if (f != null && f.a) {
            return true;
        }
        L50 e = e(i);
        return e != null && e.k;
    }

    public final void a(Profile profile, final InterfaceC6065ho4 interfaceC6065ho4) {
        ArrayList arrayList = this.k;
        final int[] iArr = {arrayList.size() + 1};
        WebsitePreferenceBridge.StorageInfoClearedCallback storageInfoClearedCallback = new WebsitePreferenceBridge.StorageInfoClearedCallback() { // from class: go4
            @Override // org.chromium.components.browser_ui.site_settings.WebsitePreferenceBridge.StorageInfoClearedCallback
            public final void onStorageInfoCleared() {
                int[] iArr2 = iArr;
                int i = iArr2[0] - 1;
                iArr2[0] = i;
                if (i == 0) {
                    interfaceC6065ho4.b();
                }
            }
        };
        C4498dF1 c4498dF1 = this.j;
        if (c4498dF1 == null) {
            storageInfoClearedCallback.onStorageInfoCleared();
        } else {
            String str = c4498dF1.a;
            N.Mks53EZS(profile, str);
            N.M101q5hN(profile, str, storageInfoClearedCallback);
            this.j = null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7426lm3 c7426lm3 = (C7426lm3) it.next();
            N.MykycHKg(profile, c7426lm3.a, c7426lm3.g, storageInfoClearedCallback);
        }
        arrayList.clear();
    }

    public final long h() {
        C4498dF1 c4498dF1 = this.j;
        long j = c4498dF1 != null ? 0 + c4498dF1.g : 0L;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            j += ((C7426lm3) it.next()).h;
        }
        return j;
    }
}
