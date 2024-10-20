package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qf2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2107Qf2 implements InterfaceC2367Sf2 {
    @Override // defpackage.InterfaceC2367Sf2
    public final ArrayList a(PackageManager packageManager, String str) {
        PackageInfo packageInfo = packageManager.getPackageInfo(str, 134217728);
        ArrayList arrayList = new ArrayList();
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (signingInfo.hasMultipleSigners()) {
            for (Signature signature : signingInfo.getApkContentsSigners()) {
                arrayList.add(AbstractC2497Tf2.a(signature));
            }
        } else {
            arrayList.add(AbstractC2497Tf2.a(signingInfo.getSigningCertificateHistory()[0]));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC2367Sf2
    public final boolean b(String str, PackageManager packageManager, C6606jO3 c6606jO3) {
        boolean hasSigningCertificate;
        c6606jO3.b();
        String str2 = c6606jO3.b;
        if (str2 == null) {
            throw new IllegalStateException();
        }
        if (!str2.equals(str)) {
            return false;
        }
        ArrayList a = a(packageManager, str);
        if (a.size() == 1) {
            c6606jO3.b();
            ArrayList arrayList = c6606jO3.c;
            if (arrayList == null) {
                throw new IllegalStateException();
            }
            hasSigningCertificate = packageManager.hasSigningCertificate(str, Arrays.copyOf((byte[]) arrayList.get(0), ((byte[]) c6606jO3.c.get(0)).length), 1);
            return hasSigningCertificate;
        }
        return c6606jO3.equals(C6606jO3.a(str, a));
    }
}
