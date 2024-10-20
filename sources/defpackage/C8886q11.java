package defpackage;

import android.content.Context;
import android.util.SparseIntArray;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: q11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8886q11 {
    public final SparseIntArray a = new SparseIntArray();
    public final C9228r11 b;

    public C8886q11(C9228r11 c9228r11) {
        this.b = c9228r11;
    }

    public final int a(Context context, InterfaceC3129Yc interfaceC3129Yc) {
        interfaceC3129Yc.getClass();
        int minApkVersion = interfaceC3129Yc.getMinApkVersion();
        SparseIntArray sparseIntArray = this.a;
        int i = sparseIntArray.get(minApkVersion, -1);
        if (i == -1) {
            int i2 = 0;
            while (true) {
                if (i2 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i2);
                    if (keyAt > minApkVersion && sparseIntArray.get(keyAt) == 0) {
                        i = 0;
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (i == -1) {
                i = this.b.c(context, minApkVersion);
            }
            sparseIntArray.put(minApkVersion, i);
        }
        return i;
    }
}
