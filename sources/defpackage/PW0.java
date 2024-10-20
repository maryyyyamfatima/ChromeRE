package defpackage;

import android.content.ContentResolver;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class PW0 implements InterfaceC9099qf0 {
    public static ContentResolver a;

    public static ContentResolver b() {
        if (a == null) {
            a = V60.a.getContentResolver();
        }
        return a;
    }

    @Override // defpackage.InterfaceC9099qf0
    public final InterfaceC0048Aj2 a() {
        return new OW0();
    }
}
