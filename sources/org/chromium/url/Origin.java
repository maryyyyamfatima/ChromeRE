package org.chromium.url;

import defpackage.C1063Ie2;
import defpackage.C1730Ni0;
import defpackage.C8697pU1;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class Origin {
    public final C1063Ie2 a;

    public Origin(C1063Ie2 c1063Ie2) {
        this.a = c1063Ie2;
    }

    public final String a() {
        C1063Ie2 c1063Ie2 = this.a;
        return !(c1063Ie2.e != null) ? c1063Ie2.b : "";
    }

    public static ByteBuffer serialize(Origin origin) {
        return origin.a.b();
    }

    public Origin(ByteBuffer byteBuffer) {
        this.a = C1063Ie2.d(new C1730Ni0(new C8697pU1(byteBuffer, new ArrayList())));
    }
}
