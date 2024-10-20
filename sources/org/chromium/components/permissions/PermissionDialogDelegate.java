package org.chromium.components.permissions;

import J.N;
import org.chromium.ui.base.WindowAndroid;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class PermissionDialogDelegate {
    public long a;
    public PermissionDialogController b;
    public final WindowAndroid c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final int[] h;

    public final void dismissFromNative() {
        PermissionDialogController permissionDialogController = this.b;
        if (permissionDialogController.i == this) {
            permissionDialogController.i = null;
            if (permissionDialogController.l == 2) {
                permissionDialogController.j.c(4, permissionDialogController.g);
            }
        } else {
            permissionDialogController.k.remove(this);
        }
        N.MLMIuACo(this.a, this);
        this.a = 0L;
    }

    public static PermissionDialogDelegate create(long j, WindowAndroid windowAndroid, int[] iArr, int i, String str, String str2, String str3) {
        return new PermissionDialogDelegate(j, windowAndroid, iArr, i, str, str2, str3);
    }

    public PermissionDialogDelegate(long j, WindowAndroid windowAndroid, int[] iArr, int i, String str, String str2, String str3) {
        this.a = j;
        this.c = windowAndroid;
        this.h = iArr;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }
}
