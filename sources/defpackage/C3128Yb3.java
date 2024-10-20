package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Yb3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3128Yb3 extends AbstractC1992Pi2 {
    public static final Map d;
    public final EnumC7311lS0 c;

    static {
        EnumMap enumMap = new EnumMap(EnumC7311lS0.class);
        for (EnumC7311lS0 enumC7311lS0 : EnumC7311lS0.values()) {
            C3128Yb3[] c3128Yb3Arr = new C3128Yb3[10];
            for (int i = 0; i < 10; i++) {
                c3128Yb3Arr[i] = new C3128Yb3(i, enumC7311lS0, C7655mS0.e);
            }
            enumMap.put((EnumMap) enumC7311lS0, (EnumC7311lS0) c3128Yb3Arr);
        }
        d = Collections.unmodifiableMap(enumMap);
    }

    public C3128Yb3(int i, EnumC7311lS0 enumC7311lS0, C7655mS0 c7655mS0) {
        super(c7655mS0, i);
        AbstractC5203fJ.a(enumC7311lS0, "format char");
        this.c = enumC7311lS0;
        if (c7655mS0.b()) {
            return;
        }
        boolean z = (c7655mS0.a & 128) != 0;
        char c = enumC7311lS0.a;
        c = z ? (char) (c & 65503) : c;
        StringBuilder sb = new StringBuilder("%");
        c7655mS0.a(sb);
        sb.append(c);
    }

    @Override // defpackage.AbstractC1992Pi2
    public final void a(C1275Jv c1275Jv, Object obj) {
        c1275Jv.b(obj, this.c, this.b);
    }
}
