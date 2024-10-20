package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: e12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4763e12 {
    public final int a;
    public final SM3 b;
    public final Executor c;
    public final C4420d12 d;
    public final String e;
    public final InterfaceC5862hD0 f;

    public C4763e12(SM3 sm3, Executor executor) {
        C5174fD0 c5174fD0 = InterfaceC5862hD0.a;
        C4420d12 c4420d12 = new C4420d12();
        this.a = 0;
        this.b = sm3;
        this.c = executor;
        this.d = c4420d12;
        String d = sm3.d();
        this.e = d;
        this.f = c5174fD0;
        sm3.b(0, d);
    }

    public static ArrayList a(ArrayList arrayList) {
        Object obj;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C8776pi2 c8776pi2 = (C8776pi2) it.next();
            if (c8776pi2.a != null && (obj = c8776pi2.b) != null) {
                C1110Io c1110Io = new C1110Io();
                c1110Io.a = "NativeLibChecking";
                c1110Io.d = Long.valueOf(((Long) obj).longValue() / 1000);
                byte b = (byte) (0 | 1);
                int i = AbstractC1472Li1.h;
                UL2 ul2 = UL2.o;
                if (ul2 != null) {
                    String str = (String) c8776pi2.a;
                    C10020tK3 c10020tK3 = new C10020tK3(0L, false);
                    if (b == 1) {
                        c1110Io.f = new C1500Lo(ul2, c10020tK3, str, null, null, null, null, null, null, 1);
                        arrayList2.add(c1110Io);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if ((1 & b) == 0) {
                            sb.append(" materializationCount");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(String.valueOf(sb)));
                    }
                } else {
                    throw new NullPointerException("Null templateUris");
                }
            }
        }
        return arrayList2;
    }
}
