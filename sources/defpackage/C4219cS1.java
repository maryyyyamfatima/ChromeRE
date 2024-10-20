package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4219cS1 implements InterfaceC8030nY1 {
    public final Context a;

    @Override // defpackage.InterfaceC8030nY1
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return AbstractC4563dS1.a(uri) && !uri.getPathSegments().contains("video");
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        Uri uri = (Uri) obj;
        if (!(i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384)) {
            return null;
        }
        R82 r82 = new R82(uri);
        Context context = this.a;
        return new C7686mY1(r82, C11740yL3.d(context, uri, new C11054wL3(context.getContentResolver())));
    }

    public C4219cS1(Context context) {
        this.a = context.getApplicationContext();
    }
}
