package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Un, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2664Un {
    public final VF0 a;
    public final MessageLite b;

    public C2664Un(OX0 ox0, MessageLite messageLite) {
        if (ox0 == null) {
            throw new NullPointerException("Null extension");
        }
        this.a = ox0;
        if (messageLite == null) {
            throw new NullPointerException("Null value");
        }
        this.b = messageLite;
    }

    public final String toString() {
        return KR0.a("ClientRequestContextExtension{extension=", String.valueOf(this.a), ", value=", String.valueOf(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2664Un)) {
            return false;
        }
        C2664Un c2664Un = (C2664Un) obj;
        return this.a.equals(c2664Un.a) && this.b.equals(c2664Un.b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
