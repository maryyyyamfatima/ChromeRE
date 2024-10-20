package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: ky, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7149ky implements VO2 {
    public final InterfaceC11610xy a;
    public final VO2 b;

    @Override // defpackage.LA0
    public final boolean a(Object obj, File file, C0543Ee2 c0543Ee2) {
        return this.b.a(new C12296zy(((BitmapDrawable) ((JO2) obj).get()).getBitmap(), this.a), file, c0543Ee2);
    }

    public C7149ky(InterfaceC11610xy interfaceC11610xy, C8181ny c8181ny) {
        this.a = interfaceC11610xy;
        this.b = c8181ny;
    }

    @Override // defpackage.VO2
    public final GA0 b(C0543Ee2 c0543Ee2) {
        return this.b.b(c0543Ee2);
    }
}
