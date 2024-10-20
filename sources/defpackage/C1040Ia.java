package defpackage;

import android.os.Build;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Ia, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1040Ia {
    public final InterfaceC0218Br2 a;
    public final HashMap b = new HashMap();

    public C1040Ia(A5 a5, String[] strArr, InterfaceC0218Br2 interfaceC0218Br2) {
        if (Build.VERSION.SDK_INT >= 30) {
            for (String str : strArr) {
                this.b.put(str, Boolean.valueOf(a5.e(str)));
            }
        }
        this.a = interfaceC0218Br2;
    }
}
