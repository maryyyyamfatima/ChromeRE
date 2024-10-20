package org.chromium.chrome.browser.permissions;

import J.N;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import defpackage.C1907Or2;
import defpackage.InterfaceC0218Br2;
import defpackage.InterfaceC11179wj;
import defpackage.V60;
import java.util.Collections;
import java.util.HashSet;
import org.chromium.base.ApplicationStatus;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PermissionUpdateRequester implements InterfaceC0218Br2 {
    public final WebContents a;
    public final HashSet b;
    public final String[] c;
    public long d;
    public InterfaceC11179wj e;

    public static PermissionUpdateRequester create(long j, WebContents webContents, String[] strArr, String[] strArr2) {
        return new PermissionUpdateRequester(j, webContents, strArr, strArr2);
    }

    public PermissionUpdateRequester(long j, WebContents webContents, String[] strArr, String[] strArr2) {
        this.d = j;
        this.a = webContents;
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        Collections.addAll(hashSet, strArr);
        HashSet hashSet2 = new HashSet();
        Collections.addAll(hashSet2, strArr);
        Collections.addAll(hashSet2, strArr2);
        this.c = (String[]) hashSet2.toArray(new String[hashSet2.size()]);
    }

    public final void onNativeDestroyed() {
        this.d = 0L;
        InterfaceC11179wj interfaceC11179wj = this.e;
        if (interfaceC11179wj != null) {
            ApplicationStatus.h(interfaceC11179wj);
            this.e = null;
        }
    }

    public final void requestPermissions() {
        String[] strArr;
        WindowAndroid Q0 = this.a.Q0();
        if (Q0 != null) {
            int i = 0;
            boolean z = true;
            while (true) {
                strArr = this.c;
                if (i >= strArr.length) {
                    break;
                }
                z &= Q0.hasPermission(strArr[i]) || Q0.canRequestPermission(strArr[i]);
                i++;
            }
            Activity activity = (Activity) Q0.k().get();
            if (z) {
                Q0.b(strArr, this);
                return;
            }
            if (activity != null) {
                C1907Or2 c1907Or2 = new C1907Or2(this);
                this.e = c1907Or2;
                ApplicationStatus.e(c1907Or2, activity);
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + V60.a.getPackageName()));
                intent.setFlags(268435456);
                activity.startActivity(intent);
                return;
            }
            N.ML3pG92D(this.d, false);
            return;
        }
        N.ML3pG92D(this.d, false);
    }

    @Override // defpackage.InterfaceC0218Br2
    public final void b(int[] iArr, String[] strArr) {
        a();
    }

    public final void a() {
        WindowAndroid Q0 = this.a.Q0();
        boolean z = false;
        int i = 0;
        if (Q0 != null) {
            boolean z2 = true;
            while (true) {
                String[] strArr = this.c;
                if (i >= strArr.length) {
                    break;
                }
                if (this.b.contains(strArr[i])) {
                    z2 &= Q0.hasPermission(strArr[i]);
                }
                i++;
            }
            z = z2;
        }
        long j = this.d;
        if (j != 0) {
            N.ML3pG92D(j, z);
        }
    }
}
