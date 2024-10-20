package defpackage;

import J.N;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7202l7 extends Zn4 {
    public final In4 a;

    public C7202l7(PC pc) {
        this.a = pc.F();
    }

    @Override // defpackage.Zn4
    public final String c() {
        C1193Je2 b = C1193Je2.b(this.a.b);
        if (b == null) {
            return null;
        }
        return b.toString();
    }

    @Override // defpackage.Zn4
    public final boolean e(String str) {
        String str2 = this.a.b;
        Pattern pattern = T34.a;
        return N.MM5WUf_F(str2, str, true);
    }
}
