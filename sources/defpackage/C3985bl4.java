package defpackage;

import J.N;
import java.util.regex.Pattern;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: bl4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3985bl4 extends Zn4 {
    public final In4 a;

    public C3985bl4(PC pc) {
        this.a = pc.F();
    }

    @Override // defpackage.Zn4
    public final String c() {
        return this.a.c;
    }

    @Override // defpackage.Zn4
    public final boolean e(String str) {
        String str2 = this.a.c;
        Pattern pattern = T34.a;
        return N.MLKUC6KA(str, str2);
    }
}
