package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import org.chromium.base.ThreadUtils;
import org.chromium.components.payments.PaymentRequestUpdateEventListener;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Bo2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0203Bo2 {
    public static C0203Bo2 e;
    public InterfaceC1192Je1 a;
    public PaymentRequestUpdateEventListener b;
    public PackageInfo c;
    public C2757Vf2 d;

    public static C0203Bo2 a() {
        Object obj = ThreadUtils.a;
        if (e == null) {
            e = new C0203Bo2();
        }
        return e;
    }

    public final boolean b(int i) {
        Object obj = ThreadUtils.a;
        if (this.d != null) {
            String nameForUid = V60.a.getPackageManager().getNameForUid(i);
            PackageInfo packageInfo = null;
            if (nameForUid != null) {
                try {
                    packageInfo = V60.a.getPackageManager().getPackageInfo(nameForUid, 64);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            PackageInfo packageInfo2 = this.c;
            if (packageInfo2 == null || packageInfo == null || !packageInfo2.packageName.equals(packageInfo.packageName)) {
                AbstractC4851eH1.a("PaymentDetailsUpdate", "Caller's signature or package name does not match invoked app's.", new Object[0]);
                return false;
            }
            boolean equals = Arrays.equals(packageInfo.signatures, this.c.signatures);
            if (!equals) {
                AbstractC4851eH1.a("PaymentDetailsUpdate", "Caller's signature or package name does not match invoked app's.", new Object[0]);
            }
            return equals;
        }
        AbstractC4851eH1.a("PaymentDetailsUpdate", "Caller's signature or package name does not match invoked app's.", new Object[0]);
        return false;
    }

    public static void c(String str, InterfaceC1192Je1 interfaceC1192Je1) {
        Object obj = ThreadUtils.a;
        if (interfaceC1192Je1 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error", str);
        try {
            ((C1062Ie1) interfaceC1192Je1).e(bundle);
        } catch (RemoteException e2) {
            AbstractC4851eH1.a("PaymentDetailsUpdate", "Error calling updateWith", e2);
        }
    }
}
