package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: zo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12238zo extends AbstractC7587mE2 {
    public final MessageLite a;
    public final XF0 b;

    public C12238zo(MessageLite messageLite, XF0 xf0) {
        if (messageLite == null) {
            throw new NullPointerException("Null defaultValue");
        }
        this.a = messageLite;
        if (xf0 == null) {
            throw new NullPointerException("Null extensionRegistryLite");
        }
        this.b = xf0;
    }

    public final String toString() {
        return KR0.a("ProtoSerializer{defaultValue=", String.valueOf(this.a), ", extensionRegistryLite=", String.valueOf(this.b), "}");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7587mE2)) {
            return false;
        }
        AbstractC7587mE2 abstractC7587mE2 = (AbstractC7587mE2) obj;
        return this.a.equals(((C12238zo) abstractC7587mE2).a) && this.b.equals(((C12238zo) abstractC7587mE2).b);
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
