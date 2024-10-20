package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.chromium.ui.permissions.AndroidPermissionDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class A5 implements AndroidPermissionDelegate {
    public final Handler a = new Handler();
    public final SparseArray g = new SparseArray();
    public int h;
    public final WeakReference i;

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean e(String str) {
        Activity activity = (Activity) this.i.get();
        if (activity == null) {
            return false;
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean h(String str) {
        Activity activity = (Activity) this.i.get();
        if (activity == null) {
            return false;
        }
        return activity.getPackageManager().isPermissionRevokedByPolicy(str, activity.getPackageName());
    }

    public A5(WeakReference weakReference) {
        this.i = weakReference;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public boolean canRequestPermission(String str) {
        if (hasPermission(str)) {
            return true;
        }
        if (h(str)) {
            return false;
        }
        if (!e(str)) {
            return true ^ T60.a.getBoolean(AbstractC1777Nr2.b(str), false);
        }
        SharedPreferences.Editor edit = T60.a.edit();
        edit.remove(AbstractC1777Nr2.b(str));
        edit.apply();
        return true;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public boolean hasPermission(String str) {
        boolean z = AbstractC9771sd.a(Process.myPid(), Process.myUid(), V60.a, str) == 0;
        if (z) {
            SharedPreferences.Editor edit = T60.a.edit();
            edit.remove(AbstractC1777Nr2.b(str));
            edit.apply();
        }
        return z;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final boolean f(int i, String[] strArr, int[] iArr) {
        InterfaceC0218Br2 interfaceC0218Br2;
        boolean z;
        SparseArray sparseArray = this.g;
        C1040Ia c1040Ia = (C1040Ia) sparseArray.get(i);
        sparseArray.delete(i);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= strArr.length) {
                break;
            }
            if (iArr[i2] == 0) {
                arrayList.add(strArr[i2]);
            } else {
                String str = strArr[i2];
                if (Build.VERSION.SDK_INT >= 30) {
                    if (c1040Ia != null) {
                        HashMap hashMap = c1040Ia.b;
                        if (hashMap.get(str) != null) {
                            z = ((Boolean) hashMap.get(str)).booleanValue();
                            if (!z && !e(str)) {
                                z2 = false;
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                        z2 = false;
                    }
                }
                if (z2) {
                    arrayList2.add(strArr[i2]);
                }
            }
            i2++;
        }
        SharedPreferences.Editor edit = T60.a.edit();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove(AbstractC1777Nr2.b((String) it.next()));
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            edit.putBoolean(AbstractC1777Nr2.b((String) it2.next()), true);
        }
        edit.apply();
        if (c1040Ia == null || (interfaceC0218Br2 = c1040Ia.a) == null) {
            return false;
        }
        interfaceC0218Br2.b(iArr, strArr);
        return true;
    }

    @Override // org.chromium.ui.permissions.AndroidPermissionDelegate
    public final void b(String[] strArr, InterfaceC0218Br2 interfaceC0218Br2) {
        boolean z;
        boolean z2;
        int i = this.h;
        int i2 = i + 1000;
        boolean z3 = true;
        this.h = (i + 1) % 100;
        SparseArray sparseArray = this.g;
        sparseArray.put(i2, new C1040Ia(this, strArr, interfaceC0218Br2));
        Activity activity = (Activity) this.i.get();
        if (activity == null) {
            z = false;
        } else {
            activity.requestPermissions(strArr, i2);
            z = true;
        }
        if (z) {
            z2 = true;
        } else {
            sparseArray.delete(i2);
            z2 = false;
        }
        if (!z2) {
            this.a.post(new RunnableC0910Ha(this, strArr, interfaceC0218Br2));
            return;
        }
        int length = strArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                z3 = false;
                break;
            } else if (TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                break;
            } else {
                i3++;
            }
        }
        if (z3) {
            T60.a.edit().putLong("AndroidPermissionRequestTimestamp::" + AbstractC1777Nr2.c("android.permission.POST_NOTIFICATIONS"), System.currentTimeMillis()).apply();
        }
    }
}
