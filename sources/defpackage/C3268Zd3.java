package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zd3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3268Zd3 {
    public static volatile C3268Zd3 d;
    public final InterfaceC1838Od3 a;
    public final HashSet b = new HashSet();
    public boolean c;

    public static C3268Zd3 a(Context context) {
        if (d == null) {
            synchronized (C3268Zd3.class) {
                if (d == null) {
                    d = new C3268Zd3(context.getApplicationContext());
                }
            }
        }
        return d;
    }

    public C3268Zd3(Context context) {
        InterfaceC1838Od3 c3138Yd3;
        C5100f01 c5100f01 = new C5100f01(new C1578Md3(context));
        C1708Nd3 c1708Nd3 = new C1708Nd3(this);
        if (Build.VERSION.SDK_INT >= 24) {
            c3138Yd3 = new C2358Sd3(c5100f01, c1708Nd3);
        } else {
            c3138Yd3 = new C3138Yd3(context, c5100f01, c1708Nd3);
        }
        this.a = c3138Yd3;
    }
}
