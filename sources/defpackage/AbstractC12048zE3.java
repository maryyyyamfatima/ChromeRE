package defpackage;

import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zE3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12048zE3 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12048zE3)) {
            return false;
        }
        AbstractC12048zE3 abstractC12048zE3 = (AbstractC12048zE3) obj;
        AE3 ae3 = (AE3) this;
        if (V82.a(ae3.a, ((AE3) abstractC12048zE3).a)) {
            AE3 ae32 = (AE3) abstractC12048zE3;
            if (V82.a(ae3.g, ae32.g) && V82.a(ae3.h, ae32.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        AE3 ae3 = (AE3) this;
        return Arrays.hashCode(new Object[]{ae3.a, ae3.g, ae3.h});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        AE3 ae3 = (AE3) this;
        sb.append(ae3.a);
        sb.append(",");
        sb.append(ae3.g);
        sb.append(")=");
        sb.append(ae3.h);
        return sb.toString();
    }
}
