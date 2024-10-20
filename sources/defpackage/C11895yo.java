package defpackage;

import android.net.Uri;
import com.google.protobuf.MessageLite;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11895yo {
    public final Uri a;
    public final MessageLite b;
    public final AbstractC7720me1 c;
    public final AbstractC0562Ei1 d;
    public final R74 e;
    public final boolean f;
    public final boolean g;

    public C11895yo(Uri uri, MessageLite messageLite, AbstractC7720me1 abstractC7720me1, AbstractC0562Ei1 abstractC0562Ei1, R74 r74, boolean z, boolean z2) {
        this.a = uri;
        this.b = messageLite;
        this.c = abstractC7720me1;
        this.d = abstractC0562Ei1;
        this.e = r74;
        this.f = z;
        this.g = z2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        StringBuilder a = AbstractC10975w63.a("ProtoDataStoreConfig{uri=", valueOf, ", schema=", valueOf2, ", handler=");
        AbstractC9972tB0.a(a, valueOf3, ", migrations=", valueOf4, ", variantConfig=");
        a.append(valueOf5);
        a.append(", useGeneratedExtensionRegistry=");
        a.append(this.f);
        a.append(", enableTracing=");
        a.append(this.g);
        a.append("}");
        return a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11895yo)) {
            return false;
        }
        C11895yo c11895yo = (C11895yo) obj;
        return this.a.equals(c11895yo.a) && this.b.equals(c11895yo.b) && this.c.equals(c11895yo.c) && this.d.equals(c11895yo.d) && this.e.equals(c11895yo.e) && this.f == c11895yo.f && this.g == c11895yo.g;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237);
    }
}
