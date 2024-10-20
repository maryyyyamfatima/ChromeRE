package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class R24 implements InterfaceC8030nY1 {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    public final P24 a;

    @Override // defpackage.InterfaceC8030nY1
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        Uri uri = (Uri) obj;
        return new C7686mY1(new R82(uri), this.a.b(uri));
    }

    public R24(P24 p24) {
        this.a = p24;
    }
}
