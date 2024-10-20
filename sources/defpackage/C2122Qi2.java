package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qi2 */
/* loaded from: classes.dex */
public final class C2122Qi2 implements RO2 {
    public final C8840pt0 a;

    @Override // defpackage.RO2
    public final boolean a(Object obj, C0543Ee2 c0543Ee2) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        String str = Build.MANUFACTURER;
        if (!(!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912)) {
            return false;
        }
        this.a.getClass();
        return "robolectric".equals(Build.FINGERPRINT) ^ true;
    }

    @Override // defpackage.RO2
    public final JO2 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        C8840pt0 c8840pt0 = this.a;
        return c8840pt0.a(new C2896Wh1((ParcelFileDescriptor) obj, c8840pt0.d, c8840pt0.c), i, i2, c0543Ee2, C8840pt0.k);
    }

    public C2122Qi2(C8840pt0 c8840pt0) {
        this.a = c8840pt0;
    }
}
