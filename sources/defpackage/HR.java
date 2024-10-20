package defpackage;

import J.N;
import android.text.TextUtils;
import org.chromium.chrome.browser.ChromeTabbedActivity;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class HR implements InterfaceC1631Mo1 {
    public final /* synthetic */ ChromeTabbedActivity a;

    @Override // defpackage.InterfaceC1631Mo1
    public final void c(String str) {
    }

    @Override // defpackage.InterfaceC1631Mo1
    public final long a() {
        return this.a.t1;
    }

    public HR(ChromeTabbedActivity chromeTabbedActivity) {
        this.a = chromeTabbedActivity;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x004d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025b  */
    @Override // defpackage.InterfaceC1631Mo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(org.chromium.content_public.browser.LoadUrlParams r18, int r19, java.lang.String r20, int r21, android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.HR.d(org.chromium.content_public.browser.LoadUrlParams, int, java.lang.String, int, android.content.Intent):void");
    }

    @Override // defpackage.InterfaceC1631Mo1
    public final void b(String str, String str2) {
        Tab g1 = this.a.g1();
        if (g1 == null) {
            NW3.a(2);
            return;
        }
        if (g1.isIncognito()) {
            NW3.a(3);
            return;
        }
        if (str2 != null && str2.equals(g1.getUrl().i())) {
            if (!AbstractC3903bX3.a(g1, false)) {
                NW3.a(5);
                return;
            }
            if (str == null || TextUtils.isEmpty(str)) {
                N.M0540rIu(g1.b());
            } else {
                N.Mm4YgQEb(g1.b(), str);
            }
            NW3.a(6);
            return;
        }
        NW3.a(4);
    }
}
