package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class SH1 {
    public final TimeUnit b;
    public int c = -1;
    public final int a = 1;

    public SH1(TimeUnit timeUnit) {
        AbstractC5203fJ.a(timeUnit, "time unit");
        this.b = timeUnit;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(' ');
        sb.append(this.b);
        if (this.c > 0) {
            sb.append(" [skipped: ");
            sb.append(this.c);
            sb.append(']');
        }
        return sb.toString();
    }

    public final int hashCode() {
        return (this.a * 37) ^ this.b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SH1)) {
            return false;
        }
        SH1 sh1 = (SH1) obj;
        return this.a == sh1.a && this.b == sh1.b;
    }
}
