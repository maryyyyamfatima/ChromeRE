package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Zn */
/* loaded from: classes.dex */
public final class C3314Zn {
    public final QP0 a;
    public final QP0 b;
    public final QP0 c;
    public final QP0 d;
    public final QP0 e;
    public final HZ3 f;
    public final AbstractC9896sy0 g;
    public final boolean h;
    public final InterfaceC9738sX i;
    public final AbstractC0952Hi1 j;
    public final U80 k;

    public C3314Zn(QP0 qp0, QP0 qp02, QP0 qp03, QP0 qp04, QP0 qp05, HZ3 hz3, AbstractC9896sy0 abstractC9896sy0, boolean z, InterfaceC9738sX interfaceC9738sX, AbstractC0952Hi1 abstractC0952Hi1, U80 u80) {
        this.a = qp0;
        this.b = qp02;
        this.c = qp03;
        this.d = qp04;
        this.e = qp05;
        if (hz3 == null) {
            throw new NullPointerException("Null typefaceProvider");
        }
        this.f = hz3;
        if (abstractC9896sy0 == null) {
            throw new NullPointerException("Null logger");
        }
        this.g = abstractC9896sy0;
        this.h = z;
        if (interfaceC9738sX == null) {
            throw new NullPointerException("Null commandResolver");
        }
        this.i = interfaceC9738sX;
        this.j = abstractC0952Hi1;
        if (u80 == null) {
            throw new NullPointerException("Null conversionContext");
        }
        this.k = u80;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        String valueOf10 = String.valueOf(this.k);
        StringBuilder a = AbstractC10975w63.a("PropArgs{onChangeCommandFuture=", valueOf, ", onClearCommandFuture=", valueOf2, ", onFocusCommandFuture=");
        AbstractC9972tB0.a(a, valueOf3, ", onBlurCommandFuture=", valueOf4, ", onTextInputActionCommandFuture=");
        AbstractC9972tB0.a(a, valueOf5, ", typefaceProvider=", valueOf6, ", logger=");
        a.append(valueOf7);
        a.append(", enableEmojiCompat=");
        a.append(this.h);
        a.append(", commandResolver=");
        a.append(valueOf8);
        a.append(", styleRunExtensionConverters=");
        a.append(valueOf9);
        a.append(", conversionContext=");
        a.append(valueOf10);
        a.append("}");
        return a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3314Zn)) {
            return false;
        }
        C3314Zn c3314Zn = (C3314Zn) obj;
        QP0 qp0 = this.a;
        if (qp0 != null ? qp0.equals(c3314Zn.a) : c3314Zn.a == null) {
            QP0 qp02 = this.b;
            if (qp02 != null ? qp02.equals(c3314Zn.b) : c3314Zn.b == null) {
                QP0 qp03 = this.c;
                if (qp03 != null ? qp03.equals(c3314Zn.c) : c3314Zn.c == null) {
                    QP0 qp04 = this.d;
                    if (qp04 != null ? qp04.equals(c3314Zn.d) : c3314Zn.d == null) {
                        QP0 qp05 = this.e;
                        if (qp05 != null ? qp05.equals(c3314Zn.e) : c3314Zn.e == null) {
                            if (this.f.equals(c3314Zn.f) && this.g.equals(c3314Zn.g) && this.h == c3314Zn.h && this.i.equals(c3314Zn.i) && this.j.equals(c3314Zn.j) && this.k.equals(c3314Zn.k)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        QP0 qp0 = this.a;
        int hashCode = ((qp0 == null ? 0 : qp0.hashCode()) ^ 1000003) * 1000003;
        QP0 qp02 = this.b;
        int hashCode2 = (hashCode ^ (qp02 == null ? 0 : qp02.hashCode())) * 1000003;
        QP0 qp03 = this.c;
        int hashCode3 = (hashCode2 ^ (qp03 == null ? 0 : qp03.hashCode())) * 1000003;
        QP0 qp04 = this.d;
        int hashCode4 = (hashCode3 ^ (qp04 == null ? 0 : qp04.hashCode())) * 1000003;
        QP0 qp05 = this.e;
        return (((((((((((((qp05 != null ? qp05.hashCode() : 0) ^ hashCode4) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }
}
