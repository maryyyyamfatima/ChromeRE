package defpackage;

import com.google.protobuf.MessageLite;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nE2 */
/* loaded from: classes.dex */
public final class C7931nE2 {
    public static final C7931nE2 c = new C7931nE2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final C7965nL1 a = new C7965nL1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [MV1] */
    /* JADX WARN: Type inference failed for: r4v8, types: [MV1] */
    public final QW2 b(Class cls) {
        FV1 z;
        FV1 fv1;
        Class cls2;
        Charset charset = AbstractC1507Lp1.a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        QW2 qw2 = (QW2) concurrentHashMap.get(cls);
        if (qw2 != null) {
            return qw2;
        }
        C7965nL1 c7965nL1 = this.a;
        c7965nL1.getClass();
        Class cls3 = YW2.a;
        if (!QX0.class.isAssignableFrom(cls) && (cls2 = YW2.a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        InterfaceC6297iV1 a = c7965nL1.a.a(cls);
        C8976qH2 c8976qH2 = (C8976qH2) a;
        if ((c8976qH2.d & 2) == 2) {
            boolean isAssignableFrom = QX0.class.isAssignableFrom(cls);
            MessageLite messageLite = c8976qH2.a;
            if (isAssignableFrom) {
                fv1 = new MV1(YW2.d, ZF0.a, messageLite);
            } else {
                A14 a14 = YW2.b;
                YF0 yf0 = ZF0.b;
                if (yf0 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                fv1 = new MV1(a14, yf0, messageLite);
            }
            z = fv1;
        } else if (QX0.class.isAssignableFrom(cls)) {
            z = c8976qH2.d() == 1 ? FV1.z(a, AbstractC7525m32.b, BC1.b, YW2.d, ZF0.a, QL1.b) : FV1.z(a, AbstractC7525m32.b, BC1.b, YW2.d, null, QL1.b);
        } else {
            if (c8976qH2.d() == 1) {
                C7181l32 c7181l32 = AbstractC7525m32.a;
                C12036zC1 c12036zC1 = BC1.a;
                A14 a142 = YW2.b;
                YF0 yf02 = ZF0.b;
                if (yf02 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                z = FV1.z(a, c7181l32, c12036zC1, a142, yf02, QL1.a);
            } else {
                z = FV1.z(a, AbstractC7525m32.a, BC1.a, YW2.c, null, QL1.a);
            }
        }
        QW2 qw22 = (QW2) concurrentHashMap.putIfAbsent(cls, z);
        return qw22 != null ? qw22 : z;
    }

    public final QW2 a(QX0 qx0) {
        return b(qx0.getClass());
    }
}
