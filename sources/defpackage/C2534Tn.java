package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Tn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2534Tn extends AbstractC7320lU {
    public final EnumC6976kU a;
    public final Y8 b;

    public C2534Tn(EnumC6976kU enumC6976kU, Y8 y8) {
        this.a = enumC6976kU;
        this.b = y8;
    }

    public final String toString() {
        return KR0.a("ClientInfo{clientType=", String.valueOf(this.a), ", androidClientInfo=", String.valueOf(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7320lU)) {
            return false;
        }
        AbstractC7320lU abstractC7320lU = (AbstractC7320lU) obj;
        EnumC6976kU enumC6976kU = this.a;
        if (enumC6976kU != null ? enumC6976kU.equals(((C2534Tn) abstractC7320lU).a) : ((C2534Tn) abstractC7320lU).a == null) {
            Y8 y8 = this.b;
            if (y8 == null) {
                if (((C2534Tn) abstractC7320lU).b == null) {
                    return true;
                }
            } else if (y8.equals(((C2534Tn) abstractC7320lU).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC6976kU enumC6976kU = this.a;
        int hashCode = ((enumC6976kU == null ? 0 : enumC6976kU.hashCode()) ^ 1000003) * 1000003;
        Y8 y8 = this.b;
        return (y8 != null ? y8.hashCode() : 0) ^ hashCode;
    }
}
