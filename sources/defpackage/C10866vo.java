package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10866vo extends X22 {
    public final W22 a;
    public final V22 b;

    public C10866vo(W22 w22, V22 v22) {
        this.a = w22;
        this.b = v22;
    }

    public final String toString() {
        return KR0.a("NetworkConnectionInfo{networkType=", String.valueOf(this.a), ", mobileSubtype=", String.valueOf(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X22)) {
            return false;
        }
        X22 x22 = (X22) obj;
        W22 w22 = this.a;
        if (w22 != null ? w22.equals(((C10866vo) x22).a) : ((C10866vo) x22).a == null) {
            V22 v22 = this.b;
            if (v22 == null) {
                if (((C10866vo) x22).b == null) {
                    return true;
                }
            } else if (v22.equals(((C10866vo) x22).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        W22 w22 = this.a;
        int hashCode = ((w22 == null ? 0 : w22.hashCode()) ^ 1000003) * 1000003;
        V22 v22 = this.b;
        return (v22 != null ? v22.hashCode() : 0) ^ hashCode;
    }
}
