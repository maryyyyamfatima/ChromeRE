package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class PR1 {
    public final String a;
    public final int b;
    public final int c;

    public PR1(int i, int i2, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PR1)) {
            return false;
        }
        PR1 pr1 = (PR1) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        return (i2 < 0 || pr1.b < 0) ? TextUtils.equals(str, pr1.a) && i == pr1.c : TextUtils.equals(str, pr1.a) && i2 == pr1.b && i == pr1.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.c));
    }
}
