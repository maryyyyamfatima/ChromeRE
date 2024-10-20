package org.chromium.chrome.browser.ntp;

import J.N;
import defpackage.AbstractC11276wz3;
import defpackage.AbstractC1414Kw3;
import defpackage.AbstractC7158kz3;
import defpackage.C1024Hw3;
import defpackage.C11038wI2;
import defpackage.C11724yI2;
import defpackage.C12067zI2;
import defpackage.InterfaceC10590uz3;
import java.util.ArrayList;
import java.util.List;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tabmodel.TabModel;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class RecentlyClosedBridge {
    public long a;
    public final InterfaceC10590uz3 b;
    public Runnable c;

    public static void pushTab(List list, int i, long j, String str, GURL gurl, String str2) {
        list.add(new C12067zI2(j, i, str, gurl));
    }

    public static void addTabToEntries(List list, int i, long j, String str, GURL gurl, String str2) {
        list.add(new C12067zI2(j, i, str, gurl));
    }

    public static void addGroupToEntries(List list, int i, long j, String str, int[] iArr, long[] jArr, String[] strArr, GURL[] gurlArr, String[] strArr2) {
        C11724yI2 c11724yI2 = new C11724yI2(i, str, j);
        ArrayList arrayList = c11724yI2.d;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            long j2 = jArr[i2];
            String str2 = strArr[i2];
            GURL gurl = gurlArr[i2];
            String str3 = strArr2[i2];
            arrayList.add(new C12067zI2(j2, i3, str2, gurl));
        }
        list.add(c11724yI2);
    }

    public static void addBulkEventToEntries(List list, int i, long j, String[] strArr, String[] strArr2, int[] iArr, long[] jArr, String[] strArr3, GURL[] gurlArr, String[] strArr4) {
        C11038wI2 c11038wI2 = new C11038wI2(i, j);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            c11038wI2.d.put(strArr[i2], strArr2[i2]);
        }
        ArrayList arrayList = c11038wI2.c;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            int i4 = iArr[i3];
            long j2 = jArr[i3];
            String str = strArr3[i3];
            GURL gurl = gurlArr[i3];
            String str2 = strArr4[i3];
            arrayList.add(new C12067zI2(j2, i4, str, gurl));
        }
        list.add(c11038wI2);
    }

    public final void restoreTabGroup(TabModel tabModel, int i, String str, int[] iArr) {
        if (iArr.length < 1) {
            return;
        }
        AbstractC7158kz3 e = ((AbstractC11276wz3) this.b).c.e(tabModel.isIncognito());
        if (e instanceof C1024Hw3) {
            C1024Hw3 c1024Hw3 = (C1024Hw3) e;
            for (int i2 : iArr) {
                if (i2 != i) {
                    c1024Hw3.c0(i2, i);
                }
            }
            if (str == null || str.isEmpty()) {
                return;
            }
            AbstractC1414Kw3.b(i, str);
        }
    }

    public RecentlyClosedBridge(Profile profile, InterfaceC10590uz3 interfaceC10590uz3) {
        this.a = N.Mlookj5S(this, profile);
        this.b = interfaceC10590uz3;
    }

    public final void onUpdated() {
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
