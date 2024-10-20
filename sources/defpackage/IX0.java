package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class IX0 implements InterfaceC6639jV1 {
    public static final IX0 a = new IX0();

    @Override // defpackage.InterfaceC6639jV1
    public final boolean b(Class cls) {
        return QX0.class.isAssignableFrom(cls);
    }

    @Override // defpackage.InterfaceC6639jV1
    public final InterfaceC6297iV1 a(Class cls) {
        if (!QX0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            Class asSubclass = cls.asSubclass(QX0.class);
            ConcurrentHashMap concurrentHashMap = QX0.i;
            QX0 qx0 = (QX0) concurrentHashMap.get(asSubclass);
            if (qx0 == null) {
                try {
                    Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                    qx0 = (QX0) concurrentHashMap.get(asSubclass);
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            if (qx0 == null) {
                qx0 = (QX0) ((QX0) Q14.a(asSubclass)).l(PX0.GET_DEFAULT_INSTANCE);
                if (qx0 == null) {
                    throw new IllegalStateException();
                }
                concurrentHashMap.put(asSubclass, qx0);
            }
            return (InterfaceC6297iV1) qx0.l(PX0.BUILD_MESSAGE_INFO);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
        }
    }
}
