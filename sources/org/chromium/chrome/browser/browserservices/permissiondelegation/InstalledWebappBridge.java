package org.chromium.chrome.browser.browserservices.permissiondelegation;

import J.N;
import android.net.Uri;
import com.android.chrome.R;
import defpackage.B72;
import defpackage.C10712vM;
import defpackage.C11027wG1;
import defpackage.C11205wn1;
import defpackage.C11370xG1;
import defpackage.C1193Je2;
import defpackage.C2037Pr2;
import defpackage.C72;
import defpackage.NX3;
import defpackage.QX3;
import defpackage.V60;
import defpackage.VX3;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class InstalledWebappBridge {
    public static long a;

    /* compiled from: chromium-ChromeModern.aab-stable-519513610 */
    /* loaded from: classes.dex */
    public final class Permission {
        public final C1193Je2 a;
        public final int b;

        public Permission(int i, C1193Je2 c1193Je2) {
            this.a = c1193Je2;
            this.b = i;
        }
    }

    public static void a(int i) {
        long j = a;
        if (j == 0) {
            return;
        }
        N.MPWzS9sk(j, i);
    }

    public static void setInstalledWebappProvider(long j) {
        a = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0036, code lost:            if (r1.U1() != false) goto L240;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0019, code lost:            if (r1.U1() != false) goto L229;     */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge.Permission[] getPermissions(int r6) {
        /*
            wn1 r0 = defpackage.C11205wn1.a()
            r1 = 4
            r0.getClass()
            if (r6 != r1) goto L6a
            android.app.Activity r1 = org.chromium.base.ApplicationStatus.c
            boolean r2 = r1 instanceof org.chromium.chrome.browser.customtabs.CustomTabActivity
            r3 = 0
            if (r2 != 0) goto L13
        L11:
            r1 = r3
            goto L1b
        L13:
            org.chromium.chrome.browser.customtabs.CustomTabActivity r1 = (org.chromium.chrome.browser.customtabs.CustomTabActivity) r1
            boolean r2 = r1.U1()
            if (r2 == 0) goto L11
        L1b:
            r2 = 1
            r4 = 0
            if (r1 == 0) goto L21
            r1 = r2
            goto L22
        L21:
            r1 = r4
        L22:
            if (r1 != 0) goto L28
            org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge$Permission[] r6 = new org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge.Permission[r4]
            goto La7
        L28:
            android.app.Activity r1 = org.chromium.base.ApplicationStatus.c
            boolean r5 = r1 instanceof org.chromium.chrome.browser.customtabs.CustomTabActivity
            if (r5 != 0) goto L30
        L2e:
            r1 = r3
            goto L38
        L30:
            org.chromium.chrome.browser.customtabs.CustomTabActivity r1 = (org.chromium.chrome.browser.customtabs.CustomTabActivity) r1
            boolean r5 = r1.U1()
            if (r5 == 0) goto L2e
        L38:
            if (r1 != 0) goto L3b
            goto L6a
        L3b:
            dY3 r5 = r1.e1
            if (r5 != 0) goto L41
            r5 = r3
            goto L45
        L41:
            FU r5 = r5.d
            java.lang.String r5 = r5.a
        L45:
            dd0 r1 = r1.Y0
            org.chromium.chrome.browser.tab.Tab r1 = r1.b
            if (r1 == 0) goto L4f
            org.chromium.content_public.browser.WebContents r3 = r1.b()
        L4f:
            java.lang.Boolean r1 = defpackage.C11205wn1.d(r5)
            if (r1 == 0) goto L56
            goto L57
        L56:
            r2 = r4
        L57:
            vY3 r1 = r0.c
            r1.getClass()
            java.lang.String r1 = "TrustedWebActivity.LocationDelegationEnrolled"
            defpackage.EI2.b(r1, r2)
            if (r3 == 0) goto L6a
            java.lang.String r1 = "TrustedWebActivity.LocationDelegation"
            java.lang.String r4 = "Enrolled"
            J.N.MCnWTXic(r3, r1, r4, r2)
        L6a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            xn1 r2 = r0.a
            java.util.HashSet r2 = r2.g()
            java.util.Iterator r2 = r2.iterator()
        L79:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            Je2 r3 = defpackage.C1193Je2.b(r3)
            if (r3 != 0) goto L8c
            goto L79
        L8c:
            int r4 = r0.c(r6, r3)
            if (r4 == 0) goto L79
            org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge$Permission r5 = new org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge$Permission
            r5.<init>(r4, r3)
            r1.add(r5)
            goto L79
        L9b:
            int r6 = r1.size()
            org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge$Permission[] r6 = new org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge.Permission[r6]
            java.lang.Object[] r6 = r1.toArray(r6)
            org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge$Permission[] r6 = (org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge.Permission[]) r6
        La7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge.getPermissions(int):org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappBridge$Permission[]");
    }

    public static int getPermission(int i, String str) {
        return C11205wn1.a().c(i, C1193Je2.a(Uri.parse(str)));
    }

    public static String getOriginFromPermission(Permission permission) {
        return permission.a.toString();
    }

    public static int getSettingFromPermission(Permission permission) {
        return permission.b;
    }

    public static void decidePermission(int i, String str, String str2, long j) {
        C1193Je2 a2 = C1193Je2.a(Uri.parse(str));
        if (a2 == null) {
            b(2, j);
            return;
        }
        Uri uri = a2.a;
        if (i == 4) {
            C11370xG1 c11370xG1 = ((C2037Pr2) C10712vM.e().n.get()).c;
            c11370xG1.getClass();
            C11027wG1 c11027wG1 = new C11027wG1(c11370xG1, a2, j);
            VX3 vx3 = c11370xG1.b;
            vx3.getClass();
            vx3.b(uri, new QX3(c11027wG1));
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("Unsupported permission type.");
        }
        C72 c72 = ((C2037Pr2) C10712vM.e().n.get()).b;
        c72.getClass();
        B72 b72 = new B72(c72, a2, j, str2);
        VX3 vx32 = c72.b;
        vx32.getClass();
        vx32.b(uri, new NX3(vx32, V60.a.getResources().getString(R.string.0_resource_name_obfuscated_res_0x7f1406df), b72));
    }

    public static void b(int i, long j) {
        if (j == 0) {
            return;
        }
        N.MO5rIsWk(j, i);
    }
}
