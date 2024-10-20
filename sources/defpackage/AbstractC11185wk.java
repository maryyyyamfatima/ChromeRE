package defpackage;

import J.N;
import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11185wk {
    public static boolean a(int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return (i == 1 || i == 0) && N.MRiRQ_Ey(N.MffiISNV(0)) && N.MRiRQ_Ey(N.MffiISNV(2));
        }
        return false;
    }
}
