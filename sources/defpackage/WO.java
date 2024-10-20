package defpackage;

import J.N;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.h;
import com.android.chrome.R;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.TabImpl;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class WO extends AbstractC2242Rg2 {
    public final WebContents g;
    public final InterfaceC0079Ap3 h;
    public final InterfaceC0079Ap3 i;
    public final Context j;
    public final Profile k;
    public final InterfaceC0079Ap3 l;
    public final XO m;
    public final InterfaceC1308Kb2 n;
    public String o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WO(android.app.Activity r7, org.chromium.content_public.browser.WebContents r8, defpackage.InterfaceC0079Ap3 r9, defpackage.InterfaceC1308Kb2 r10, defpackage.InterfaceC0079Ap3 r11, defpackage.InterfaceC0079Ap3 r12, defpackage.XO r13) {
        /*
            r6 = this;
            wM r0 = new wM
            org.chromium.chrome.browser.profiles.Profile r1 = org.chromium.chrome.browser.profiles.Profile.b(r8)
            r0.<init>(r1)
            li4 r1 = org.chromium.chrome.browser.vr.VrModuleProvider.b()
            org.chromium.chrome.browser.offlinepages.OfflinePageItem r2 = defpackage.AbstractC2217Rb2.c(r8)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L17
            r2 = r3
            goto L18
        L17:
            r2 = r4
        L18:
            if (r8 == 0) goto L23
            org.chromium.url.GURL r5 = r8.u()
            org.chromium.url.GURL r5 = defpackage.AbstractC2290Rq0.a(r5)
            goto L24
        L23:
            r5 = 0
        L24:
            if (r2 != 0) goto L35
            if (r5 == 0) goto L35
            java.util.regex.Pattern r2 = defpackage.T34.a
            java.lang.String r2 = r5.h()
            boolean r2 = defpackage.T34.l(r2)
            if (r2 == 0) goto L35
            r4 = r3
        L35:
            org.chromium.chrome.browser.profiles.Profile r2 = org.chromium.chrome.browser.profiles.Profile.b(r8)
            boolean r2 = J.N.Mvm8S6US(r2)
            r6.<init>(r0, r1, r4, r2)
            r6.j = r7
            r6.g = r8
            r6.h = r9
            r6.i = r12
            org.chromium.chrome.browser.profiles.Profile r7 = org.chromium.chrome.browser.profiles.Profile.b(r8)
            r6.k = r7
            r6.l = r11
            r6.m = r13
            r6.e = r3
            org.chromium.chrome.browser.offlinepages.OfflinePageItem r7 = defpackage.AbstractC2217Rb2.c(r8)
            if (r7 == 0) goto L82
            java.lang.String r9 = r7.a
            r6.f = r9
            boolean r8 = defpackage.AbstractC2217Rb2.f(r8)
            r9 = 2
            if (r8 == 0) goto L68
            r6.e = r9
            goto L6b
        L68:
            r8 = 3
            r6.e = r8
        L6b:
            r11 = 0
            long r7 = r7.g
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 == 0) goto L82
            java.util.Date r11 = new java.util.Date
            r11.<init>(r7)
            java.text.DateFormat r7 = java.text.DateFormat.getDateInstance(r9)
            java.lang.String r7 = r7.format(r11)
            r6.o = r7
        L82:
            r6.n = r10
            org.chromium.chrome.browser.profiles.Profile r7 = org.chromium.chrome.browser.profiles.Profile.d()
            KU3 r7 = defpackage.LU3.a(r7)
            java.lang.String r8 = "page_info_opened"
            r7.notifyEvent(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WO.<init>(android.app.Activity, org.chromium.content_public.browser.WebContents, Ap3, Kb2, Ap3, Ap3, XO):void");
    }

    @Override // defpackage.AbstractC2242Rg2
    public final String b() {
        int i = this.e;
        Context context = this.j;
        if (i == 2) {
            return String.format(context.getString(R.string.f79440_resource_name_obfuscated_res_0x7f14074e), this.o);
        }
        if (i != 3) {
            return null;
        }
        if (TextUtils.isEmpty(this.o)) {
            return context.getString(R.string.f79620_resource_name_obfuscated_res_0x7f140763);
        }
        return String.format(context.getString(R.string.f79610_resource_name_obfuscated_res_0x7f140762), this.o);
    }

    @Override // defpackage.AbstractC2242Rg2
    public final h a() {
        VS0 vs0 = (VS0) this.j;
        if (vs0.isFinishing()) {
            return null;
        }
        return vs0.h0();
    }

    @Override // defpackage.AbstractC2242Rg2
    public final boolean c() {
        TabImpl tabImpl = (TabImpl) N.MMqeq$AW(this.g);
        return tabImpl != null && YD3.b(tabImpl).c();
    }
}
