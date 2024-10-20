package defpackage;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iv4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6449iv4 implements InterfaceC6793jv4, InterfaceC6107hv4 {
    public static final Object c = new Object();
    public volatile InterfaceC6793jv4 a;
    public volatile Object b = c;

    public C6449iv4(InterfaceC6793jv4 interfaceC6793jv4) {
        this.a = interfaceC6793jv4;
    }

    public static InterfaceC6793jv4 b(InterfaceC6793jv4 interfaceC6793jv4) {
        return interfaceC6793jv4 instanceof C6449iv4 ? interfaceC6793jv4 : new C6449iv4(interfaceC6793jv4);
    }

    @Override // defpackage.InterfaceC6793jv4
    public final Object a() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj2) {
                    obj = this.a.a();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != obj) {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.b = obj;
                    this.a = null;
                }
            }
        }
        return obj;
    }
}
