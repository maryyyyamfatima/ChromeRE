package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Rf2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2237Rf2 implements InterfaceC2367Sf2 {
    @Override // defpackage.InterfaceC2367Sf2
    public final boolean b(String str, PackageManager packageManager, C6606jO3 c6606jO3) {
        ArrayList a;
        c6606jO3.b();
        String str2 = c6606jO3.b;
        if (str2 == null) {
            throw new IllegalStateException();
        }
        if (str.equals(str2) && (a = a(packageManager, str)) != null) {
            return c6606jO3.equals(C6606jO3.a(str, a));
        }
        return false;
    }

    @Override // defpackage.InterfaceC2367Sf2
    public final ArrayList a(PackageManager packageManager, String str) {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
        ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
        for (Signature signature : packageInfo.signatures) {
            byte[] a = AbstractC2497Tf2.a(signature);
            if (a == null) {
                return null;
            }
            arrayList.add(a);
        }
        return arrayList;
    }
}
