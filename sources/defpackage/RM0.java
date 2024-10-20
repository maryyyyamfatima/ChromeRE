package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class RM0 {
    public final int a;
    public final String b;
    public final File c;

    public abstract AbstractC0185Bl a();

    public abstract int b();

    public RM0(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = SM0.i(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RM0)) {
            return false;
        }
        RM0 rm0 = (RM0) obj;
        return this.a == rm0.a && this.b.equals(rm0.b) && this.c.equals(rm0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((527 + this.a) * 31)) * 31);
    }
}
