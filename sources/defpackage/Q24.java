package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Q24 implements InterfaceC8374oY1, P24 {
    public final ContentResolver a;

    @Override // defpackage.InterfaceC8374oY1
    public final void a() {
    }

    public Q24(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // defpackage.P24
    public final InterfaceC3145Yf0 b(Uri uri) {
        return new C2403Sm3(this.a, uri);
    }

    @Override // defpackage.InterfaceC8374oY1
    public final InterfaceC8030nY1 c(C3727b02 c3727b02) {
        return new R24(this);
    }
}
