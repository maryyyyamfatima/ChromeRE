package defpackage;

import com.google.protobuf.MessageLite;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class QX0 extends AbstractC4754e0 {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public C11975z14 g = C11975z14.f;
    public int h = -1;

    public abstract Object n(PX0 px0, Object obj, Object obj2);

    @Override // com.google.protobuf.MessageLite
    public final void f(KV kv) {
        C7931nE2 c7931nE2 = C7931nE2.c;
        c7931nE2.getClass();
        QW2 b = c7931nE2.b(getClass());
        LV lv = kv.a;
        if (lv == null) {
            lv = new LV(kv);
        }
        b.d(this, lv);
    }

    @Override // com.google.protobuf.MessageLite
    public final InterfaceC7751mj2 h() {
        return (InterfaceC7751mj2) l(PX0.GET_PARSER);
    }

    @Override // defpackage.InterfaceC7327lV1
    public final QX0 b() {
        return (QX0) l(PX0.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.MessageLite
    public final JX0 g() {
        return (JX0) l(PX0.NEW_BUILDER);
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC7671mV1.c(this, sb, 0);
        return sb.toString();
    }

    public final int hashCode() {
        int i2 = this.a;
        if (i2 != 0) {
            return i2;
        }
        C7931nE2 c7931nE2 = C7931nE2.c;
        c7931nE2.getClass();
        int j = c7931nE2.b(getClass()).j(this);
        this.a = j;
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7931nE2 c7931nE2 = C7931nE2.c;
        c7931nE2.getClass();
        return c7931nE2.b(getClass()).g(this, (QX0) obj);
    }

    public final JX0 j() {
        return (JX0) l(PX0.NEW_BUILDER);
    }

    public final JX0 k(QX0 qx0) {
        JX0 j = j();
        j.m(qx0);
        return j;
    }

    public static void i(QX0 qx0) {
        if (!p(qx0, true)) {
            throw new C6827k14().a();
        }
    }

    @Override // defpackage.InterfaceC7327lV1
    public final boolean isInitialized() {
        return p(this, true);
    }

    @Override // com.google.protobuf.MessageLite
    public final JX0 d() {
        JX0 jx0 = (JX0) l(PX0.NEW_BUILDER);
        jx0.m(this);
        return jx0;
    }

    public Object m(PX0 px0, Object obj) {
        return n(px0, obj, null);
    }

    public Object l(PX0 px0) {
        return n(px0, null, null);
    }

    @Override // com.google.protobuf.MessageLite
    public final int e() {
        if (this.h == -1) {
            C7931nE2 c7931nE2 = C7931nE2.c;
            c7931nE2.getClass();
            this.h = c7931nE2.b(getClass()).h(this);
        }
        return this.h;
    }

    public static void u(Class cls, QX0 qx0) {
        i.put(cls, qx0);
    }

    public static Object s(MessageLite messageLite, String str, Object[] objArr) {
        return new C8976qH2(messageLite, str, objArr);
    }

    public static OX0 t(MessageLite messageLite, Object obj, MessageLite messageLite2, InterfaceC0597Ep1 interfaceC0597Ep1, int i2, EnumC10540uq4 enumC10540uq4, Class cls) {
        return new OX0(messageLite, obj, messageLite2, new NX0(interfaceC0597Ep1, i2, enumC10540uq4), cls);
    }

    public static Object o(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean p(QX0 qx0, boolean z) {
        byte byteValue = ((Byte) qx0.l(PX0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C7931nE2 c7931nE2 = C7931nE2.c;
        c7931nE2.getClass();
        boolean c = c7931nE2.b(qx0.getClass()).c(qx0);
        if (z) {
            qx0.m(PX0.SET_MEMOIZED_IS_INITIALIZED, c ? qx0 : null);
        }
        return c;
    }

    public static C0072Ao1 q(InterfaceC0857Gp1 interfaceC0857Gp1) {
        C0072Ao1 c0072Ao1 = (C0072Ao1) interfaceC0857Gp1;
        int i2 = c0072Ao1.h;
        int i3 = i2 == 0 ? 10 : i2 * 2;
        if (i3 < i2) {
            throw new IllegalArgumentException();
        }
        return new C0072Ao1(Arrays.copyOf(c0072Ao1.g, i3), c0072Ao1.h);
    }

    public static InterfaceC1377Kp1 r(InterfaceC1377Kp1 interfaceC1377Kp1) {
        int size = interfaceC1377Kp1.size();
        return interfaceC1377Kp1.c(size == 0 ? 10 : size * 2);
    }
}
