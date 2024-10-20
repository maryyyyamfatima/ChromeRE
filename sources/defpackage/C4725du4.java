package defpackage;

import android.os.IBinder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: du4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4725du4 {
    public Object a = Boolean.TRUE;
    public final Is4 b;
    public final IBinder c;
    public final /* synthetic */ C9529rt4 d;

    public C4725du4(C9529rt4 c9529rt4, String str, IBinder iBinder) {
        Is4 is4;
        this.d = c9529rt4;
        synchronized (c9529rt4.i) {
            c9529rt4.i.add(this);
        }
        try {
            is4 = (Is4) Enum.valueOf(Is4.class, str);
        } catch (IllegalArgumentException | NullPointerException unused) {
            is4 = Is4.UNKNOWN_ERROR;
        }
        this.b = is4;
        this.c = iBinder;
    }
}
