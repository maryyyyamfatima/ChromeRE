package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class R34 implements InterfaceC8030nY1 {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final InterfaceC8030nY1 a;

    @Override // defpackage.InterfaceC8030nY1
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.InterfaceC8030nY1
    public final C7686mY1 b(Object obj, int i, int i2, C0543Ee2 c0543Ee2) {
        return this.a.b(new C5788h01(((Uri) obj).toString()), i, i2, c0543Ee2);
    }

    public R34(InterfaceC8030nY1 interfaceC8030nY1) {
        this.a = interfaceC8030nY1;
    }
}
