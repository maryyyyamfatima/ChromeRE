package defpackage;

import com.google.protobuf.MessageLite;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qH2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8976qH2 implements InterfaceC6297iV1 {
    public final MessageLite a;
    public final String b;
    public final Object[] c;
    public final int d;

    public C8976qH2(MessageLite messageLite, String str, Object[] objArr) {
        this.a = messageLite;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final String c() {
        return this.b;
    }

    public final Object[] b() {
        return this.c;
    }

    public final MessageLite a() {
        return this.a;
    }

    public final int d() {
        return (this.d & 1) == 1 ? 1 : 2;
    }
}
