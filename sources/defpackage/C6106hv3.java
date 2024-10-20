package defpackage;

import android.text.TextUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: hv3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6106hv3 implements Comparable {
    public final String a;
    public final String g;
    public final long h;
    public final int i;
    public final String j;
    public final String k;
    public final boolean l;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.i, ((C6106hv3) obj).i);
    }

    public C6106hv3(int i, String str, String str2, String str3, long j, String str4, boolean z) {
        this.i = i;
        this.j = str;
        this.a = str2;
        this.g = str3;
        this.h = j;
        this.k = str4;
        this.l = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.C6106hv3 a(org.chromium.chrome.browser.tab.Tab r11) {
        /*
            org.chromium.content_public.browser.WebContents r0 = r11.b()
            if (r0 != 0) goto L7
            goto L2c
        L7:
            org.chromium.content_public.browser.WebContents r0 = r11.b()
            org.chromium.content_public.browser.NavigationController r0 = r0.i()
            if (r0 != 0) goto L12
            goto L2c
        L12:
            org.chromium.content_public.browser.WebContents r0 = r11.b()
            org.chromium.content_public.browser.NavigationController r0 = r0.i()
            int r0 = r0.k()
            org.chromium.content_public.browser.WebContents r1 = r11.b()
            org.chromium.content_public.browser.NavigationController r1 = r1.i()
            org.chromium.content_public.browser.NavigationEntry r0 = r1.e(r0)
            if (r0 != 0) goto L2e
        L2c:
            r0 = 0
            goto L34
        L2e:
            org.chromium.url.GURL r0 = r0.e
            java.lang.String r0 = r0.i()
        L34:
            hv3 r10 = new hv3
            int r2 = r11.getId()
            java.lang.String r3 = r11.getTitle()
            org.chromium.url.GURL r1 = r11.getUrl()
            java.lang.String r4 = r1.i()
            org.chromium.url.GURL r1 = r11.z()
            r1.i()
            if (r0 == 0) goto L50
            goto L52
        L50:
            java.lang.String r0 = ""
        L52:
            r5 = r0
            Nb0 r0 = defpackage.C1695Nb0.m(r11)
            long r6 = r0.s
            org.chromium.url.GURL r0 = r11.getUrl()
            java.lang.String r8 = r0.i()
            boolean r9 = r11.isIncognito()
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6106hv3.a(org.chromium.chrome.browser.tab.Tab):hv3");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6106hv3)) {
            return false;
        }
        C6106hv3 c6106hv3 = (C6106hv3) obj;
        return this.i == c6106hv3.i && TextUtils.equals(this.a, c6106hv3.a);
    }

    public final int hashCode() {
        int i = 527 + this.i;
        StringBuilder sb = new StringBuilder();
        sb.append(i * 31);
        String str = this.a;
        sb.append(str);
        if (sb.toString() == null) {
            return 0;
        }
        return str.hashCode();
    }
}
