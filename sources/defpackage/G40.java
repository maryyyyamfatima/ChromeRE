package defpackage;

import android.text.TextUtils;
import java.util.HashSet;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class G40 extends AbstractC10229tw0 {
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final HashSet g = new HashSet();
    public final HashSet h = new HashSet();
    public final HashSet i = new HashSet();
    public C4344co2 j;
    public E40 k;
    public F40 l;

    public G40(boolean z, boolean z2, boolean z3, boolean z4) {
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    public final int c(String str, String str2, String str3) {
        int i = (this.c && TextUtils.isEmpty(str)) ? 1 : 0;
        if (this.d) {
            if (this.k == null) {
                this.k = new E40();
            }
            if (!this.k.isValid(str2)) {
                i |= 2;
            }
        }
        if (!this.e) {
            return i;
        }
        if (this.l == null) {
            this.l = new F40();
        }
        return !this.l.isValid(str3) ? i | 4 : i;
    }
}
