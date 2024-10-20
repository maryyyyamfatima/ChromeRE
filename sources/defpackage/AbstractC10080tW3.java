package defpackage;

import android.os.Build;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tW3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10080tW3 {
    public static final boolean a;
    public static final boolean b;
    public static final boolean c;

    static {
        int i = Build.VERSION.SDK_INT;
        a = true;
        b = true;
        c = i >= 28;
    }
}
