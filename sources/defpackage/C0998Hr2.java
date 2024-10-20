package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hr2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0998Hr2 implements InterfaceC12080zL0 {
    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Pair c() {
        return null;
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Map d() {
        try {
            Context context = V60.a;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo == null || packageInfo.requestedPermissions == null) {
                return null;
            }
            String str = "";
            int i = 0;
            String str2 = "";
            while (true) {
                String[] strArr = packageInfo.requestedPermissions;
                if (i < strArr.length) {
                    int i2 = packageInfo.requestedPermissionsFlags[i];
                    String str3 = strArr[i];
                    if ((i2 & 2) != 0) {
                        if (!TextUtils.isEmpty(str)) {
                            str = str + ", ";
                        }
                        str = str + str3;
                    } else {
                        if (!TextUtils.isEmpty(str2)) {
                            str2 = str2 + ", ";
                        }
                        str2 = str2 + str3;
                    }
                    i++;
                } else {
                    return AbstractC9048qW.c(Pair.create("Granted Permissions", str), Pair.create("Not Granted or Requested Permissions", str2));
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
