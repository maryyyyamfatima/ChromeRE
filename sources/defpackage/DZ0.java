package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class DZ0 implements Appendable {
    public final Appendable a;
    public boolean g = true;

    public DZ0(Appendable appendable) {
        this.a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        boolean z = this.g;
        Appendable appendable = this.a;
        if (z) {
            this.g = false;
            appendable.append("  ");
        }
        this.g = c == '\n';
        appendable.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.g;
        Appendable appendable = this.a;
        boolean z2 = false;
        if (z) {
            this.g = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.g = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }
}
