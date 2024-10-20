package org.chromium.components.permissions;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import defpackage.AD2;
import defpackage.AbstractC1996Pj1;
import defpackage.AbstractC4249cY1;
import defpackage.AbstractC9048qW;
import defpackage.C1430La;
import defpackage.C1559Ma;
import defpackage.GD2;
import defpackage.InterfaceC11646y40;
import defpackage.InterfaceC1689Na;
import defpackage.JD2;
import defpackage.LD2;
import defpackage.PD2;
import defpackage.ZX1;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;
import org.chromium.ui.permissions.AndroidPermissionDelegate;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AndroidPermissionRequester {
    public static boolean hasRequiredAndroidPermissionsForContentSetting(AndroidPermissionDelegate androidPermissionDelegate, int i) {
        String[] requiredAndroidPermissionsForContentSetting = PermissionUtil.getRequiredAndroidPermissionsForContentSetting(i);
        HashSet hashSet = new HashSet();
        for (String str : requiredAndroidPermissionsForContentSetting) {
            if (!androidPermissionDelegate.hasPermission(str)) {
                hashSet.add(str);
            }
        }
        for (String str2 : PermissionUtil.getOptionalAndroidPermissionsForContentSetting(i)) {
            androidPermissionDelegate.hasPermission(str2);
        }
        return hashSet.isEmpty();
    }

    public static boolean a(WindowAndroid windowAndroid, int[] iArr, InterfaceC1689Na interfaceC1689Na) {
        if (windowAndroid == null) {
            return false;
        }
        SparseArray sparseArray = new SparseArray();
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            if (!hasRequiredAndroidPermissionsForContentSetting(windowAndroid, i)) {
                HashSet d = AbstractC9048qW.d(PermissionUtil.getRequiredAndroidPermissionsForContentSetting(i));
                HashSet d2 = AbstractC9048qW.d(PermissionUtil.getOptionalAndroidPermissionsForContentSetting(i));
                sparseArray.append(i, d);
                hashSet.addAll(d);
                hashSet.addAll(d2);
            }
        }
        if (hashSet.isEmpty()) {
            return false;
        }
        windowAndroid.b((String[]) hashSet.toArray(new String[hashSet.size()]), new C1430La(sparseArray, windowAndroid, interfaceC1689Na, iArr));
        return true;
    }

    public static void b(WindowAndroid windowAndroid, String str, InterfaceC11646y40 interfaceC11646y40, Runnable runnable) {
        ZX1 s = windowAndroid.s();
        C1559Ma c1559Ma = new C1559Ma(interfaceC11646y40, runnable);
        Context context = (Context) windowAndroid.j.get();
        View inflate = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e02e0, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.text)).setText(str);
        HashMap e = PropertyModel.e(AbstractC4249cY1.B);
        PD2 pd2 = AbstractC4249cY1.h;
        GD2 gd2 = new GD2();
        gd2.a = inflate;
        e.put(pd2, gd2);
        LD2 ld2 = AbstractC4249cY1.r;
        AD2 ad2 = new AD2();
        ad2.a = true;
        e.put(ld2, ad2);
        PD2 pd22 = AbstractC4249cY1.j;
        String string = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140535);
        GD2 gd22 = new GD2();
        gd22.a = string;
        e.put(pd22, gd22);
        JD2 jd2 = AbstractC4249cY1.a;
        GD2 gd23 = new GD2();
        gd23.a = c1559Ma;
        s.l(AbstractC1996Pj1.a(e, jd2, gd23, e), 1, false);
    }
}
